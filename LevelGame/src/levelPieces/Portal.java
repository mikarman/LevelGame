package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Portal extends RandomMotionPiece implements Drawable, Moveable, InteractingPiece {

	public Portal(int position) {
		super(position);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (super.getLocation() == playerLocation)
		{
			System.out.print("advan");
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		int loc = super.getLocation();
		if (pieces[loc].equals(this))
		{
			pieces[loc] = null;
		}
		super.move(pieces, playerLocation);
	}

	@Override
	public void draw() {
		System.out.print('@');
	}
	

	
	
}
