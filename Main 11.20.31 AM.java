import java.util.Objects;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("\t\t\t\t\tThe Game of the Undead");
        System.out.println("\t\t\t\t\t======================");
        System.out.println("Mechanics: The game consist of 2 teams. Each team will select 3 undead \n\t\t   and each turn will decide by rolling dice. And in every turn player \n\t\t   will choose if he/she will attack or use the ability.");
        System.out.println("\t\t\t\t\t======================");

        Undead[] undeadTeam1 = new Undead[3];
        System.out.print("Enter team 1 name: ");
        String team1Name = input.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Choose an Undead: ");
            String undeadType = input.nextLine();

            switch (undeadType.toLowerCase()) {
                case "zombie":
                    System.out.print("Select a type of zombie (standard/mummy): ");
                    String zombieType = input.nextLine();
                    if (zombieType.equals("standard")) {
                        undeadTeam1[i] = new Zombie();
                    } else if (zombieType.equals("mummy")) {
                        undeadTeam1[i] = new Mummy();
                    }
                    break;

                case "vampire":
                    undeadTeam1[i] = new Vampire();
                    break;

                case "skeleton":
                    System.out.print("Select a type of skeleton (standard/lich): ");
                    String skeletonType = input.nextLine();
                    if (skeletonType.equals("standard")) {
                        undeadTeam1[i] = new Skeleton();
                    } else if (skeletonType.equals("lich")) {
                        undeadTeam1[i] = new Lich();
                    }
                    break;

                case "ghost":
                    undeadTeam1[i] = new Ghost();
                    break;

                default:
                    System.out.println("Invalid undead type.");
                    i--; // Allow the user to re-enter the undead type
                    break;
            }
        }
        /*//Store the new Method of undead team 1
        Zombie zombieTeam1 = null;
        Vampire vampireTeam1 = null;
        Skeleton skeletonTeam1 = null;
        Ghost  ghostTeam1 = null;
        Lich lichTeam1 = null;
        Mummy mummyTeam1 = null;

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
                            zombieTeam1 = (Zombie) undeadTeam1[0];
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam1[0] = new Mummy();
                            mummyTeam1 = (Mummy) undeadTeam1[0];

                        }
                    }
                    case 1 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam1[1] = new Zombie();
                            zombieTeam1 = (Zombie) undeadTeam1[1];
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam1[1] = new Mummy();
                            mummyTeam1 = (Mummy) undeadTeam1[1];
                        }
                    }
                    case 2 -> {
                        if (Objects.equals(zombieType, "standard")) {
                            undeadTeam1[2] = new Zombie();
                            zombieTeam1 = (Zombie) undeadTeam1[2];
                        } else if (Objects.equals(zombieType, "mummy")) {
                            undeadTeam1[2] = new Mummy();
                            mummyTeam1 = (Mummy) undeadTeam1[2];
                        }
                    }
                    default -> System.out.println("Invalid case undead.");
                }
            }
            else if (team1[i].equals("vampire")) {
                switch (i) {
                    case 0 -> {
                        undeadTeam1[0] = new Vampire();
                        vampireTeam1 = (Vampire) undeadTeam1[0];
                    }
                    case 1 -> {
                        undeadTeam1[1] = new Vampire();
                        vampireTeam1 = (Vampire) undeadTeam1[1];
                    }
                    case 2 -> {
                        undeadTeam1[2] = new Vampire();
                        vampireTeam1 = (Vampire) undeadTeam1[2];
                    }
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
                                skeletonTeam1 = (Skeleton) undeadTeam1[0];
                            } else if (Objects.equals(skeletonType, "lich")) {
                                undeadTeam1[0] = new Lich();
                                lichTeam1 = (Lich) undeadTeam1[0];
                            }
                        }
                        case 1 -> {
                            if (Objects.equals(skeletonType, "standard")) {
                                undeadTeam1[1] = new Skeleton();
                                skeletonTeam1 = (Skeleton) undeadTeam1[1];
                            } else if (Objects.equals(skeletonType, "lich")) {
                                undeadTeam1[1] = new Lich();
                                lichTeam1 = (Lich) undeadTeam1[1];
                            }
                        }
                        case 2 -> {
                            if (Objects.equals(skeletonType, "standard")) {
                                undeadTeam1[2] = new Skeleton();
                                skeletonTeam1 = (Skeleton) undeadTeam1[2];
                            } else if (Objects.equals(skeletonType, "lich")) {
                                undeadTeam1[2] = new Lich();
                                lichTeam1 = (Lich) undeadTeam1[2];
                            }
                        }
                        default -> System.out.println("Invalid case undead.");
                    }
            }
            else if (team1[i].equals("ghost")) {
                switch (i) {
                    case 0 -> {
                        undeadTeam1[0] = new Ghost();
                        ghostTeam1 = (Ghost) undeadTeam1[0];
                    }
                    case 1 -> {
                        undeadTeam1[1] = new Ghost();
                        ghostTeam1 = (Ghost) undeadTeam1[0];
                    }
                    case 2 -> {
                        undeadTeam1[2] = new Ghost();
                        ghostTeam1 = (Ghost) undeadTeam1[0];
                    }
                    default -> System.out.println("Invalid undead.");
                }
            }
            System.out.println();
        }*/

        System.out.println("\t\t\t\t\t======================");

        Undead[] undeadTeam2 = new Undead[3];

        System.out.print("Enter team 2 name: ");
        String team2Name = input.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Choose an Undead: ");
            String undeadType = input.nextLine();

            switch (undeadType.toLowerCase()) {
                case "zombie":
                    System.out.print("Select a type of zombie (standard/mummy): ");
                    String zombieType = input.nextLine();
                    if (zombieType.equals("standard")) {
                        undeadTeam2[i] = new Zombie();
                    } else if (zombieType.equals("mummy")) {
                        undeadTeam2[i] = new Mummy();
                    }
                    break;

                case "vampire":
                    undeadTeam2[i] = new Vampire();
                    break;

                case "skeleton":
                    System.out.print("Select a type of skeleton (standard/lich): ");
                    String skeletonType = input.nextLine();
                    if (skeletonType.equals("standard")) {
                        undeadTeam2[i] = new Skeleton();
                    } else if (skeletonType.equals("lich")) {
                        undeadTeam2[i] = new Lich();
                    }
                    break;

                case "ghost":
                    undeadTeam2[i] = new Ghost();
                    break;

                default:
                    System.out.println("Invalid undead type.");
                    i--; // Allow the user to re-enter the undead type
                    break;
            }
        }
        /*/Store the new Method of undead team 2
        Zombie zombieTeam2 = null;
        Vampire vampireTeam2 = null;
        Skeleton skeletonTeam2 = null;
        Ghost  ghostTeam2 = null;
        Lich lichTeam2 = null;
        Mummy mummyTeam2 = null;

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
        }*/

        //Displaying teams
        System.out.println();
        System.out.println("Team 1 " + team1Name);
        System.out.println("Player 1: " + undeadTeam1[0].getName());
        System.out.println("Player 2: " + undeadTeam1[1].getName());
        System.out.println("Player 3: " + undeadTeam1[2].getName());

        System.out.println();
        System.out.println("Team 1 " + team2Name);
        System.out.println("Player 4: " + undeadTeam2[0].getName());
        System.out.println("Player 5: " + undeadTeam2[1].getName());
        System.out.println("Player 5: " + undeadTeam2[2].getName());

        if (undeadTeam1[0] != null && undeadTeam2[0] != null) {
            // Attack the first undead of team 1 with the first undead of team 2.
            undeadTeam1[0].attack(undeadTeam2[0]);
            System.out.println("\n" + undeadTeam2[0].getHP());
        }
    }
}
