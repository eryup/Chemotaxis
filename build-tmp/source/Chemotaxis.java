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

 int bacSize=20;
 Bacteria [] squad;
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
 	fill(50,80);
 	rect(0, 0, 800, 800);
 	for (int i=0;i<squad.length;i++)
 	{
 	squad[i].move();
 	squad[i].show();
 	}
 }  
 public void mousePressed()
 {
 	for (int i=0;i<squad.length;i++)
 	{
 	squad[i].click();
 	}
 }
 class Bacteria    
 {     
 	int myX, myY;
 	int myColor=color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
 	Bacteria()
 	{
 		myX=400;
 		myY=400;
 	}
 	public void move()
 	{
 		if(mouseX>myX)
 		{
 			myX=myX+(int)(Math.random()*5)-1;
 		}
 		else if (mouseX<myX)
 		{
 			myX=myX+(int)(Math.random()*5)-3;
 		}
 		else
 		{
 			myX=myX+(int)(Math.random()*5)-2;
 		}
 		if(mouseY>myY)
 		{
 			myY=myY+(int)(Math.random()*5)-1;
 		}
 		else if (mouseY<myY)
 		{
 			myY=myY+(int)(Math.random()*5)-3;
 		}
 		else
 		{
 			myY=myY+(int)(Math.random()*5)-2;
 		}
 	}
 	public void show()
 	{
 		fill(myColor);
 		ellipse(myX, myY, bacSize, bacSize);
 	}
 	public void click()
 	{
 		myX=(int)(Math.random()*801);
 		myY=(int)(Math.random()*801);		
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
