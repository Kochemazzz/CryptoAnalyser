package ru.javarush.cryptoanalysernew.kochemazov.commands.factory;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Bias;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
public interface CommandsFactory {
    Command createCommands();
}
