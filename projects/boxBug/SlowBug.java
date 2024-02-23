import java.awt.Color;

import info.gridworld.actor.Bug;

public class SlowBug extends Bug {
    private int turn = 0;
    public SlowBug(Color color)
    {
        super(color);
    }
    public SlowBug()
    {
        super(null);
    }
    public void act()
    {
        turn++;
        if (turn % 3==0) 
            super.act();
    }
}
