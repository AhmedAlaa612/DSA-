public class SparseTable {
    Ptr[] courses;
    Ptr[] students;

    public void setCourses(int n) {
        this.courses = new Ptr[n];
        for (int i = 0; i <n; i++){
            this.courses[i] = new Ptr(i+1);
        }
    }

    public void setStudents(int n) {
        this.students = new Ptr[n];
        for (int i = 0; i <n; i++){
            this.students[i] = new Ptr(i+1);
        }
    }
    public void addNode(int student, int course){
        Node newNode = new Node(student, course);
        Node curr_course = courses[course-1].next;
        Node curr_student = students[student-1].next;

        if (curr_course != null) {
            while (curr_course.getNext_course() != null) {
                curr_course = curr_course.getNext_course();
            }
            curr_course.setNext_course(newNode);
        }
        else courses[course-1].next = newNode;
        if (curr_student != null) {
            while (curr_student.getNext_student() != null) {
                curr_student = curr_student.getNext_student();
            }
            curr_student.setNext_student(newNode);
        }
        else students[student-1].next = newNode;
    }
    public void listStudentCourses(int student_id){
        Node student = students[student_id-1].next;
        System.out.println("courses by : " + student_id);
        while(student != null){
            System.out.println(student.getCourse());
            student = student.getNext_student();
        }
    }
    public void listStudentsInCourse(int course_id){
        Node course = courses[course_id-1].next;
        System.out.println("Students enrolled in course : "+course_id);
        while(course != null){
            System.out.println(course.getStudent());
            course = course.getNext_course();
        }
    }
}
