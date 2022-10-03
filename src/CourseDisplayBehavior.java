import java.util.ArrayList;
import java.util.List;

public class CourseDisplayBehavior {
    protected List<Course> courseList;

    public CourseDisplayBehavior() {
        this.courseList = new ArrayList<>();
    }

    public void displayAllCourse(){
        for (Course course:courseList) {
            System.out.println(course.toString());
        }
        System.out.println();
    }
}
