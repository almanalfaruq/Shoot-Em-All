import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.WorldHandler;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;

/**
 * Write a description of class MainGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainGame extends World
{
    private int timer;
    /**
     * Constructor for objects of class MainGame.
     * 
     */
    public MainGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        ChangeMouseImage(new GreenfootImage("target.png"), 0, 0);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Damas damas6 = new Damas();
        addObject(damas6,211,144);
        Damas damas7 = new Damas();
        addObject(damas7,331,47);
        Damas damas5 = new Damas();
        addObject(damas5,280,125);
        Damas damas14 = new Damas();
        addObject(damas6,48,28);
        Damas damas13 = new Damas();
        addObject(damas7,62,272);
        Damas damas8 = new Damas();
        addObject(damas8,200,267);
        Damas damas9 = new Damas();
        addObject(damas9,67,153);
        Damas damas10 = new Damas();
        addObject(damas10,175,55);
        Damas damas11 = new Damas();
        addObject(damas11,335,209);
        Damas damas12 = new Damas();
        addObject(damas12,454,97);
        Timer timer = new Timer();
        addObject(timer,245,34);
        removeObject(timer);
        Timer timer2 = new Timer();
        addObject(timer2,245,36);
        removeObject(timer2);
        Timer timer3 = new Timer();
        addObject(timer3,251,43);
        DamasBanter damasbanter = new DamasBanter();
        addObject(damasbanter,56,47);
        timer3.setLocation(680,36);
    }
    
    public void ChangeMouseImage(GreenfootImage image, int XClick, int YClick)
    {
        JPanel Panel = WorldHandler.getInstance().getWorldCanvas();
        Cursor Cursor;
        Toolkit Tk = Toolkit.getDefaultToolkit();
        Point CursorPoint= new Point(XClick,YClick);
        Cursor = Tk.createCustomCursor(image.getAwtImage(),CursorPoint,"Somehow");
        Panel.setCursor(Cursor);
    }
}
