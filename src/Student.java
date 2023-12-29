import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Course> courses;
    private List<Club> clubs;

    public Student(String name, int id, List<Course> courses, List<Club> clubs) {
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.clubs = clubs;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }
}
