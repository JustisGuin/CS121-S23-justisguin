public class Class {
    String dog = "Bentely";
    String cat = "Orange";

    Integer numberOfAnimals = 6;

    public Class(String dog, String cat, Integer numberOfAnimals){
        this.dog=dog;
        this.cat=cat;
        this.numberOfAnimals=numberOfAnimals;
    }

    void getClassInfo(){
        System.out.printf("Dog Name: %s%nCat: %s%nNumber of Animals: %.1f",dog,cat,numberOfAnimals);
    }

    }
