package blog.kanghokennethyoon.effectivejava.item3;

public class StaticFactory implements Doable {

    private static final StaticFactory INSTANCE = new StaticFactory();

    public static StaticFactory getInstance() {
        // can return different instance depending on the provided context
        return INSTANCE;
    }

}
