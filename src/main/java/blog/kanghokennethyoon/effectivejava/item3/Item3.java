package blog.kanghokennethyoon.effectivejava.item3;

import java.util.List;

public class Item3 {

    public static void main(String[] args) {

        List<Doable> doables = List.of(
                PSFV.INSTANCE,
                StaticFactory.getInstance(),
                EnumSingleton.INSTANCE
        );

        for (Doable doable: doables) {
            doable.doSomething();
        }

    }
}
