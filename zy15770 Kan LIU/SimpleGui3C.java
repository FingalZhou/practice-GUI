package guipractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public  class SimpleGui3C implements ActionListener{
	JFrame frame;
	
	public static void main (String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Click the button to change colors randomly...");
		
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.NORTH,label);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setTitle("LittlePractice");
		frame.setSize(500, 600);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color startColor = new Color(red, green, blue);
		
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(100,100,startColor, 330,330, endColor);
		
		g2d.setPaint(gradient);
		g2d.fillOval(100,100,300,300);
	}
	
	
}

