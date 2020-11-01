
package rocketGame;

import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Laser{
	int y;
	int x;
	final int length=5,width=25;
	boolean inScreen,notused;
	
	public Laser(int x,int y,boolean inScreen,boolean notused){
		this.y=y;
		this.x=x;
		this.inScreen=inScreen;
		this.notused=notused;
	}
	
	public void move(){
		if(inScreen&&notused)
		x=x+7;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public BufferedImage getLas(){
		return Main.las;
	}
	public boolean getScreen(){
		if(x<1100){
			inScreen=true;
		}
		else inScreen=false;
		return inScreen;
	}
	public boolean getUsed(){
		
		return notused;
	}
	public int getLength(){
		return length;
		
	}
	public int getWidth(){
		return width;
		
	}
}
