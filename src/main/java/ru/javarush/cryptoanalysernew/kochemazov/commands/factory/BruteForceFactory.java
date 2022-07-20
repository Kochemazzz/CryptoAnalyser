package ru.javarush.cryptoanalysernew.kochemazov.commands.factory;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Bias;
import ru.javarush.cryptoanalysernew.kochemazov.commands.BruteForce;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
public class BruteForceFactory implements CommandsFactory {
    @Override
    public Command createCommands() {
        return new BruteForce();
    }
}
