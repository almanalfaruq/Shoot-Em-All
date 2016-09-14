import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class CountTimer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 3;
    private int count = 65;
    public void act() 
    {
        // Add your action code here.
        World world;
        world = getWorld();
        if(time == 0)
        {
            Greenfoot.setWorld(new MainGame());
        }
        
        if(counter())
        {
            time--;
            count = 65;
        }
        display();
    }
    
    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }
   
    private void display()
    {
        setImage(new GreenfootImage("Are You Ready? \n" + time, 30, Color.BLACK, Color.WHITE));
    }
    
    public void setTime()
    {
        time = 3;
    }
    
    public boolean isTimeUp()
    {
        return time == 0;
    }
    
}