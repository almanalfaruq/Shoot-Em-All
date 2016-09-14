import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DamasThug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DamasThug extends Actor
{
    /**
     * Act - do whatever the DamasThug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int centX = (getWorld().getWidth())/2;
        int centY = (getWorld().getHeight())/2;
        if ( getY() == centY )
        {
            setLocation(getX(), getY());
        } else
        {
            //turnTowards(centY, centX);
            setLocation(getX(), getY() - 1);
        }
    }    
}
