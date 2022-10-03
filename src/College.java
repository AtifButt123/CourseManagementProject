import java.util.ArrayList;
import java.util.List;

public class College extends CourseDisplayBehavior{
    private String collegeName;
    private String department;
    private String location;
    private List<Student> studentList;

    public College(String collegeName, String department, String location) {
        this.collegeName = collegeName;
        this.department = department;
        this.location = location;
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

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    public void displayAllStudent(){
        System.out.println("Total Students in college:");
        for (Student student:studentList) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
