 int bacSize=20;
 Bacteria [] squad;
 void setup()   
 {     
 	size(800,800);
 	squad=new Bacteria[250];
 	for (int i=0;i<squad.length;i++)
 	{
 		squad[i] = new Bacteria();
 	}
 }   
 void draw()   
 {    
 	fill(50,80);
 	rect(0, 0, 800, 800);
 	for (int i=0;i<squad.length;i++)
 	{
 	squad[i].move();
 	squad[i].show();
 	}
 }  
 void mousePressed()
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
 	void move()
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
 	void show()
 	{
 		fill(myColor);
 		ellipse(myX, myY, bacSize, bacSize);
 	}
 	void click()
 	{
 		myX=(int)(Math.random()*801);
 		myY=(int)(Math.random()*801);		
 	}
 }    