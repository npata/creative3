package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Person {

    public void render(Graphics2D g2) {
        g2.setColor(Color.yellow);
        //head
        g2.drawOval(225, 100, 50, 50);
        //body
        g2.drawLine(250, 150, 250, 300);
        //left arm
        g2.drawLine(250, 175, 200, 275);
        //right arm
        g2.drawLine(250, 175, 300, 275);
        //left leg
        g2.drawLine(250, 300, 200, 400);
        //right leg
        g2.drawLine(250, 300, 300, 400);
    }
    
}
