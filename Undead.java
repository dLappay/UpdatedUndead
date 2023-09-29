public class Undead {
    //attributes
    private String name;
    private int hp = 100;
    private boolean isDead;

    //constructor
    public Undead() {
        hp = 100;
        name =  "Undead";
        isDead = false;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public boolean isDead() {
        return isDead;
    }
    public void attack(Undead u) {
        u.setHp(u.getHP() - hp);
    }
}
