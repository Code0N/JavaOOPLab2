package ru.code0n;
import java.awt.*;

public class DrawableRect extends Rectangle {
    protected Color outColor;

    public DrawableRect(int xx1, int yy1, int xx2, int yy2, Color rCol) {
        super(xx1, yy1, xx2, yy2);
        outColor = rCol;
    }

    public DrawableRect(int width, int height, Color rCol) {
        super(width, height);
        outColor = rCol;
    }

    public DrawableRect() {
        super();
        outColor = Color.green;
    }

    public void Draw(Graphics g) {
        g.setColor(outColor);
        g.drawRect(super.getx1(), super.gety1(), super.getx2() - super.getx1(), super.gety2() - super.gety1());
    }
}
