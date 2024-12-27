package org.designpatterns.behavioural.CommandPattern.WithPattern;

import java.util.ArrayList;
import java.util.List;

// GMCommand Interface
interface GMCommand {
    void execute();
}

// Concrete GMCommands
class JumpGMCommand implements GMCommand {
    @Override
    public void execute() {
        System.out.println("Character Jumps");
    }
}

class AttackGMCommand implements GMCommand {
    @Override
    public void execute() {
        System.out.println("Character Attacks");
    }
}

class MoveForwardGMCommand implements GMCommand {
    @Override
    public void execute() {
        System.out.println("Character Moves Forward");
    }
}

// Invoker
class Macro {
    private List<GMCommand> GMCommands = new ArrayList<>();

    public void addGMCommand(GMCommand GMCommand) {
        GMCommands.add(GMCommand);
    }

    public void execute() {
        for (GMCommand GMCommand : GMCommands) {
            GMCommand.execute();
        }
    }
}

// Main
public class GameMacroExample {
    public static void main(String[] args) {
        GMCommand moveForward = new MoveForwardGMCommand();
        GMCommand jump = new JumpGMCommand();
        GMCommand attack = new AttackGMCommand();

        Macro macro = new Macro();
        macro.addGMCommand(moveForward);
        macro.addGMCommand(jump);
        macro.addGMCommand(attack);

        macro.execute();
        // Output:
        // Character Moves Forward
        // Character Jumps
        // Character Attacks
    }
}

