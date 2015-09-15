import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 int bacSize=30;
 Bacteria [] squad;
// int step=8;
 public void setup()   
 {     
 	size(800,800);
 	squad=new Bacteria[500];
 	for (int i=0;i<squad.length;i++)
 	{
 		squad[i] = new Bacteria();
 	}
 }   
 public void draw()   
 {    
 	background(50);
 	for (int i=0;i<squad.length;i++)
 	{
 	squad[i].move();
 	squad[i].show();
 	}
 }  
 class Bacteria    
 {     
 	int myX, myY;
 	int [] bacteriaColor={(int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)};
 	Bacteria()
 	{
 		myX=400;
 		myY=400;
 		//bacteriaColor=1;
 	}
 	public void move()
 	{
 		myX=myX+(int)(Math.random()*5)-2;
 		myY=myY+(int)(Math.random()*5)-2;
 	}
 	public void show()
 	{
 		fill(bacteriaColor[0],bacteriaColor[1],bacteriaColor[2],bacteriaColor[3]);
 		ellipse(myX, myY, bacSize, bacSize);
 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
