package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Farmer;
import model.King;
import model.Knight;
import model.Person;
import view.Panel;

public class ButtonClickListener implements ActionListener{

    private Panel panel;

    public ButtonClickListener(Panel panel) {
        this.panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button == panel.getFarmerButton()) {
            panel.getCanvas().setCurrentPerson(new Farmer());
        }else if (button == panel.getKnightButton()) {
            panel.getCanvas().setCurrentPerson(new Knight());
        } else if (button == panel.getKingButton()) {
            panel.getCanvas().setCurrentPerson(new King());
        } else {
            panel.getCanvas().setCurrentPerson(new Person());
        }
        panel.getCanvas().repaint();
    }
    
}
