package info.gridworld.actor;
import info.gridworld.actor.Bug;
import java.awt.Color;
public class UTurnBug extends Bug {
	public UTurnBug()
	{
		setColor(Color.YELLOW);
	}
	public UTurnBug(Color bugColor)
	{
		setColor(bugColor);
	}
	public void turnAround()
	{
		setDirection(getDirection()+180);
	}
	public void act()
	{
		if(canMove())
			move();
		else
			turnAround();
	}

}
