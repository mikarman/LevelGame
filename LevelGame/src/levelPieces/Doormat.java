package levelPieces;

import gameEngine.Drawable;

public class Doormat extends LocationAwarePiece implements Drawable {

	
	public Doormat(int position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.print('_');
	}	

}
