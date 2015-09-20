package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.lang.Math;

public class Ninja extends LocationAwarePiece implements Moveable, InteractingPiece  {

	boolean hideJutsu = false;
	
	public Ninja(int position) {
		super(position);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (hideJutsu == false)
		{
			System.out.print('N');
		}
		else
		{
			System.out.print(' ');
		}
		
	}

	
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		final int visiRange = 2;
		if (Math.abs(playerLocation - super.getLocation()) > visiRange)
		{
			hideJutsu = true;
		}
		else
		{
			hideJutsu = false;
		}
		
		if (playerLocation == super.getLocation())
		{
			return InteractionResult.HIT;
		}
		
		return InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		int loc = super.getLocation();
		final int Ninjump = 3;
		if (Math.abs(loc - playerLocation) > Ninjump)
		{
			if (pieces[loc] instanceof Ninja)
			{
				pieces[loc] = null;
			}
			if (((playerLocation > pieces.length/2) && (playerLocation + Ninjump < pieces.length)) || (playerLocation - Ninjump < 0))
			{
				loc = playerLocation + Ninjump;
			}
			else
			{
				loc = playerLocation - Ninjump;
			}
			super.setLocation(loc);
			pieces[loc] = this;
		}
		else
		{
			pieces[loc] = this;
		}
	}
	
	

	
	
}
