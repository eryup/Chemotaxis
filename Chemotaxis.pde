 int bacSize=30;
 Bacteria [] squad;
 int step=8;
 void setup()   
 {     
 	size(800,800);
 	squad=new Bacteria[500];
 	for (int i=0;i<squad.length;i++)
 	{
 		squad[i] = new Bacteria();
 	}
 }   
 void draw()   
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
 	}
 	void move()
 	{
 		//myX=myX+(int)(Math.random()*5)-2;
 		//myY=myY+(int)(Math.random()*5)-2;
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
 	void show()
 	{
 		fill(bacteriaColor[0],bacteriaColor[1],bacteriaColor[2],bacteriaColor[3]);
 		ellipse(myX, myY, bacSize, bacSize);
 	}
 }    