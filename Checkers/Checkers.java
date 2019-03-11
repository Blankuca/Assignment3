package checkers;

import java.util.Scanner;

public class Checkers{
        
	public static Position getInputOld() {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the coordinates of the piece to move");
        System.out.print("	Enter X: ");
        int x0 = s.nextInt();
        
        System.out.print("	Enter Y: ");
        int y0 = s.nextInt();
        
        Position posPieceToMove = new Position(x0,y0);
        
        return posPieceToMove;
	}
	
	public static Position getInputNew() {
        Scanner s = new Scanner(System.in);

		System.out.println("Enter the coordinates of the new position");
        System.out.print("	Enter X: ");
        int x1 = s.nextInt();
        
        System.out.print("	Enter Y: ");
        int y1 = s.nextInt();
        
       
        Position newPosition = new Position(x1,y1);
        
        return newPosition;
        
	}
	
	//Main class
	public static void main(String[] args) {
				
		Board board = new Board();		
		board.print();
         
        int c = 1; // set c as counter to keep track of turns
         
    	int turn = 1;  // define turn as the 'piece' of the player who has the turn

        Player player = new Player();
        		
        while(true) {
            
        	 Position posPieceToMove = getInputOld();
        	 Position newPosition = getInputNew();
        	 
        	 Piece pieceToMove = board.getPiece(posPieceToMove);
        	 Piece movePieceTo = board.getPiece(newPosition);

        	 //if c is odd, its player 1's turn
        	 
        	 if(c%2 != 0) {
            	 turn = 1;		
             } else {
            	 turn = 2;
             }
        	 
        	 // Print turn
        	 
        	 System.out.println("\nTurn of player no. " + turn +"\n");
        	 
        	 player.setID(turn);
        	 
        	 Move move = new Move(pieceToMove, movePieceTo, player);
        	 
        	 
        	 try {
        		 move.isValidMove();
           		 board.makeMove(move);
        		 board.print();
        		 System.out.println("Piece moved!");
        		 
        		 // Next turn
                 
                 c++;
  
        	 } catch(MyException e) {
        		 System.out.println("\n"+e.getMessage());
        	 }
        	 
    	 }
                  
     }        	
 }

