import java.util.Scanner;
public class Zombie extends Undead {
    static String z = "Zombie";

    public Zombie() {
        super();
        super.setName(z);
    }

    public void ability(Undead enemy) {
        int halfEnemyHP = enemy.getHP() / 2;
        int remainingEnemyHP = enemy.getHP() - halfEnemyHP;
        enemy.setHp(remainingEnemyHP);
        super.setHp(super.getHP() + halfEnemyHP);
        System.out.println(super.getName() + " eats " + halfEnemyHP + " HP");
    }

    public void attack(Undead enemy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attack - Attack damage is half of its HP");
        System.out.println("Ability - Zombie can eat another undead as a result it will increase its \nHP by the half of the HP of the undead being eaten.");
            if (super.getHP() > 0) {
                if (super.getHP() > 50) {
                    System.out.print("Choose attack or ability: ");
                    String chooseAttackOrAbility = input.nextLine().toLowerCase();
                    switch (chooseAttackOrAbility.toLowerCase()) {
                        case "attack" -> {
                            int halfZombieHP = super.getHP() / 2;
                            int attackDamage = enemy.getHP() - halfZombieHP;
                            enemy.setHp(attackDamage);
                            System.out.println("Attack damage: " + halfZombieHP);
                        }
                        case "ability" -> ability(enemy);
                    }
                } else {
                    System.out.println("Attack is not available");
                    String chooseAttackOrAbility = input.nextLine().toLowerCase();
                    switch (chooseAttackOrAbility.toLowerCase()) {
                        case "attack" -> System.out.println("You can't attack below 50 HP");
                        case "ability" -> ability(enemy);
                    }
                }
            } else {
                super.setIsDead(true);
            }
    }

    public void attackForGhost(Undead enemy) {
        int halfZombieHP = super.getHP() / 2;
        int ghostDefence = (int) (halfZombieHP * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}

