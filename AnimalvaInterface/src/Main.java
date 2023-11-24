public class Main {
    public static void main(String[] args) {
        Animal animal= new Animal() {
            @Override
            public String makeSound() {
                return null;
            }
        };
        Tiger tiger=new Tiger();
        Chicken chicken=new Chicken();
        System.out.println(tiger.makeSound());
        System.out.println(chicken.makeSound());

        System.out.println(chicken.howToEat());
        Apple apple= new Apple();
        System.out.println(apple.howToEat());
        Orange orange= new Orange();
        System.out.println(orange.howToEat());
    }
}