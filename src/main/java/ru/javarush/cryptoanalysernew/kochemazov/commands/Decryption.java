package ru.javarush.cryptoanalysernew.kochemazov.commands;
import ru.javarush.cryptoanalysernew.kochemazov.constants.Alphabet;
public class Decryption implements Command {
    static String alphabet = Alphabet.ALPHABET;
//    String symbols = Alphabet.NUMBERS_SYMBOLS; TODO needs realisation here

    static String output = " ";
    @Override
    public void execute(String input, int bias) {
        String inputLow = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            int getIndexInAlphabet = alphabet.indexOf(inputLow.charAt(i));
            if (getIndexInAlphabet == -1) {
                output += " ";
            } else {
                int IndexInAlpabetWithBias = (getIndexInAlphabet - bias) % alphabet.length();
                output += alphabet.charAt(IndexInAlpabetWithBias);
            }
        }
        System.out.println(output);
    }
    public static String getOutput() {
        return output;
    }
    public static void setOutput(String output) {
        Decryption.output = output;
    }
}
