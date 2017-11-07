/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * the name of the employee.
     */
    private String name;

    /**
     * the magener of the employee.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newName the name of the employee
     * @param newManager the name of the manager of the employee
     */
    public Employee(final String newName, final String newManager) {
        this.name = newName;
        this.manager = newManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newName the name of the employee
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newManager the name of the magener of the employee
     */
    public void setManager(final String newManager) {
        this.manager = newManager;
    }
}
