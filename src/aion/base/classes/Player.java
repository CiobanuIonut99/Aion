package aion.base.classes;

public interface Player {

    public static final String name = "Player";
    public static final int damage = 1000;
    public static final int hp = 1000;
    public static final int defense = 1000;
    public static final int resistance = 1000;
    public static final String skill= "a";

    public abstract void attack(Player player);

    public default void setName(String name) {
    }

    public default void setDamage(int damage) {
    }

    public default void setHp(int hp) {
    }

    public default void setDefense(int defense) {
    }

    public default void setResistance(int resistance) {
    }

    public default void run() {
        System.out.println("I'm running");
    }

    public default int getHp() {
        return hp;
    }

    public default String getName() {
        return name;
    }

    public default int getDefense() {
        return defense;
    }

    public default int getResistance() {
        return resistance;
    }

    public default int getDamage() {
        return damage;
    }

    public abstract String getSkill();

    public abstract String getPermaSkill();


}
