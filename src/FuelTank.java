/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Defines a motorcycle fuel tank by its capacity in gallons.
 * Course: CMPSC 221
 * Author: Artem Nebel
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.2
 */

// FuelTank class
class FuelTank {
    /** Tank capacity*/
    private double capacity;

    /**
     * Creates a fuel tank.
     *
     * @param capacity the tank capacity in gallons
     */
    public FuelTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}