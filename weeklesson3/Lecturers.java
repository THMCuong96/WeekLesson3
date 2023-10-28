package weeklesson3;

public class Lecturers extends Student {

    private int LecturersID;
    private String LecturersName;
    private String Biology ,Chemistry, History;
    private List<Student> students; // Một giảng viên có nhiều học sinh



    // Phương thức nhập điểm số cho một Student theo môn học
    public void enterPoint(Student st, float point) {
        if (this.subject.equals("History")) {
            st.setHistoryPoint( point);
        } else if (this.subject.equals("Biology")) {
            st.setBiologyPoint(point);
        } else if (this.subject.equals("Chemistry")) {
            st.setChemistryPoint(point);
        } else {
            System.out.println("Error: The lecturer does not teach this subject");
        }
    }
}

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Lectures ID: ");
        int iD = input.nextInt();
        Lecturers lt = null;
        if (iD == 1) { // Nếu mã số là 1
            lt = lt1;
        } else if (iD == 2) { // Nếu mã số là 2
            lt = lt2;
        } else if (iD == 3) { // Nếu mã số là 3
            lt = lt3;
        } else { // Nếu mã số không hợp lệ
            System.out.println("Error: ID does not exist"); // Thông báo lỗi và kết thúc chương trình
            return;
        }
    }
}


