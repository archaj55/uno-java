/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uno;

import java.util.Random;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * The Deck class consists of 108 uno cards. There are four suits, Red, Green,
 * Yellow and Blue, each consisting of one 0 card, two 1 cards, 2s, 3s, 4s,
 * 5s, 6s, 7s, 8s and 9s; two Draw Two cards; two Skip cards; and two Reverse
 * cards. In addition there are four Wild cards and four Wild Draw Four cards.
 */
public class Deck
{
  private Card[] cards;
  private int cardsInDeck;
 
    public Deck()
  {
    //initializes the cards array to 108 cards
    cards = new Card[108];
    reset();
  }

    public void reset() {
    //creates an array of colors to hold the values of the enum Color
    Card.Color[] colors = Card.Color.values();
    //index of the cards array              
    cardsInDeck = 0;
    //traversing the array of colors. minus one because we are excluding the Wild Color
    for (int i = 0; i < colors.length-1; i++)
    {
      //the card color will be the current index of the card array
      Card.Color color = colors[i];

      // Add 1 zero
      cards[cardsInDeck++] = new Card(color, Card.Value.getValue(0));
      
      // Add 2 cards for 1-9
      for (int j = 1; j < 10; j++)
      {
        cards[cardsInDeck++] = new Card(color, Card.Value.getValue(j));
        cards[cardsInDeck++] = new Card(color, Card.Value.getValue(j));
      }
      // Add Draw Two, Skip, and Reverse
      Card.Value[] values = new Card.Value[]{Card.Value.DrawTwo, Card.Value.Skip, Card.Value.Reverse};
      for (Card.Value value : values)
      {
        cards[cardsInDeck++] = new Card(color, value);
        cards[cardsInDeck++] = new Card(color, value);
      }
    }

    // Add Wild Cards: Wild Wild and Wild DrawFour
//    Card.Value[] values = new Card.Value[]{Card.Value.Wild, Card.Value.Wild_Four};
//    for (Card.Value value : values)
//    {
//      for (int i = 0; i < 4; i++)
//      {
//        cards[cardsInDeck++] = new Card(Card.Color.Wild, value);
//      }
//    }
  }



    public void replaceDeck(ArrayList<Card> cards) {
      this.cards = cards.toArray(new Card[cards.size()]);
      this.cardsInDeck = this.cards.length;
    }

    /**
     *
     * @return true if there are no cards in the deck
     */
    public boolean isEmpty() {
      return cardsInDeck == 0;
    }

    public void shuffle() {
      int n = cards.length;
      Random r = new Random();

      for (int i = 0; i < cards.length; i++) {

        // Get a random index of the array past the current index
        // Swap the random element with the present element

        int randomVal = i + r.nextInt(n - i);
        Card randomCard = cards[randomVal];
        cards[randomVal] = cards[i];
        cards[i] = randomCard;
      }

    }

    public Card drawCard() throws IllegalArgumentException {
      if (isEmpty()) {
        throw new IllegalArgumentException("Cannot draw a card since there are no cards in the deck");
      }
      return cards[--cardsInDeck];
    }

    public ImageIcon drawCardImage() throws IllegalArgumentException {
      if(isEmpty()) {
        throw new IllegalArgumentException("Cannot draw a card since the deck is empty");
      }
      return new ImageIcon(cards[--cardsInDeck].toString() + ".png");
    }

    public Card[] drawCard(int n) {
      if (n < 0) {
        throw new IllegalArgumentException("Must draw positiive cards but tried to draw " + n + " cards.");
      }

      if (n > cardsInDeck) {
        throw new IllegalArgumentException("Cannot draw " + n + " cards since there are only " + cardsInDeck + " cards.");
      }

      Card[] retArr = new Card[n];

      for (int i = 0; i < n; i++) {
        retArr[i] = cards[--cardsInDeck];
      }
      return retArr;
    }
}
