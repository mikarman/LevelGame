package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Ninja extends LocationAwarePiece implements Moveable, InteractingPiece  {

	
	
	public Ninja(int position) {
		super(position);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return InteractionResult.HIT;
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
