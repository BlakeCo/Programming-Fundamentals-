import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
  {
        move(5);
        if ( isAtEdge() )
    {
            turn ( 180 );
    }
        if ( IsCollidingWithPlayer() )
    {
        getWorld().showText( "Game Over", 300, 200 );
        Greenfoot.stop();
    }
  }    
   
    public Obstacle()
  {
        turn(90);
  }
   
    public boolean IsCollidingWithPlayer()
  {
    Player collided = (Player)getOneIntersectingObject( Player.class );
    if ( collided != null )
    {
        return true;
    }
    return false;
  }
}
