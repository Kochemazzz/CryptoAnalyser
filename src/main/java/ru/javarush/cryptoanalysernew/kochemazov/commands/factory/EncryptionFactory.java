package ru.javarush.cryptoanalysernew.kochemazov.commands.factory;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Encryption;
public class EncryptionFactory implements CommandsFactory{
    @Override
    public Command createCommands() {
        return new Encryption();
    }
}
