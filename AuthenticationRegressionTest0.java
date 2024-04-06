
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthenticationRegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b12 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b12 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    boolean b15 = authenticationUseCase0.authenticate("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    boolean b15 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "");
    boolean b15 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b18 = authenticationUseCase0.authenticate("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "hi!", "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "hi!");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("hi!", "", "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "");
    boolean b15 = authenticationUseCase0.authenticate("hi!", "");
    boolean b18 = authenticationUseCase0.authenticate("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "");
    boolean b15 = authenticationUseCase0.authenticate("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    boolean b15 = authenticationUseCase0.authenticate("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "");
    boolean b15 = authenticationUseCase0.authenticate("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    boolean b15 = authenticationUseCase0.authenticate("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "hi!");
    boolean b12 = authenticationUseCase0.authenticate("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("", "");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "", "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    authenticationUseCase0.registerUser("", "hi!", "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException");
    } catch (java.time.format.DateTimeParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("", "");
    boolean b6 = authenticationUseCase0.authenticate("hi!", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b12 = authenticationUseCase0.authenticate("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }

    AuthenticationUseCase authenticationUseCase0 = new AuthenticationUseCase();
    boolean b3 = authenticationUseCase0.authenticate("hi!", "hi!");
    boolean b6 = authenticationUseCase0.authenticate("", "");
    boolean b9 = authenticationUseCase0.authenticate("hi!", "");
    boolean b12 = authenticationUseCase0.authenticate("", "hi!");
    boolean b15 = authenticationUseCase0.authenticate("hi!", "");
    boolean b18 = authenticationUseCase0.authenticate("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

}
