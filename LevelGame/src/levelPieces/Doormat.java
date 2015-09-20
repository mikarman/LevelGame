package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class Doormat extends LocationAwarePiece implements Moveable {

	
	public Doormat(int position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.print('_');
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		pieces[super.getLocation()] = this;
		
	}	

}
