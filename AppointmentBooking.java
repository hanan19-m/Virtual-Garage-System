import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppointmentBooking {
    private Set<LocalDateTime> bookedAppointments;
    private DateTimeFormatter formatter;
    private Map<LocalDateTime, AppointmentData> appointmentDataMap; // HashMap to store appointment data

    public AppointmentBooking() {
        this.bookedAppointments = new HashSet<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.appointmentDataMap = new HashMap<>();
    }

    public boolean bookAppointment(String dateString, String timeString, String vehicle, String service) {
        // Validate the entered date and time
        LocalDateTime appointmentDateTime;
        try {
            appointmentDateTime = LocalDateTime.parse(dateString + " " + timeString, formatter);
        } catch (Exception e) {
            System.out.println("Invalid date or time format. Please try again.");
            return false;
        }

        // Check if the appointment date and time are in the past
        LocalDateTime currentDateTime = LocalDateTime.now();
        if (appointmentDateTime.isBefore(currentDateTime)) {
            System.out.println("Invalid date or time. Please specify a future date and time.");
            return false;
        }

        // Check if the appointment date and time are already booked
        if (isAppointmentBooked(appointmentDateTime)) {
            System.out.println("The selected date and time are not available. Please choose another date and time.");
            return false;
        }

        // Add the booked appointment to the set
        bookedAppointments.add(appointmentDateTime);

        // Save the appointment in the database
        saveAppointment(appointmentDateTime, vehicle, service);

        // Appointment booking successful
        System.out.println("Appointment booked successfully!");
        System.out.println("Date and Time: " + appointmentDateTime.format(formatter));
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Service: " + service);

        return true;
    }

    private boolean isAppointmentBooked(LocalDateTime appointmentDateTime) {
        return bookedAppointments.contains(appointmentDateTime);
    }

    private void saveAppointment(LocalDateTime appointmentDateTime, String vehicle, String service) {
        // Create an AppointmentData object to store the appointment details
        AppointmentData appointmentData = new AppointmentData(vehicle, service);

        // Store the appointment data in the HashMap using the appointmentDateTime as the key
        appointmentDataMap.put(appointmentDateTime, appointmentData);

    }
    
    private static class AppointmentData {
        private String vehicle;
        private String service;

        public AppointmentData(String vehicle, String service) {
            this.vehicle = vehicle;
            this.service = service;
        }
    }
    
   }
   //New Comment
    //A N W A R
    //H A N A N