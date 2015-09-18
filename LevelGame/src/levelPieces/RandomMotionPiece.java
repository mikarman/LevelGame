package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import java.util.*;


public abstract class RandomMotionPiece extends LocationAwarePiece implements Moveable {


	public RandomMotionPiece(int position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		
		Random next = new Random(); 
		int rn = next.nextInt(2); 
		
		if (rn == 1 && playerLocation != 0)
		{
			playerLocation = playerLocation -1; // Moves to the left 
			
		}
		else if (rn == 0 && playerLocation != 21)
		{
			playerLocation = playerLocation +1; 
		}
		
		
		
	}
	
}
