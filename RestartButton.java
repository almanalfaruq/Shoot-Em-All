import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartButton extends Actor
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RestartButton()
    {
    GreenfootImage image = getImage();  
        image.scale(90, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Countdown());
        }
        Over.backgroundMusic3.stop(); 
        Win.backgroundMusic2.stop();
        MainMenu.backgroundMusic.playLoop();
    }  
}
