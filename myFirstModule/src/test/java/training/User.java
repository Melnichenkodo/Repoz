package training;

public class User {

    private String userName;
    private String password;
    private Profile profile;

    public User() {
    }


    public User(String userName, String password, Profile profile) {
        this.userName = userName;
        this.password = password;
        this.profile = profile;

    }

    public User(User sourceObject) {
        this.userName = sourceObject.userName;
        this.password = sourceObject.password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}

