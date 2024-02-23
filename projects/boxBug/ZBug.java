/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;
import info.gridworld.grid.*;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int zcheck = 1;
    private int linecheck;
    private boolean runonce = true;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        linecheck = length;
    }
    public void diagZ() 
    {
    	int stepsZ = 0;
    	while(getDirection() != Location.SOUTHWEST) // turning southwest
    	{
    		turn();
    	}
        while (stepsZ < linecheck && canMove()) //start first line of z
        {
            move();
            stepsZ++;
        }
    	
    }
    public void horiZ() 
    {
    	int stepsZ = 0;
    	while(getDirection() != Location.EAST) // turning EAST
    	{
    		turn();
    	}
        while (stepsZ < linecheck && canMove()) //start bottom line
        {
            move();
            stepsZ++;
        }
    	
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
    	int x = 0;
    	if (runonce == true)
    	{
    		if (x==0) {//step one
    	while(getDirection() != Location.EAST && zcheck == 1) // start by turning east
    	{
    		turn();
    	}
    	
        while (steps < sideLength && canMove()) //start first line of z
        {
            move();
            steps++;
            zcheck = 0;
        }
    		}
        diagZ();
        horiZ();
        runonce = false;
        }
    	x++;
    }
        
    }
