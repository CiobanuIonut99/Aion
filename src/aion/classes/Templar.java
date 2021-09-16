package aion.classes;

import aion.base.classes.AbstractWariior;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Templar extends AbstractWariior implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
    private int indexFromList;

    private List<String> skillListTemplar = new ArrayList<>();

    @Override
    public String toString() {
        return "Templar{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListTemplar=" + skillListTemplar +
                '}';
    }

    public Templar(String name) {

        skillListTemplar.addAll(skillList);
        skillListTemplar.add("Shining Slash");
        skillListTemplar.add("Empyrean Armor");
        this.name = name;
        damage = random.nextInt(500 - 300) + 300;
        hp = random.nextInt(5000 - 3000) + 3000;
        defense = random.nextInt(250 - 200) + 200;
        resistance = random.nextInt(10);
    }

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
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
    public void attack(Player player) {
        System.out.println("I'm attacking with a greatsword");
        player.setHp(player.getHp() - damage);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = random.nextInt(500 - 300) + 300;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setSkillListTemplar(List<String> skillListTemplar) {
        this.skillListTemplar = skillListTemplar;
    }

    public List<String> getSkillListTemplar() {
        return skillListTemplar;
    }

    @Override
    public String getSkill() {
        Random randomForSkill = new Random();
         indexFromList = randomForSkill.nextInt(skillListTemplar.size() - 1);
        permaSkill = skillListTemplar.get(indexFromList);
        return skillListTemplar.get(indexFromList);
    }

    @Override
    public String getPermaSkill() {
        return permaSkill;
    }


}
