package ru.javarush.cryptoanalysernew.kochemazov.commands.factory;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Bias;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Decryption;
public class DecryptionFactory implements CommandsFactory{
    @Override
    public Command createCommands() {
        return new Decryption();
    }
}
