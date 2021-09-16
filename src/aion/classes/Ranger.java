package aion.classes;

import aion.base.classes.AbstractScout;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ranger extends AbstractScout implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
    private int indexFromList;

    private List<String> skillListRanger = new ArrayList<>();

    @Override
    public String toString() {
        return "Ranger{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListRanger=" + skillListRanger +
                '}';
    }

    public Ranger(String name) {
        skillListRanger.addAll(skillList);
        skillListRanger.add("Stunning Shot");
        skillListRanger.add("Gale Arrow");
        this.name = name;
        damage = random.nextInt(1050 - 800) + 800;
        hp = random.nextInt(3000 - 1600) + 1600;
        defense = random.nextInt(120 - 80) + 80;
        resistance = random.nextInt(10);

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
         indexFromList = randomForSkill.nextInt(skillListRanger.size() - 1);
        permaSkill = skillListRanger.get(indexFromList);
        return skillListRanger.get(indexFromList);
    }

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = random.nextInt(1050 - 800) + 800;
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

    public void setSkillListRanger(List<String> skillListRanger) {
        this.skillListRanger = skillListRanger;
    }

    public int getDefense() {
        return defense;
    }

    public int getResistance() {
        return resistance;
    }

    public List<String> getSkillListRanger() {
        return skillListRanger;
    }

    @Override
    public void attack(Player player) {
        System.out.println("I'm attacking with a bow");
        player.setHp(player.getHp() - damage);
    }


    @Override
    public String getPermaSkill() {
        return permaSkill;
    }
}
