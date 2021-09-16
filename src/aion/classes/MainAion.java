package aion.classes;

import aion.base.classes.Player;
import org.w3c.dom.ranges.Range;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainAion {
    public static void main(String[] args) {

        Assasin assasin1 = new Assasin("Katsuki");
        Ranger ranger1 = new Ranger("Mau");
        Templar templar1 = new Templar("Biscuit");
        Gladiator gladiator1 = new Gladiator("Barbarossa");
        Chanter chanter1 = new Chanter("Save");
        Cleric cleric1 = new Cleric("HealingServant");
        Sorcerer sorcerer1 = new Sorcerer("Sorcerio");
        SpiritMaster spiritMaster1 = new SpiritMaster("SupirituMeister");


        List<Player> players = new ArrayList<>();
//        players.add(assasin1);
//        players.add(ranger1);
//        players.add(templar1);
//        players.add(gladiator1);
        players.add(chanter1);
//        players.add(cleric1);
//        players.add(sorcerer1);
        players.add(spiritMaster1);

        Random random = new Random();
        int a = random.nextInt(players.size());
        int b = random.nextInt(players.size());

        if (a != b) {

            Player x = players.get(a);
            Player y = players.get(b);

            if (x instanceof Assasin) {
                x = assasin1;
            } else if (x instanceof Ranger) {
                x = ranger1;
            } else if (x instanceof Templar) {
                x = templar1;
            } else if (x instanceof Gladiator) {
                x = gladiator1;
            } else if (x instanceof Chanter) {
                x = chanter1;
            } else if (x instanceof Cleric) {
                x = cleric1;
            } else if (x instanceof Sorcerer) {
                x = sorcerer1;
            } else
                x = spiritMaster1;


            if (y instanceof Assasin) {
                y = assasin1;
            }
            if (y instanceof Ranger) {
                y = ranger1;
            }
            if (y instanceof Templar) {
                y = templar1;
            }
            if (y instanceof Gladiator) {
                y = gladiator1;
            }
            if (y instanceof Chanter) {
                y = chanter1;
            }
            if (y instanceof Cleric) {
                y = cleric1;
            }
            if (y instanceof Sorcerer) {
                y = sorcerer1;
            }
            if (y instanceof SpiritMaster) {
                y = spiritMaster1;
            }

            System.out.println(x);
            System.out.println(y);
            System.out.println();

            System.out.println("The duel beetwen " + x.getName() + " and " + y.getName() + " is starting");
            System.out.println();
            boolean isFirstRound = true;

            while (x.getHp() > 0 && y.getHp() > 0) {
                x.getSkill();
                y.getSkill();

                if (x.getHp() > 0) {
                    while(isFirstRound && x.getPermaSkill().equals("Healing Light")){
                        x.getPermaSkill();
                    }
                    isFirstRound = false;

                    x.attack(y);
                    if (!x.getPermaSkill().equals("Healing Light")) {
                        System.out.println(x.getName() + " I inflicted " + x.getDamage() + " damage by using " + x.getPermaSkill());
                    }
                    x.setDamage(1);
                    System.out.println("New hp for " + x.getName() + ": " + x.getHp());
                    System.out.println();

                }


                if (y.getHp() > 0) {

                    y.attack(x);
                    if (!y.getPermaSkill().equals("Healing Light")) {
                        System.out.println(y.getName() + " I inflicted " + y.getDamage() + " damage by using " + y.getPermaSkill());
                    }
                    y.setDamage(1);
                    System.out.println("New hp for " + y.getName() + ": " + y.getHp());
                    System.out.println();

                }

                if (x.getHp() <= 0) {
                    System.out.println("New hp for " + x.getName() + ": " + x.getHp());
                    System.out.println(y.getName() + " won");
                    System.out.println();
                }

                if (y.getHp() <= 0) {
                    System.out.println("New hp for " + y.getName() + ": " + y.getHp());
                    System.out.println(x.getName() + " won");
                    System.out.println();

                }

            }

        }

    }
}
