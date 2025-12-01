public class Login{
    public boolean authenticate(String username, String password) {
        // Simple authentication logic for demonstration purposes
        return "admin".equals(username) && "password123".equals(password);
    }
}