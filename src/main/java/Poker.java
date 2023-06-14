import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
This class represents a game of Poker and is the entry point to the game.
This class gets the number of players and validates if the total players constraints are satisfied.
The total players constraints is that the player number must be of minimum 2 and a maximum of 5.

The main classes identified are
1. Card: Represents the playing cards. Each card is unique in rank and shape.
2. Deck: Represents a deck of playing cards. Each card is from class Card and each card in the deck is unique.
3. Chips: Represents the chips used to play poker.
4. Hand: Represents the cards each player holds.
5. Player: Represents players playing Poker.
6. Game: Represents a single round of poker game.

 */
public class Poker {


    public static void main(String[] args) {

        //ask for the total number of players
//        int totalPLayers = getNumberOfPlayers();

        Deck deck = new Deck();
        Card card = deck.getCards().get(33);
        Chips chips = new Chips();

        Hand playerHand = new Hand();
        playerHand.setHandCards(deck.getCards().get(10));
        playerHand.setHandCards(deck.getCards().get(16));
        playerHand.setHandCards(deck.getCards().get(44));

        Player playerOne = new Player("Krishu");
        playerOne.setPlayerHand(playerHand);

        List<Player> players = new ArrayList<>();
        players.add(playerOne);
        PokerRound pokerRound = new PokerRound(deck, players);

        Gson gson = new Gson();
        String deckJson = gson.toJson(deck);
        System.out.println(deckJson);

        String cardJson = gson.toJson(card);
        System.out.println(cardJson);

        String chipsJson = gson.toJson(chips);
        System.out.println(chipsJson);

        String playerHandJson = gson.toJson(playerHand);
        System.out.println(playerHandJson);

        String playerOneJson = gson.toJson(playerOne);
        System.out.println(playerOneJson);

        String pokerRoundJson = gson.toJson(pokerRound);
        System.out.println(pokerRoundJson);

    }

    /**
     * This method asks for the total number of players playing the game
     * The minimum players playing must be 2 and maximum 5
     *
     * @return total number of players
     */
    private static int getNumberOfPlayers() {
        int totalPLayers;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the number of players, minimum players = 2 and Max players = 5");
            totalPLayers = scanner.nextInt();
            if (totalPLayers >= 2 && totalPLayers <= 5) {
                break;
            }
        }

        scanner.close();
        System.out.println("Total Players playing: " + totalPLayers);
        return totalPLayers;
    }
}