/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Defines a motorcycle wheel by its rim size and tire brand.
 * Course: CMPSC 221
 * Author: Artem Nebel
 * Date Developed: 10/22/2026
 * Last Date Changed: 10/22/2026
 * Revision: 1.4
 */

// Wheel class
class Wheel {
    /** The rim diameter*/
    private double size;
    /** The brand of tires*/
    private String tireBrand;

    /**
     * Creates a wheel.
     *
     * @param size      the rim diameter in inches
     * @param tireBrand the brand of tires
     */
    public Wheel(double size, String tireBrand) {
        this.size = size;
        this.tireBrand = tireBrand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }
}