/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Defines a motorcycle frame by its material and frame style.
 * Course: CMPSC 221
 * Author: Artem Nebel
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Revision: 1.2
 */

// Frame class
class Frame {
    /** The material*/
    private Material material;
    /** The frame style*/
    private String style;

    /**
     * Creates a frame.
     *
     * @param material the material the frame is made of
     * @param style    the frame style
     */
    public Frame(Material material, String style) {
        this.material = material;
        this.style = style;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}