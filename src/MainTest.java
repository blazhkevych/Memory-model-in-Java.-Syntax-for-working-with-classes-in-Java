import Tasks.T1.Human;
import Tasks.T2.City;
import Tasks.T3.Country;
import Tasks.T4.Fraction;
import Tasks.T5.Book;
import Tasks.T6.Car;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * This class is used as test suite for all classes.
 * It ensures that the classes are correct and works as designed.
 */
public class MainTest {

    /**
     * Test functionality of the Human class
     * Tests include: creation of Human object, testing all getters,
     * updating with setters and validating the toString() method.
     */
    public static void testHuman() {
        System.out.println("\n================= Start of Human test =================\n");

        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        LocalDate newBirthDate = LocalDate.of(2000, 1, 1);

        Human human = new Human("FullName", birthDate, "+380987654321", "City", "Country", "HomeAddress");

        System.out.println("Testing human getters...");
        System.out.println("Full name: " + ("FullName".equals(human.getFullName()) ? "PASS" : "FAIL"));
        System.out.println("Birth date: " + (birthDate.equals(human.getBirthDate()) ? "PASS" : "FAIL"));
        System.out.println("Phone number: " + ("+380987654321".equals(human.getPhoneNumber()) ? "PASS" : "FAIL"));
        System.out.println("City: " + ("City".equals(human.getCity()) ? "PASS" : "FAIL"));
        System.out.println("Country: " + ("Country".equals(human.getCountry()) ? "PASS" : "FAIL"));
        System.out.println("Home address: " + ("HomeAddress".equals(human.getHomeAddress()) ? "PASS" : "FAIL"));

        System.out.println("\nTesting human setters...");
        human.setFullName("NewFullName");
        human.setBirthDate(newBirthDate);
        human.setPhoneNumber("+380987654322");
        human.setCity("NewCity");
        human.setCountry("NewCountry");
        human.setHomeAddress("NewHomeAddress");

        System.out.println("Full name: " + ("NewFullName".equals(human.getFullName()) ? "PASS" : "FAIL"));
        System.out.println("Birth date: " + (newBirthDate.equals(human.getBirthDate()) ? "PASS" : "FAIL"));
        System.out.println("Phone number: " + ("+380987654322".equals(human.getPhoneNumber()) ? "PASS" : "FAIL"));
        System.out.println("City: " + ("NewCity".equals(human.getCity()) ? "PASS" : "FAIL"));
        System.out.println("Country: " + ("NewCountry".equals(human.getCountry()) ? "PASS" : "FAIL"));
        System.out.println("Home address: " + ("NewHomeAddress".equals(human.getHomeAddress()) ? "PASS" : "FAIL"));

        System.out.println("\nTesting toString...");
        String expectedToString = "Human {fullName='NewFullName', birthDate=2000-01-01, phoneNumber='+380987654322', city='NewCity', country='NewCountry', homeAddress='NewHomeAddress'}";
        System.out.println("toString: " + (expectedToString.equals(human.toString()) ? "PASS" : "FAIL"));

        System.out.println("\n================= End of Human test =================\n");
    }

    /**
     * Test functionality of the City class
     * Tests include: creation of City object, testing all getters,
     * updating with setters and validating the toString() method.
     */
    public static void testCity() {
        System.out.println("\n================= Start of City test =================\n");

        City city = new City("CityName", "RegionName", "CountryName", 1000000, 12345, "+38044");

        System.out.println("Testing city getters...");
        System.out.println("City name: " + ("CityName".equals(city.getCityName()) ? "PASS" : "FAIL"));
        System.out.println("Region name: " + ("RegionName".equals(city.getRegionName()) ? "PASS" : "FAIL"));
        System.out.println("Country name: " + ("CountryName".equals(city.getCountryName()) ? "PASS" : "FAIL"));
        System.out.println("Population: " + (1000000 == city.getPopulation() ? "PASS" : "FAIL"));
        System.out.println("Postal code: " + (12345 == city.getPostalCode() ? "PASS" : "FAIL"));
        System.out.println("Telephone code: " + ("+38044".equals(city.getTelephoneCode()) ? "PASS" : "FAIL"));

        System.out.println("\nTesting city setters...");
        city.setCityName("NewCityName");
        city.setRegionName("NewRegionName");
        city.setCountryName("NewCountryName");
        city.setPopulation(2000000);
        city.setPostalCode(54321);
        city.setTelephoneCode("+38055");

        System.out.println("City name: " + ("NewCityName".equals(city.getCityName()) ? "PASS" : "FAIL"));
        System.out.println("Region name: " + ("NewRegionName".equals(city.getRegionName()) ? "PASS" : "FAIL"));
        System.out.println("Country name: " + ("NewCountryName".equals(city.getCountryName()) ? "PASS" : "FAIL"));
        System.out.println("Population: " + (2000000 == city.getPopulation() ? "PASS" : "FAIL"));
        System.out.println("Postal code: " + (54321 == city.getPostalCode() ? "PASS" : "FAIL"));
        System.out.println("Telephone code: " + ("+38055".equals(city.getTelephoneCode()) ? "PASS" : "FAIL"));

        System.out.println("\nTesting toString...");
        String expectedToString = "City{name='NewCityName', region='NewRegionName', country='NewCountryName', population=2000000, postalCode=54321, telCode='+38055'}";
        System.out.println("toString: " + (expectedToString.equals(city.toString()) ? "PASS" : "FAIL"));

        System.out.println("\n================= End of City test =================\n");
    }

    /**
     * Test functionality of the Country class
     * Tests include: creation of Country object, testing all getters,
     * updating with setters and validating the toString() method.
     */
    public static void testCountry() {
        System.out.println("\n================= Start of Country test =================\n");

        long population = 37661000L;
        long newPopulation = 46660000L;
        List<String> cityNames = Arrays.asList("City1", "City2");
        List<String> newCityNames = Arrays.asList("NewCity1", "NewCity2");

        Country country = new Country("CountryName", "ContinentName", cityNames, population, "CountryCode", "CapitalName");

        System.out.println("Testing country getters...");
        System.out.println("Country name: " + ("CountryName".equals(country.getCountryName()) ? "PASS" : "FAIL"));
        System.out.println("Continent name: " + ("ContinentName".equals(country.getContinentName()) ? "PASS" : "FAIL"));
        System.out.println("Cities name: " + (cityNames.equals(country.getCityNames()) ? "PASS" : "FAIL"));
        System.out.println("Population: " + (population == country.getPopulation() ? "PASS" : "FAIL"));
        System.out.println("Country code: " + ("CountryCode".equals(country.getCountryCode()) ? "PASS" : "FAIL"));
        System.out.println("Capital name: " + ("CapitalName".equals(country.getCapitalName()) ? "PASS" : "FAIL"));

        System.out.println("\nTesting country setters...");
        country.setCountryName("NewCountryName");
        country.setContinentName("NewContinentName");
        country.setCityNames(newCityNames);
        country.setPopulation(newPopulation);
        country.setCountryCode("NewCountryCode");
        country.setCapitalName("NewCapitalName");

        System.out.println("Country name: " + ("NewCountryName".equals(country.getCountryName()) ? "PASS" : "FAIL"));
        System.out.println("Continent name: " + ("NewContinentName".equals(country.getContinentName()) ? "PASS" : "FAIL"));
        System.out.println("Cities name: " + (newCityNames.equals(country.getCityNames()) ? "PASS" : "FAIL"));
        System.out.println("Population: " + (newPopulation == country.getPopulation() ? "PASS" : "FAIL"));
        System.out.println("Country code: " + ("NewCountryCode".equals(country.getCountryCode()) ? "PASS" : "FAIL"));
        System.out.println("Capital name: " + ("NewCapitalName".equals(country.getCapitalName()) ? "PASS" : "FAIL"));

        System.out.println("\nTesting toString...");
        String expectedToString = "Country [name: NewCountryName, continent: NewContinentName, capital: NewCapitalName, population: 46660000, cities: [NewCity1, NewCity2], code: NewCountryCode]";
        System.out.println("toString: " + (expectedToString.equals(country.toString()) ? "PASS" : "FAIL"));

        System.out.println("\n================= End of Country test =================\n");
    }

    /**
     * Test functionality of the Fraction class
     * Tests include: creation of Fraction object, testing all getters,
     * updating with setters, performing arithmetic operations and validating the toString() method.
     */
    public static void testFraction() {
        System.out.println("\n================= Start of Fraction test =================\n");

        // Creating fraction instances for testing arithmetic operations
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        System.out.println("Testing getters...");
        System.out.println("Numerator: " + (1 == fraction1.getNumerator() ? "PASS" : "FAIL"));
        System.out.println("Denominator: " + (2 == fraction1.getDenominator() ? "PASS" : "FAIL"));

        System.out.println("\nTesting setters...");
        fraction1.setNumerator(3);
        fraction1.setDenominator(5);
        System.out.println("Numerator: " + (3 == fraction1.getNumerator() ? "PASS" : "FAIL"));
        System.out.println("Denominator: " + (5 == fraction1.getDenominator() ? "PASS" : "FAIL"));

        System.out.println("\nTesting arithmetic operations...");
        Fraction result; // fraction to hold the result of operations

        result = fraction1.add(fraction2);
        System.out.println("Add: " + result.toString());

        result = fraction1.subtract(fraction2);
        System.out.println("Subtract: " + result.toString());

        result = fraction1.multiply(fraction2);
        System.out.println("Multiply: " + result.toString());

        result = fraction1.divide(fraction2);
        System.out.println("Divide: " + result.toString());

        System.out.println("\nTesting toString...");
        System.out.println("toString: " + ("3/5".equals(fraction1.toString()) ? "PASS" : "FAIL"));

        System.out.println("\n================= End of Fraction test =================\n");
    }

    /**
     * Test functionality of the Book class. Since the object creation uses Builder pattern,
     * the tests make use of the Builder. Tests include: creation of Book object via Builder, testing all getters,
     * and validating the toString() method.
     */
    public static void testBook() {
        System.out.println("\n================= Start of Book test =================\n");

        // Test book creation
        Book book1 = new Book.Builder("Title1", "Author1")
                .year(2021)
                .publishingHouse("PublishingHouse1")
                .genre("Genre1")
                .numberOfPages(100)
                .build();

        System.out.println("Testing getters...");
        System.out.println("Title: " + ("Title1".equals(book1.getTitle()) ? "PASS" : "FAIL"));
        System.out.println("Author: " + ("Author1".equals(book1.getAuthor()) ? "PASS" : "FAIL"));
        System.out.println("Year: " + (2021 == book1.getYear() ? "PASS" : "FAIL"));
        System.out.println("Publishing house: " + ("PublishingHouse1".equals(book1.getPublishingHouse()) ? "PASS" : "FAIL"));
        System.out.println("Genre: " + ("Genre1".equals(book1.getGenre()) ? "PASS" : "FAIL"));
        System.out.println("Number of pages: " + (100 == book1.getNumberOfPages() ? "PASS" : "FAIL"));

        System.out.println("\nTesting toString...");
        String expectedToString = "Book: Title1, Author: Author1, Year: 2021, Publishing house: PublishingHouse1, Genre: Genre1, Number of pages: 100";
        System.out.println("toString: " + (expectedToString.equals(book1.toString()) ? "PASS" : "FAIL"));

        System.out.println("\n================= End of Book test =================\n");
    }

    /**
     * Test functionality of the Car class
     * This includes testing the creation of a Car object, verifying getter method functionality,
     * testing the setting of new property values with setter methods, and checking the string
     * output of the toString method.
     */
    public static void testCar() {
        System.out.println("\n================= Start of Car test =================\n");

        // Test car creation
        Car car1 = new Car("Car1", "Manufacturer1", 2021, 2.5);

        System.out.println("Testing getters...");
        System.out.println("Car Name: " + ("Car1".equals(car1.getCarName()) ? "PASS" : "FAIL"));
        System.out.println("Manufacturer Name: " + ("Manufacturer1".equals(car1.getManufacturerName()) ? "PASS" : "FAIL"));
        System.out.println("Manufacture Year: " + (2021 == car1.getManufactureYear() ? "PASS" : "FAIL"));
        System.out.println("Engine Capacity: " + (2.5 == car1.getEngineCapacity() ? "PASS" : "FAIL"));

        System.out.println("\nTesting setters...");
        car1.setCarName("NewCar1");
        car1.setManufacturerName("NewManufacturer1");
        car1.setManufactureYear(2022);
        car1.setEngineCapacity(3.0);

        System.out.println("Car Name: " + ("NewCar1".equals(car1.getCarName()) ? "PASS" : "FAIL"));
        System.out.println("Manufacturer Name: " + ("NewManufacturer1".equals(car1.getManufacturerName()) ? "PASS" : "FAIL"));
        System.out.println("Manufacture Year: " + (2022 == car1.getManufactureYear() ? "PASS" : "FAIL"));
        System.out.println("Engine Capacity: " + (3.0 == car1.getEngineCapacity() ? "PASS" : "FAIL"));

        System.out.println("\nTesting toString...");
        String expectedToString = "Car Name: NewCar1\nManufacturer Name: NewManufacturer1\nManufacture Year: 2022\nEngine Capacity: 3.0";
        System.out.println("toString: " + (expectedToString.equals(car1.toString()) ? "PASS" : "FAIL"));

        System.out.println("\n================= End of Car test =================\n");
    }

    /**
     * This is the main method that serves as a tests.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        testHuman();
        testCity();
        testCountry();
        testFraction();
        testBook();
        testCar();
    }
}