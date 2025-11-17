package hei.school;

public class Student extends User {
    private final String group;
    private final String tutor;

    public Student(int id, String firstname, String lastname, String birthday, String email, String touch, String group, String tutor) {
        super(id, firstname, lastname, birthday, email, touch);
        this.group = group;
        this.tutor = tutor;
    }

    public String getGroup() {
        return group;
    }

    public String getTutor() {
        return tutor;
    }
}
