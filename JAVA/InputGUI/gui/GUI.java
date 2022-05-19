package gui;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class GUI{
	
	private JFrame frame;
	private JPanel panel;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JLabel user;
	private JLabel pass;
	private JButton b;
	private JTextField uField;
	private JPasswordField pField;
	private JLabel fail;
	private final String PASSWORD = "a";
	private final String USER = "dp";
	
	
	public GUI() {
		
		frame = new JFrame("LOCK");
		frame.setLayout(new GridLayout(4,1));
		frame.setSize(new Dimension(350,200));
		frame.setResizable(false);
		panel = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		fail = new JLabel("TRY AGAIN");
		fail.setVisible(false);
		fail.setForeground(Color.RED);
		user = new JLabel("Enter password: ");
		user.setForeground(Color.WHITE);
		pass = new JLabel("Enter username: ");
		pass.setForeground(Color.WHITE);
		uField = new JTextField();
		uField.setPreferredSize(new Dimension(150,25));
		pField = new JPasswordField();
		pField.setPreferredSize(new Dimension(150,25));

		
		b = new JButton("Login");
		b.setSize(new Dimension(35,20));
		
		

		panel.setBackground(Color.DARK_GRAY);
		p1.setBackground(Color.DARK_GRAY);
		p2.setBackground(Color.DARK_GRAY);
		p3.setBackground(Color.DARK_GRAY);

		panel.add(user);
		panel.add(uField);

		p1.add(pass);
		p1.add(pField);

		p2.add(b);
		p3.add(fail);

		
		frame.add(panel);
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(uField.getText().toLowerCase().equals(USER) && String.valueOf(pField.getPassword()).equals(PASSWORD)) {
							
							frame.setVisible(false);
							App a = new App();
							
						}else {
							fail.setVisible(true);
						}
						
					}	
				}	
		);
		
	}
}