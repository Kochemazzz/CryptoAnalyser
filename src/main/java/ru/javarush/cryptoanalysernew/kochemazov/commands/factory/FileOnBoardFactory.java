package ru.javarush.cryptoanalysernew.kochemazov.commands.factory;
import ru.javarush.cryptoanalysernew.kochemazov.commands.Command;
import ru.javarush.cryptoanalysernew.kochemazov.commands.FileOnBoard;
public class FileOnBoardFactory implements CommandsFactory{
    @Override
    public Command createCommands() {
        return new FileOnBoard();
    }
}
