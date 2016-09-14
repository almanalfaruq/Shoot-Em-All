import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends Actor
{
    /**
     * Act - do whatever the HowToPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public HowToPlay()
    {
    GreenfootImage image = getImage();  
        image.scale(90, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new CaraMain());
        }
    }  
}
