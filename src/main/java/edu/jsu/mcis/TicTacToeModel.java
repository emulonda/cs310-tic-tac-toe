package edu.jsu.mcis;

public class TicTacToeModel{
    
    private static final int DEFAULT_WIDTH = 3;
    
    /* Mark (represents X, O, or an empty square */
    
    public enum Mark {
        
        X("X"), 
        O("O"), 
        EMPTY(" ");

        private String message;
        
        private Mark(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    /* Result (represents the final state of the game: X wins, O wins, a tie,
       or NONE if the game is not yet over) */
    
    public enum Result {
        
        X("X"), 
        O("O"), 
        TIE("Tie"), 
        NONE("none");

        private String message;
        
        private Result(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    private Mark[][] grid; /* Game grid */
    private boolean xTurn; /* True if X is current player */
    private int width;     /* Size of game grid */
    
    /* DEFAULT CONSTRUCTOR */
    
    public TicTacToeModel() {
        
        /* No arguments (call main constructor; use default size) */
        
        this(DEFAULT_WIDTH);
        
    }
    
    /* CONSTRUCTOR */
    
    public TicTacToeModel(int width) {
        
        /* Initialize width; X goes first */
        
        this.width = width;
        xTurn = true;
        
        /* Create grid (width x width) as a 2D Mark array */

        grid = new mark[width][width];

        /* Initialize grid by filling every square with empty marks */

        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = mark.EMPTY;
        
			}
		}
	
	
	
    public boolean makeMark(int row, int col) {
        
        /* Place the current player's mark in the square at the specified
           location, but only if the location is valid and if the square is
           empty! */
        
        /* INSERT YOUR CODE HERE */
		if (isValidSquare(row, col) && !isSquareMarked(row, col)) {
			if (xTurn) {
				grid[row][col] = Mark.X;
			}
			else {
				grid[row][col] = Mark.O;

        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return true if specified location is within grid bounds */
        
			if (! (row > model.getWidth())) {
				if (!(col > model.getWidth())) {
				return true;
				}
				else {
				return false;
				}
			}
			else {

			view.showInputError();
			
			}
        
    }
	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return true if square at specified location is marked */
        
			if (grid[row][col].equals(Mark.EMPTY)) {
				if (xTurn) {
					grid[row][col] = Mark.X;
					return true;
				}
				else {
					grid[row][col] = Mark.O;
					return true;
					
				}
			}  	  
    }
	
    public Mark getMark(int row, int col) {
        
        /* Return mark from the square at the specified location */
        
        /* INSERT YOUR CODE HERE */
			if (grid[row][col].equals(Mark.EMPTY)) {
				if (xTurn) {
					grid[row][col] = Mark.X;
					return Mark.X;
				}
				else {
					grid[row][col] = Mark.O;
					return Mark.O;
					
				}
			}
			else {
				return false
			
			}
			
			
            
    }
	
    public Result getResult() {
        
        /* Use isMarkWin() to see if X or O is the winner, if the game is a
           tie, or if the game is not over, and return the corresponding Result
           value */
        if (isMarkWin(Mark.X)) {
			
			return Result.X;
		
		} else if (isMarkWin(Mark.O)) {
			return Result.O;
		} else if (isTie()) {
			return Result.TIE;
		}
		else {
			return Result.NONE;
		}
    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified mark is the
           winner */
		   
       
        for ( int i = 0; i < getWidth(); i++) {
			
			for (int j = 0; j <getWidth(); i++) {
				
				if (mark.equals(getMark(grid[i][0], grid[i][1], grid[i][2])) == true) {
					return true;
				}
				
				else if (mark.equals(getMark(grid[0][j], grid[1][j], grid[2][j])) == true) {
					
					return true;
				}
				else {
					return false;
				}
			}
		}
    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */

        /* INSERT YOUR CODE HERE */

        return false; /* remove this line! */
        
    }

    public boolean isGameover(){
        
        /* Return true if the game is over */
        
        return Result.NONE != getResult();
        
    }

    public boolean isXTurn(){
        
        /* Getter for xTurn */
        
        return xTurn;
        
    }

    public int getWidth(){
        
        /* Getter for width */
        
        return width;
        
    }
    
}