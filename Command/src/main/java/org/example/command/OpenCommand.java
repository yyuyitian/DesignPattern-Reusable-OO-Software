package org.example.command;

public class OpenCommand extends Command{

    private Application app;

    public OpenCommand(Application app) {
        this.app = app;
    }

    @Override
    public void execute() {
        System.out.println("open document in: " + app.name);
        Document document = new Document(); // ask user for name in actual
        app.add(document);
        document.open();
    }
}
