import java.util.ArrayList;

public class Lecturer extends Researcher {
    ArrayList<Course> courses = new ArrayList<Course>();

    public Lecturer(int ssNO, String name, String email, ArrayList<Course> courses) {
        super(ssNO, name, email);
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public String position() {
        return "Lecturer";
    }

    @Override
    public String toString() {
        return "Lecturer{" + "ssNO=" + super.getSsNO() + ", name=" + super.getName() + ", email=" + super.getEmail() + ", course=" + courses + '}';
    }
}
