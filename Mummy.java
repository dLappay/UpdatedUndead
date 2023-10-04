import java.util.Scanner;

public class Mummy extends Zombie{
    static String m = "Mummy";
    public Mummy() {
        super.setName(m);
    }
    public void attack(Undead enemy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attack -  attack damage is equal to the half of its HP plus 10% of the undead HP.");
        if (super.getHP() > 0) {
            if (super.getHP() > 50) {
                System.out.print("Choose attack or ability: ");
                String chooseAttackOrAbility = input.nextLine().toLowerCase();
                switch (chooseAttackOrAbility.toLowerCase()) {
                    case "attack":
                        int attackDamage = super.getHP() / 2;
                        int plusHP = (int) (enemy.getHP() * 0.10);
                        enemy.setHp(enemy.getHP() - (attackDamage + plusHP));
                        System.out.println("Attack damage: " + (enemy.getHP() - (attackDamage + plusHP)));
                        break;
                    case "ability":
                        super.ability(enemy);
                        break;
                }
            } else {
                System.out.println("Attack is not available");
                String chooseAttackOrAbility = input.nextLine().toLowerCase();
                switch (chooseAttackOrAbility.toLowerCase()) {
                    case "attack":
                        System.out.println("You can't attack below 50 HP");
                        break;
                    case "ability":
                        super.ability(enemy);
                        break;
                }
            }
        }
        if (super.getHP() < 0) {
            super.setHp(100);
        }
    }
    public void attackForGhost(Undead enemy) {
        int attackDamage = super.getHP() / 2;
        int plusHP = (int) (enemy.getHP() * 0.10);
        int totalDamage = attackDamage + plusHP;
        int ghostDefence = (int) (totalDamage * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
