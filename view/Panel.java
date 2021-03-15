package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ButtonClickListener;

import java.awt.Container;
import java.awt.BorderLayout;

public class Panel {
    private JFrame window;
    private Canvas canvas;
    private JButton farmerButton = new JButton("Farmer");
    private JButton knightButton = new JButton("Knight");
    private JButton kingButton = new JButton("King");
    private JButton resetButton = new JButton("Reset");

    public Panel(JFrame window) {
        this.window = window;
        canvas = new Canvas(this);
    }

    public void init() {
        Container cp = window.getContentPane();
        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        southPanel.add(farmerButton);
        southPanel.add(knightButton);
        southPanel.add(kingButton);

        JPanel centerPanel = new JPanel();
        cp.add(BorderLayout.CENTER, centerPanel);

        centerPanel.add(canvas);

        ButtonClickListener listener = new ButtonClickListener(this);
        farmerButton.addActionListener(listener);
        knightButton.addActionListener(listener);
        kingButton.addActionListener(listener);
        resetButton.addActionListener(listener);
    }

    public JButton getFarmerButton() {
        return farmerButton;
    }

    public JButton getKnightButton() {
        return knightButton;
    }

    public JButton getKingButton() {
        return kingButton;
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
