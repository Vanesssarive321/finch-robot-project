package com.vanessa;

import com.birdbrain.Finch;

/**
 * Description of this method
 * @param nameOfParam description of paramemter
 */
public class SymbolFinch extends Finch {

    /**
     * Constructor of the SymbolFinch class
     * @param device specifies the device of the Finch. 
     * Use "A", "B", "C" as specificed on the BlueBird Connector
     */
    public SymbolFinch(String device) {
        super(device);
    }
/**
 * This method is to draw the top curve for the money symbol
 * @param (String position) this paramemter defines the method to draw curve that takes thestring postion as a input.
 */
    public void drawCurve(String position) {
       if(position.equals("top") ){
        setMotors( 0, 40);
        pause(2);
       } else{
        setMotors( 40, 0);
        pause(2);
       }
    }
/**
 * This method draws a curve on the bottom of the dollor sign 
 */
    public void drawDollarSign() {
        drawCurve("top");
        setTurn("L",45,40);
        setMove("F",13,40);
        setTurn("R",45,40);
        drawCurve("bottom");
        stop();
        for(int i =0; i<2;i++){
            pause (4);
            setMove("F",25,40);
        }
    }
/**
 * This method draws my initials so  V and R
 */
    public void drawVR() {
        setMove("F",5,100);
        setTurn("L",140,100);
        setMove("F",5, 100);
        setTurn("R",90,100);
        drawTopOfR();
        setTurn("L",160,100);
        setMove("F",2.5,100);
    }
/**
 * This method shows the drawing of the Top R for my initial
 */
    public void drawTopOfR(){
        for(int i = 0; i < 6; i++) {
            setMove("F",0.75,100);
            setTurn("R",32,100);
        }
    }
/**
 * This method is going to draw a up arrow
 */
    public void drawUpArrow() {
        setMove("F",5,100);
        setTurn("L",140,100);
        setMove("F",5, 100);
        setTurn("R",90,100);
    }
    /**
 * This method is going to draw a circle
 */
    public void drawCircle(){
        setMove("F",1,50);
        drawCurve("top");
        pause(2);
        setTurn("L",15,40);
    }
    
}