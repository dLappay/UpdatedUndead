import java.util.Scanner;

public class Skeleton extends Zombie {
    static  String s = "Skeleton";
    public Skeleton() {
        super.setName(s);
        super.setHp(super.getHP() - 20);
    }

    public void attack(Undead enemy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attack - Attack damage is 70% of its HP");
        System.out.println("Ability - No ability");
        if (super.getHP() > 0) {
            System.out.print("Choose attack: ");
            String chooseAttackOrAbility = input.nextLine().toLowerCase();
            if (chooseAttackOrAbility.equals("attack") || chooseAttackOrAbility.equals("Attack")) {
                int attackDamage = (int) (super.getHP() * 0.7);
                enemy.setHp(attackDamage);
                System.out.println("Attack damage: " + attackDamage);
            }
        }else {
            super.setIsDead(true);
        }


    }
    public void attackForGhost(Undead enemy) {
        int attackDamage = (int) (super.getHP() * 0.7);
        int ghostDefence = (int) (attackDamage * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
