package model;

import java.awt.Graphics2D;
import java.awt.Color;

public class Farmer extends Person{

    public Farmer() {
        super();
    }

    @Override
    public void render(Graphics2D g2) {
        super.render(g2);
        g2.drawLine(300, 275, 275, 400);
        g2.drawLine(300, 275, 325, 150);

        g2.drawLine(315, 148, 335, 152);

        g2.drawLine(325, 150, 329, 130);
        g2.drawLine(315, 148, 319, 128);
        g2.drawLine(335, 152, 339, 132);
    }
    
}
