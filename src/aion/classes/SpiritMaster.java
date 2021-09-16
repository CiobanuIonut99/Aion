package aion.classes;

import aion.base.classes.AbstractMage;
import aion.base.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpiritMaster extends AbstractMage implements Player {
    Random random = new Random();
    private String name;
    private int damage;
    private int hp;
    private int defense;
    private int resistance;
    private String permaSkill;
    private int indexFromList;

    private List<String> skillListSpiritMaster = new ArrayList<>();


    @Override
    public String toString() {
        return "SpiritMaster{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", hp=" + hp +
                ", defense=" + defense +
                ", resistance=" + resistance +
                ", skillListSpiritMaster=" + skillListSpiritMaster +
                '}';
    }

    public void setPermaSkill(String permaSkill) {
        this.permaSkill = permaSkill;
    }

    public SpiritMaster(String name) {
        skillListSpiritMaster.addAll(skillList);
        skillListSpiritMaster.add("Vacuum Choke");
        skillListSpiritMaster.add("Sandblaster");
        this.name = name;
        damage = random.nextInt(2000 - 1500) + 1500;
        hp = random.nextInt(2400 - 2000) + 2000;
        defense = random.nextInt(90 - 50) + 50;
        resistance = random.nextInt(10);

    }

    @Override
    public String getSkill() {
        Random randomForSkill = new Random();
         indexFromList = randomForSkill.nextInt(skillListSpiritMaster.size() - 1);
        permaSkill = skillListSpiritMaster.get(indexFromList);
        return skillListSpiritMaster.get(indexFromList);
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

    public void setSkillListSpiritMaster(List<String> skillListSpiritMaster) {
        this.skillListSpiritMaster = skillListSpiritMaster;
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

    public List<String> getSkillListSpiritMaster() {
        return skillListSpiritMaster;
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
