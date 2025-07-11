package solid.srp.user;

public class WelcomeEmailManager {

    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}
