package blog.kanghokennethyoon.effectivejava.item4;

public class Item4 {

    public static void main(String[] args) {

        InstantiableUtilities instantiableUtilities = new InstantiableUtilities();

        // instantiableUtilities.doSomething()
        // instantiableUtilities cannot access static method doSomething();

        // MyUtilities myUtilities = new MyUtilities();
        // instance cannot be created because the constructor is private.
        MyUtilities.doSomething();

    }
}
