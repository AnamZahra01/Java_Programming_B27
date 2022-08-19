package day37_static.drive;

public class Driver {

    String name;
    long licenseNumber;
    char licenseType;

    public Driver(String name, long licenseNumber, char licenseType) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.licenseType = licenseType;
    }

    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber=" + licenseNumber +
                ", licenseType=" + licenseType +
                '}';
    }
}
