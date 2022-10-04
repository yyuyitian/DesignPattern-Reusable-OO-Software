package org.example.decorator;

public class Client {

    public static void main(String[] args) {
        TextView view = new TextView();
        ScrollDecorator scrollDecorator = new ScrollDecorator(view);
        BorderDecorator borderDecorator = new BorderDecorator(scrollDecorator, 3);
        BorderDecorator borderDecorator1 = new BorderDecorator(scrollDecorator, 4); // 为同一个textView对象添加双边框
        borderDecorator.draw();
        borderDecorator1.draw();
    }
}
