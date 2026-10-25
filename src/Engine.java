/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Defines a motorcycle engine by displacement, cylinder count and horsepower.
 * Course: CMPSC 221
 * Author: Artem Nebel
 * Date Developed: 10/22/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.1
 */

// Engine class
class Engine {
    /** Engine displacement cc */
    private int displacement;
    /** Number of cylinders */
    private int cylinders;
    /** Peak horsepower */
    private int horsepower;

    /**
     * Creates an engine.
     *
     * @param displacement the displacement in cc
     * @param cylinders    the number of cylinders
     * @param horsepower   the peak horsepower
     */
    public Engine(int displacement, int cylinders, int horsepower) {
        this.displacement = displacement;
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}