import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public static GreenfootSound backgroundMusic2 = new GreenfootSound("win.mp3");
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        MainMenu.backgroundMusic.stop();
        prepare();
        backgroundMusic2.play();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        YouWin youwin = new YouWin();
        addObject(youwin,427,194);
        RestartButton restartbutton = new RestartButton();
        addObject(restartbutton,411,380);
        restartbutton.setLocation(516,283);
        DamasThug damasthug = new DamasThug();
        addObject(damasthug,133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(133,533);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(135,574);
        damasthug.setLocation(139,587);
        damasthug.setLocation(139,592);
        damasthug.setLocation(139,592);
        damasthug.setLocation(139,592);
        damasthug.setLocation(139,592);
        damasthug.setLocation(139,592);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(139,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
        damasthug.setLocation(108,599);
    }
}
