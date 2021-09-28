package org.ron.c130.my1stOOP;

public class Pet {

    private String name;
    private String type;
    private int age;
    private char size;
    private boolean isMale;

    public Pet() {

    }

    public Pet(String name, String type, int age, char size, boolean isMale) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.size = size;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public static void main(String[] args) {
        System.out.println("Running pet");
        Pet pet1 = new Pet("Rover", "Dog", 6, 'L', true);

        Pet pet2 = new Pet();
        pet2.setName("Noodles");
        pet2.setType("Cat");

        System.out.println(pet1.getType());
        System.out.println(pet2.getName());
        System.out.println(pet2.getType());
    }

    public static void printPet(Pet pet) {
        System.out.println("Pet: name=" + pet.getName());
    }
}
