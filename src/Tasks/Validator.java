package Tasks;

import java.time.LocalDate;
import java.util.List;

public class Validator {
    /**
     * Validates the provided telephone code.
     * Ukrainian telephone codes start with "+380" followed by a city code (2-3 digits).
     *
     * @param telephoneCode the telephone code to validate.
     * @return true if the telephone code is valid, false otherwise.
     */
    private static boolean isValidTelephoneCode(String telephoneCode) {
        // Matches "+380" followed by exactly 2-3 digits (city code)
        return telephoneCode.matches("\\+380\\d{2,3}");
    }

    /**
     * Validates and returns the provided telephone code if it's valid.
     * If the telephone code is invalid, it throws an IllegalStateException.
     *
     * @param telephoneCode the telephone code to be validated.
     * @return the same telephone code if it is valid.
     * @throws IllegalStateException If the telephone code is invalid.
     */
    public static String validateTelephoneCode(String telephoneCode) {
        if (!isValidTelephoneCode(telephoneCode)) {
            throw new IllegalStateException("Incorrect telephone code");
        }
        return telephoneCode;
    }

    /**
     * Validates the provided telephone number.
     * Ukrainian telephone numbers start with "+380" followed by 9 digits.
     *
     * @param telephoneNumber the telephone number to validate.
     * @return true if the telephone number is valid, false otherwise.
     */
    private static boolean isValidTelephoneNumber(String telephoneNumber) {
        // Matches "+380" followed by exactly 9 digits
        return telephoneNumber.matches("\\+380\\d{9}");
    }

    /**
     * Validates and returns the provided telephone number if it's valid.
     * If the telephone number is invalid, it throws an IllegalStateException.
     *
     * @param telephoneNumber the telephone number to be validated.
     * @return the same telephone number if it is valid.
     * @throws IllegalStateException If the telephone number is invalid.
     */
    public static String validateTelephoneNumber(String telephoneNumber) {
        if (!isValidTelephoneNumber(telephoneNumber)) {
            throw new IllegalStateException("Incorrect telephone number");
        }
        return telephoneNumber;
    }

    /**
     * Validates the provided postal code. Ukrainian postal codes must contain exactly
     * five digits.
     *
     * @param postalCode the postal code to validate.
     * @return true if the postal code is valid, false otherwise.
     */
    private static boolean isValidPostalCode(int postalCode) {
        int length = (int) (Math.log10(postalCode) + 1);
        return length == 5;
    }

    /**
     * Validates the given postal code. If the postal code is invalid, an exception will be thrown.
     * Ukrainian postal codes must have exactly five digits.
     *
     * @param postalCode the postal code to validate.
     * @return the same postal code if it is valid.
     * @throws IllegalStateException if the postal code is invalid.
     */
    public static int validatePostalCode(int postalCode) {
        if (!(isValidPostalCode(postalCode))) {
            throw new IllegalStateException("Incorrect postal code");
        }
        return postalCode;
    }

    /**
     * Validates the provided population value.
     *
     * @param population the population value to validate.
     * @return true if the population is valid, false otherwise.
     */
    private static boolean isValidPopulation(long population) {
        return population >= 0;
    }

    /**
     * Validates the provided population value.
     * A population is considered valid if it's not negative.
     *
     * @param population the population value to validate.
     * @return population if the population is valid.
     * @throws IllegalStateException if the population is invalid.
     */
    public static long validatePopulation(long population) {
        if (!(isValidPopulation(population))) {
            throw new IllegalStateException("Incorrect population");
        }
        return population;
    }

    /**
     * A helper method to validate the input for string properties.
     * It throws an IllegalStateException when the provided string is null or empty.
     *
     * @param input        The string to be validated.
     * @param errorMessage The error message to be returned if validation fails.
     * @return String the input string if it passes validation.
     */
    public static String validateString(String input, String errorMessage) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalStateException(errorMessage);
        }
        return input;
    }

    /**
     * Overloaded helper method to validate the input for list of strings.
     * It throws an IllegalStateException when the provided list is null, contains null,
     * or contains an empty or whitespace-only string.
     *
     * @param input        The list of strings to be validated.
     * @param errorMessage The error message to be returned if validation fails.
     * @return List<String> the input list if it passes validation.
     */
    public static List<String> validateString(List<String> input, String errorMessage) {
        if (input == null) {
            throw new IllegalStateException(errorMessage);
        }
        for (String str : input) {
            if (str == null || str.trim().isEmpty()) {
                throw new IllegalStateException(errorMessage);
            }
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
    public static LocalDate validateDate(LocalDate date) {
        if (date == null || date.isAfter(LocalDate.now())) {
            throw new IllegalStateException("Incorrect birth date!");
        }
        return date;
    }

    /**
     * Validates the year.
     *
     * @param year the year to be validated
     * @return true if the year is valid, false otherwise
     * @throws IllegalArgumentException if the year is less than or equal to 0
     */
    public static boolean isValidYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive integer.");
        }

        // Assuming the book cannot be published in the future,
        // the year should also not be greater than the current year.
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("Year cannot be in the future.");
        }

        return true;
    }

    /**
     * Validates the year and returns it if it is valid.
     *
     * @param year the year to be validated
     * @return the validated year
     * @throws IllegalArgumentException if the year is less than or equal to 0 or greater than the current year
     */
    public static int validateYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive integer.");
        }

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("Year cannot be in the future.");
        }

        return year;
    }

    /**
     * Validates the number of pages in the book.
     *
     * @param numberOfPages the number of pages to be validated
     * @return true if the number of pages is valid, false otherwise
     * @throws IllegalArgumentException if the numberOfPages is less than or equal to 0
     */
    public static boolean isValidNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Number of pages must be a positive integer.");
        }
        return true;
    }

    /**
     * Validates the engine capacity.
     *
     * @param engineCapacity the engine capacity to be validated
     * @return the validated engine capacity
     * @throws IllegalArgumentException if the engine capacity is less than or equal to 0 or beyond a sensible limit
     */
    public static double validateEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            throw new IllegalArgumentException("Engine Capacity must be a positive value.");
        }

        // Assuming the engine capacity for current cars doesn't exceed certain sensible limit (let's say 10L as a generic limit),
        // the engineCapacity should also not be larger than this limit.
        if (engineCapacity > 10) {
            throw new IllegalArgumentException("Engine Capacity should not exceed the top limit.");
        }

        return engineCapacity;
    }
}
