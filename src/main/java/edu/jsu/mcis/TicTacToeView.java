package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
		
		System.out.println("\n  012");
        for(int i = 0; i < model.getWidth(); i++){
            System.out.println("");
            System.out.print(i + " ");
            for (int j = 0; j < model.getWidth(); j++){
                System.out.print(model.getMark(i, j));
            }
			System.out.println();
        }
		 
		/*for (int i = 0; i < getWidth(); i++) {
				
				System.out.println();
				
			for (int j = 0; j < getWidth(); i++) {
				
				System.out.println();
				grid[i][j] = '-';
				System.out.println(grid[i][j]);
			}
		}*/
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