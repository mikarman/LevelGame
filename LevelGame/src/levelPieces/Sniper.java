package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.lang.Math;

public class Sniper extends RandomMotionPiece implements Moveable, InteractingPiece{

	public Sniper(int position) {
		super(position);
	}

	@Override
	public void draw() {
		System.out.print('S');
		
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		int loc = super.getLocation();
		if (Math.abs(loc - playerLocation) <= 3)
		{
			if (loc > playerLocation)
			{
				for (int i = loc-1; i >= playerLocation; i--)
				{
					if (pieces[i] != null && !(pieces[i] instanceof Doormat))
					{
						return InteractionResult.NONE;
					}
				}
				return InteractionResult.DIE;
				
			}
			else
			{
				for (int j = loc+1; j <= playerLocation; j++)
				{
					if (pieces[j] != null && !(pieces[j] instanceof Doormat))
					{
						return InteractionResult.NONE;
					}
					
				}
				return InteractionResult.DIE;
			}
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

}
