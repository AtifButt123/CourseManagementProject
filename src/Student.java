import java.util.ArrayList;
import java.util.List;

public class Student extends CourseDisplayBehavior{
    private String rollNo;
    private String name;
    private String gender;
    private String cgpa;

    public Student(String rollNo, String name, String gender, String cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.cgpa = cgpa;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course){
        courseList.remove(course);
    }

    @Override
    public String toString() {
        return "Student{ " +
                "rollNo= '" + rollNo + '\'' +
                ", name= '" + name + '\'' +
                ", gender= '" + gender + '\'' +
                ", cgpa= '" + cgpa + '\'' +
                '}';
    }
}
