package model;

import java.awt.Graphics2D;
import java.awt.Color;

public class King extends Person {

    public King() {
        super();
    }

    @Override
    public void render(Graphics2D g2) {
        super.render(g2);
        g2.setColor(Color.yellow);
        g2.drawLine(225, 110, 275, 110);
        g2.drawLine(225, 110, 225, 85);
        g2.drawLine(275, 110, 275, 85);

        g2.drawLine(225, 85, 242, 100);
        g2.drawLine(242, 100, 250, 70);

        g2.drawLine(250, 70, 258, 100);
        g2.drawLine(258, 100, 275, 85);
    }
    
}
