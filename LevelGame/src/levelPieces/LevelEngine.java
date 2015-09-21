package levelPieces;

import java.util.ArrayList;
import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractingPiece;
import gameEngine.GameEngine;

public class LevelEngine {

	Drawable[] drawnPieces;
	ArrayList<Moveable> movingPieces;
	ArrayList<InteractingPiece> interactingPieces;
	
	public LevelEngine()
	{
		super();
	}
	
	public void createLevel(int levelNum)
	{
		/* create pieces, moving pieces, interacting pieces
		 *
		 */
		drawnPieces = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<Moveable>(GameEngine.BOARD_SIZE);
		interactingPieces = new ArrayList<InteractingPiece>(GameEngine.BOARD_SIZE);
		switch(levelNum)
		{
			case 1:	
				for (int i = 1; i < 11; i++)
				{
					Doormat carpet = new Doormat(i);
					drawnPieces[i] = carpet;
					movingPieces.add(carpet);
				}
				Ninja hyaa = new Ninja(19);
				drawnPieces[19] = hyaa;
				movingPieces.add(hyaa);
				interactingPieces.add(hyaa);
				Portal stargate = new Portal(8);
				drawnPieces[8] = stargate;
				movingPieces.add(stargate);
				interactingPieces.add(stargate);
				Sniper wolf = new Sniper(1);
				drawnPieces[1] = wolf;
				movingPieces.add(wolf);
				interactingPieces.add(wolf);
				Sniper eagleEye = new Sniper(20);
				drawnPieces[20] = eagleEye;
				movingPieces.add(eagleEye);
				interactingPieces.add(eagleEye);
				break;
			default:
				System.out.println("You have entered Nirvana, an empty space of absolute tranquility");
				break;
		}
	}
	
	public Drawable[] getPieces()
	{
		return drawnPieces;
	}
	
	public ArrayList<Moveable> getMovingPieces()
	{
		return movingPieces;
	}
	
	public ArrayList<InteractingPiece> getInteractingPieces()
	{
		return interactingPieces;
	}
}
