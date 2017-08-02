package becker;

import becker.robots.*;

public class ejercicio2
{
    public static void girarderecha(Robot karel){
        for (int j=0; j<3; j++){
            karel.turnLeft();
        }
    }
    public static void girar180(Robot karel){
        for (int j=0; j<2; j++){
            karel.turnLeft();
        }
    }
    
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
      Wall w1 = new Wall(prague, 1,1, Direction.NORTH);
      Wall w5 = new Wall(prague, 1,2, Direction.NORTH);
      Wall w2 = new Wall(prague, 1,1, Direction.WEST);
      Wall w3 = new Wall(prague, 2,1, Direction.WEST);
      Wall w4 = new Wall(prague, 2,1, Direction.SOUTH);
      Wall w6 = new Wall(prague, 1,2, Direction.EAST);
      Wall w7 = new Wall(prague, 1,2, Direction.SOUTH);
      Thing o1 = new Thing(prague, 2,2);
// Direct the robot to the final situation
      girarderecha(karel);
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.pickThing();
      girar180(karel);
      karel.move();
      girarderecha(karel);
      karel.move();
      girarderecha(karel);
      karel.move();
      girarderecha(karel);
      System.out.println(karel.countThingsInBackpack());
   }
}

