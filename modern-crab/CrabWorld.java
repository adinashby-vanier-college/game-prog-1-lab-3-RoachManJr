// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm =  new  Worm();
        addObject(worm, 464, 74);
        Worm worm2 =  new  Worm();
        addObject(worm2, 349, 342);
        Worm worm3 =  new  Worm();
        addObject(worm3, 77, 465);
        Worm worm4 =  new  Worm();
        addObject(worm4, 15, 87);
        Worm worm5 =  new  Worm();
        addObject(worm5, 147, 133);
        Worm worm6 =  new  Worm();
        addObject(worm6, 414, 458);
        Worm worm7 =  new  Worm();
        addObject(worm7, 322, 235);
        Worm worm8 =  new  Worm();
        addObject(worm8, 133, 338);
        Worm worm9 =  new  Worm();
        addObject(worm9, 305, 66);
        Worm worm10 =  new  Worm();
        addObject(worm10, 248, 445);
        Worm worm11 =  new  Worm();
        addObject(worm11, 446, 326);
        Crab crab =  new  Crab();
        addObject(crab, 124, 225);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 472, 468);
        worm3.setLocation(88, 467);
        worm3.setLocation(171, 434);
        removeObject(worm10);
        removeObject(worm3);
        removeObject(worm8);
        removeObject(worm6);
        removeObject(worm2);
        removeObject(worm11);
        removeObject(worm7);
        removeObject(worm9);
        removeObject(worm);
    }
}
