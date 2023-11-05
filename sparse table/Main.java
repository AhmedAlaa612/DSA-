public class Main {
    public static void main(String[] args) {
        SparseTable table = new SparseTable();
        table.setCourses(10);
        table.setStudents(10);
        table.addNode(1, 1);
        table.addNode(1, 2);
        table.addNode(2, 3);
        table.addNode(1, 6);
        table.addNode(2, 1);
        table.addNode(3, 1);
        table.addNode(1, 4);
        table.listStudentCourses(1);
        table.listStudentsInCourse(1);
    }
}
