package hei.school;

public abstract class User {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final String birthday;
    private final String email;
    private final String touch;

    public User(int id, String firstname, String lastname, String birthday, String email, String touch) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.email = email;
        this.touch = touch;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getTouch() {
        return touch;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
