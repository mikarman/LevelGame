package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.lang.Math;

public class Ninja extends LocationAwarePiece implements Moveable, InteractingPiece  {

	boolean hideJutsu;
	
	public Ninja(int position) {
		super(position);
		hideJutsu = false;
	}


	@Override
	public void draw() {
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
		int loc = super.getLocation();
		final int Ninjump = 3;
		if (Math.abs(loc - playerLocation) > Ninjump)
		{
			if (pieces[loc].equals(this))
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
