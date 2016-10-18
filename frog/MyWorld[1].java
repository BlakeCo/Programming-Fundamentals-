import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new Player(), 10, 200 );
        addObject(new Goal() , 500 , 200 );
        addObject(new Obstacle() , 200, 0);
        addObject(new Obstacle() , 300, 50);
        addObject(new Obstacle() , 400, 100);
    }
}
