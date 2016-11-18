import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class TreasureWorld extends World
{
    
    public TreasureWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SilverCoin silvercoin = new SilverCoin();
        addObject(silvercoin,161,150);
        GoldCoin goldcoin = new GoldCoin();
        addObject(goldcoin,310,207);
        Skull skull = new Skull();
        addObject(skull,460,335);
        Pelican pelican = new Pelican();
        addObject(pelican,162,304);
        skull.setLocation(222,351);
        goldcoin.setLocation(218,227);
        skull.setLocation(249,363);
        silvercoin.setLocation(85,213);
        goldcoin.setLocation(239,227);
        GoldCoin goldcoin2 = new GoldCoin();
        addObject(goldcoin2,285,178);
        GoldCoin goldcoin3 = new GoldCoin();
        addObject(goldcoin3,342,143);
        SilverCoin silvercoin2 = new SilverCoin();
        addObject(silvercoin2,72,159);
        SilverCoin silvercoin3 = new SilverCoin();
        addObject(silvercoin3,91,103);
        SilverCoin silvercoin4 = new SilverCoin();
        addObject(silvercoin4,158,86);
        Bank bank = new Bank();
        addObject(bank,411,83);
        Skull skull2 = new Skull();
        addObject(skull2,496,291);
        Skull skull3 = new Skull();
        addObject(skull3,51,292);
        Skull skull4 = new Skull();
        addObject(skull4,261,74);
        pelican.setLocation(387,114);
        goldcoin3.setLocation(386,289);
        goldcoin2.setLocation(524,60);
        silvercoin3.setLocation(71,45);
        silvercoin4.setLocation(179,137);
        silvercoin.setLocation(140,319);
        goldcoin.setLocation(275,226);
    }
}
