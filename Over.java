import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends World
{

    /**
     * Constructor for objects of class Over.
     * 
     */
    public static GreenfootSound backgroundMusic3 = new GreenfootSound("over.mp3");
    public Over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        backgroundMusic3.play();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameOver gameover = new GameOver();
        addObject(gameover,412,177);
        RestartButton restartbutton2 = new RestartButton();
        addObject(restartbutton2,426,315);
        restartbutton2.setLocation(528,280);
    }
}
