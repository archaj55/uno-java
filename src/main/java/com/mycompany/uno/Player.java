/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uno;

import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
class Player{
    static int count = 0;
    int id;
    String name;
    ArrayList<Card> currentCards;
    
    Player(String name){
        count++;
        this.id = count;
        this.name = name;
    }
}
    
