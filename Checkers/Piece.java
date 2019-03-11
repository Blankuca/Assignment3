package checkers;

public class Piece {
	
	private Position coord;
	private Player player;
	
	public Piece(int col, int row, Player player) {
		Position pos = new Position(col,row);
		this.coord = pos;
		this.player = player;
	}
	
	public void setCoord(Position pos) {
		this.coord = pos;
	}	
	
	public void setPlayer(Player pl) {
		this.player = pl;
	}
	
	public Position getPosition() {
		return coord;
	}
	
	public Player getPlayer() {
		return player;
	}
	
}

