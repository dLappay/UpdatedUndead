import java.util.Scanner;

public class Ghost extends Undead{
    static String g = "Ghost";
    public Ghost() {
        super.setHp(getHP() / 2);
        super.setName(g);
    }
    public void ability(Undead enemy) {
        int haunt = (int) (enemy.getHP() * 0.10);
        super.setHp(super.getHP() + haunt);
    }
    public void attack(Undead enemy) {
        //attack
        Scanner input = new Scanner(System.in);
        System.out.println("Attack - Attack damage is only 20% of its HP");
        System.out.println("Ability - Ghost can haunt which increases its HP by the 10% of the undead being haunt.");
        if (super.getHP() > 0) {
            System.out.print("Choose attack or ability: ");
            String chooseAttackOrAbility = input.nextLine().toLowerCase();
            switch (chooseAttackOrAbility.toLowerCase()) {
                case "attack":
                    int attackDamage = (int) (super.getHP() * 0.2);
                    enemy.setHp(attackDamage);
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
                    System.out.println("You can't attack");
                    break;
                case "ability":
                    ability(enemy);
                    break;
            }
        }

        if (super.getHP() < 0){
            super.setIsDead(true);
        }
    }
}
