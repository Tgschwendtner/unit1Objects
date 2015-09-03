//Tracey Gschwendtner
import java.awt.Color;
public class Turtle_Lab
{
    public static void main(String args[])
    {
        World turtleLand = new World(500,500);
        Turtle turtle1 = new Turtle(100, 100, turtleLand);
        turtle1.setPenColor(Color.YELLOW);
        turtle1.penDown();
        turtle1.turnRight();
        turtle1.forward(300);
        turtle1.penUp();
        
        //first x
        turtle1.turnRight();
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.forward(100);
        turtle1.turnRight();
        turtle1.forward(25);
        turtle1.turn(230);
        turtle1.penDown();
        turtle1.setPenColor(Color.RED);
        turtle1.forward(100);
        turtle1.penUp();
        turtle1.turn(130);
        turtle1.forward(75);
        turtle1.turn(130);
        turtle1.penDown();
        turtle1.forward(100);
        turtle1.penUp();
        
        //second x
        turtle1.forward(50);
        turtle1.penDown();
        turtle1.forward(75);
        turtle1.penUp();
        turtle1.turn(-130);
        turtle1.forward(50);
        turtle1.turn(-130);
        turtle1.penDown();
        turtle1.forward(75);
        turtle1.penUp();
        
        //thrid x
        turtle1.turn(130);
        turtle1.forward(200);
        turtle1.turn(-90);
        turtle1.forward(200);
        turtle1.turn(-130);
        turtle1.penDown();
        turtle1.forward(50);
        turtle1.penUp();
        turtle1.turnLeft();
        turtle1.turn(-45);
        turtle1.forward(50);
        turtle1.turn(-130);
        turtle1.penDown();
        turtle1.forward(75);
        
        
        
        Turtle turtle2 = new Turtle(400, 200, turtleLand);
        turtle2.setPenColor(Color.PINK);
        turtle2.penDown();
        turtle2.turnLeft();
        turtle2.forward(300);
        turtle2.penUp();
        turtle2.turnRight();
        turtle2.forward(50);
        int x = 0;
        turtle2.penDown();
        while(x<36){
            turtle2.turn(10);
            turtle2.forward(8);
            x += 1;
        }
        turtle2.penUp();
        turtle2.turn(180);
        turtle2.forward(100);
        turtle2.turn(180);
        int y = 0;
        turtle2.penDown();
        while(y<36){
            turtle2.turn(10);
            turtle2.forward(8);
            y += 1;
        }
        
        
        Turtle turtle3 = new Turtle(200,50, turtleLand);
        turtle3.setPenColor(Color.RED);
        turtle3.penDown();
        turtle3.turnLeft();
        turtle3.turnLeft();
        turtle3.forward(200);
        turtle3.penUp();
        turtle3.forward(100);

        
        Turtle turtle4 = new Turtle(325,50, turtleLand);
        turtle4.setPenColor(Color.BLUE);
        turtle4.penDown();
        turtle4.turnLeft();
        turtle4.turnLeft();
        turtle4.forward(200);
        turtle4.penUp();
        turtle4.forward(100);
    }
}
