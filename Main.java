import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("\t\t\t\t\tThe Game of the Undead");
        System.out.println("\t\t\t\t\t======================");
        System.out.println("Mechanics: The game consist of 2 teams. Each team will select 3 undead \n\t\t   and each turn will decide by rolling dice. And in every turn player \n\t\t   will choose if he/she will attack or use the ability.");
        System.out.println("\t\t\t\t\t======================");

        //Team 1 selecting Undead character
        Undead[] undeadTeam1 = new Undead[3];
        String[] team1 = new String[3];
        System.out.print("Enter team 1 name: ");
        String team1Name = input.nextLine();
        for(int i = 0; i < 3; i++) {
            System.out.print("Choose a Undead: ");
            team1[i] = input.nextLine();
            if (team1[i].equals("zombie")) {
                System.out.print("Select a type of zombie: ");
                String zombieType = input.nextLine();
                switch (i) {
                    case 0 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam1[0] = new Zombie();
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam1[0] = new Mummy();
                        }
                    }
                    case 1 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam1[1] = new Zombie();
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam1[1] = new Mummy();
                        }
                    }
                    case 2 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam1[2] = new Zombie();
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam1[2] = new Mummy();
                        }
                    }
                    default -> System.out.println("Invalid case undead.");
                }
            }
            else if (team1[i].equals("vampire")) {
                switch (i) {
                    case 0 -> undeadTeam1[0] = new Vampire();
                    case 1 -> undeadTeam1[1] = new Vampire();
                    case 2 -> undeadTeam1[2] = new Vampire();
                    default -> System.out.println("Invalid undead.");
                }
            }
            else if (team1[i].equals("skeleton")) {
                    System.out.print("Select a type of skeleton: ");
                    String skeletonType = input.nextLine();
                    switch (i) {
                        case 0 -> {
                            if (Objects.equals(skeletonType, "standard")) {
                                undeadTeam1[0] = new Skeleton();
                            } else if (Objects.equals(skeletonType, "lich")) {
                                undeadTeam1[0] = new Lich();
                            }
                        }
                        case 1 -> {
                            if (Objects.equals(skeletonType, "standard")) {
                                undeadTeam1[1] = new Skeleton();
                            } else if (Objects.equals(skeletonType, "lich")) {
                                undeadTeam1[1] = new Lich();
                            }
                        }
                        case 2 -> {
                            if (Objects.equals(skeletonType, "standard")) {
                                undeadTeam1[2] = new Skeleton();
                            } else if (Objects.equals(skeletonType, "lich")) {
                                undeadTeam1[2] = new Lich();
                            }
                        }
                        default -> System.out.println("Invalid case undead.");
                    }
            }
            else if (team1[i].equals("ghost")) {
                switch (i) {
                    case 0 -> undeadTeam1[0] = new Ghost();
                    case 1 -> undeadTeam1[1] = new Ghost();
                    case 2 -> undeadTeam1[2] = new Ghost();
                    default -> System.out.println("Invalid undead.");
                }
            }
            System.out.println();
        }
        System.out.println("\t\t\t\t\t======================");

        //Team 2 selecting Undead character
        Undead[] undeadTeam2 = new Undead[3];
        String[] team2 = new String[3];
        System.out.print("Enter team 2 name: ");
        String team2Name = input.nextLine();
        for(int i = 0; i < 3; i++) {
            System.out.print("Choose a Undead: ");
            team2[i] = input.nextLine();
            if (team2[i].equals("zombie")) {
                System.out.print("Select a type of zombie: ");
                String zombieType = input.nextLine();
                switch (i) {
                    case 0 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam2[0] = new Zombie();
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam2[0] = new Mummy();
                        }
                    }
                    case 1 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam2[1] = new Zombie();
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam2[1] = new Mummy();
                        }
                    }
                    case 2 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam2[2] = new Zombie();
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam2[2] = new Mummy();
                        }
                    }
                    default -> System.out.println("Invalid case undead.");
                }
            }
            else if (team2[i].equals("vampire")) {
                switch (i) {
                    case 0 -> undeadTeam2[0] = new Vampire();
                    case 1 -> undeadTeam2[1] = new Vampire();
                    case 2 -> undeadTeam2[2] = new Vampire();
                    default -> System.out.println("Invalid undead.");
                }
            }
            else if (team2[i].equals("skeleton")) {
                System.out.print("Select a type of skeleton: ");
                String skeletonType = input.nextLine();
                switch (i) {
                    case 0 -> {
                        if (Objects.equals(skeletonType, "standard")) {
                            undeadTeam2[0] = new Skeleton();
                        } else if (Objects.equals(skeletonType, "lich")) {
                            undeadTeam2[0] = new Lich();
                        }
                    }
                    case 1 -> {
                        if (Objects.equals(skeletonType, "standard")) {
                            undeadTeam2[1] = new Skeleton();
                        } else if (Objects.equals(skeletonType, "lich")) {
                            undeadTeam2[1] = new Lich();
                        }
                    }
                    case 2 -> {
                        if (Objects.equals(skeletonType, "standard")) {
                            undeadTeam2[2] = new Skeleton();
                        } else if (Objects.equals(skeletonType, "lich")) {
                            undeadTeam2[2] = new Lich();
                        }
                    }
                    default -> System.out.println("Invalid case undead.");
                }
            }
            else if (team2[i].equals("ghost")) {
                switch (i) {
                    case 0 -> undeadTeam2[0] = new Ghost();
                    case 1 -> undeadTeam2[1] = new Ghost();
                    case 2 -> undeadTeam2[2] = new Ghost();
                    default -> System.out.println("Invalid undead.");
                }
            }
            System.out.println();
        }

        //Displaying teams
        System.out.println();
        System.out.println("Team 1" + team1Name);
        System.out.println("Player 1: " + undeadTeam1[0].getName());
        System.out.println("Player 2: " + undeadTeam1[1].getName());
        System.out.println("Player 3: " + undeadTeam1[2].getName());

        System.out.println();
        System.out.println("Team 1" + team2Name);
        System.out.println("Player 4: " + undeadTeam2[0].getName());
        System.out.println("Player 5: " + undeadTeam2[1].getName());
        System.out.println("Player 5: " + undeadTeam2[2].getName());

        //Game
        Undead undead = new Undead();
        DiceRoll diceRoll = new DiceRoll();
        do {
            int team1Roll = diceRoll.roll();
            int team2Roll = diceRoll.roll();

            undeadTeam1[0].attack(undeadTeam2[0]);
            System.out.println(undeadTeam2[0].getHP());

            /*if (team1Roll > team2Roll) {
                String chooseAttackOrUseAbility = input.nextLine();
                if(Objects.equals(chooseAttackOrUseAbility, "attack")) {
                    undeadTeam1[0].attack(undeadTeam2[0]);
                    System.out.println(undeadTeam2[0].getHP());
                } else if (Objects.equals(chooseAttackOrUseAbility, "ability")) {
                    if (undeadTeam1[0] == new Zombie() || undeadTeam1[0] == new Vampire() || undeadTeam1[0] == new Lich()) {
                        undeadTeam1[0].
                    }
                }
            }*/
        }while(undeadTeam1[0].getHP() < 0 || undeadTeam2[0].getHP() < 0);
    }
}
