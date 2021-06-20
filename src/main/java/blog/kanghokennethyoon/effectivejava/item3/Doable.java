package blog.kanghokennethyoon.effectivejava.item3;

public interface Doable {

    default void doSomething() {
        System.out.println(this.getClass().getName() + " doing something");
    }
}
