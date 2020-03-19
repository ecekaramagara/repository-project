package code.Board;

import code.Physics.EulerSolver;

/**
 * class Ball describes a ball in the golf simulator
 * defined by a location, mass, and color
 */
public class Ball extends EulerSolver{

    private int color; //int that can be converted to a color in the graphics engine

    /**
     * parametric constructor for a ball
     */
    public Ball(){
        color = 1; //standard color 1 ---> white
    }

    /**
     * getter for the mass of the ball
     * @return double describing the mass
     */

    /**
     * getter for the location of the ball
     * @return Vector2d containing the x and y coordinate of a ball
     */


    /**
     * getter for the color of the ball
     * @return int later to be mapped to a color
     */
    public int getColor(){
        return color;
    }

    /**
     * change the color of the ball
     * @param newColor the color of the ball after method gets executed
     */
    public void setColor(int newColor){
        color = newColor;
    }

    /**
     * change the location of the ball
     * will be called regularly when updating where the ball is
     * @param newLocation the location of the ball after method gets executed
     */


    //methods like setMass and setColor are not necessary for anything but might be fun to play around with in later phases
    //(at random points in the game the mass of the ball could change to increase difficulty, a color change could happen to indicate this)
    /**
     * change the mass of the ball
     * @param newMass the mass of the ball after method gets executed
     */

}

