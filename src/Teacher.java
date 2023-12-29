import java.util.List;

public class Teacher {
    private List<Course> courses;
    private String name;
    private int id;

    public Teacher(List<Course> courses, String name, int id) {
        this.courses = courses;
        this.name = name;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
