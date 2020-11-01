package rocketGame;

import java.awt.image.BufferedImage;

public class Asteroid {
	int x,y;
	final int width=35,height=40,diffX=7,diffY=7;
	
	int hitboxX,hitboxY;
	boolean inScreen,destroyed,xAxis;
	
	public Asteroid(int x,int y,boolean inScreen,boolean destroyed, boolean xAxis){
		this.y=y;
		this.x=x;
		this.inScreen=inScreen;
		this.xAxis=xAxis;
		this.destroyed=destroyed;
		
	}
	public void move(){
		if(inScreen&&destroyed!=true)
		x=x-6;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public BufferedImage getAsteroid(){
		return Main.ast;
	}
	public boolean getScreen(){
		if(x>0){
			inScreen=true;
		}
		else inScreen=false;
		return inScreen;
	}
	public boolean getDestroy(){
		
		return destroyed;
	}
	public int getHitboxX(){
		hitboxX=x+diffX;
		return hitboxX;
		
	}
	public int getHitboxY(){
		hitboxY=y+diffY;
		return hitboxY;
		
	}
}	
