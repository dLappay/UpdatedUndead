public class Mummy extends Undead{
    static String m = "Mummy";
    public Mummy() {
        super.setName(m);
    }
    public void attack(Undead enemy) {
        int attackDamage = super.getHP() / 2;
        int plusHP = (int) (enemy.getHP() * 0.10);
        enemy.setHp(enemy.getHP() - (attackDamage + plusHP));

        if(enemy.getHP() >= 0) {
            enemy.setIsDead(true);
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
