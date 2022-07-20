package ru.javarush.cryptoanalysernew.kochemazov.commands.factory;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Bias;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
public class BiasFactory implements CommandsFactory {
    @Override
    public Command createCommands() {
        return new Bias();
    }
}
