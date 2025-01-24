class Devices{
    int deviceId;
    String status;

    public Devices(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus(){
        System.out.println("Displaying Devices");
    }
}
class Thermostat extends Devices{
    String temperatureSetting;
    Thermostat(int deviceId, String status, String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    void displayStatus(){
        System.out.println("Device Id: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature: " + temperatureSetting);
    }

}

public class SmartHomeDevice {
    public static void main(String[] args) {
        Devices thermostat = new Thermostat(8989, "ON", "15 degree");
        thermostat.displayStatus();
    }
}
