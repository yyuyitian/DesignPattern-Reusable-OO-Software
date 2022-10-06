package org.example.editor;

import org.example.factory.PMWindowImp;
import org.example.factory.Window;
import org.example.factory.WindowImp;
import org.example.factory.XWindowImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        // 1、bridge模式，不直接依赖实现
//        Window window = new Window("X"); // 可在运行时读取配置
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw(window);
//        Row row = new Row();
//        row.draw(window);

        // 2、非BRIDGE模式，直接依赖实现，无法在运行时改变实现
        WindowImp windowImp = new XWindowImp();
        Rectangle rectangle = new Rectangle();
        rectangle.draw(windowImp);

        // 3、非工厂模式

    }
}
