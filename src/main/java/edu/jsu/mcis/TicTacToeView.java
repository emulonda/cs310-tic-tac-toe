package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToeView extends JPanel implements ActionListener{

	JButton[][] squares;
	JPanel squaresPanel;
	JLabel resultLabel;
	TicTacToeModel model;
    

	/* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
		int width = model.getWidth();
		
		squaresPanel = new JPanel(new GridLayout(width, width));
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		squares = new JButton[width][width];
		resultLabel = new JLabel();
		resultLabel.setName("ResultLabel");
		
		for (int row = 0; row < width; ++row) {
			for (int col = 0; col < width; ++col){
				
				squares[row][col] = new JButton();
				squares[row][col].addActionListener(this);
				squares[row][col].setName("Square" + row + col);		
				squares[row][col].setPreferredSize(new Dimension(64, 64));
				squaresPanel.add(squares[row][col]);
			}
		}
		
		add(squaresPanel);
		add(resultLabel);
		
		resultLabel.setText("Welcome to Tic-Tac-Toe");
        
    }
	@Override
	public void actionPerformed(ActionEvent event) {
	String name = ((JButton) event.getSource()).getName();
	int row = (int) name.charAt(6) - 48, col = (int) name.charAt(7) - 48;
	
	if(!model.makeMark(row, col)){
	}
	
	else {
		String mark = model.getMark(row, col).toString();
		((JButton) event.getSource()).setText(mark);
		
		if(model.getResult() == TicTacToeModel.Result.NONE) {
		
		}
		
		else {
			if (model.getResult() == TicTacToeModel.Result.X) {
				resultLabel.setText("X");
			}
			
			else if(model.getResult() == TicTacToeModel.Result.O) {
				resultLabel.setText("O");
			}
			
			else if(model.getResult() == TicTacToeModel.Result.TIE) {
				resultLabel.setText("TIE");
			}
		}
	}
}

    public void viewModel() {
        
        /* Print the board to the console (see examples) */
		
		System.out.print("\n  ");
		for(int i = 0; i < model.getWidth(); i++){
			System.out.print(i);
		}
		System.out.println();
        for(int i = 0; i < model.getWidth(); i++){
            System.out.print(i + " ");
            for (int j = 0; j < model.getWidth(); j++){
                System.out.print(model.getMark(i, j));
            }
			System.out.println();
        }
		 
    }

    public void showNextMovePrompt() {
        /* Display a prompt for the player's next move (see examples) */
		
        System.out.println("Enter the row and column numbers, seperated by a space: ");

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        System.out.println("Input is invalid, try again");
		

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}