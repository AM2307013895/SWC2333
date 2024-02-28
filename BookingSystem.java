import java.util.Scanner;

public class BookingSystem {
   //Define the array (size 20)
   private Appointment[] appointmentSchedule = new Appointment[20];

   //Define method to add an appointment to the schedule
   public void addAppointment(Appointment appointment) {
       for (int i = 0; i < appointmentSchedule.length; i++) {
           if (appointmentSchedule[i] == null) {
               appointmentSchedule[i] = appointment;
               break;
           }
       }
   }

   //Define method to display all appointment details
   public void displayAppointments() {
       for (Appointment appointment : appointmentSchedule) {
           if (appointment != null) {
               System.out.println(appointment.toString());
           }
       }
   }

   //Define method to search for appointments by date
   public void searchAppointmentsByDate(String date) {
       for (Appointment appointment : appointmentSchedule) {
           if (appointment != null && appointment.getApptDate().equals(date)) {
               System.out.println(appointment.toString());
           }
       }
   }

   //Define method to cancel a specific appointment in the schedule
   public void cancelAppointment(String patientName, String date, String time) {
       for (int i = 0; i < appointmentSchedule.length; i++) {
           Appointment appointment = appointmentSchedule[i];
           if (appointment != null && appointment.getPatientName().equals(patientName)
                   && appointment.getApptDate().equals(date) && appointment.getApptTime().equals(time)) {
               appointmentSchedule[i] = null;
               break;
           }
       }
   }

   //Define main()
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       BookingSystem bookingSystem = new BookingSystem();

       while (true) {
        System.out.println("\nWelcome to the Dental Booking System!");
        System.out.println("1. Add an appointment");
        System.out.println("2. Display all appointments");
        System.out.println("3. Search appointments by date");
        System.out.println("4. Cancel an appointment");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt(); //Read user's input

           switch (choice) {
               case 1:
                    //Display patient's details
                   System.out.print("Enter patient name: ");
                   scanner.nextLine();
                   String patientName = scanner.nextLine();
                   System.out.print("Enter appointment date: ");
                   String apptDate = scanner.nextLine();
                   System.out.print("Enter appointment time: ");
                   String apptTime = scanner.nextLine();
                   System.out.print("Enter dentist name: ");
                   String dentistName = scanner.nextLine();
                   Appointment appointment = new Appointment(patientName, apptDate, apptTime, dentistName);
                   bookingSystem.addAppointment(appointment);
                   
               case 2:
                    //display all appointments
                   bookingSystem.displayAppointments();
                   
               case 3:
                    //search for appointment date
                   System.out.print("Enter appointment date to search: ");
                   scanner.nextLine();
                   String searchDate = scanner.nextLine();
                   bookingSystem.searchAppointmentsByDate(searchDate);
                   
               case 4:
                    //patient's details for appointment cancelation
                   System.out.print("Enter patient name to cancel: ");
                   scanner.nextLine();
                   String cancelPatientName = scanner.nextLine();
                   System.out.print("Enter appointment date to cancel: ");
                   String cancelApptDate = scanner.nextLine();
                   System.out.print("Enter appointment time to cancel: ");
                   String cancelApptTime = scanner.nextLine();
                   bookingSystem.cancelAppointment(cancelPatientName, cancelApptDate, cancelApptTime);
                }
                
                //scanner close
                scanner.close();
                //exit program
                System.exit(0);
        }
    }
}