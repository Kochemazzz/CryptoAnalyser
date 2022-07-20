package ru.javarush.cryptoanalysernew.kochemazov.commands;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class FileOnBoard implements Command {
    private static Path pathInput;
    public static String ReadLineString ;
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void execute() throws IOException {
        while (true) {
            System.out.println("Please, input path");
            String inputString = scanner.nextLine();
            Path newPath = Path.of(inputString);
            if (Files.exists(newPath)) {
                System.out.println("File on board!");
                FileOnBoard.pathInput = newPath;
                FileOnBoard.ReadLineString = String.valueOf(Files.readAllLines(FileOnBoard.pathInput));
                break;
            } else {
                System.out.println("Not file in local directory");
            }
        }
    }
    @Override
    public void execute(String input, int bias) {
        throw new UnsupportedOperationException("needs refactor");
    }
}
