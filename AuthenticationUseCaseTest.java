import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthenticationUseCaseTest {
    private AuthenticationUseCase authenticationUseCase;

    @BeforeEach
    public void setup() {
        authenticationUseCase = new AuthenticationUseCase();
    }

    @Test
    public void testRegisterUser_ValidInput_RegistrationSuccessful() {
        String username = "AnwarAref";
        String password = "password123";
        String email = "Anwar@example.com";
        String dateOfBirth = "2002-09-16";
        String phoneNumber = "1234567890";

        authenticationUseCase.registerUser(username, password, email, dateOfBirth, phoneNumber);

        // Assert that the user is successfully registered
        Assertions.assertTrue(authenticationUseCase.authenticate(username, password));
    }

    @Test
    public void testRegisterUser_UserAlreadyRegistered_RegistrationFailed() {
        String username = "AnwarAref";
        String password = "password123";
        String email = "Anwar@example.com";
        String dateOfBirth = "2002-09-16";
        String phoneNumber = "1234567890";

        // Register the user for the first time
        authenticationUseCase.registerUser(username, password, email, dateOfBirth, phoneNumber);

        // Try to register the same user again
        authenticationUseCase.registerUser(username, password, email, dateOfBirth, phoneNumber);

        // Assert that the registration True due to user already being registered, it will
        // print "Registration failed. User already registered." and will not add the user ifo to the database
        Assertions.assertTrue(authenticationUseCase.authenticate(username, password));
    }

    @Test
    public void testRegisterUser_UnderageUser_RegistrationFailed() {
        String username = "HananMahmood";
        String password = "password123";
        String email = "Hanan@example.com";
        String dateOfBirth = "2019-09-19"; // User is underage
        String phoneNumber = "1234567890";

        authenticationUseCase.registerUser(username, password, email, dateOfBirth, phoneNumber);

        // Assert that the registration fails due to user being underage
        Assertions.assertFalse(authenticationUseCase.authenticate(username, password));
    }

    @Test
    public void testAuthenticate_ValidCredentials_AuthenticationSuccessful() {
        String username = "AnwarAref";
        String password = "password123";
        String email = "Anwar@example.com";
        String dateOfBirth = "2002-09-16";
        String phoneNumber = "1234567890";

        // Register the user
        authenticationUseCase.registerUser(username, password, email, dateOfBirth, phoneNumber);

        // Authenticate with valid credentials
        boolean result = authenticationUseCase.authenticate(username, password);

        // Assert that authentication is successful
        Assertions.assertTrue(result);
    }

    @Test
    public void testAuthenticate_InvalidCredentials_AuthenticationFailed() {
        String username = "AnwarAref";
        String password = "password123";
        String email = "Anwar@example.com";
        String dateOfBirth = "2002-09-16";
        String phoneNumber = "1234567890";

        // Register the user
        authenticationUseCase.registerUser(username, password, email, dateOfBirth, phoneNumber);

        // Authenticate with invalid password
        boolean result = authenticationUseCase.authenticate(username, "wrongpassword");

        // Assert that authentication fails with invalid credentials
        Assertions.assertFalse(result);
    }
}