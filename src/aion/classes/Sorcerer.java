package aion.classes;

import aion.base.classes.AbstractMage;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorcerer extends AbstractMage implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
    private int indexFromList;

    private List<String> skillListSorcerer = new ArrayList<>();

    @Override
    public String toString() {
        return "Sorcerer{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListSorcerer=" + skillListSorcerer +
                '}';
    }

    public Sorcerer(String name) {
        skillListSorcerer.addAll(skillList);
        skillListSorcerer.add("Wind Cut Down");
        skillListSorcerer.add("Inferno");
        this.name = name;
        damage = random.nextInt(2000 - 1500) + 1500;
        hp = random.nextInt(2400 - 2000) + 2000;
        defense = random.nextInt(90 - 50) + 50;
        resistance = random.nextInt(10);

    }

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
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

    @Override
    public String getSkill() {
        Random randomForSkill = new Random();
         indexFromList = randomForSkill.nextInt(skillListSorcerer.size() - 1);
        permaSkill = skillListSorcerer.get(indexFromList);
        return skillListSorcerer.get(indexFromList);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setDamage(int damage) {
        this.damage = random.nextInt(2000 - 1500) + 1500;
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

    public void setSkillListSorcerer(List<String> skillListSorcerer) {
        this.skillListSorcerer = skillListSorcerer;
    }

    public int getDefense() {
        return defense;
    }

    public int getResistance() {
        return resistance;
    }

    public List<String> getSkillListSorcerer() {
        return skillListSorcerer;
    }

    @Override
    public void attack(Player player) {
        System.out.println("I'm attacking with a tome");
        player.setHp(player.getHp() - damage);
    }


    @Override
    public String getPermaSkill() {
        return permaSkill;
    }
}
