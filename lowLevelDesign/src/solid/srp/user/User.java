package solid.srp.user;

public class User {

    private String name;
    private String email;

    public User (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


//    public void sendWelcomeEmail() {
//        System.out.println("Sending welcome email to " + email);
//    }

//    public void saveToDatabase() {
//        System.out.println("Saving user to database");
//    }
}
