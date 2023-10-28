package weeklesson3;

public class main extends Lecturers{
    public static void main(String[] args) {

        Student st1 = new Student(1, "Lê Văn Tèo", LocalDate.of(2003, 1, 1), 8.0, 7.5, 9.0, new ArrayList<>());
        Student st2 = new Student(2, "Nguyễn Thị Nở", LocalDate.of(2004, 2, 2), 7.0, 8.5, 8.0, new ArrayList<>());
        Student st3 = new Student(3, "Trần Chí Phèo", LocalDate.of(2005, 3, 3), 9.0, 9.5, 10.0, new ArrayList<>());

        Lecturers lt1 = new Lecturers(1, "Nguyễn Văn Minh", "History", new ArrayList<>());
        Lecturers lt2 = new Lecturers(2, "Trần Thị Bình", "Biology", new ArrayList<>());
        Lecturers lt3 = new Lecturers(3, "Lê Văn Chí", "Chemistry", new ArrayList<>());


        lt1.getStudents().add(st1);
        lt1.getStudents().add(st2);
        lt2.getStudents().add(st2);
        lt2.getStudents().add(st3);
        lt3.getStudents().add(st1);
        lt3.getStudents().add(st3);

        st1.getLecturers().add(lt1);
        st1.getLecturers().add(lt3);
        st2.getLecturers().add(lt1);
        st2.getLecturers().add(lt2);
        st3.getLecturers().add(lt2);
        st3.getLecturers().add(lt3);


        System.out.println("list of Students and Lectures:");
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);


        Scanner input = new Scanner(System.in);

        for (Lecturers lt : Arrays.asList(lt1, lt2, lt3)) {
            for (Student st : lt.getStudents()) {
                System.out.println("Enter point for Student " + st.getStudentName() + " subject " + lt.getLecturers() + ": ");
                float point = 0; // Khai báo một biến để lưu trữ điểm số
                boolean valid = false; // Khai báo một biến để kiểm tra tính hợp lệ của dữ liệu
                while (!valid) { // Lặp cho đến khi dữ liệu hợp lệ
                    if (input.hasNextFloat()) { // Nếu dữ liệu là một số thực
                        point = input.nextFloat(); // Gán dữ liệu cho biến point
                        valid = true; // Đặt biến valid bằng true
                    } else { // Nếu dữ liệu không phải là một số thực
                        System.out.println("Error: invalid data"); // Thông báo lỗi
                        System.out.println("PLEASE RE-ENTER THE STUDENT'S SCORE " + st.getStudentName() + " subject " + lt.getLecturers() + ": ");
                        input.next(); // Bỏ qua dữ liệu không hợp lệ
                    }
                }
                lt.enterPoint(st, point);
            }
        }

        // In ra kết quả sau khi nhập điểm số
        System.out.println("List of lecturers and students after entering scores:");
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        input.close();
    }

}
