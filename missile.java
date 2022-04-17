import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class missile extends Actor
{
    /**
     * Act - do whatever the missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void move()
    {
        setLocation(getX(),getY()-5);
        if(getY()<20)
        {
            getWorld().removeObject(this);
        }
        else
        {
            checkhit();
        }
    }
    
    public void checkhit()
    {
        explosionfx e = new explosionfx();
        if(isTouching(ufo.class))
        {
            getWorld().addObject(e,getX(),getY()-100);
            Space s=(Space)getWorld();
            s.addScore(10);
            Greenfoot.playSound("ExplosionSFX.wav");
            removeTouching(ufo.class);
            s.removeObject(this);
        }
    }
    
    public void act()
    {
        // Add your action code here.
        move();
    }
}
