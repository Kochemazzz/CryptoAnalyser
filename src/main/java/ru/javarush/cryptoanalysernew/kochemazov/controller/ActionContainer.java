package ru.javarush.cryptoanalysernew.kochemazov.controller;
import ru.javarush.cryptoanalysernew.kochemazov.commands.BruteForce;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Encryption;
import ru.javarush.cryptoanalysernew.kochemazov.commands.factory.*;
public enum ActionContainer {
    FILE(new FileOnBoardFactory().createCommands()),
    BIAS(new BiasFactory().createCommands()),
    ENCRYPT(new EncryptionFactory().createCommands()),
    DECRYPT(new DecryptionFactory().createCommands()),
    BRUTEFORCE(new BruteForceFactory().createCommands());

    private final Command command;
    ActionContainer(Command command) {
        this.command = command;
    }

    public static Command find (String input) {
        int newInput = Integer.parseInt(input);
        ActionContainer value = ActionContainer.values()[newInput];
        Command valueCommand = value.command;
        return valueCommand;
    }


}
