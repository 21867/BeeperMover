/**
   @Author:
      Date:
   Teacher:
       Lab:
      Misc:
  */
import kareltherobot.*;
import java.awt.Color;

public class BeeperMoverDriver implements Directions
{
    public static void main(String args[])
    {
        UrRobot karel = new UrRobot(4, 3, East, 0);  
        BeeperMover.task(karel);         
    } 

    static {
        World.reset(); 
        World.readWorld("chp2_8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}