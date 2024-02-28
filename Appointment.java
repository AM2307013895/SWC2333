public class Appointment {
    //Define the private attributes of the Appointment class
    private String patientName;
    private String apptDate;
    private String apptTime;
    private String dentistName;

    //Define the default constructor
    public Appointment() {
        //Initialise the attributes to empty strings
        this.patientName = "";
        this.apptDate = "";
        this.apptTime = "";
        this.dentistName = "";
    }//end of constructor

    //Define the parameter constructor
    public Appointment(String patientName, String apptDate, String apptTime, String dentistName) {
        //Attributes with the given values
        this.patientName = patientName;
        this.apptDate = apptDate;
        this.apptTime = apptTime;
        this.dentistName = dentistName;
    }//end of parameter constructor

    //Define the setter method
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }//end of setter method

    //Define the setter method
    public void setApptDate(String apptDate) {
        this.apptDate = apptDate;
    }//end of setter method

    //Define the setter method
    public void setApptTime(String apptTime) {
        this.apptTime = apptTime;
    }//end of setter method

    //Define the setter method
    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }//end of the setter method

    //Define getter for patient name
    public String getPatientName() {
        return this.patientName;
    }//end of the getter method

    //Define the getter method for appointment date
    public String getApptDate() {
        return this.apptDate;
    }//end of the getter

    //Define the getter for appoitment time
    public String getApptTime() {
        return this.apptTime;
    }//end of the getter

    //Define the getter method for the dentist name
    public String getDentistName() {
        return this.dentistName;
    }//end of the getter method

    //Define the toString() method
    @Override
    //Display output
    public String toString() {
        return  
        "\n==================================" +
        "\nAppointment Details" +
        "\nPatient Name" + "\t\t" + "= " + patientName +
        "\nAppointment Date" + "\t" + "= " + apptDate +
        "\nAppointment Time" + "\t" + "= " + apptTime +
        "\nDentist Name" + "\t\t" + "= " + dentistName +
        "\n==================================";
    }
}//end of class