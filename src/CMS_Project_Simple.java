import java.util.ArrayList;
import java.util.List;

//Note...
//This code can be improved by including repo class for each class (College, student, course)
//But this is a simple project that's been written for the sake of understanding association relationships
//like is A, has A

//Student: Course (many to many)
//College:Student (one to many)
//College: Course (one to many)

public class CMS_Project_Simple {
    public static void main(String[] args) {
        College punjabCollege = new College("Punjab Group of Colleges", "PCIT", "Wahdat road Lahore, Pakistan");
        Student s1 = new Student("bsef19m001","Atif Iqbal Butt", "Male", "3.62");
        Student s2 = new Student("bsef19m002","Taimoor Ahmad", "Male", "3.4");
        Student s3 = new Student("bsef19m003","Ameer Hamza", "Male", "2.62");
        Student s4 = new Student("bsef19m004","Mohammad Irfan", "Male", "4.0");
        Student s5 = new Student("bsef19m005","Farhan Ali", "Male", "3.5");

        punjabCollege.addStudent(s1);
        punjabCollege.addStudent(s2);
        punjabCollege.addStudent(s3);
        punjabCollege.addStudent(s4);
        punjabCollege.addStudent(s5);

        Course c1 = new Course("CS101", "Object Oriented Design");
        Course c2 = new Course("FS403", "Intro to Computer Networks");
        Course c3 = new Course("DS201", "Analysis of Algorithm");

        List<Course>courseListCollege = new ArrayList<Course>();
        courseListCollege.add(c1);
        courseListCollege.add(c2);
        courseListCollege.add(c3);

        c1.addStudent(s1);
        c1.addStudent(s2);

        c2.addStudent(s1);
        c2.addStudent(s3);
        c2.addStudent(s4);

        c3.addStudent(s1);
        c3.addStudent(s2);
        c3.addStudent(s3);
        c3.addStudent(s4);
        c3.addStudent(s5);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);

        s2.addCourse(c1);
        s2.addCourse(c3);

        s3.addCourse(c2);
        s3.addCourse(c3);

        s4.addCourse(c2);
        s4.addCourse(c3);

        s5.addCourse(c3);

        punjabCollege.setCourseList(courseListCollege);
        punjabCollege.displayAllStudent();
        System.out.println("Total courses allowed in college");
        punjabCollege.displayAllCourse();
        System.out.println("Courses enrolled by student rollNo: 5");
        s5.displayAllCourse();
        c1.displayAllStudent();
    }
}