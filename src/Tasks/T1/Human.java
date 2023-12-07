package Tasks.T1;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * This Human class represents a human.
 * It follows Java Code Conventions and OOP principles.
 */
public class Human {
    private String fullName;
    private LocalDate birthDate;
    private String phoneNumber;
    private String city;
    private String country;
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
        this.setFullName(fullName);
        this.setBirthDate(birthDate);
        this.setPhoneNumber(phoneNumber);
        this.setCity(city);
        this.setCountry(country);
        this.setHomeAddress(homeAddress);
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
        this.fullName = this.validateString(fullName, "Incorrect full name!");
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
        this.birthDate = this.validateDate(birthDate);
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
        phoneNumber = this.validateString(phoneNumber, "Phone number cannot be empty!");
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalStateException("Invalid phone number!");
        }
        this.phoneNumber = phoneNumber;
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
        this.city = this.validateString(city, "Incorrect city!");
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
        this.country = this.validateString(country, "Incorrect country!");
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
        this.homeAddress = this.validateString(homeAddress, "Incorrect home address!");
    }

    /**
     * A helper method to validate the input for string properties.
     * It throws an IllegalStateException when the provided string is null or empty.
     *
     * @param input The string to be validated.
     * @param errorMessage The error message to be returned if validation fails.
     * @return String the input string if it passes validation.
     */
    private String validateString(String input, String errorMessage) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalStateException(errorMessage);
        }
        return input;
    }

    /**
     * A helper method to validate the input for date properties.
     * It throws an IllegalStateException when the provided date is null or in the future.
     *
     * @param date The date to be validated.
     * @return LocalDate the input date if it passes validation.
     */
    private LocalDate validateDate(LocalDate date) {
        if (date == null || date.isAfter(LocalDate.now())) {
            throw new IllegalStateException("Incorrect birth date!");
        }
        return date;
    }

    /**
     * A helper method to check if the provided phone number is valid.
     *
     * @param phoneNumber The phone number to be validated.
     * @return boolean true if phone number is valid, false otherwise.
     */
    private boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\+38(050|063|066|073|091|092|093|094|095|096|097|098|099)\\d{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }

    /**
     * A method that returns a string representation of a Human instance.
     *
     * @return String the string representation of a Human instance.
     */
    @Override
    public String toString() {
        return "Human{" + "fullName='" + fullName + '\'' + ", birthDate=" + birthDate + ", phoneNumber='" + phoneNumber + '\'' + ", city='" + city + '\'' + ", country='" + country + '\'' + ", homeAddress='" + homeAddress + '\'' + '}';
    }
}