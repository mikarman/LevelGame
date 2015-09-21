package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Cat extends LocationAwarePiece implements Moveable, InteractingPiece {

	boolean allergies; 
	public Cat(int position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print('C');
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if (playerLocation == super.getLocation())
		{
			if (allergies == false)
			{
			allergies = true; 
			return InteractionResult.HIT;
			
			}
		}
		
		
		return InteractionResult.NONE; 
	}
	
	
	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		pieces[super.getLocation()] = this;
		
	}	

}