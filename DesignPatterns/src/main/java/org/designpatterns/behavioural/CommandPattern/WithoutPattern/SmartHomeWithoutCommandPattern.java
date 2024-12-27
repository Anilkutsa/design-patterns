package org.designpatterns.behavioural.CommandPattern.WithoutPattern;

/**
 * Drawback:
 * - The logic for triggering the action is tightly coupled with the Light object.
 * - If a remote control or automation system were added later, it would require significant restructuring.
 */

// Receiver
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Main
public class SmartHomeWithoutCommandPattern {
    public static void main(String[] args) {
        Light light = new Light();

        // Directly invoking methods
        light.turnOn(); // Light is ON
        light.turnOff(); // Light is OFF
    }
}
