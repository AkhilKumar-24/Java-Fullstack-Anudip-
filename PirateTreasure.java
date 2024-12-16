package akhil;
import java.util.Scanner;

public class PirateTreasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCoins = scanner.nextInt();
        int benPercentage = scanner.nextInt();
        int blackbeardPercentage = scanner.nextInt();

        int benShare = totalCoins * benPercentage / 100;

        int remainingAfterBen = totalCoins - benShare;
        int blackbeardShare = remainingAfterBen * blackbeardPercentage / 100;

        int remainingAfterBlackbeard = remainingAfterBen - blackbeardShare;

        int otherPiratesShare = remainingAfterBlackbeard / 3;

        System.out.println(benShare); 
        System.out.println(blackbeardShare); 
        System.out.println(otherPiratesShare); 
    }
}

