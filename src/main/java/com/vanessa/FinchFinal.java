package com.vanessa;

import com.birdbrain.Finch;

public class FinchFinal {
    public static void main(String[] args) {
        SymbolFinch bird = new SymbolFinch("A");


        // WWhat do you want your bird to do?
        bird.drawUpArrow();


        bird.stop();
        bird.disconnect();
    }
}

