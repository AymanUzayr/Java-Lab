public class Generics {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Mango"));

        System.out.println("Generic List elements:");
        for(Fruit fruit : fruits) {
            System.out.print(fruit + "\t");
        }
}
