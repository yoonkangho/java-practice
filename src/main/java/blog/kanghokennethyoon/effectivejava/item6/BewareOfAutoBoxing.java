package blog.kanghokennethyoon.effectivejava.item6;

import java.util.concurrent.Callable;

public class BewareOfAutoBoxing {

    private static final long MAX_VALUE = 10000000;

    public static void main(String[] args) throws Exception {

        timedExecution(BewareOfAutoBoxing::dontDoThis);

        timedExecution(BewareOfAutoBoxing::doItThisWay);

    }

    public static <T> T timedExecution(Callable<T> fn) throws Exception{
        T result;
        long startTime = System.nanoTime();
        result = fn.call();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(String.format("execution took %d ms", duration / 1000000));
        return result;
    }

    public static Long dontDoThis() {
        Long sum = 0L;
        for (long i = 0; i <= MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static long doItThisWay() {
        long sum = 0L;
        for (long i = 0; i <= MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
