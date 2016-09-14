import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Damas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Damas extends Actor
{
    /**
     * Act - do whatever the Damas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Damas()
    {
    GreenfootImage image = getImage();  
        image.scale(100, 80);
        setImage(image);
    }

    public void act() 
    {
        // Add your action code here.
        MoveAround();
    }    
    
    public void MoveAround()
    {
        move(8);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(getX() <= 5 || getX() >=getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if(getY() <= 5 || getY() >=getWorld().getHeight() - 5)
        {
            turn(180);
        }
        removeOnClick();
    }
    
    public void removeOnClick()
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            World world;
            world = getWorld();
            world.removeObject(this);
            return;
        }
    }
}
