package org.example.command;

public class Document {

    public String getName() {
        return "document";
    }

    public void open() {
        System.out.println("invoke document open method");
    }

    public void paste() {
        System.out.println("invoke document paste method");
    }

}
