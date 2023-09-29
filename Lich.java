public class Lich extends Undead{
    static String l = "Lich";
    public Lich() {
        super();
        super.setName(l);
    }
    public void ability(Undead enemy) {
        int getEnemyHP = (int) (enemy.getHP() * 0.10);
        setHp(super.getHP() + getEnemyHP);
        enemy.setHp(enemy.getHP() - getEnemyHP);
    }
    public void attack(Undead enemy) {
        int attackDamage = (int) (super.getHP() * 0.70);
        enemy.setHp(enemy.getHP() - attackDamage);

        if(enemy.getHP() >= 0) {
            enemy.setIsDead(true);
        }
    }
    public void attackForGhost(Undead enemy) {
        int attackDamage = (int) (super.getHP() * 0.70);
        int ghostDefence = (int) (attackDamage * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
