package Geometry;

import Scene.*;

/**
 * Created by Jonathan on 05.06.15.
 * Implemented by David on 06.06.15.
 * Abstract Class, used to describe geometric forms in a scene.
 */
public abstract class Geometry {
    /**
     * Color of the form
     */
    public final Color color;

    /**
     * Initializes the geometric form with the given parameter.
     * @param inputColor Specifies the color of a certain geometric form
     */
    Geometry (Color inputColor){
        this.color = inputColor;
    }

    /**
     * Determines wether the given ray is hitting the current object.
     * @param ray if the form is hit, the method returns a Hit object giving information of the t-value, ray and hit Geometry-object.
     */
    public abstract Hit hit(final Ray ray);
}
