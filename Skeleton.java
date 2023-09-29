public class Skeleton extends Undead {
    static  String s = "Skeleton";
    public Skeleton() {
        super.setName(s);
        super.setHp(super.getHP() - 20);
    }
    public void attack(Undead enemy) {
        //attack
        int attackDamage = (int) (super.getHP() * 0.7);
        enemy.setHp(attackDamage);

        if(enemy.getHP() >= 0) {
            enemy.setIsDead(true);
        }
    }
    public void attackForGhost(Undead enemy) {
        int attackDamage = (int) (super.getHP() * 0.7);
        int ghostDefence = (int) (attackDamage * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
