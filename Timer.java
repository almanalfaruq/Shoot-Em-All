import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 20;
    private int count = 65;
    //GreenfootSound backgroundMusic;
    public void act() 
    {
        // Add your action code here.
        World world;
        world = getWorld();
        if(time == 0 && world.numberOfObjects() >1)
        {
            Greenfoot.setWorld(new Over());
            MainMenu.backgroundMusic.stop();
            //Greenfoot.stop();
        } else if (time >= 0 && world.numberOfObjects() == 1)
        {
            Greenfoot.setWorld(new Win());
            MainMenu.backgroundMusic.stop();
            //Greenfoot.stop();
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
        setImage(new GreenfootImage("Time left: " + time, 30, Color.BLACK, Color.WHITE));
    }
    
    public void setTime()
    {
        time = 20;
    }
    
    public boolean isTimeUp()
    {
        return time == 0;
    }
    
}