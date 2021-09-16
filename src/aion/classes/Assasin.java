package aion.classes;

import aion.base.classes.AbstractScout;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Assasin extends AbstractScout implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private int indexFromList;
    private String permaSkill;

    private List<String> skillListAssasin = new ArrayList<>();

    public Assasin(){

    }

    public Assasin(String name) {

        skillListAssasin.addAll(skillList);
        skillListAssasin.add("Swift Edge");
        skillListAssasin.add("Soul Slash");
        this.name = name;
        damage = random.nextInt(900 - 700) + 700;
        hp = random.nextInt(3000 - 1600) + 1600;
        defense = random.nextInt(140 - 100) + 100;
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
         indexFromList = randomForSkill.nextInt(skillListAssasin.size() - 1);
         permaSkill =skillListAssasin.get(indexFromList) ;
        return skillListAssasin.get(indexFromList);

    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = random.nextInt(900 - 700) + 700;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = random.nextInt(900 - 700) + 700;
    }

    @Override
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setSkillListAssasin(List<String> skillListAssasin) {
        this.skillListAssasin = skillListAssasin;
    }

    public int getDefense() {
        return defense;
    }

    public int getResistance() {
        return resistance;
    }

    public List<String> getSkillListAssasin() {
        return skillListAssasin;
    }

    @Override
    public String toString() {
        return "Assasin{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListAssasin=" + skillListAssasin +
                '}';
    }

    @Override
    public void attack(Player player) {
        System.out.println("I'm attacking with a dagger");
        player.setHp(player.getHp() - damage);
    }

    @Override
    public String getPermaSkill() {
        return permaSkill;
    }
}

