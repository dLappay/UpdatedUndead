import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display game title and rules
        System.out.println("\t\t\t\t\tThe Game of the Undead");
        System.out.println("\t\t\t\t\t======================");
        System.out.println("Mechanics: The game consist of 2 teams. Each team will select 3 undead \n\t\t   and each turn will decide by rolling dice. And in every turn player \n\t\t   will choose if he/she will attack or use the ability.");
        System.out.println("\t\t\t\t\t======================");

        // Create an array to store Undead for Team 1
        Undead[] undeadTeam1 = new Undead[3];
        System.out.print("Enter team 1 name: ");
        String team1Name = input.nextLine();

        // Allow players to choose Undead for Team 1
        for (int i = 0; i < 3; i++) {
            System.out.print("Choose an Undead: ");
            String undeadType = input.nextLine();

            // Based on the chosen Undead type, create the corresponding Undead object
            switch (undeadType.toLowerCase()) {
                case "zombie" -> {
                    System.out.print("Select a type of zombie (standard/mummy): ");
                    String zombieType = input.nextLine();
                    if (zombieType.equals("standard")) {
                        undeadTeam1[i] = new Zombie();
                    } else if (zombieType.equals("mummy")) {
                        undeadTeam1[i] = new Mummy();
                    }
                }
                case "vampire" -> undeadTeam1[i] = new Vampire();
                case "skeleton" -> {
                    System.out.print("Select a type of skeleton (standard/lich): ");
                    String skeletonType = input.nextLine();
                    if (skeletonType.equals("standard")) {
                        undeadTeam1[i] = new Skeleton();
                    } else if (skeletonType.equals("lich")) {
                        undeadTeam1[i] = new Lich();
                    }
                }
                case "ghost" -> undeadTeam1[i] = new Ghost();
                default -> {
                    System.out.println("Invalid undead type.");
                    i--; // Allow the user to re-enter the undead type
                }
            }
        }
        System.out.println("================================");
        System.out.println("================================");

        // Create an array to store Undead for Team 2
        Undead[] undeadTeam2 = new Undead[3];
        System.out.print("Enter team 2 name: ");
        String team2Name = input.nextLine();

        // Allow players to choose Undead for Team 2
        for (int i = 0; i < 3; i++) {
            System.out.print("Choose an Undead: ");
            String undeadType = input.nextLine();

            // Based on the chosen Undead type, create the corresponding Undead object
            switch (undeadType.toLowerCase()) {
                case "zombie" -> {
                    System.out.print("Select a type of zombie (standard/mummy): ");
                    String zombieType = input.nextLine();
                    if (zombieType.equals("standard")) {
                        undeadTeam2[i] = new Zombie();
                    } else if (zombieType.equals("mummy")) {
                        undeadTeam2[i] = new Mummy();
                    }
                }
                case "vampire" -> undeadTeam2[i] = new Vampire();
                case "skeleton" -> {
                    System.out.print("Select a type of skeleton (standard/lich): ");
                    String skeletonType = input.nextLine();
                    if (skeletonType.equals("standard")) {
                        undeadTeam2[i] = new Skeleton();
                    } else if (skeletonType.equals("lich")) {
                        undeadTeam2[i] = new Lich();
                    }
                }
                case "ghost" -> undeadTeam2[i] = new Ghost();
                default -> {
                    System.out.println("Invalid undead type.");
                    i--; // Allow the user to re-enter the undead type
                }
            }
        }
        // Display the selected teams and Undead
        System.out.println("================================");
        System.out.println("================================");
        System.out.println("         Team 1 " + team1Name);
        System.out.println("Player 1: " + undeadTeam1[0].getName());
        System.out.println("Player 2: " + undeadTeam1[1].getName());
        System.out.println("Player 3: " + undeadTeam1[2].getName());

        System.out.println();
        System.out.println("         Team 2 " + team2Name);
        System.out.println("Player 1: " + undeadTeam2[0].getName());
        System.out.println("Player 2: " + undeadTeam2[1].getName());
        System.out.println("Player 3: " + undeadTeam2[2].getName());

        // Initialize scores for both teams
        int scoreTeam1 = 0;
        int scoreTeam2 = 0;

        // Loop through the Undead battles
        for (int i = 0; i < 3; i++) {
            // Display the current battle
            System.out.println("================================");
            System.out.println("================================");
            System.out.println("             Round " + (i +1));
            System.out.println("================================");
            System.out.println("================================");
            System.out.println("             Team 1");
            System.out.println(undeadTeam1[i].getName());
            System.out.println("HP: " + undeadTeam1[i].getHP());
            System.out.println("               VS");
            System.out.println();
            System.out.println("             Team 2");
            System.out.println(undeadTeam2[i].getName());
            System.out.println("HP: " + undeadTeam2[i].getHP());
            System.out.println("================================");

            // Create a dice roll object
            DiceRoll diceRoll = new DiceRoll();
            do{
                // Roll dice for both teams
                int diceRollTeam1 = diceRoll.roll();
                int diceRollTeam2 = diceRoll.roll();

                // Display dice rolls
                System.out.println("================================");
                System.out.println("           DICE ROLL");
                System.out.println(undeadTeam1[i].getName() + ": " + diceRollTeam1);
                System.out.println(undeadTeam2[i].getName() + ": " + diceRollTeam2);
                System.out.println("================================");

                // Determine which team's turn it is based on dice rolls and perform attacks
                if(diceRollTeam1 > diceRollTeam2) {
                    System.out.println("           Team 1 turn");
                    undeadTeam1[i].attack(undeadTeam2[i]);
                }else {
                    System.out.println("           Team 2 turn");
                    undeadTeam2[i].attack(undeadTeam1[i]);
                }

                // Check if Undead from both teams are dead
                if (undeadTeam1[i].getHP() <= 0) {
                    undeadTeam1[i].setIsDead(true);
                }
                if (undeadTeam2[i].getHP() <= 0) {
                    undeadTeam2[i].setIsDead(true);
                }

                // Display the status of Undead in both teams
                System.out.println("================================");
                System.out.println("================================");
                System.out.println("              Team 1");
                System.out.println("Undead: " + undeadTeam1[i].getName());
                System.out.println("Hp:" + undeadTeam1[i].getHP());
                System.out.println(undeadTeam1[i].getName() + " is dead? " + undeadTeam1[i].isDead());
                System.out.println("================================");
                System.out.println("              Team 2");
                System.out.println("Undead: " + undeadTeam2[i].getName());
                System.out.println("Hp:" + undeadTeam2[i].getHP());
                System.out.println(undeadTeam2[i].getName() + " is dead? " + undeadTeam2[i].isDead());

            }while(undeadTeam1[i].getHP() > 0 && undeadTeam2[i].getHP() > 0);

            // Update scores based on the battle outcome
            if (!undeadTeam1[i].isDead()) {
                scoreTeam1++;
            } else {
                scoreTeam2++;
            }

            // Display the current standings
            System.out.println("================================");
            System.out.println("================================");
            System.out.println("            Standings");
            System.out.println("Team 1 - " +  scoreTeam1 + "      |     Team 2 - " + scoreTeam2 );
            System.out.println("================================");
            System.out.println("================================");

            // Check if either team has won two battles (best of 3)
            if (scoreTeam1 == 2) {
                break;
            } else if (scoreTeam2 == 2){
                break;
            }
        }

        // Determine the winner based on the overall score
        if (scoreTeam1 > scoreTeam2) {
            System.out.println("          Team 1 WINS!!!");
            System.out.println("================================");
            System.out.println("================================");
        } else {
            System.out.println("          Team 2 WINS!!!");
            System.out.println("================================");
            System.out.println("================================");
        }
    }
}
