package org.designpatterns.behavioural.CommandPattern.WithoutPattern;

/**
 * Drawback:
 * - Hardcoding the actions in the main class makes it impossible to dynamically record, replay, or reuse the sequence of actions elsewhere.
 * - Adding new actions would require modifying the main program logic.
 */

// Main
public class GameMacroWithoutCommandPattern {
    public static void main(String[] args) {
        // Directly executing actions
        moveForward();
        jump();
        attack();
    }

    public static void moveForward() {
        System.out.println("Character Moves Forward");
    }

    public static void jump() {
        System.out.println("Character Jumps");
    }

    public static void attack() {
        System.out.println("Character Attacks");
    }
}
