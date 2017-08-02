package becker;

import becker.robots.*;

public class ejercicio1
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
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
      Wall w1 = new Wall(prague, 1,1, Direction.NORTH);
      Wall w2 = new Wall(prague, 1,1, Direction.WEST);
      Wall w3 = new Wall(prague, 2,1, Direction.WEST);
      Wall w4 = new Wall(prague, 2,1, Direction.SOUTH);
      Wall w8 = new Wall(prague, 2,2, Direction.SOUTH);
      Wall w5 = new Wall(prague, 2,2, Direction.EAST);
      Wall w6 = new Wall(prague, 1,2, Direction.EAST);
      Wall w7 = new Wall(prague, 1,2, Direction.NORTH);
      // Direct the robot to the final situation
      girar180(karel);
      for(int i=0;i<4;i++){
      karel.move();
      girarderecha(karel);
      karel.move();
      karel.move();
      }
      girar180(karel);
      System.out.println(karel.countThingsInBackpack());
   }
}
