public class Vet {
    public static void main(String[] args) {
        Dog dog01 = new Dog("Mr Tucker", "Cane Corso Mix", 1, false);
        Dog dog02 = new Dog("Ollie", "Yorkie", 1, false, "Aquila");
        System.out.println("=====================");
        System.out.println(dog01.stats());
        System.out.println("=====================");
        System.out.println(dog02.stats());
        System.out.println("=====================");
        System.out.println(Dog.getDogCount());
        System.out.println("=====================");
        Dog.displayAllDogInfo();
        System.out.println("=====================");
        dog01.giveToy("Rope Toy");
        dog02.houseBreak(); // this was just a method we created to allow us to easily change certain values
        System.out.println("=====================");
        System.out.println(dog02.stats());
        System.out.println("=====================");
        dog01.giveToy("Kong Chew Toy");
        System.out.println("=====================");
        dog02.setHouseBroken(false); // using the default getters and setters you can change individual values like this
        System.out.println(dog02.stats());
    }
}
