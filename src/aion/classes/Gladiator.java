package aion.classes;

import aion.base.classes.AbstractWariior;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gladiator extends AbstractWariior implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
private int indexFromList;
    private List<String> skillListGladiator = new ArrayList<>();

    @Override
    public String toString() {
        return "Gladiator{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListGladiator=" + skillListGladiator +
                '}';
    }

    public Gladiator(String name) {
        skillListGladiator.addAll(skillList);
        skillListGladiator.add("Explosion of Rage");
        skillListGladiator.add("Aion's Strength");
        this.name = name;
        damage = random.nextInt(600 - 400) + 400;
        hp = random.nextInt(4000 - 2000) + 2000;
        defense = random.nextInt(190 - 140) + 140;
        resistance = random.nextInt(10);
    }

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
    }

    @Override
    public String getSkill() {
        Random randomForSkill = new Random();
         indexFromList = randomForSkill.nextInt(skillListGladiator.size() - 1);
        permaSkill = skillListGladiator.get(indexFromList);
        return skillListGladiator.get(indexFromList);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setDamage(int damage) {
        this.damage = random.nextInt(600 - 400) + 400;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setSkillListGladiator(List<String> skillListGladiator) {
        this.skillListGladiator = skillListGladiator;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDefense() {
        return defense;
    }

    public int getResistance() {
        return resistance;
    }

    public List<String> getSkillListGladiator() {
        return skillListGladiator;
    }


    @Override
    public void attack(Player player) {
        System.out.println("I'm attacking with a polearm");
        player.setHp(player.getHp() - damage);
    }



    @Override
    public String getPermaSkill() {
        return permaSkill;
    }
}
