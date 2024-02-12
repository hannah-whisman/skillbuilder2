
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill{

    // TODO - replace this line with instruction from step 1
    public static final int DEFAULT_POWER = 10;


    // instance variables
    // TODO - replace this line with instruction from step 2
    private int power;

    // TODO - replace this line with instruction from step 3
    private String name;


    // constructors

    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    // TODO - replace this line with instruction from step 4
    public PowerPill(String name) {
        // Set the power to the default power value
        this.power = DEFAULT_POWER;
        // Set the name of the pill to the provided name
        this.name = name;
    }


    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    // TODO - replace this line with instruction from step 5
// Add a value constructor where the first parameter is a string called name and the second parameter is an integer called power.
    public PowerPill(String name, int power) {
        // Set the power and name to the provided values
        this.name = name;
        this.power = power;
    }


    // accessor methods

    // TODO - replace this line with instruction from step 6
    /**
     * Gets the power level of this power pill.
     * returns the power level of this power pill.
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets the name of this power pill.
     * returns the name of this power pill.
     */
    public String getName() {
        return name;
    }







    //     TODO - replace this line with instruction from step 7
    /**
     * Sets the power level of this power pill.
     * the paramater "power" is the power level to be set.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Sets the name of this power pill.
     * the paramater "name" is the name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
    // toString method

    // TODO - replace this line with instruction from step 8
/**
 * Returns a string representation of this PowerPill object.
 */
public String toString() {
    return "PowerPill " + name + " = " + power;
}


}