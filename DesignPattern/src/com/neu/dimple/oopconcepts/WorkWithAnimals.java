package com.neu.dimple.oopconcepts;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class WorkWithAnimals {

    public static void main(String args[]){

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says " + doggy.getSound());
        System.out.println("kitty says " + kitty.getSound());

        Animal animals[] = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says " + animals[0].getSound());
        System.out.println("kitty says " +  animals[1].getSound());

        speakAnimal(doggy);

//        This will not work
//        doggy.digHole();

        ((Dog)doggy).digHole();


        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());

    }

    private static void speakAnimal(Animal randAnimal) {
        System.out.println("randAnimal says " +  randAnimal.getSound());

    }

    public static void changeObjectName(Dog fido){
        fido.setName("Marcus");
    }
}
