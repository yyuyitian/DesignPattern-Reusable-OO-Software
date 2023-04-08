package org.example.editor;

import org.example.command.Command;
import org.example.command.OpenCommand;

public class MenuOpenItem extends MenuItem{

    Command command;

    @Override
    public void click() {
        command.execute();
        int capacity;
    }
}
