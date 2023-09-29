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
    }
    public void attack(Undead enemy) {
        int attackDamage = enemy.getHP() - getHP();
        enemy.setHp(attackDamage);
    }
    public void attackForGhost(Undead enemy) {
        int ghostDefence = (int) (getHP() * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}
