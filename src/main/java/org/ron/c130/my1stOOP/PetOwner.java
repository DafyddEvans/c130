package org.ron.c130.my1stOOP;

public class PetOwner {

    public static void main(String[] args) {
        System.out.println("Running pet");
        Pet pet1 = new Pet();
        pet1.setName("Rover");
        pet1.setType("Dog");

        Pet pet2 = new Pet();
        pet2.setName("Noodles");
        pet2.setType("Cat");

        System.out.println(pet1.getType());
        System.out.println(pet2.getName());
        System.out.println(pet2.getType());
    }
}
