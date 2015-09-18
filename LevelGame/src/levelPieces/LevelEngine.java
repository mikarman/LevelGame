package levelPieces;

import gameEngine.Drawable;

public class LevelEngine {

	public LevelEngine()
	{
		
	}
	
	public void createLevel(int levelNum)
	{
		/* create pieces, moving pieces, interacting pieces
		 *
		 */
		switch(levelNum)
		{
			case 1:	
				for (int i = 1; i < 11; i++)
				{
					Doormat carpet1 = new Doormat();
				}
				break;
			default:
				break;
		}
	}
	
	public Drawable[] getPieces()
	{
		return drawnPieces;
	}
}
