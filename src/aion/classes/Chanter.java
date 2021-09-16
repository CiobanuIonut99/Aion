package aion.classes;

import aion.base.classes.AbstractPriest;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chanter extends AbstractPriest implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
    private int hpMax;
    private List<String> skillListChanter = new ArrayList<>();

    private int indexFromList;

    @Override
    public String toString() {
        return "Chanter{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListChanter=" + skillListChanter +
                '}';
    }

    public Chanter(String name) {
        skillListChanter.addAll(skillList);
        skillListChanter.add("Booming Strike");
        skillListChanter.add("Meteor Strike");
        this.name = name;
        damage = random.nextInt(400 - 200) + 200;
        hp = random.nextInt(4000 - 3500) + 3500;
        defense = random.nextInt(220 - 180) + 180;
        resistance = random.nextInt(10);
        hpMax = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getResistance() {
        return resistance;
    }

    @Override
    public String getSkill() {
        Random randomForSkill = new Random();
        indexFromList = randomForSkill.nextInt(skillListChanter.size() - 1);
        permaSkill = skillListChanter.get(indexFromList);
        return skillListChanter.get(indexFromList);

    }

    @Override
    public void attack(Player player) {


        int heal = 1000;
        if (permaSkill.equals("Healing Light")) {
            if (hp <= hpMax - heal) {

                hp = hp + heal;
                System.out.println(name + " I received " + heal + " hp" + " by using " + " " + getPermaSkill());

            } else {

                if (player.getDamage() < heal) {
                    hp = hp + player.getDamage();
                    System.out.println(name + " I received " + player.getDamage() + " hp" + " by using " + " " + getPermaSkill());
                }
            }
        } else {
            System.out.println("I'm attacking with a mace");
            player.setHp(player.getHp() - damage);
        }

    }

    @Override
    public String getPermaSkill() {
        return permaSkill;
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
        this.damage = random.nextInt(400 - 200) + 200;
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

    public void setSkillListChanter(List<String> skillListChanter) {
        this.skillListChanter = skillListChanter;
    }

    public List<String> getSkillListChanter() {
        return skillListChanter;
    }
}
