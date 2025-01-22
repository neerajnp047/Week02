import java.util.ArrayList;

class Doctor {
    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName() + ".");
    }

    public void displayPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        patients.forEach(p -> System.out.println("- " + p.getName()));
    }
}

class Patient {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Doctor doctor) {
        doctors.add(doctor);
        System.out.println(name + " is consulting Dr. " + doctor.getName() + ".");
    }

    public void displayDoctors() {
        System.out.println(name + " has consulted:");
        doctors.forEach(d -> System.out.println("- Dr. " + d.getName()));
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Sangeeta");

        Patient patient1 = new Patient("Rohan");
        Patient patient2 = new Patient("Bharat");

        doctor1.consult(patient1);
        doctor2.consult(patient2);
        doctor1.consult(patient2);
        patient1.consult(doctor2);

        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();
    }
}