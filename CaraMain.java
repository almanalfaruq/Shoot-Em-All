import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaraMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaraMain extends World
{

    /**
     * Constructor for objects of class CaraMain.
     * 
     */
    public CaraMain()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CaraMainKata caramainkata = new CaraMainKata();
        addObject(caramainkata,378,300);
        caramainkata.setLocation(372,303);
        caramainkata.setLocation(374,314);
        StartButton startbutton = new StartButton();
        addObject(startbutton,387,323);
        startbutton.setLocation(380,218);
    }
}
