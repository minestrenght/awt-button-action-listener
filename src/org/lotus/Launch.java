package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.Button;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launch {

    public static void main(String[] args) {
		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(new UiBuilder());
    }
}

class UiBuilder implements Runnable {

    @Override
    public void run() {
        Frame f = new Frame("My AWT Frame"); //set title
        Button b = new Button("Hit me !");
        f.add(b);
        f.pack();
        f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
        b.addActionListener(new ButtonClickHandler());
    }
}

class ButtonClickHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Button was clicked !");
    }
}