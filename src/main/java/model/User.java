package model;

public class User{

    private String userEmail;

    private String userPassword;

    private String userType;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User() {
    }

    public User(String userEmail, String userPassword, String userType) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userType = userType;
    }


}