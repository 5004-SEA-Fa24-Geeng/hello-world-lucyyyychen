package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {
    // Fields
    /*
    the ID of the locality in which the greeting used
    */
    private int localityID;

    /*
    the name of the locality in which the greeting used
    */
    private String localityName;

    /*
    the ascii greeting which is used for the locality
    */
    private String asciiGreeting;

    /*
    the uni-code greeting which is used for the locality
    */
    private String unicodeGreeting;

    /*
    the format string with the greeting inserted into the format
    */
    private String formatStr;

    // Constructors
    /**
     * This is the constructor for the Greeting class.
     *
     * @param localityID the ID of the locality in which the greeting used
     * @param localityName the name of the locality in which the greeting used
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * This is the constructor for the Greeting class.
     *
     * @param localityID the ID of the locality in which the greeting used
     * @param localityName the name of the locality in which the greeting used
     * @param greeting the greeting which is used in the locality
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * This is the constructor for the Greeting class.
     * @param localityID the ID of the locality in which the greeting used
     * @param localityName the name of the locality in which the greeting used
     * @param asciiGreeting the ascii greeting which is used for the locality
     * @param unicodeGreeting the uni-code greeting which is used for the locality
     * @param formatStr the string with the greeting inserted into the format
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    // Methods
    /**
     * Get the ascii greeting of the locality.
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Get the unicode format string.
     * @return the unicode format string
     */
    public String getFormatStr() {
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Get the format string with the greeting inserted into the format.
     * @param asciiOnly if the object only has ascii-code
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, this.asciiGreeting);
        } else {
            return String.format(this.formatStr, this.unicodeGreeting);
        }
    }

    /**
     * Get the ID number of the locality.
     * @return the ID number of the locality
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Get the name of the locality.
     * @return the name of the locality
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Get the unicode greeting of the locality.
     * @return the unicode greeting of the locality
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Get the full greeting details as a string.
     * @return the full greeting details as a string
     */
    public String toString() {
        return "{localityID:" + this.localityID + ", localityName:\"" + this.localityName
                + "\", asciiGreeting:\"" + this.asciiGreeting + "\", unicodeGreeting:\"" + this.unicodeGreeting + "\"}";
    }


//    public static void main(String[] args){
//
//    }
}
