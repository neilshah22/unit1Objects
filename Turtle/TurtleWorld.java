import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(35);
        turtle.forward(45);
        turtle.turn(120);
        turtle.forward(45);
        turtle.turn(35);
        turtle.forward(50);
        turtle.turn(35);
        turtle.forward(45);
        turtle.turn(120);
        turtle.forward(45);
    }
}
