package com.vanessa;

import com.birdbrain.Finch;

public class SymbolFinch extends Finch {

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
        setMove("F",8,40);
        setTurn("R",45,40);
        drawCurve("bottom");
        // TODO: add pauses to move bird, and the 2 vertical lines

    }

    public void drawHeart() {
        
    }
    
}