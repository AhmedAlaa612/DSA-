public class Node {
    private int student;
    private int course;
    private Node next_student = null;
    private Node next_course = null;

    public Node(int student, int course) {
        this.student = student;
        this.course = course;
    }

    public Node getNext_student() {
        return next_student;
    }

    public Node getNext_course() {
        return next_course;
    }

    public int getStudent() {
        return student;
    }

    public int getCourse() {
        return course;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setNext_student(Node next_student) {
        this.next_student = next_student;
    }

    public void setNext_course(Node next_course) {
        this.next_course = next_course;
    }
}
