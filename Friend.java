package akhil;
import java.util.Scanner;

public class Friend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of friends: ");
        int totalFriends = scanner.nextInt();
        
        System.out.print("Enter the number of teams: ");
        int numTeams = scanner.nextInt();
        
        splitIntoTeams(totalFriends, numTeams);
        
        scanner.close();
    }
    
    public static void splitIntoTeams(int totalFriends, int numTeams) {
        int friendsPerTeam = totalFriends / numTeams; 
        int leftOutFriends = totalFriends % numTeams; 
        
        System.out.println("Each team will have " + friendsPerTeam + " friends.");
        System.out.println(leftOutFriends + " friend(s) will be left out and can assist.");
    }
}
