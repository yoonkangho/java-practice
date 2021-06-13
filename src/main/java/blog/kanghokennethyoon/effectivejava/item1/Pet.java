package blog.kanghokennethyoon.effectivejava.item1;

public class Pet {

    private final String sound = "";

    public enum PetType { CANINE, FELINE }

    public static Pet of(PetType petType) {
        return switch (petType) {
            case CANINE -> new Dog();
            case FELINE -> new Cat();
        };
    }

}
