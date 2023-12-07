import Tasks.T1.Human;

import java.time.LocalDate;

/**
 * This is the main test class for classes testing.
 */
public class MainTest {
    /**
     * This method tests functions of Human class
     */
    public static void testHuman() {
        // Initialize a Human object
        Human human;
        try {
            // Creating a new instance of Human with correct input values
            human = new Human("John Doe", LocalDate.of(2000, 1, 1), "+380501234567", "Kiev", "Ukraine", "Street1, 1");
            // Printing the Human object to the console
            System.out.println(human);

            // Testing setters with incorrect input values:
            try {
                //human.setFullName("");  // Set an empty name
                //human.setPhoneNumber("1234");  // set a phone number with insufficient digits
                human.setBirthDate(LocalDate.of(2030, 1, 1));  // set a future birthdate
            } catch (IllegalStateException e) {
                // Exception caught and printed when setters are used with invalid values
                System.out.println(e.getMessage());
            }
            // Printing object after attempted incorrect updates to the console:
            System.out.println(human);
        } catch (IllegalStateException e) {
            // Exception caught and printed when Human constructor is used with invalid values
            System.out.println(e.getMessage());
        }
        System.out.println("\n================= End of Human test =================\n");
    }

    /**
     * This is the main method that serves as a tests.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        testHuman();

    }
}