package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame   {
	   
    public Frame() {
       
        JFrame frame = new JFrame();
        GamePanel screen = new GamePanel();
       
        frame.add(screen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  
        JButton bouton = new JButton("Cliquez ici !");
		frame.add(bouton) ;
	

    }
}
