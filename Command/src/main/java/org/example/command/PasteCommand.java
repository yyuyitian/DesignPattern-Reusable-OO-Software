package org.example.command;

public class PasteCommand extends Command{

    Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("paste text on document: " + document.getName());
        document.paste();
    }
}
