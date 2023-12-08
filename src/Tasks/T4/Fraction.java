package Tasks.T4;

/**
 * A class that represents a mathematical fraction.
 * This class includes methods for basic arithmetic operations.
 * The fraction is always maintained in its simplified form.
 * It is designed to prevent division by zero by throwing an IllegalArgumentException.
 */
public class Fraction {
    /**
     * Numerator of the fraction
     */
    private int numerator;
    /**
     * Denominator of the fraction
     */
    private int denominator;

    /**
     * Constructor for creating a Fraction instance with specified numerator and denominator.
     * Note that the denominator cannot be zero. Denominator as zero will result in IllegalArgumentException.
     *
     * @param numerator   the numerator of the fraction
     * @param denominator the denominator of the fraction
     * @throws IllegalArgumentException if denominator is zero
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    /**
     * Getter for numerator.
     *
     * @return the numerator of the fraction
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Setter for numerator.
     * Fraction is reduced to simplest form after setting numerator.
     *
     * @param numerator the new numerator for the fraction
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    /**
     * Getter for denominator.
     *
     * @return the denominator of the fraction
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Setter for denominator.
     * Note that the denominator cannot be zero. Denominator as zero will result in an IllegalArgumentException.
     * Fraction is reduced to simplest form after setting denominator.
     *
     * @param denominator the new denominator for the fraction
     * @throws IllegalArgumentException if denominator is zero
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
        reduce();
    }

    /**
     * Method to obtain string representation of object.
     *
     * @return the fraction in the form - numerator/denominator
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * Method to add two Fraction instances.
     *
     * @param secondFraction another Fraction instance to be added to current instance
     * @return a new Fraction instance that is the sum of this and secondFraction
     * @throws IllegalArgumentException if secondFraction is null
     */
    public Fraction add(Fraction secondFraction) {
        checkFraction(secondFraction);
        int newNumerator = this.numerator * secondFraction.getDenominator() + secondFraction.getNumerator() * this.denominator;
        int newDenominator = this.denominator * secondFraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * Subtracts secondFraction from this Fraction instance.
     * Throws an IllegalArgumentException if the secondFraction is null.
     *
     * @param secondFraction The Fraction to be subtracted from this Fraction.
     * @return A new Fraction that is the result of the subtraction.
     */
    public Fraction subtract(Fraction secondFraction) {
        checkFraction(secondFraction);
        int newNumerator = this.numerator * secondFraction.getDenominator() - secondFraction.getNumerator() * this.denominator;
        int newDenominator = this.denominator * secondFraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * Multiplies this Fraction instance with a second Fraction.
     * Throws an IllegalArgumentException if the secondFraction is null.
     *
     * @param secondFraction Fractions to be multiplied with this Fraction.
     * @return A new Fraction that is the result of the multiplication.
     */
    public Fraction multiply(Fraction secondFraction) {
        checkFraction(secondFraction);
        int newNumerator = this.numerator * secondFraction.getNumerator();
        int newDenominator = this.denominator * secondFraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * Divides this Fraction instance by a second Fraction.
     * Throws an IllegalArgumentException if the secondFraction is null or has a numerator of zero.
     *
     * @param secondFraction Fraction by which this Fraction must be divided.
     * @return A new Fraction that is the result of the division.
     * @throws IllegalArgumentException If secondFraction is zero or null
     */
    public Fraction divide(Fraction secondFraction) {
        checkFraction(secondFraction);
        if (secondFraction.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int newNumerator = this.numerator * secondFraction.getDenominator();
        int newDenominator = this.denominator * secondFraction.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * Reduce the fraction to its simplest form by dividing both the numerator and denominator
     * by their greatest common divisor (gcd).
     */
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    /**
     * Recursively calculates the greatest common divisor (gcd) of two integers a and b.
     * The gcd is the largest positive integer that divides both a and b without leaving a remainder.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of a and b.
     */
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    /**
     * Checks if the Fraction instance passed as an argument is null.
     * Throws an IllegalArgumentException if it is.
     *
     * @param secondFraction Fraction instance to be checked for nullity.
     * @throws IllegalArgumentException If secondFraction is null.
     */
    private void checkFraction(Fraction secondFraction) {
        if (secondFraction == null) {
            throw new IllegalArgumentException("Fraction cannot be null");
        }
    }
}