package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        for (int[]a : grid) {
			for (int : a) {
				System.out.print(i);
			}
			System.out.println("\n");

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        System.out.println("Enter the row and column numbers, seperated by a space:");

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