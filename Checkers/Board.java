package checkers;

public class Board {
	
	private Piece[][] board = new Piece[8][8];
	
	public Board() {
		Player player0 = new Player();  // Define player0 for empty spaces, which take the player id 0
		player0.setID(0);
		
		Player player1 = new Player();
		player1.setID(1);
		
		Player player2 = new Player();
		player2.setID(2);
				
	    for (int row = 0; row < 8; row++) {
	    	for (int col = 0; col < 8; col++) {
	    		board[row][col] = new Piece(col,row,player0);
	    	}
	    }
	    for (int row = 0; row < 8; row++) {
	    	for (int col = 0; col < 8; col++) {
	    		if (row < 3) {
		    		if (col%2==0 && row%2!=0 || col%2!=0 && row%2==0 ) {
		    		board[row][col].setPlayer(player1);
		    		} 
	    		} else if (row > 4) {
	    			if (col%2==0 && row%2==0 || col%2!=0 && row%2!=0 ) {		    			
			    		board[row][col].setPlayer(player2);
	    				}
	    		}
	    	}
	    }	    
	}
	
	public Piece getPiece(Position pos) {
		Piece pieceToReturn = board[pos.getRow()][pos.getCol()];
		return pieceToReturn;
	}
	
	public void print() {
	 // Printing first 2 lines of the board, which are always constant
	    System.out.println("\n    0 1 2 3 4 5 6 7      <--- x axis");
	    System.out.println("  +-----------------+");
	    
	    for (int row = 0; row < 8; row++) {
	    	System.out.print(row+" | ");
	    	for (int col = 0; col < 8; col++) {

	    		if (board[row][col].getPlayer().getID() == 0) {
	    			System.out.print("  ");
	    		}else {
	    		System.out.print(board[row][col].getPlayer().getID() + " ");
	    		}
	        }
	    	System.out.println("| "+row);
	    }
	    
	    System.out.println("  +-----------------+");
	    System.out.println("    0 1 2 3 4 5 6 7 \n");
	}
	
	public void setPiece(Piece p) {
		int col = p.getPosition().getCol();
		int row = p.getPosition().getRow();
		board[row][col] = p;
	}
	
	public void makeMove(Move m) {
		Player player0 = new Player();
		player0.setID(0);
		
	//	Player player = m.getPlayer();
		
		int oldCol = m.getPieceToMove().getPosition().getCol();
		int oldRow = m.getPieceToMove().getPosition().getRow();	
		
		int newCol = m.getPlaceToMove().getPosition().getCol();
		int newRow = m.getPlaceToMove().getPosition().getRow();
		
		Piece p0 = new Piece(oldCol, oldRow ,player0);
		
		board[oldRow][oldCol] = p0;
		board[newRow][newCol] = m.getPieceToMove();
		
		Position newPos = new Position(newCol,newRow);
		board[newRow][newCol].setCoord(newPos);
				
	}
}