package fi.academy.drinkkifyspring.entities;

public class User {

    private Integer uid;
    private String user_email;

    public User() {
        this.uid = null;
        this.user_email = "";
    }

    @Override
    public String toString() {
        return String.format("Users{uid=%d, user_email=%s}", uid, user_email);
    }

}
