package Tasks.T6;

import Tasks.Validator;

/**
 * This class represents a Car, with its specifications defined as fields.
 * Each Car object has a name, the manufacturer's name, manufacture year, and engine capacity.
 * The class uses utility methods from the Validator class to perform validation on input data.
 * The class overrides the toString() method to provide a String representation of a Car object.
 */
public class Car {
    private String carName;
    private String manufacturerName;
    private int manufactureYear;
    private double engineCapacity;

    /**
     * Constructs a new Car object with the given parameters.
     * The input parameters are validated using the Validator utility class.
     *
     * @param carName          the name of the car
     * @param manufacturerName the name of the manufacturer
     * @param manufactureYear  the year the car was manufactured
     * @param engineCapacity   the capacity of the engine
     */
    public Car(String carName, String manufacturerName, int manufactureYear, double engineCapacity) {
        this.carName = Validator.validateString(carName, "Incorrect car name!");
        this.manufacturerName = Validator.validateString(manufacturerName, "Incorrect manufacturer name");
        this.manufactureYear = Validator.validateYear(manufactureYear);
        this.engineCapacity = Validator.validateEngineCapacity(engineCapacity);
    }

    /**
     * Returns the name of the car.
     *
     * @return a String representing the car's name
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Sets the name of the car.
     *
     * @param carName the car's name to be set
     */
    public void setCarName(String carName) {
        this.carName = Validator.validateString(carName, "Incorrect car name!");
    }

    /**
     * Returns the name of the manufacturer.
     *
     * @return a String representing the car's manufacturer name
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the name of the car's manufacturer.
     *
     * @param manufacturerName the name of the car's manufacturer to be set
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = Validator.validateString(manufacturerName, "Incorrect manufacturer name");
    }

    /**
     * Returns the year the car was manufactured.
     *
     * @return the year the car was manufactured, as an integer
     */
    public int getManufactureYear() {
        return manufactureYear;
    }

    /**
     * Sets the manufacture year of the car.
     *
     * @param manufactureYear the manufacture year to be set
     */
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = Validator.validateYear(manufactureYear);
    }

    /**
     * Returns the engine capacity of the car.
     *
     * @return the engine capacity, as a double
     */
    public double getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the engine capacity of the car.
     *
     * @param engineCapacity the engine capacity to be set
     */
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = Validator.validateEngineCapacity(engineCapacity);
    }

    /**
     * Returns a string representation of the car,
     * including the car's name, manufacturer's name, manufacture year, and engine capacity.
     *
     * @return a string representation of the car
     */
    @Override
    public String toString() {
        return "Car Name: " + carName + "\n" +
                "Manufacturer Name: " + manufacturerName + "\n" +
                "Manufacture Year: " + manufactureYear + "\n" +
                "Engine Capacity: " + engineCapacity;
    }
}