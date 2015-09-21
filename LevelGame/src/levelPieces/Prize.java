package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class Prize extends LocationAwarePiece implements Moveable, InteractingPiece {
	
	boolean won = false; 
	char look; 

	public Prize(int position, char prizeLook) {
		super(position);
		look = prizeLook; 
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		
		if (playerLocation == super.getLocation())
		{
			if (won == false)
			{
			won = true; 
			return InteractionResult.GET_POINT;
			
			}
		}
		
		return InteractionResult.NONE; 
		
	}



	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		pieces[super.getLocation()] = this;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
