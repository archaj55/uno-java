package com.mycompany.uno;

public class Card {
    
    enum Color{
        red, green, blue, yellow, Wild;

        private static final Color[] colors = Color.values();
        
        public static Color getColor(int i){    //Method to get all the colors in deck
            return Color.colors[i];
        }
    }

    enum Value{
        
        Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, Wild_Four;

        private static final Value[] val= Value.values();
        public static Value getValue(int i){    //Method to get all the values in deck     
            return Value.val[i];
        }
    }


    private final Color color;
    private final Value value;

    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }

    public Color getColor(){
        return this.color;

    }

    public Value getValue(){
        return this.value;

    }


    public String toString(){ 
        return color + "_" + value;

    } 
}
