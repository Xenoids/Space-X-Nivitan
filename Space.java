import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    static GreenfootSound bgm = new GreenfootSound("One Cosmos.wav");
    int counter=0;
    boolean spawn=false;
    private int score;
    private int health=3;
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1 , false); 
        add();
        showHealth();
        showScore();
        Button.changes=true;
    }
    
    private void add()
    {
        Rocket r = new Rocket();
        addObject(r,getWidth()/2,625);
        star s = new star();
        addObject(s,getWidth()/2,getHeight()/6);
    }
    
    public void updateHealth(int point)
    {
        health=health+point;
        showHealth();
        if(health==0)
        {
            Greenfoot.setWorld(new Death());
        }
    }
    
    public void showHealth()
    {
        showText("Health : "+health,500,50);
    }
    
    public void showScore()
    {
        showText("Score : "+score,100,50);
    }
    
    public void addScore(int points)
    {
        score=score+points;
        showScore();
    }
    
    private void addStar()
    {
        star s = new star();
        addObject(s,getWidth()/2,getHeight()-1100);
    }
    
    public void started()
    {
        bgm.setVolume(25);
        bgm.playLoop();
    }
    
    public void stopped()
    {
        mainmenu.lagu.stop();
        bgm.stop();
    }
    
    public void act()
    {
        counter++;
        if(counter==400)
        {
            addStar();
            counter=0;
        }
        setPaintOrder(Rocket.class);
        setPaintOrder(explosionfx.class);
        if(Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new ufo(),Greenfoot.getRandomNumber(599),0);
        }
    }
}
