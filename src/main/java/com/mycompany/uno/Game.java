 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uno;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.mycompany.uno.Card.Value;

public class Game {

    private int presPlayer;  //index of current player
    private String[] pIds;   // array with names of all players

    private Deck deck;
    private ArrayList<ArrayList<Card>> playerHand; // ArrayList of Arraylist. Contains the current hands of all players
    private ArrayList<Card> discardPile; // Discard pile

    private Card.Color validColor;
    private Card.Value validValue;

    boolean gameDirection;

    public Game(String[] playerNames) {
        deck = new Deck();
        deck.shuffle();
        discardPile = new ArrayList<Card>();

        pIds = playerNames;
        presPlayer = 0;
        gameDirection = false; // Default game direction is false

        playerHand = new ArrayList<ArrayList<Card>>();

        for (int i = 0; i < playerNames.length; i++) {
            ArrayList<Card> hand = new ArrayList<Card>(Arrays.asList(deck.drawCard(7)));
            playerHand.add(hand);
        }

    }

    public void start(Game game) {
        Card card = deck.drawCard();

        validColor = card.getColor();
        validValue = card.getValue();

        if (card.getValue() == Card.Value.DrawTwo) {
            start(game);
        }

        if (card.getValue() == Card.Value.Skip) {
            JLabel message = new JLabel(pIds[presPlayer] + " was skipped!");
            message.setFont(new Font("Arial", Font.BOLD, 36));
            JOptionPane.showMessageDialog(null, message);

            if (gameDirection == false) {
                presPlayer = (presPlayer + 1) % pIds.length;
            }

            else if (gameDirection == true) {
                presPlayer = (presPlayer - 1) % pIds.length;
                if (presPlayer == -1) {
                    presPlayer = pIds.length - 1;
                }
            }
        }

        if (card.getValue() == Card.Value.Reverse) {
            JLabel message = new JLabel(pIds[presPlayer] + " Game direction was changed!");
            message.setFont(new Font("Arial", Font.BOLD, 36));
            JOptionPane.showMessageDialog(null, message);

            gameDirection ^= true; // Flips game direction
            presPlayer = pIds.length - 1;
        }

        discardPile.add(card);

    }

    public Card getTopCard() {
        return new Card(validColor, validValue); //returns the topmost card of the deck
    }

    public ImageIcon getTopCardImage() {
        return new ImageIcon(validColor + "_" + validValue + ".png");  //returns the image of the topmost card of the deck
    }

    public boolean isGameOver() {      //checks if the game is over
        for (String player : this.pIds) {
            if (hasEmptyHand(player)) {
                return true;
            }
        }
        return false;
    }

    public String getpresPlayer() {                //returns the name of the current player
        return this.pIds[this.presPlayer];
    }

    public String getPreviousPlayer(int i) {          //returns the name of the previous player
        int index = this.presPlayer - i;
        if (index == -1) {
            index = pIds.length - 1;
        }
        return this.pIds[index];
    }

    public String[] getPlayers() {                   //returns array of players
        return pIds;
    }

    public ArrayList<Card> getPlayerHand(String pid) {   //Returns the array list given the name of player
        int index = Arrays.asList(pIds).indexOf(pid);
        return playerHand.get(index);
    }

    public int playerHandSize(String pid) {
        return getPlayerHand(pid).size();
    }

    public Card getPlayerCard(String pid, int choice) {    //returns a selected card from the current player's hand
        ArrayList<Card> hand = getPlayerHand(pid);
        return hand.get(choice);
    }

    public Boolean hasEmptyHand(String pid) {
        return getPlayerHand(pid).isEmpty();
    }

    public boolean validCardPlay(Card card) {             // to check if the seleceted card can be played
        return card.getColor() == validColor || card.getValue() == validValue;
    }

    public void checkPlayerTurn(String pid) throws InvalidPlayerTurnException {
        if (this.pIds[this.presPlayer] != pid) {
            throw new InvalidPlayerTurnException("it is not " + pid + "'s turn", pid);
        }
    }

    public void submitDraw(String pid) throws InvalidPlayerTurnException {
        checkPlayerTurn(pid);

        if (deck.isEmpty()) {                       //if the draw pile/deck is empty, it replaces it with shuffled discard 
            deck.replaceDeck(discardPile);
            deck.shuffle();
        }

        getPlayerHand(pid).add(deck.drawCard());    //player draws card and it becomes the next players turn
        if (gameDirection == false) {
            presPlayer = (presPlayer + 1) % pIds.length;
        }

        else if (gameDirection == true) {           // if game direction was reversed
            presPlayer = (presPlayer - 1) % pIds.length;
            if (presPlayer == -1) {
                presPlayer = pIds.length - 1;
            }
        }
    }

    public void setCardColor(Card.Color color) {
        validColor = color;
    }

    public void submitPlayerCard(String pid, Card card, Card.Color declaredColor)
            throws InvalidPlayerTurnException, InvalidColorSubmissionException, InvalidValueSubmissionException {
        checkPlayerTurn(pid);

        ArrayList<Card> pHand = getPlayerHand(pid);

        if (!validCardPlay(card)) {
            if (card.getColor() == Card.Color.Wild) {
                validColor = card.getColor();
                validValue = card.getValue();
            }

            if (card.getColor() != validColor) {
                throw new InvalidColorSubmissionException( "Can't play that card! Expected color: " + validColor + " but got color" + card.getColor() ,  card.getColor(), validColor);
            }

            else if (card.getValue() != validValue) {
            throw new InvalidValueSubmissionException("Can't play that card! Expected value: " + validValue + " but got value" + card.getValue(), card.getValue(), validValue);
            }

        }

        pHand.remove((card));

        if (hasEmptyHand(this.pIds[presPlayer])) {
            JLabel message3 = new JLabel(this.pIds[presPlayer] + " won the game! Thank you for playing!");
            message3.setFont(new Font("Arial", Font.BOLD, 36));
            JOptionPane.showMessageDialog(null, message3);
            System.exit(0);

        }

        validColor = card.getColor();               //sets the the valid color to the color of discarded card
        validValue = card.getValue();               //sets the the valid value to the value  of discarded card
        discardPile.add(card);

        if (gameDirection == false) {
            presPlayer = (presPlayer + 1) % pIds.length;
        }

        else if (gameDirection == true) {
            presPlayer = (presPlayer - 1) % pIds.length;
            if (presPlayer == -1) {
                presPlayer = pIds.length - 1;
            }
        }

        if (card.getColor() == Card.Color.Wild) {
            validColor = declaredColor;
        }

        if (card.getValue() == Card.Value.DrawTwo) {
            pid = pIds[presPlayer];
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());

            JLabel message = new JLabel(pid + " drew 2 cards!");
            message.setFont(new Font("Arial", Font.BOLD, 36));
            JOptionPane.showMessageDialog(null, message);

        }

        if (card.getValue() == Card.Value.Wild_Four) {
            pid = pIds[presPlayer];
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());

            JLabel message = new JLabel(pid + " drew 4 cards!");
        }

        if (card.getValue() == Card.Value.Skip) {
            JLabel message = new JLabel(pIds[presPlayer] + " was skipped!");
            message.setFont(new Font("Arial", Font.BOLD, 36));
            JOptionPane.showMessageDialog(null, message);
            if (gameDirection == false) {
                presPlayer = (presPlayer + 1) % pIds.length;
            }

            else if (gameDirection == true) {
                presPlayer = (presPlayer - 1) % pIds.length;
                if (presPlayer == -1) {
                    presPlayer = pIds.length - 1;
                }
            }
        }

        if (card.getValue() == Card.Value.Reverse) {
            JLabel message = new JLabel(pid + " changed the game direction!");
            message.setFont(new Font("Arial", Font.BOLD, 36));
            JOptionPane.showMessageDialog(null, message);

            gameDirection ^= true;
            if (gameDirection == true) {
                presPlayer = (presPlayer - 2) % pIds.length;
                if (presPlayer == -1) {
                    presPlayer = pIds.length - 1;
                }
                if (presPlayer == -2) {
                    presPlayer = pIds.length - 2;
                }
            } else if (gameDirection == false) {
                presPlayer = (presPlayer + 2) % pIds.length;
            }
        }

    }

    class InvalidPlayerTurnException extends Exception {
        String playerId;

        public InvalidPlayerTurnException(String message, String pid) {
            super(message);
            playerId = pid;
        }

        public String getPid() {
            return playerId;
        }
    }

    class InvalidColorSubmissionException extends Exception {
        private Card.Color expected;
        private Card.Color actual;

        public InvalidColorSubmissionException(String message, Card.Color actual, Card.Color expected) {
            super(message); //
            this.actual = actual;
            this.expected = expected;
        }

    }

    class InvalidValueSubmissionException extends Exception{
        private Card.Value expected;
        private Card.Value actual;

   public InvalidValueSubmissionException(String message, Card.Value actual, Card.Value expected){
       super(message); //
       this.actual = actual;
       this.expected = expected;
   }     

}
}
