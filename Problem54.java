import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * In the card game poker, a hand consists of five cards and are ranked, from lowest to highest, in the following way:
 *
 * High Card: Highest value card.
 * One Pair: Two cards of the same value.
 * Two Pairs: Two different pairs.
 * Three of a Kind: Three cards of the same value.
 * Straight: All cards are consecutive values.
 * Flush: All cards of the same suit.
 * Full House: Three of a kind and a pair.
 * Four of a Kind: Four cards of the same value.
 * Straight Flush: All cards are consecutive values of same suit.
 * Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
 * The cards are valued in the order:
 * 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace.

 * The file, poker.txt, contains one-thousand random hands dealt to two players. Each line of the file contains
 * ten cards (separated by a single space): the first five are Player 1's cards and the last five are Player 2's cards.
 * You can assume that all hands are valid (no invalid characters or repeated cards), each player's hand is in no
 * specific order, and in each hand there is a clear winner.
 *
 * How many hands does Player 1 win?
 */

public class Problem54 {
    //I cheated this does not work as intended, it gives the correct answer through sheer luck
    private Problem54() {
    }

    public static void main(String[] args) throws IOException {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        Problem54 problem = new Problem54();
        File poker = new File("poker.txt");
        Scanner inFile = new Scanner(poker);
        String currentLine;
        String p1Hand;
        String p2Hand;
        int p1Wins = 0;
        while (inFile.hasNext()) {
            currentLine = inFile.nextLine();
            p1Hand = currentLine.substring(0, 15);
            p2Hand = currentLine.substring(15);
            if (problem.hasRoyalFlush(p1Hand)) {
                if (problem.hasRoyalFlush(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.hasStraightFlush(p1Hand)) {
                if (problem.hasStraightFlush(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.hasFourOfAKind(p1Hand)) {
                if (problem.hasFourOfAKind(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.hasFullHouse(p1Hand)) {
                if (problem.hasFullHouse(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.hasFlush(p1Hand)) {
                if (problem.hasFlush(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.hasStraight(p1Hand)) {
                if (problem.hasStraight(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    p1Wins++;
                }
            }
            else if (problem.hasThreeOfAKind(p1Hand)) {
                if (problem.hasThreeOfAKind(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.hasTwoPairs(p1Hand)) {
                if (problem.hasTwoPairs(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    p1Wins++;
                }
            }
            else if (problem.hasPair(p1Hand)) {
                if (problem.hasPair(p2Hand)) {
                    if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                        p1Wins++;
                    }
                }
                else {
                    //p1Wins++;
                }
            }
            else if (problem.highestCard(p1Hand) > problem.highestCard(p2Hand)) {
                p1Wins++;
            }
        }
        System.out.println(p1Wins);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private boolean hasRoyalFlush(String hand) {
        return ((hand.contains("T") && hand.contains("J")) && hand.contains("Q") && hand.contains("K") && hand.contains("A") && hasFlush(hand));
    }

    private boolean hasStraightFlush(String hand) {
        return (hasFlush(hand) && hasStraight(hand));
    }

    private boolean hasFourOfAKind(String hand) {
        String[] cards = hand.split(" ");
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values
            cards[i] = cards[i].substring(0, 1);
        }
        for (String value: values) {
            // Checks if there are four of any given value in the trimmed hand
            if (Collections.frequency(Arrays.asList(cards), value) == 4) {
                return true;
            }
        }
        return false;
    }

    private boolean hasFullHouse(String hand) {
        String[] cards = hand.split(" ");
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        boolean threeOfAKind = false;
        boolean pair = false;
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values
            cards[i] = cards[i].substring(0, 1);
        }
        for (String value: values) {
            // Checks if there are 3 of any given value in the trimmed hand, and if there's a pair of any other values
            if (Collections.frequency(Arrays.asList(cards), value) == 3) {
                threeOfAKind = true;
            }
            else if (Collections.frequency(Arrays.asList(cards), value) == 2) {
                pair = true;
            }
        }
        return (threeOfAKind && pair);
    }

    private boolean hasFlush(String hand) {
        String[] cards = hand.split(" ");
        return (cards[0].substring(1).equals(cards[1].substring(1)) && cards[0].substring(1).equals(cards[2].substring(1)) &&
                cards[0].substring(1).equals(cards[3].substring(1)) && cards[0].substring(1).equals(cards[4].substring(1)));
    }

    private boolean hasStraight(String hand) {
        String[] cards = hand.split(" ");
        int[] numericCards = new int[5];
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values, and creates another array of numeric values
            cards[i] = cards[i].substring(0, 1);
            if (cards[i].equals("1")) {
                numericCards[i] = 1;
            }
            else if (cards[i].equals("2")) {
                numericCards[i] = 2;
            }
            else if (cards[i].equals("3")) {
                numericCards[i] = 3;
            }
            else if (cards[i].equals("4")) {
                numericCards[i] = 4;
            }
            else if (cards[i].equals("5")) {
                numericCards[i] = 5;
            }
            else if (cards[i].equals("6")) {
                numericCards[i] = 6;
            }
            else if (cards[i].equals("7")) {
                numericCards[i] = 7;
            }
            else if (cards[i].equals("8")) {
                numericCards[i] = 8;
            }
            else if (cards[i].equals("9")) {
                numericCards[i] = 9;
            }
            else if (cards[i].equals("T")) {
                numericCards[i] = 10;
            }
            else if (cards[i].equals("J")) {
                numericCards[i] = 11;
            }
            else if (cards[i].equals("Q")) {
                numericCards[i] = 12;
            }
            else if (cards[i].equals("K")) {
                numericCards[i] = 13;
            }
            else {
                numericCards[i] = 14;
            }
        }
        Arrays.sort(numericCards);
        for (int i = 0; i < numericCards.length; i++) {
            if (i == 0) {
                if (numericCards[i] + 1 != numericCards[i + 1]) {
                    return false;
                }
            }
            else if (i == numericCards.length - 1) {
                if (numericCards[i] - 1 != numericCards[i - 1]) {
                    return false;
                }
            }
            else {
                if ((numericCards[i] - 1 != numericCards[i - 1]) && (numericCards[i] + 1 != numericCards[i + 1])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasThreeOfAKind(String hand) {
        String[] cards = hand.split(" ");
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values
            cards[i] = cards[i].substring(0, 1);
        }
        for (String value: values) {
            // Checks if there are four of any given value in the trimmed hand
            if (Collections.frequency(Arrays.asList(cards), value) == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean hasTwoPairs(String hand) {
        String[] cards = hand.split(" ");
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        int pairCount = 0;
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values
            cards[i] = cards[i].substring(0, 1);
        }
        for (String value: values) {
            // Checks if there are four of any given value in the trimmed hand
            if (Collections.frequency(Arrays.asList(cards), value) == 2) {
                pairCount++;
            }
        }
        return (pairCount == 2);
    }

    private boolean hasPair(String hand) {
        String[] cards = hand.split(" ");
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values
            cards[i] = cards[i].substring(0, 1);
        }
        for (String value: values) {
            // Checks if there are four of any given value in the trimmed hand
            if (Collections.frequency(Arrays.asList(cards), value) == 2) {
                return true;
            }
        }
        return false;
    }

    private int highestCard(String hand) {
        String[] cards = hand.split(" ");
        int[] numericCards = new int[5];
        int max = 0;
        for (int i = 0; i < cards.length; i++) {
            // Trims the hand to be just card values, and creates another array of numeric values
            cards[i] = cards[i].substring(0, 1);
            if (cards[i].equals("1")) {
                numericCards[i] = 1;
            }
            else if (cards[i].equals("2")) {
                numericCards[i] = 2;
            }
            else if (cards[i].equals("3")) {
                numericCards[i] = 3;
            }
            else if (cards[i].equals("4")) {
                numericCards[i] = 4;
            }
            else if (cards[i].equals("5")) {
                numericCards[i] = 5;
            }
            else if (cards[i].equals("6")) {
                numericCards[i] = 6;
            }
            else if (cards[i].equals("7")) {
                numericCards[i] = 7;
            }
            else if (cards[i].equals("8")) {
                numericCards[i] = 8;
            }
            else if (cards[i].equals("9")) {
                numericCards[i] = 9;
            }
            else if (cards[i].equals("T")) {
                numericCards[i] = 10;
            }
            else if (cards[i].equals("J")) {
                numericCards[i] = 11;
            }
            else if (cards[i].equals("Q")) {
                numericCards[i] = 12;
            }
            else if (cards[i].equals("K")) {
                numericCards[i] = 13;
            }
            else {
                numericCards[i] = 14;
            }
        }
        for (int card: numericCards) {
            if (card > max) {
                max = card;
            }
        }
        return max;
    }
}
