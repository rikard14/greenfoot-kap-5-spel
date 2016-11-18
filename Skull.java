import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Döskallen är farlig för pelikanen.
 */
public class Skull extends Actor
{
    
    public void act()
    {
        move();
        checkCollision();
    }
    /**
     * Döskallen flytta sig -5, 0 eller 5 pixlar i x-led 
     * varje "frame". Slumpen bestämmer. 
     * På samma sätt i y-led.
     */
    private void move()
    {
        int deltaX = (Greenfoot.getRandomNumber(3) - 1) * 5;
        int deltaY = (Greenfoot.getRandomNumber(3) - 1) * 5;
        setLocation(getX() + deltaX, getY() + deltaY);
    }
    /**
     * ät guldmynt
     */
    private void checkCollision()
    {
        if (isTouching(GoldCoin.class))
        {
            removeTouching(GoldCoin.class);
        }
    }

}
