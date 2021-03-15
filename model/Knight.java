package model;

import java.awt.Graphics2D;
import java.awt.Color;

public class Knight extends Person{

    public Knight() {
        super();
    }

    @Override
    public void render(Graphics2D g2) {
        super.render(g2);
        //sword
        g2.translate(300, 275);
        g2.rotate(Math.PI/4);

        g2.drawRect(0, -20, 10, 30);
        g2.drawLine(5, -20, 5, -95);

        g2.drawLine(0, -20, 0, -70);
        g2.drawLine(0, -70, 5, -95);

        g2.drawLine(10, -20, 10, -70);
        g2.drawLine(10, -70, 5, -95);

    }
    
}
