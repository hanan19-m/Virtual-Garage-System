
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppointmentRegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b30 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "hi!", "");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "hi!", "");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "hi!", "hi!", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b30 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b35 = appointmentBooking0.bookAppointment("", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "hi!", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    boolean b35 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b30 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b35 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b30 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "hi!", "");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "", "", "");
    boolean b35 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "", "", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "hi!", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b30 = appointmentBooking0.bookAppointment("", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    boolean b20 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "hi!");
    boolean b30 = appointmentBooking0.bookAppointment("", "hi!", "", "");
    boolean b35 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("", "hi!", "", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("", "", "", "");
    boolean b30 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("", "", "hi!", "");
    boolean b15 = appointmentBooking0.bookAppointment("", "hi!", "hi!", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    AppointmentBooking appointmentBooking0 = new AppointmentBooking();
    boolean b5 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b10 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    boolean b15 = appointmentBooking0.bookAppointment("hi!", "hi!", "", "");
    boolean b20 = appointmentBooking0.bookAppointment("hi!", "", "hi!", "hi!");
    boolean b25 = appointmentBooking0.bookAppointment("hi!", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

}
