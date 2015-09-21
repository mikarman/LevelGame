//At Work
package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import java.util.*;


public abstract class RandomMotionPiece extends LocationAwarePiece implements Moveable {


	public RandomMotionPiece(int position) {
		super(position);
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		
		Random next = new Random(); 
		int rn = next.nextInt(2); 
		int loc = super.getLocation();
		if (rn == 1 && loc > 0)
		{
			loc = loc - 1;
			super.setLocation(loc); // Moves to the left 
		}
		else if (rn == 0 && loc < pieces.length-1)
		{
			loc = loc + 1;
			super.setLocation(loc);
		}
		pieces[loc] = this;	
	}
	
}
