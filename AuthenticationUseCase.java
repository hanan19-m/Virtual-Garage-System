import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationUseCase {
    private Map<String, UserInfo> userDatabase;

    public AuthenticationUseCase() {
        // Initialize the map to store registered usernames and user information
        userDatabase = new HashMap<>();
    }

    public void registerUser(String username, String password, String email, String dateOfBirth, String phoneNumber) {
        // Check if the user is already registered
        if (userDatabase.containsKey(username)) {
            System.out.println("Registration failed. User already registered.");
        } 
        // Calculate the user's age based on the provided date of birth
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        // Check if the user is under 18 years old
        if (age.getYears() < 18) {
            System.out.println("Registration failed. User must be 18 years or older.");
        }
        else {
            // Create a new UserInfo object with the provided user information
            UserInfo userInfo = new UserInfo(username, password, email, dateOfBirth, phoneNumber);
            
            // Add the user to the database
            userDatabase.put(username, userInfo);
            
            System.out.println("Registration successful!");
        }
    }

    public boolean authenticate(String username, String password) {
        // Check if the entered username exists in the registered user database
        if (userDatabase.containsKey(username)) {
            // Get the UserInfo object for the entered username
            UserInfo userInfo = userDatabase.get(username);

            // Check if the entered password matches the stored password
            if (password.equals(userInfo.getPassword())) {
                return true; // Authentication successful
            }
        }
        return false; // Authentication failed
    }

    private class UserInfo {
        private String username;
        private String password;
        private String email;
        private String dateOfBirth;
        private String phoneNumber;

        public UserInfo(String username, String password, String email, String dateOfBirth, String phoneNumber) {
            this.username = username;
            this.password = password;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}