import java.util.ArrayList;
import java.util.List;

public class Course{
    private String courseId;
    private String courseName;
    private List<Student>studentList;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        studentList = new ArrayList<>();
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void displayAllStudent(){
        System.out.println("Students enrolled in Course: " + courseName);
        for (Student student:studentList) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName=" + courseName +
                '}';
    }
}
