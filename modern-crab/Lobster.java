// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        initRotate();
        moveAround();
        eat();
        zombie();
    }

    /**
     * 
     */
    public void initRotate()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360) - 1);
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void zombie()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        World world = getWorld();
        if (worm != null) {
            getWorld().addObject( new  Lobster(), getX(), getY());
            Greenfoot.playSound("zombie-screaming-207590.wav");
            getWorld().removeObject(worm);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        Actor lobster = getOneIntersectingObject(Lobster.class);
        if (crab != null) {
            World world = getWorld();
            if (Greenfoot.getRandomNumber(10) > 5) {
                world.removeObject(crab);
                Greenfoot.playSound("game-over-31-179699.wav");
            }
            else {
                sleepFor(100);
                Greenfoot.playSound("success-1-6297.wav");
            }
        }
    }
}
