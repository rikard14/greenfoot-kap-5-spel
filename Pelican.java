import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pelikanen flyttas runt med hjälp av tangentbordet i världen.
 * 
 * @author Rikard Karlsson
 * @version 2016-11-18
 */
public class Pelican extends Actor
{
    //egenskaper - objektvariabler
    private int health;
    private int noSilver;
    private int noGold;
    
    //konstruktor
    //ärvs från Actor
    public Pelican()
    {
        health = 3;
        noSilver = 0;
        noGold = 0;
    }
    
    //metoder
    /**
     * Anroppas vid varje skärmuppdatering av systemet.
     */
    public void act()
    {
        move();
        checkCollision();
        showHealth();
        showCoins(); 
    }
    
    /**
     * Pelikanen kan bara flytta diagonalt. Bokstaven 
     * U motsvarar snett upp vänster. 
     * I motsvarar snett upp höger. 
     * B motsvarar snett ner vänster. 
     * L motsvarar snett ner höger.
     */
    private void move()
    {
        if (Greenfoot.isKeyDown("U"))
        {
            setLocation(getX() - 1, getY() - 1);
        }
        else if (Greenfoot.isKeyDown("I"))
        {
            setLocation(getX() + 1, getY() - 1);
        }
        else if (Greenfoot.isKeyDown("B"))
        {
            setLocation(getX() - 1, getY() + 1);
        }
        else if (Greenfoot.isKeyDown("L"))
        {
            setLocation(getX() + 1, getY() + 1);
        }
    }
    /**
     * Kollision med:
     * döskalle medför healt minskar med ett
     * om health blir 0 så ska döskallen vara kvar
     * 
     * guldmynt medför att antal guldmynt ökas med ett. 
     * Men bara om vi inte redan bär 3 mynt. Upplockade mynt tas bort.
     */
    private void checkCollision()
    {
        if (isTouching(Skull.class))
        {
            health = health - 1;
            if (health > 0)
            {
                removeTouching(Skull.class);
            }
            else
            {
                getWorld().showText("Game over", 300, 200);
                Greenfoot.stop();
            }
        }
        if (isTouching(GoldCoin.class))
        {
            if (getNoCoins() < 3)
            {
                //kan plocka
                noGold = noGold + 1;
                removeTouching(GoldCoin.class);            
            }
        }
        if (isTouching(SilverCoin.class))
        {
            if (getNoCoins() < 3)
            {
                //kan plocka
                noSilver = noSilver + 1;
                removeTouching(SilverCoin.class);            
            }
        }
        if (isTouching(Bank.class))
        {
            int value = noGold * 3 + noSilver;
            noSilver  = 0;
            noGold = 0;
            TreasureWorld myWorld = (TreasureWorld)getWorld();
            myWorld.addMoney(value);
        }
    }
    private void showHealth()
    {
        getWorld().showText("health: " + health, 100, 50);
    }
    private void showCoins()
    {
        getWorld().showText("silver: " + noSilver + ", gold: " + noGold, 100, 80);
    }
    private int getNoCoins()
    {
        return noSilver + noGold;
    }
}
