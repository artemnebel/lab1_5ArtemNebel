/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Defines a motorcycle composed of an engine, frame, two wheels and a fuel tank.
 * Course: CMPSC 221
 * Author: Artem Nebel
 * Date Developed: 10/21/2026
 * Last Date Changed: 10/23/2026
 * Revision: 1.3
 */

// Motorcycle class
class Motorcycle {
    /** The manufacturer*/
    private String make;
    /** The model name*/
    private String model;
    /** The model year */
    private int year;
    /** The paint color */
    private String color;
    /** The engine */
    private Engine engine;
    /** The frame */
    private Frame frame;
    /** The front wheel */
    private Wheel frontWheel;
    /** The rear wheel */
    private Wheel rearWheel;
    /** The fuel tank */
    private FuelTank fuelTank;

    /**
     * Creates a motorcycle and sets all of its properties.
     *
     * @param make       the manufacturer
     * @param model      the model name
     * @param year       the model year
     * @param color      the paint color
     * @param engine     the engine
     * @param frame      the frame
     * @param frontWheel the front wheel
     * @param rearWheel  the rear wheel
     * @param fuelTank   the fuel tank
     */
    public Motorcycle(String make, String model, int year, String color, Engine engine,
                      Frame frame, Wheel frontWheel, Wheel rearWheel, FuelTank fuelTank) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.frame = frame;
        this.frontWheel = frontWheel;
        this.rearWheel = rearWheel;
        this.fuelTank = fuelTank;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel;
    }

    public Wheel getRearWheel() {
        return rearWheel;
    }

    public void setRearWheel(Wheel rearWheel) {
        this.rearWheel = rearWheel;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void start() {
        System.out.println(make + " " + model + " started.");
    }

    public void stop() {
        System.out.println(make + " " + model + " stopped.");
    }
}