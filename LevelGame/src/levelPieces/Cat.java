package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractingPiece;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

<<<<<<< HEAD:LevelGame/src/levelPieces/Portal.java
public class Portal extends RandomMotionPiece implements Drawable, Moveable, InteractingPiece {
=======
public class Cat extends LocationAwarePiece implements Moveable, InteractingPiece {
>>>>>>> 06c5dabf57210501125503089ea73612eaf2dae5:LevelGame/src/levelPieces/Cat.java

	boolean allergies; 
	public Cat(int position) {
		super(position);
	}

	@Override
<<<<<<< HEAD:LevelGame/src/levelPieces/Portal.java
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (super.getLocation() == playerLocation)
		{
			System.out.print("advan");
			return InteractionResult.ADVANCE;
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
=======
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
>>>>>>> 06c5dabf57210501125503089ea73612eaf2dae5:LevelGame/src/levelPieces/Cat.java
	}
	
	
	@Override
<<<<<<< HEAD:LevelGame/src/levelPieces/Portal.java
	public void draw() {
		System.out.print('@');
	}
	
=======
	public void move(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		pieces[super.getLocation()] = this;
		
	}	
>>>>>>> 06c5dabf57210501125503089ea73612eaf2dae5:LevelGame/src/levelPieces/Cat.java

}
