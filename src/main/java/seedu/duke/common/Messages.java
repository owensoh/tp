package seedu.duke.common;


/**
 * Class containing hardcoded Strings.
 */
public class Messages {

    /**
     * Used in the printing of Welcome Message.
     */
    public static final String LOGO = " ____ ____ ____ ____ ____ ____ ____ \n"
            + "||E |||l |||d |||e |||r |||l |||y ||\n"
            + "||__|||__|||__|||__|||__|||__|||__||\n"
            + "|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|\n"
            + " ____ ____                          \n"
            + "||I |||n ||                         \n"
            + "||__|||__||                         \n"
            + "|/__\\|/__\\|                         \n"
            + " ____ ____ ____ ____                \n"
            + "||Y |||o |||u |||r ||               \n"
            + "||__|||__|||__|||__||               \n"
            + "|/__\\|/__\\|/__\\|/__\\|               \n"
            + " ____ ____ ____ ____                \n"
            + "||H |||o |||o |||d ||               \n"
            + "||__|||__|||__|||__||               \n"
            + "|/__\\|/__\\|/__\\|/__\\|               ";
    public static final String WELCOME_MESSAGE = "Welcome admin. Type after the '>' to start.";

    /**
     * Used to prompt user to type in commands.
     */
    public static final String PROMPT_MESSAGE = "> ";

    /**
     * Used to respond to user when command is unrecognized.
     */
    public static final String INVALID_COMMAND_MESSAGE = "Sorry user, I do not recognize this command";

    /**
     * Used when exiting the application when the bye command is issued.
     */
    public static final String GOODBYE_MESSAGE = "Bye command has been recognized. Goodbye!";

    /**
     * Used when elderly has been added.
     */
    public static final String ADD_ELDERLY_MESSAGE = "Elderly has been added!";

    /**
     * Used when invalid elderly name is given.
     */
    public static final String NO_SUCH_ELDERLY_MESSAGE = "Elderly name you have keyed in does not exist";

    /**
     * Used when invalid addelderly is typed.
     */
    public static final String INVALID_ADD_ELDERLY_MESSAGE = "Add Elderly format: addelderly n/[username]";

    /**
     * Used when appointment has been added.
     */
    public static final String ADD_APPOINTMENT_MESSAGE = "Appointment has been added!";

    /**
     * Used when invalid addappt is typed.
     */
    public static final String INVALID_ADD_APPOINTMENT_MESSAGE = "Add Appointment format: addappt n/[username] "
            + "l/[location] d/[date] t/[time] {p/[purpose]}";

    /**
     * Used when invalid viewappt is typed.
     */
    public static final String INVALID_VIEW_APPOINTMENT_MESSAGE = "View Appointment format: viewappt n/[username]";

    /**
     * Used when medicine has been added.
     */
    public static final String ADD_MEDICINE_MESSAGE = "Medicine has been added!";

    /**
     * Used when invalid addmed is typed.
     */
    public static final String INVALID_ADD_MEDICINE_MESSAGE = "Add Medicine format: addmed n/[username] m/[medicine "
            + "name] f/[frequency]";

    /**
     * Used when invalid viewmed is typed.
     */
    public static final String INVALID_VIEW_MEDICINE_MESSAGE = "View Medicine format: viewmed n/[username]";

    /**
     * Used when Next-Of_kin has been added.
     */
    public static final String ADD_NOK_MESSAGE = "Next-of-Kin has been added!";

    /**
     * Used when record of elderly has been added.
     */
    public static final String ADD_RECORD_MESSAGE = "Record of elderly has been added!";

    /**
     * Used when vaccination status of the elderly is set to be vaccinated.
     */
    public static final String SET_VACCINATED_MESSAGE = "We have set %s to be vaccinated\r\n";

    /**
     * Used when birthday of the elderly has been set.
     */
    public static final String SET_BIRTHDAY_MESSAGE = "Birthday of %s has been set to %s\r\n";

    /**
     * Used when blood pressure of the elderly has been updated.
     */
    public static final String SET_BLOOD_PRESSURE_MESSAGE = "Blood pressure of %s has been updated to %.2f %.2f!\r\n";

    /**
     * Used when dietary prefrence of the elderly has been updated.
     */
    public static final String SET_DIET_MESSAGE = "Dietary preference of %s has been set to %s\r\n";


    /**
     * Used when counting number of elderly for list.
     */
    public static final String NUMBER_OF_ELDERLY_STRING = "There are currently %d elderly registered in the system\n";

    /**
     * Used to list down all the supported dietary preferences for user's selection.
     */
    public static final String LIST_OF_DIETS = "Select the possible diet of the elderly%n1. Halal%n2. Vegetarian%n"
            + "3. Vegan%n4. Beef free%n5. Diabetes%n6. No restriction%n";

    /**
     * Used when printing elderly object.
     */
    public static final String VACCINATED_MESSAGE = "Vaccination status of %s: %s";
    public static final String BIRTHDAY_MESSAGE = "Birthday of %s: %s";
    public static final String RECORDS_MESSAGE = "Here are %s's records:\n%s\n";
    public static final String APPOINTMENTS_MESSAGE = "Here is the list of upcoming appointments:\n%s\n";
    public static final String MEDICINES_MESSAGE = "This is the list of medicine(s):\n%s\n";
    public static final String NOKS_MESSAGE = "These are NOK(s) attached to %s:\n%s\n";
    public static final String OVERALL_ELDERLY_MESSAGE = "Elderly Name: %s\n%s\n%s\n%s\n%s\n%s\n%s";

}
