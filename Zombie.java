public class Zombie extends Undead{
    static String z = "Zombie";
    public Zombie() {
        super.setName(z);
    }

    public void ability(Undead enemy) {
        int halfEnemyHP = enemy.getHP() / 2;
        int  remainingEnemyHP = enemy.getHP() - halfEnemyHP;
        enemy.setHp(remainingEnemyHP);
        super.setHp(super.getHP() + halfEnemyHP);
    }
    public void attack(Undead enemy) {
        int halfZombieHP = super.getHP() / 2;
        int attackDamage = enemy.getHP() - halfZombieHP;
        enemy.setHp(attackDamage);

        if(enemy.getHP() >= 0) {
            enemy.setIsDead(true);
        }
    }
    public void attackForGhost(Undead enemy) {
        int halfZombieHP = super.getHP() / 2;
        int ghostDefence = (int) (halfZombieHP * 0.10);
        enemy.setHp(enemy.getHP() - ghostDefence);
    }
}

