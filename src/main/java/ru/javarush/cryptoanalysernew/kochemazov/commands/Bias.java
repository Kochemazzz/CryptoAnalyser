package ru.javarush.cryptoanalysernew.kochemazov.commands;
import java.io.IOException;
import java.util.Scanner;
public class Bias implements Command{
    private static int KEY = 0;
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void execute() throws IOException {
        while (true) {
            System.out.println("Please, input bias!");
            System.out.println();
            KEY = scanner.nextInt();
            if (KEY > 0 && KEY < 33) {
                System.out.println("bias add");
                break;
            } else {
                System.out.println("bias not supported");
            }
        }
    }
    @Override
    public void execute(String input, int bias) {
        throw new UnsupportedOperationException("needs refactoring");
    }
    public static int getKEY() {
        return KEY;
    }
}
