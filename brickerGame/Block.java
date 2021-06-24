package brickerGame;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Block extends Rectangle{
	
	Image pic;
	boolean destroyed;
	
	int posX, posY;
	int width, height;
	
	Block(int x, int y, int w, int h, String s){
		
		this.posX = x;
		this.posY = y;
		this.height = h;
		this.width = w;
		
	}
	
	public void draw(Graphics g, Component c){
		//if(!destroyed)
			//g.drawImage(pic, x, y, w, h, c);
		
	}

}
