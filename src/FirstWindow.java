import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{

	public FirstWindow() {
		super("Ben is cool, I guess.");
		setSize(1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.YELLOW);
		JPanel p3 = new JPanel(new GridBagLayout());
		p3.setBackground(Color.RED);
		JPanel p4 = new JPanel(new GridBagLayout());
		p4.setBackground(Color.CYAN);
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.GREEN);
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.RED);
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.YELLOW);
		JButton b3 = new JButton("Button 3");
		b3.setBackground(Color.PINK);
		JButton b4 = new JButton("Button 4");
		b4.setBackground(Color.BLUE);
		JButton b5 = new JButton("Button 5");
		b5.setBackground(Color.CYAN);
		JButton b6 = new JButton("Button 6");
		b6.setBackground(Color.GREEN);
		JButton b7 = new JButton("Button 7");
		b7.setBackground(Color.BLUE);
		JButton b8 = new JButton("Button 8");
		b8.setBackground(Color.ORANGE);
		JButton b9 = new JButton("Button 9");
		b9.setBackground(Color.YELLOW);
		JButton b10 = new JButton("Button 10");
		b10.setBackground(Color.GREEN);
		JButton b11 = new JButton("Button 11");
		b11.setBackground(Color.RED);
		JButton b12 = new JButton("Button 12");
		b12.setBackground(Color.CYAN);
		JButton b13 = new JButton("Button 13");
		b13.setBackground(Color.PINK);
		JButton b14 = new JButton("Button 14");
		b14.setBackground(Color.GREEN);
		
		JCheckBox cb1 = new JCheckBox("Do you LOVE bacon?");
		cb1.setBackground(Color.CYAN);
		JCheckBox cb2 = new JCheckBox("Do you LOVE Java?");
		Color myNewColor = new Color (20, 255, 175, 100);
		cb2.setBackground(myNewColor);
		JCheckBox cb3 = new JCheckBox("Please check me");
		myNewColor = new Color (255, 20, 175, 100);
		cb3.setBackground(myNewColor);
		JCheckBox cb4 = new JCheckBox("Are tacos the best?");
		myNewColor = new Color (20, 100, 200, 100);
		cb4.setBackground(myNewColor);
		
		JLabel myLabel = new JLabel("Fancy label!");
		JTextArea myTextArea = new JTextArea("Fancy text area!");
		JTextField myTextField = new JTextField("Fancy text field");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		p1.add(b1);
		p1.add(b2);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p5.add(b3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p5.add(b11, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p5.add(b12, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p5.add(b13, gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p4.add(b4, gbc);
		gbc.gridy = 1;
		p4.add(cb3, gbc);
		gbc.gridy = 2;
		p4.add(cb4, gbc);
		
		p2.add(cb1);
		p2.add(cb2);
		p2.add(b14);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(b5, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(b6, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(b7, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(b8, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(b9, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(b10, gbc);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.EAST);
		add(p5, BorderLayout.WEST);
		
		setVisible(true);
	} //end of constructor
	
} //end of FirstWindow
