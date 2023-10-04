import java.util.Scanner;
public class Vampire extends Undead {
    static String v = "Vampire";
    public Vampire() {
        super.setHp(getHP() + 20);
        super.setName(v);
    }
    public void ability(Undead enemy) {
        //bite
        int additionalHp = (int) (enemy.getHP() * 0.8);
        int currentHP = super.getHP() + additionalHp;
        super.setHp(currentHP);
        enemy.setHp(enemy.getHP() - additionalHp);
        System.out.println(super.getName() + " eats " + currentHP);
    }
    public void attack(Undead enemy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attack - Attack damage is same as its HP");
        System.out.println("Ability - Vampire can bite which increases their HP by 80% of the undead HP being bitten");
        if (super.getHP() > 0) {
            System.out.print("Choose attack or ability: ");
            String chooseAttackOrAbility = input.nextLine().toLowerCase();
            switch (chooseAttackOrAbility.toLowerCase()) {
                case "attack":
                    int attackDamage = enemy.getHP() - getHP();
                    enemy.setHp(attackDamage);
                    System.out.println("Attack damage: " + super.getHP());
                    break;
                case "ability":
                    ability(enemy);
                    break;
            }
        } else {
            System.out.println("Attack is not available");
            String chooseAttackOrAbility = input.nextLine().toLowerCase();
            if (chooseAttackOrAbility.equals("ability")) {
                ability(enemy);
            } else {
                System.out.println("You can't attack if your HP is 0");
            }
        }
        if (enemy.getHP() < 0) {
            enemy.setHp(0);
        }
    }
    public void attackForGhost(Undead enemy) {
        int ghostDefence = (int) (getHP() * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
