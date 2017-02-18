package com.vsouhrada.kotlin.playground.all_in_one;

/**
 * @author vsouhrada
 */
public class AllInOne {

    public void updateWeather(int degrees) {
        String description;
        Colour colour;

        if (degrees < 5) {
            description = "cold";
            colour = Colour.BLUE;
        } else if (degrees < 23) {
            description = "mild";
            colour = Colour.ORANGE;
        } else {
            description = "hot";
            colour = Colour.RED;
        }
    }

}
