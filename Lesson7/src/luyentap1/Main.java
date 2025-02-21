package luyentap1;

import luyentap1.animal.Animal;
import luyentap1.animal.Chicken;
import luyentap1.animal.Tiger;
import luyentap1.fruit.Apple;
import luyentap1.fruit.Fruit;
import luyentap1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.getSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit f : fruits) {
            System.out.println(f.howToEat());
        }
    }
}