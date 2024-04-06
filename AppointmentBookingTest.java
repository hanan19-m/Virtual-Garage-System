import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppointmentBookingTest {
    private AppointmentBooking appointmentBooking;
    private DateTimeFormatter formatter;

    @BeforeEach
    public void setup() {
        appointmentBooking = new AppointmentBooking();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    }

    @Test
    public void testBookAppointment_ValidInput_AppointmentBookedSuccessfully() {
        String dateString = "2024-12-12";
        String timeString = "10:00";
        String vehicle = "Car";
        String service = "Oil Change";

        boolean result = appointmentBooking.bookAppointment(dateString, timeString, vehicle, service);

        // Assert that the appointment is booked successfully
        Assertions.assertTrue(result);
    }

    @Test
    public void testBookAppointment_InvalidDateFormat_AppointmentBookingFailed() {
        String dateString = "12-12-2024"; // Invalid date format
        String timeString = "10:00";
        String vehicle = "Car";
        String service = "Oil Change";

        boolean result = appointmentBooking.bookAppointment(dateString, timeString, vehicle, service);

        // Assert that the appointment booking fails due to invalid date format
        Assertions.assertFalse(result);
    }

    @Test
    public void testBookAppointment_PastDateTime_AppointmentBookingFailed() {
        // Create a past date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime pastDateTime = currentDateTime.minusDays(1);

        String dateString = pastDateTime.format(formatter);
        String timeString = pastDateTime.format(formatter);
        String vehicle = "Car";
        String service = "Oil Change";

        boolean result = appointmentBooking.bookAppointment(dateString, timeString, vehicle, service);

        // Assert that the appointment booking fails due to past date and time
        Assertions.assertFalse(result);
    }

    @Test
    public void testBookAppointment_DuplicateDateTime_AppointmentBookingFailed() {
        String dateString = "2024-12-12";
        String timeString = "10:00";
        String vehicle = "Car";
        String service = "Oil Change";

        // Book the first appointment
        appointmentBooking.bookAppointment(dateString, timeString, vehicle, service);

        // Try to book another appointment with the same date and time
        boolean result = appointmentBooking.bookAppointment(dateString, timeString, "Motorcycle", "Tire Change");

        // Assert that the appointment booking fails due to duplicate date and time
        Assertions.assertFalse(result);
    }
}