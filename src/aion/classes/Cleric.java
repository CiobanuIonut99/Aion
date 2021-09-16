package aion.classes;

import aion.base.classes.AbstractPriest;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cleric extends AbstractPriest implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
    private int hpMax;
    private List<String> skillListCleric = new ArrayList<>();

   private  int indexFromList;

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
    }

    @Override
    public String toString() {
        return "Cleric{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListCleric=" + skillListCleric +
                '}';
    }

    @Override
    public String getSkill() {
        Random randomForSkill = new Random();
        indexFromList = randomForSkill.nextInt(skillListCleric.size() - 1);
      permaSkill =  skillListCleric.get(indexFromList);
        return skillListCleric.get(indexFromList);
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

    public void setSkillListCleric(List<String> skillListCleric) {
        this.skillListCleric = skillListCleric;
    }

    public Cleric(String name) {
        skillListCleric.addAll(skillList);
        skillListCleric.add("Thunderbolt");
        skillListCleric.add("Earth's Wrath");
        this.name = name;
        damage = random.nextInt(400 - 200) + 200;
        hp = random.nextInt(4000 - 3500) + 3500;
        defense = random.nextInt(220 - 180) + 180;
        resistance = random.nextInt(10);
        hpMax = hp;
    }

    @Override
    public void attack(Player player) {

        int heal = 1000;
        if (permaSkill.equals("Healing Light")) {
            if(hp <= hpMax - heal){

                hp = hp + heal;
                System.out.println(name +" I received " + heal + " hp" + " by using " + " " + getPermaSkill());

            }
            else {

                if( player.getDamage() < heal){
                    hp = hp+ player.getDamage();
                    System.out.println(name +" I received " + player.getDamage() + " hp" + " by using " + " " + getPermaSkill());
                }



            }



        }
        else {
            System.out.println("I'm attacking with a mace");
            player.setHp(player.getHp() - damage);
        }
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


    public List<String> getSkillListCleric() {
        return skillListCleric;
    }

    @Override
    public String getPermaSkill() {
        return permaSkill;
    }
}

