import java.awt.Color;

public class TurtleWorld2
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(120);
        turtle.forward(50);
        turtle.turn(120);
        turtle.forward(50);
        turtle.penUp();
        turtle.forward(50);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(120);
        turtle.forward(50);
        turtle.turn(120);
        turtle.forward(50);
        turtle.penUp();
        turtle.forward(50);
        turtle.penDown();
        turtle.forward(70);
        turtle.turn(120);
        turtle.forward(70);
        turtle.turn(120);
        turtle.forward(70);
        turtle.penUp();
        turtle.turn(330);
        turtle.forward(100);
        turtle.penDown();
        turtle.turn(30);
        turtle.forward(70);
        turtle.turn(250);
        turtle.forward(70);
        turtle.turn(235);
        turtle.forward(70);
        turtle.penUp();
    }
}
