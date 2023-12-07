package Tasks.T1;

import java.time.LocalDate;

import Tasks.Validator;

/**
 * This Human class represents a human.
 */
public class Human {
    /**
     * Full name of the human.
     */
    private String fullName;
    /**
     * Date of birth of the human.
     */
    private LocalDate birthDate;
    /**
     * Phone number of the human.
     */
    private String phoneNumber;
    /**
     * City where the human resides.
     */
    private String city;
    /**
     * Country where the human resides.
     */
    private String country;
    /**
     * Home address of the human.
     */
    private String homeAddress;

    /**
     * A constructor that initializes a human instance.
     *
     * @param fullName    the full name of a human.
     * @param birthDate   a human's date of birth.
     * @param phoneNumber a human's phone number.
     * @param city        the city where a human lives.
     * @param country     the country where a human resides.
     * @param homeAddress a human's home address.
     */
    public Human(String fullName, LocalDate birthDate, String phoneNumber, String city, String country, String homeAddress) {
        this.fullName = Validator.validateString(fullName, "Incorrect full name!");
        this.birthDate = Validator.validateDate(birthDate);
        this.phoneNumber = Validator.validateTelephoneNumber(phoneNumber);
        this.city = Validator.validateString(city, "Incorrect city name!");
        this.country = Validator.validateString(country, "Incorrect country name!");
        this.homeAddress = Validator.validateString(homeAddress, "Incorrect home address!");
    }

    /**
     * A getter for the fullName property.
     *
     * @return String the full name of a human.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * A setter for the fullName property.
     * It throws an IllegalStateException when the provided name is incorrect/empty.
     *
     * @param fullName the full name to be set.
     */
    public void setFullName(String fullName) {
        this.fullName = Validator.validateString(fullName, "Incorrect full name!");
    }

    /**
     * A getter for the birthDate property.
     *
     * @return LocalDate the birthdate of a human.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * A setter for the birthDate property.
     * It throws an IllegalStateException when the provided date is incorrect/empty.
     *
     * @param birthDate the birthdate to be set.
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = Validator.validateDate(birthDate);
    }

    /**
     * A getter for the phoneNumber property.
     *
     * @return String the phone number of a human.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * A setter for the phoneNumber property.
     * It throws an IllegalStateException when the provided phone number is invalid/empty.
     *
     * @param phoneNumber the phone number to be set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Validator.validateTelephoneNumber(phoneNumber);
    }

    /**
     * A getter for the city property.
     *
     * @return String the city where a human lives
     */
    public String getCity() {
        return city;
    }

    /**
     * A setter for the city property.
     * It throws an IllegalStateException when the provided city name is incorrect/empty.
     *
     * @param city the city to be set.
     */
    public void setCity(String city) {
        this.city = Validator.validateString(city, "Incorrect city name!");
    }

    /**
     * A getter for the country property.
     *
     * @return String the country where a human resides.
     */
    public String getCountry() {
        return country;
    }

    /**
     * A setter for the country property.
     * It throws an IllegalStateException when the provided country name is incorrect/empty.
     *
     * @param country the country to be set.
     */
    public void setCountry(String country) {
        this.country = Validator.validateString(country, "Incorrect country name!");
    }

    /**
     * A getter for the homeAddress property.
     *
     * @return String a human's home address.
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * A setter for the homeAddress property.
     * It throws an IllegalStateException when the provided address is incorrect/empty.
     *
     * @param homeAddress the home address to be set.
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = Validator.validateString(homeAddress, "Incorrect home address!");
    }

    /**
     * A method that returns a string representation of a Human instance.
     *
     * @return String the string representation of a Human instance.
     */
    @Override
    public String toString() {
        return "Human {" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}