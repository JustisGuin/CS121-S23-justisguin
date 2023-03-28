public class Main {
    public static void main(String[] args) {
        Class animals1 = new Class("Bentely", "Orange", 6);


        System.out.printf("Dog Name: %s%n", animals1.dog);
        System.out.printf("Cat Name: %s%n", animals1.cat);
        System.out.printf("Number Of Animals: %s%n", animals1.numberOfAnimals);


        animals1.getClassInfo();

    }
}
