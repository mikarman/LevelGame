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
				Prize trophey = new Prize(20, 'T'); 
				drawnPieces[20] = trophey; 
				interactingPieces.add(trophey);
				movingPieces.add(trophey); 
				Prize tropheyTwo = new Prize(3, '*');
				drawnPieces[3] = tropheyTwo;
				interactingPieces.add(tropheyTwo); 
				movingPieces.add(tropheyTwo); 
				Cat mittens = new Cat(7); 
				drawnPieces[7] = mittens; 
				movingPieces.add(mittens);
				interactingPieces.add(mittens); 
				break;
				
			case 2: 
				for (int i = 1; i < 13; i++)
				{
					Doormat carpet = new Doormat(i);
					drawnPieces[i] = carpet;
					movingPieces.add(carpet);
				}
				Ninja naruto = new Ninja(12);
				drawnPieces[12] = naruto;
				movingPieces.add(naruto);
				interactingPieces.add(naruto);
				Prize freePoint = new Prize(19, 'T'); 
				drawnPieces[19] = freePoint; 
				interactingPieces.add(freePoint);
				movingPieces.add(freePoint); 
				Prize freePointTwo = new Prize(14, '*');
				drawnPieces[14] = freePointTwo;
				interactingPieces.add(freePointTwo); 
				movingPieces.add(freePointTwo); 
				Cat kitty = new Cat(16); 
				drawnPieces[16] = kitty; 
				movingPieces.add(kitty);
				interactingPieces.add(kitty); 
				break;
				
				
			default:
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
