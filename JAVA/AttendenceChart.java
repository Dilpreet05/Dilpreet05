import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AttendenceChart{	
	public static void main(String[] args) {
		JFrame frame = new JFrame("ATTENDENCE CHART");
		frame.setPreferredSize(new Dimension(400,225));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		for(int k = 1; k <= 20; k++) {
			
			JButton b = new JButton("Student " + k);
			b.setBackground(Color.WHITE);
			
			b.addActionListener(
				new ActionListener(){					
					public void actionPerformed(ActionEvent e) {
						
						if(b.getBackground().equals(Color.WHITE)) {
							b.setBackground(Color.GREEN);
						}else if(b.getBackground().equals(Color.GREEN)) {
								b.setBackground(Color.RED);
						}else if(b.getBackground().equals(Color.RED)){
							b.setBackground(Color.YELLOW);
						}else if (b.getBackground().equals(Color.YELLOW)){
							b.setBackground(Color.WHITE);
						}
					}	
				}
			);
			
			
			panel.add(b);
		}
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		
		
	}

}
