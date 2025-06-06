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

    public void drawCurve(String position) {
       if(position.equals("top") ){
        setMotors( 0, 40);
        pause(2);
       } else{
        setMotors( 40, 0);
        pause(2);
       }
    }

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

    public void drawVR() {
        setMove("F",5,100);
        setTurn("L",140,100);
        setMove("F",5, 100);
        setTurn("R",90,100);
        drawTopOfR();
        setTurn("L",160,100);
        setMove("F",2.5,100);
    }

    public void drawTopOfR(){
        for(int i = 0; i < 6; i++) {
            setMove("F",0.75,100);
            setTurn("R",32,100);
        }
    }

    public void drawUpArrow() {
        setMove("F",5,100);
        setTurn("L",140,100);
        setMove("F",5, 100);
        setTurn("R",90,100);
    }
    public void drawCircle(){
        setMove("F",1,50);
        drawCurve("top");
        pause(2);
        setTurn("L",15,40);
    }
    
}