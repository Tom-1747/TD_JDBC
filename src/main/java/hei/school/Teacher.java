package hei.school;

public class Teacher extends User{
    private final String skill;

    public Teacher(int id, String firstname, String lastname, String birthday, String email, String touch, String skill) {
        super(id, firstname, lastname, birthday, email, touch);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }
}
