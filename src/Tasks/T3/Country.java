package Tasks.T3;

import java.util.List;

import Tasks.Validator;

/**
 * Class represents a Country entity.
 */
public class Country {
    /**
     * The name of the country
     */
    private String countryName;
    /**
     * The name of the continent
     */
    private String continentName;
    /**
     * List of names of cities in the country
     */
    private List<String> cityNames;
    /**
     * The population of the country
     */
    private long population;
    /**
     * The country code for international communication
     */
    private String countryCode;
    /**
     * The name of the capital city of the country
     */
    private String capitalName;

    /**
     * This constructor creates a new Country object with the given parameters after validating them.
     *
     * @param countryName   Name of the country, cannot be null or an empty string.
     * @param continentName Name of the continent to which the country belongs, cannot be null or an empty string.
     * @param cityNames     List of city names in the country. The list itself or any string in it cannot be null or empty.
     * @param population    The population of the country. Must be a positive long number.
     * @param countryCode   The country code. Cannot be null, empty or invalid.
     * @param capitalName   The name of the capital of the country. Must be a valid string.
     * @throws IllegalStateException if any of the parameters are invalid.
     */
    public Country(String countryName, String continentName, List<String> cityNames, long population, String countryCode, String capitalName) {
        this.countryName = Validator.validateString(countryName, "Incorrect country name!");
        this.continentName = Validator.validateString(continentName, "Incorrect continent name!");
        this.cityNames = Validator.validateString(cityNames, "Incorrect city names!");
        this.population = Validator.validatePopulation(population);
        this.countryCode = Validator.validateString(countryCode, "Incorrect country code!");
        this.capitalName = Validator.validateString(capitalName, "Incorrect capital name!");
    }

    /**
     * Returns the name of the country.
     *
     * @return A string representing the country name.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the country name. Validation of this name is done by Validator class.
     *
     * @param countryName The name to set for the country.
     * @throws IllegalArgumentException if the provided country name is invalid.
     */
    public void setCountryName(String countryName) {
        this.countryName = Validator.validateString(countryName, "Incorrect country name!");
    }

    /**
     * Gets the name of the continent.
     *
     * @return a string representing the name of the continent.
     */
    public String getContinentName() {
        return continentName;
    }

    /**
     * Sets the name of the continent.
     *
     * @param continentName the new name of the continent.
     *                      It should not be null or an empty string.
     *                      It will be validated by Validator.
     */
    public void setContinentName(String continentName) {
        this.continentName = Validator.validateString(continentName, "Incorrect continent name!");
    }

    /**
     * Gets the names of the cities.
     *
     * @return a list of strings representing the names of the cities.
     */
    public List<String> getCityNames() {
        return cityNames;
    }

    /**
     * Sets the names of the cities.
     *
     * @param cityNames the new list of city names.
     *                  The chosen names should not be null, contain null or empty strings.
     *                  The list will be validated by Validator.
     */
    public void setCityNames(List<String> cityNames) {
        this.cityNames = Validator.validateString(cityNames, "Incorrect city names!");
    }

    /**
     * Gets the population.
     *
     * @return a long representing the population.
     */
    public long getPopulation() {
        return population;
    }

    /**
     * Sets the population.
     *
     * @param population the new population.
     *                   It should not be negative.
     *                   The population will be validated by Validator.
     */
    public void setPopulation(long population) {
        this.population = Validator.validatePopulation(population);
    }

    /**
     * Gets the country code.
     *
     * @return a string representing the country code.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the country code.
     *
     * @param countryCode the new country code.
     *                    It should not be null or an empty string.
     *                    It will be validated by Validator.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = Validator.validateString(countryCode, "Incorrect country code!");
    }

    /**
     * Gets the capital name.
     *
     * @return a string representing the capital name.
     */
    public String getCapitalName() {
        return capitalName;
    }

    /**
     * Sets the capital name.
     *
     * @param capitalName the new capital name.
     *                    It should not be null or an empty string.
     *                    It will be validated by Validator.
     */
    public void setCapitalName(String capitalName) {
        this.capitalName = Validator.validateString(capitalName, "Incorrect capital name!");
    }

    /**
     * Converts the country object's info to string.
     *
     * @return a string representing the formatted info of the country.
     */
    @Override
    public String toString() {
        return String.format("Country [name: %s, continent: %s, capital: %s, population: %d, cities: %s, code: %s]",
                countryName, continentName, capitalName, population, cityNames, countryCode);
    }
}