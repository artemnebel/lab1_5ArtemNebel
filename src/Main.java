/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Creates three Motorcycle objects with the constructor and prints
 *                  every property of each one to the screen using getter methods.
 * Course: CMPSC 221
 * Author: Artem Nebel
 * Date Developed: 10/22/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.2
 */

public class Main {
    public static void main(String[] args) {
        // Create three motorcycles; the constructor sets every property
        Motorcycle moto1 = new Motorcycle("Honda", "CBR600RR", 2024, "Red",
                new Engine(599, 4, 119),
                new Frame(Material.ALUMINUM, "Twin-spar"),
                new Wheel(17.0, "Bridgestone"),
                new Wheel(17.0, "Bridgestone"),
                new FuelTank(4.8));

        Motorcycle moto2 = new Motorcycle("Harley-Davidson", "Fat Boy 114", 2023, "Black",
                new Engine(1868, 2, 94),
                new Frame(Material.STEEL, "Softail cradle"),
                new Wheel(18.0, "Michelin"),
                new Wheel(18.0, "Michelin"),
                new FuelTank(5.0));

        Motorcycle moto3 = new Motorcycle("Ducati", "Panigale", 2025, "Yellow",
                new Engine(1103, 4, 215),
                new Frame(Material.CARBON_FIBER, "Front frame"),
                new Wheel(17.0, "Pirelli"),
                new Wheel(17.0, "Pirelli"),
                new FuelTank(4.5));

        // Printing every motorcycle's details
        printMotorcycle(moto1);
        printMotorcycle(moto2);
        printMotorcycle(moto3);
    }

    /**
     * Prints all of a motorcycle's instance values using its getter methods.
     *
     * @param m the motorcycle to print
     */
    public static void printMotorcycle(Motorcycle m) {
        System.out.println("------------------------------------");
        System.out.println("Make:              " + m.getMake());
        System.out.println("Model:             " + m.getModel());
        System.out.println("Year:              " + m.getYear());
        System.out.println("Color:             " + m.getColor());
        System.out.println("Engine:            " + m.getEngine().getDisplacement() + " cc, "
                + m.getEngine().getCylinders() + " cylinders, "
                + m.getEngine().getHorsepower() + " hp");
        System.out.println("Frame material:    " + m.getFrame().getMaterial());
        System.out.println("Frame style:       " + m.getFrame().getStyle());
        System.out.println("Front wheel:       " + m.getFrontWheel().getSize() + " in, "
                + m.getFrontWheel().getTireBrand() + " tire");
        System.out.println("Rear wheel:        " + m.getRearWheel().getSize() + " in, "
                + m.getRearWheel().getTireBrand() + " tire");
        System.out.println("Fuel tank:         " + m.getFuelTank().getCapacity() + " gal");
        m.start();
        m.stop();
    }
}