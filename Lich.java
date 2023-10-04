import java.util.Scanner;

public class Lich extends Skeleton{
    static String l = "Lich";
    public Lich() {
        super();
        super.setName(l);
    }
    public void ability(Undead enemy) {
        int getEnemyHP = (int) (enemy.getHP() * 0.10);
        setHp(super.getHP() + getEnemyHP);
        enemy.setHp(enemy.getHP() - getEnemyHP);
        System.out.println(super.getName() + " get additional " + super.getHP() + " HP");
    }
    public void attack(Undead enemy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attack - attack damage is equal to 70% of its");
        System.out.println("Ability - It could cast a spell on undead which gets the 10% of their HP and add it to its HP");
        if (super.getHP() > 0) {
            System.out.print("Choose attack or ability: ");
            String chooseAttackOrAbility = input.nextLine().toLowerCase();
            switch (chooseAttackOrAbility.toLowerCase()) {
                case "attack":
                    int attackDamage = (int) (super.getHP() * 0.70);
                    enemy.setHp(enemy.getHP() - attackDamage);
                    System.out.println("Attack damage: " + attackDamage);
                    break;
                case "ability":
                    ability(enemy);
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
                    ability(enemy);
                    break;
            }
        }

        if(enemy.getHP() >= 0) {
            enemy.setIsDead(false);
        }
    }
    public void attackForGhost(Undead enemy) {
        int attackDamage = (int) (super.getHP() * 0.70);
        int ghostDefence = (int) (attackDamage * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
