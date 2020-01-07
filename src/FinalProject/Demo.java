package FinalProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerName = null,playerGender = null, playerType = null;
        Date birthDate = null;
        Integer playerAge = null , inningsPlayed = null, ballsfaced = null, ballsBowled =null, runsScore = null, runsGiven = null;

        try {
            // get the input
            System.out.println("Enter the player name:");
            playerName = scanner.next();

            System.out.println("Enter the player age:");
            playerAge = scanner.nextInt();

            System.out.println("Enter the player Gender:");
            playerGender = scanner.next();

            System.out.println("Enter the player birthDate (DD/MM/YYYY\") :");
            String playerBirthDate = scanner.next();
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(playerBirthDate);

            System.out.println("Enter the player type:");
            playerType = scanner.next();

            System.out.println("Enter the innings Played:");
            inningsPlayed = scanner.nextInt();
            System.out.println("Enter the balls faced:");
            ballsfaced = scanner.nextInt();
            System.out.println("Enter the runs given:");
            runsGiven = scanner.nextInt();
            System.out.println("Enter the balls bowled:");
            ballsBowled = scanner.nextInt();
            System.out.println("Enter the runs scored:");
            runsScore = scanner.nextInt();

        } catch (ParseException ex) {
            System.out.println("Invalid birthDate format " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Input Mismatch" + ex.getMessage());
        } catch (Exception e){
            System.out.println("Oops ! Something went wrong" + e.getMessage());
        }


        CricketPlayer cricketPlayer =
                new IndianTeam( playerName, playerAge , birthDate, playerGender,
                        playerType,inningsPlayed,runsScore,runsGiven,ballsfaced,ballsBowled);

    }
}
