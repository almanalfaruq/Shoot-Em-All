import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.WorldHandler;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public static GreenfootSound backgroundMusic = new GreenfootSound("opening.mp3");
    
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        backgroundMusic.play();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startbutton = new StartButton();
        addObject(startbutton,244,241);
        startbutton.setLocation(249,230);
        Judul judul = new Judul();
        addObject(judul,230,103);
        judul.setLocation(256,107);
        startbutton.setLocation(245,246);
        judul.setLocation(248,117);
        startbutton.setLocation(248,247);
        HowToPlay howtoplay = new HowToPlay();
        addObject(howtoplay,227,295);
        howtoplay.setLocation(247,286);
        removeObject(howtoplay);
        removeObject(startbutton);
        StartButton startbutton2 = new StartButton();
        addObject(startbutton2,210,237);
        startbutton2.setLocation(254,240);
        HowToPlay howtoplay2 = new HowToPlay();
        addObject(howtoplay2,233,299);
        startbutton2.setLocation(172,252);
        howtoplay2.setLocation(306,250);
        startbutton2.setLocation(189,250);
        judul.setLocation(402,84);
        howtoplay2.setLocation(522,374);
        startbutton2.setLocation(299,217);
        howtoplay2.setLocation(496,215);
        startbutton2.setLocation(312,218);
        howtoplay2.setLocation(496,219);
    }
    
}
