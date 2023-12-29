public class Course {
    private Teacher teacher;
    private String name;
    private int id;
    private String schedule;
    private Subject subject;

    public Course(Teacher teacher, String name, int id, String schedule, Subject subject) {
        this.teacher = teacher;
        this.name = name;
        this.id = id;
        this.schedule = schedule;
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
