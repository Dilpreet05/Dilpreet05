package gui;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

public class TicTacToe{
	

	JFrame frame;
	JPanel board;
	JPanel winner;
	JLabel winnerL;
	static int[] count = {0};
	ArrayList<JButton> list;
	String str = "";
	
	public TicTacToe() {
		
		frame = new JFrame("Tic Tac Toe");
		frame.setSize(new Dimension(250,250));
		board = new JPanel();
		board.setLayout(new GridLayout(3,3));
		winner = new JPanel();
		winner.setBackground(Color.DARK_GRAY);

		list = new ArrayList<JButton>();

		
		
		for(int k = 0; k < 9; k++) {
			JButton b = new JButton("-");
			b.setBackground(Color.DARK_GRAY);
			b.setForeground(Color.white);
			
			b.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							if(count[0]%2 == 0 && !b.getText().equals("O")) {
								b.setText("X");
								count[0]++;
								if(checkWinner()) {
									frame.setVisible(false);
									frame.remove(board);
									System.out.println("The winner is X");
								}else if(isFull()) {
									frame.setVisible(false);
									frame.remove(board);		
									System.out.println("It is a tie!");
								}
							}else if(count[0]%2 == 1 && !b.getText().equals("X")){
								b.setText("O");
								count[0]++;
								if(checkWinner()){
									frame.setVisible(false);
									frame.remove(board);
									System.out.println("The winner is O");
								}
							}

							
						}
					}
			);
			list.add(b);
			board.add(b);
		}
		
		
		frame.add(board);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/*
	 * 		{ b0 b1 b2
	 * 		  b3 b4 b5
	 * 		  b6 b7 b8
	 * 		length = 0 
	 * 				}
	 */
	
	private boolean isFull() {
		
		if((list.get(0).getText().equals("X") || list.get(0).getText().equals("O")) && (list.get(1).getText().equals("X") || list.get(1).getText().equals("O")) && (list.get(2).getText().equals("X") || list.get(2).getText().equals("O")) && (list.get(3).getText().equals("X") || list.get(3).getText().equals("O")) && (list.get(4).getText().equals("X") || list.get(4).getText().equals("O")) && (list.get(5).getText().equals("X") || list.get(5).getText().equals("O")) && (list.get(6).getText().equals("X") || list.get(6).getText().equals("O")) && (list.get(7).getText().equals("X") || list.get(7).getText().equals("O")) && (list.get(8).getText().equals("X") || list.get(8).getText().equals("O"))) {
		return true;	
		}
		return false;
	}
	
	private boolean checkWinner() {

			if(list.get(0).getText().equals(list.get(1).getText()) && list.get(1).getText().equals(list.get(2).getText()) && (list.get(0).getText().equals("X") || list.get(0).getText().equals("O"))) {
				str = list.get(2).getText();
//				return true;
			}else if(list.get(3).getText().equals(list.get(4).getText()) && list.get(4).getText().equals(list.get(5).getText())&& (list.get(3).getText().equals("X") || list.get(3).getText().equals("O"))) {
				str = list.get(5).getText();
//				return true;
			}else if(list.get(6).getText().equals(list.get(7).getText()) && list.get(8).getText().equals(list.get(8).getText())&& (list.get(6).getText().equals("X") || list.get(6).getText().equals("O"))) {
				str = list.get(8).getText();
//				return true;
			}else if(list.get(0).getText().equals(list.get(3).getText()) && list.get(3).getText().equals(list.get(6).getText())&& (list.get(0).getText().equals("X") || list.get(0).getText().equals("O"))) {
				str = list.get(6).getText();
//				return true;
			}else if(list.get(1).getText().equals(list.get(4).getText()) && list.get(4).getText().equals(list.get(7).getText())&& (list.get(1).getText().equals("X") || list.get(1).getText().equals("O"))) {
				str = list.get(7).getText();
//				return true;
			}else if(list.get(2).getText().equals(list.get(5).getText()) && list.get(5).getText().equals(list.get(8).getText())&& (list.get(2).getText().equals("X") || list.get(2).getText().equals("O"))) {
				str = list.get(8).getText();
//				return true;
			}else if(list.get(0).getText().equals(list.get(4).getText()) && list.get(4).getText().equals(list.get(8).getText())&& (list.get(0).getText().equals("X") || list.get(0).getText().equals("O"))) {
				str = list.get(8).getText();
//				return true;
			}else if(list.get(2).getText().equals(list.get(4).getText()) && list.get(4).getText().equals(list.get(6).getText())&& (list.get(2).getText().equals("X") || list.get(2).getText().equals("O"))) {
				str = list.get(6).getText();
//				return true;
			}

			if(str.equals("X") || str.equals("O"))
				return true;
		
		return false;
	}
	
/*
 * 
 * 	XOX
 * 	OOX
 * 	XXO
 * wins for x, not an actual win
 * 
 */
	
	
	
}