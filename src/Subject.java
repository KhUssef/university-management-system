import java.util.List;

public class Subject {
    private List<Course> courses;
    private String name;

    public Subject(List<Course> courses, String name) {
        this.courses = courses;
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
