package hei.school;

public class Tutor extends User{
    private final String linkDescription;

    public Tutor(int id, String firstname, String lastname, String birthday, String email, String touch, String linkDescription) {
        super(id, firstname, lastname, birthday, email, touch);
        this.linkDescription = linkDescription;
    }

    public String getLinkDescription() {
        return linkDescription;
    }
}
