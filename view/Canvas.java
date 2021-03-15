package view;

import javax.swing.JPanel;

import model.Person;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Canvas extends JPanel{

    private Panel panel;
    private Person currentPerson = new Person();

    public Canvas(Panel panel) {
        this.panel = panel;
        setBackground(Color.black);
        setPreferredSize(new Dimension(500, 500));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        currentPerson.render(g2);
    }

    public void setCurrentPerson(Person p) {
        currentPerson = p;
    }
    
}
