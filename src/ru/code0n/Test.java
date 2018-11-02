package ru.code0n;
import java.awt.*;
import java.awt.image.BufferedImage;
//import java.awt.Graphics;

public class Test {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 15, 20, 25);
        Rectangle rect2 = new Rectangle(50, 50);
        Rectangle rect3 = new Rectangle();

        System.out.println("Rectangle 1 state:");
        rect1.rect_print();
        System.out.println("Rectangle 2 state:");
        rect2.rect_print();
        System.out.println("Rectangle 3 state:");
        rect3.rect_print();

        rect1.move(5, 7);
        rect2.move(5, 7);
        rect3.move(5, 7);

        System.out.println("\nRectangle 1 state after movement:");
        rect1.rect_print();
        System.out.println("Rectangle 2 state after movement:");
        rect2.rect_print();
        System.out.println("Rectangle 3 state after movement:");
        rect3.rect_print();

        System.out.println("\nUnion rectangles");
        Rectangle unrect = rect1.union(rect2);
        if (unrect != null) {
            unrect.rect_print();
        }
        else {
            System.out.println("Треугольники не пересекаются");
        }
        Rectangle unrect2 = rect1.union(rect3);
        if (unrect2 != null) {
            unrect2.rect_print();
        }
        else {
            System.out.println("Треугольники не пересекаются");
        }
    }
}
