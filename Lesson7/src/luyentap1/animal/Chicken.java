package luyentap1.animal;

import luyentap1.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String getSound() {
        return "Chicken: cock-co-dock!";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}