package blog.kanghokennethyoon.effectivejava.item2;

public class Item2 {

    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        CalzonePizza calzonePizza = new CalzonePizza.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

    }
}
