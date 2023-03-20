public class Car {
    String driver;
    int driverLicenseNumber;
    String brand;
    String model;
    int yearOfBuild;
    String color;
    double engineCapacity;



    public Car (String driver, int driverLicenseNumber, String brand, String model, int yearOfBuild, String color, double engineCapacity){
        this.driver = driver;
        this.driverLicenseNumber = driverLicenseNumber;
        this.brand = brand;
        this.model = model;
        this.yearOfBuild = yearOfBuild;
        this.color = color;
        this.engineCapacity = engineCapacity;
        printCar();
        printDriver();
    }

    public void printCar(){
        System.out.println("Deze " + this.brand + " "  + this.model + " is " + this.color + ".");
    }

    public void printDriver(){
        System.out.println(this.driver + " with driverlicensenumber " + driverLicenseNumber + " drives a " + color
                + " " +  model + " " + brand + " build in " + yearOfBuild + " with a " + engineCapacity +
                " engine.\n");
    }
}
