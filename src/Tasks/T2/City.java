package Tasks.T2;

import Tasks.Validator;

/**
 * Represents a City, with various related information attributes.
 */
public class City {
    /**
     * The name of the city.
     */
    private String cityName;

    /**
     * The name of the region.
     */
    private String regionName;

    /**
     * The name of the country.
     */
    private String countryName;

    /**
     * The estimated or exact population of the city.
     */
    private long population;

    /**
     * The official postal code of the city.
     */
    private int postalCode;

    /**
     * The telephone area code of the city.
     */
    private String telephoneCode;

    /**
     * Constructs a new City.
     *
     * @param cityName      The name of the city.
     * @param regionName    The name of the region.
     * @param countryName   The name of the country.
     * @param population    The population of the city.
     * @param postalCode    The postal code of the city.
     * @param telephoneCode The telephone code of the city.
     */
    public City(String cityName, String regionName, String countryName, long population, int postalCode, String telephoneCode) {
        this.cityName = Validator.validateString(cityName, "Incorrect city name!");
        this.regionName = Validator.validateString(regionName, "Incorrect region name!");
        this.countryName = Validator.validateString(countryName, "Incorrect country name!");
        this.population = Validator.validatePopulation(population);
        this.postalCode = Validator.validatePostalCode(postalCode);
        this.telephoneCode = Validator.validateTelephoneCode(telephoneCode);
    }

    /**
     * Returns city name.
     *
     * @return the name of the city.
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the city name.
     *
     * @param cityName the new city name.
     */
    public void setCityName(String cityName) {
        this.cityName = Validator.validateString(cityName, "Incorrect city name!");
    }

    /**
     * Returns region name.
     *
     * @return the name of the region.
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the region name.
     *
     * @param regionName the new region name.
     */
    public void setRegionName(String regionName) {
        this.regionName = Validator.validateString(regionName, "Incorrect region name!");
    }

    /**
     * Returns country name.
     *
     * @return the name of the country.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the country name.
     *
     * @param countryName the new country name.
     */
    public void setCountryName(String countryName) {
        this.countryName = Validator.validateString(countryName, "Incorrect country name!");
    }

    /**
     * Returns population.
     *
     * @return the population of the city.
     */
    public long getPopulation() {
        return population;
    }

    /**
     * Sets the city population.
     *
     * @param population the new population of the city.
     */
    public void setPopulation(long population) {
        this.population = Validator.validatePopulation(population);
    }

    /**
     * Returns postal code.
     *
     * @return the postal code of the city.
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     *
     * @param postalCode the new postal code of the city.
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = Validator.validatePostalCode(postalCode);
    }

    /**
     * Returns telephone code.
     *
     * @return the telephone code of the city.
     */
    public String getTelephoneCode() {
        return telephoneCode;
    }

    /**
     * Sets the telephone code.
     *
     * @param telephoneCode the new telephone code of the city.
     */
    public void setTelephoneCode(String telephoneCode) {
        this.telephoneCode = Validator.validateTelephoneCode(telephoneCode);
    }

    /**
     * Returns the string representation of city.
     *
     * @return The string representation of the city.
     */
    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                ", postalCode='" + postalCode + '\'' +
                ", telephoneCode='" + telephoneCode + '\'' +
                '}';
    }
}


