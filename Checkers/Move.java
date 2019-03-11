package checkers;

public class Move {
	
	private Piece piece;
	private Piece newP;	
	private Player player;
	
	public Move(Piece piece, Piece newP, Player player){
		this.piece = piece;
		this.newP = newP;
		this.player = player;		
	}
	
	public Piece getPieceToMove() {
		return piece;
	}
	
	public Piece getPlaceToMove() {
		return newP;
	}
	public Player getPlayer() {
		return player;
	}
		
	public void isValidMove() throws MyException{
		if (piece.getPlayer().getID() != player.getID()) {
			throw new MyException("Try Again. Please select a valid piece to move.\n");
		}
		if (newP.getPlayer().getID() != 0) {
			throw new MyException("Try Again. Please move to an empty space.\n");
		}
		if (piece.getPlayer().getID() == 1) {

			if (piece.getPosition().getRow() != newP.getPosition().getRow() - 1) {
				throw new MyException("Try Again. Move forward.\n");
			}
		}else {
			if (piece.getPosition().getRow() != newP.getPosition().getRow() + 1) {
				throw new MyException("Try Again. Move forward.\n");
			}
		}
		if ((piece.getPosition().getCol() != newP.getPosition().getCol() +1) && (piece.getPosition().getCol() != newP.getPosition().getCol() -1 )) {
			throw new MyException("Try Again. Move diagonally.\n");
		}

	}
	
}	