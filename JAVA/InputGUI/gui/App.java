package gui;

import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

import javax.swing.*;
import java.awt.*;

public class App{
	
	JFrame frame;
	JLabel label;
	JLabel question;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	Timer timer;
	TimerTask task;
	boolean bool;
	static int count;
	
	
	public App() {
		
		count = 0;
		
		frame = new JFrame("QUIZ");
		frame.setLayout(new GridLayout(5,1));
		frame.setPreferredSize(new Dimension(400,300));
		label = new JLabel();
		label.setForeground(Color.blue.darker());
		question = new JLabel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		
		p1 = new JPanel();
		p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
		p4 = new JPanel();
		p4.setLayout(new BoxLayout(p4, BoxLayout.X_AXIS));
		p5 = new JPanel();
		p5.setLayout(new BoxLayout(p5, BoxLayout.X_AXIS));
		
		b1 = new JButton("A");
		b2 = new JButton("B");
		b3 = new JButton("C");
		b4 = new JButton("D");
		
		timer = new Timer();
		task = new TimerTask() {
			public void run() {
				count++;
				b2.doClick();
			}
		};
		
	
		question.setText("1. What is the square root of 8?");
		l1.setText(" -  \u221A8");
		l2.setText(" - 2\u221A2");
		l3.setText(" - 8^0.5");
		l4.setText(" - 4\u221A2");
		p1.add(question);
		p2.add(b1);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(l1);
		p3.add(b2);
		p3.add(Box.createRigidArea(new Dimension(10,0)));
		p3.add(l2);
		p4.add(b3);
		p4.add(Box.createRigidArea(new Dimension(10,0)));
		p4.add(l3);
		p5.add(b4);
		p5.add(Box.createRigidArea(new Dimension(10,0)));
		p5.add(l4);
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == 1) {
					b1.setBackground(Color.green);
				}else 
					b1.setBackground(Color.RED);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setBackground(Color.GREEN);
				if(count == 0) {
				timer.schedule(task, 500);
				}else if (count !=1){
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					b4.setBackground(null);
					
					question.setText("2. Which of these water brands contain salt in their products?");
					l1.setText(" - Dasani");
					l2.setText(" - Kirkland");
					l3.setText(" - Evian");
					l4.setText(" - Aquafina");
				}else 
					b2.setBackground(Color.RED);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setBackground(Color.RED);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b4.setBackground(Color.RED);
			}
		});
		
	}
	
}