package ru.javarush.cryptoanalysernew.kochemazov.commands;
import java.io.IOException;
import java.nio.file.Path;
public interface Command {
    default void execute() throws IOException {}
    void execute(String input, int bias);

}
