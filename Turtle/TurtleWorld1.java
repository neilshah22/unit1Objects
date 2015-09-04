import java.awt.Color;

public class TurtleWorld1
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setPenColor(Color.BLUE);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.GREEN);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setPenColor(Color.BLACK);
        
        //First Triangle made by turtle1
        turtle1.penDown();
        turtle1.forward(50);
        turtle1.turn(120); 
        turtle1.forward(50);
        turtle1.turn(120);
        turtle1.forward(50);
        turtle1.turn(120);
        turtle1.forward(50);
        turtle1.penUp();
        turtle2.penUp();
        turtle3.penUp();
        
        //Second triangle made by turtle2
        turtle2.forward(50);
        turtle2.turn(325);
        turtle2.forward(50);
        turtle2.turn(150);
        turtle2.penDown();
        turtle2.forward(150);
        turtle2.turn(120); 
        turtle2.forward(150);
        turtle2.turn(120);
        turtle2.forward(150);
        turtle2.turn(180);
        
        //Thrid triangle made by turtle3
        turtle3.forward(50);
        turtle3.turn(325);
        turtle3.forward(100);
        turtle3.penDown();
        turtle3.turn(150);
        turtle3.forward(250);
        turtle3.turn(120);
        turtle3.forward(250);
        turtle3.turn(120);
        turtle3.forward(250);
        
        //Turtle1 makes second triangle
        turtle1.penDown();
        turtle1.forward(250);
        turtle1.turn(120);
        turtle1.forward(350);
        turtle1.turn(110);
        turtle2.forward(285);
        turtle1.forward(400);
        turtle2.turn(55);
        turtle2.forward(100);
        turtle2.turn(120);
        turtle2.forward(430);
        turtle3.turn(300);
        turtle3.forward(110);
        turtle3.turn(55);
        turtle3.forward(100);
        turtle3.turn(100);
        turtle3.forward(170);
    }
}
