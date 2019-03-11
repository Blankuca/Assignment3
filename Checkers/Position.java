package checkers;

public class Position {
	private int col;
	private int row;
	
	
	public boolean areValid(int col, int row) throws MyException{
		
		if (col < 0 || col > 7) {
			throw new MyException("Coordinate x out of bounds");
		}
		if (row < 0 || row > 7) {
			throw new MyException("Coordinate y out of bounds");
		}
		return true;
	}
	
	public Position() {
		this.col = 0;
		this.row = 0;
	}
		
	public Position(int col, int row) {
		try {
			if (this.areValid(col,row)) {
				this.col = col;
				this.row = row;
			}
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}	}

	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
	
	public void setPosition(int col, int row) {
		this.col = col;
		this.row = row;
	}

}
