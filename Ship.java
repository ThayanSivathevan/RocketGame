package rocketGame;

public class Ship {
	int x,y;
	int hitbox1X,hitbox1Y,hitbox2X,hitbox2Y;
	final int width1=14,width2=24,height1=44,height2=10,diffx=6,diffy=20;
	
	public Ship(){
		
	}
	
	public int gethitbox1X(){
		hitbox1X=x+diffx;
		return hitbox1X;
	}
	public int gethitbox1Y(){
		hitbox1Y=y;
		return hitbox1Y;
	}
	public int gethitbox2X(){
		hitbox2X=x+diffx+width1;
		return hitbox2X;
	}
	public int gethitbox2Y(){
		hitbox2Y=y+diffy;
		return hitbox2Y;
	}
}
