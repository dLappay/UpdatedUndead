public class Ghost extends Undead{
    static String g = "Ghost";
    public Ghost() {
        super.setHp(getHP() / 2);
        super.setName(g);
    }
    public void attack(Undead enemy) {
        //attack
        int attackDamage = (int) (super.getHP() * 0.2);
        enemy.setHp(attackDamage);

        if(enemy.getHP() >= 0) {
            enemy.setIsDead(true);
        }
    }
}
