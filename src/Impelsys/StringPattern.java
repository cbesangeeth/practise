package Impelsys;

import java.util.concurrent.*;

public class StringPattern {

    public static void main(String[] args) {
        String input = "Hello world smruti ranjan";
//        String[] splits = input.split(" ");
//        for (int i = 0; i <= splits.length - 1; i++) {
//            if (i % 2 == 1) {
//                decrement(splits[i]);
//            } else {
//                increment(splits[i]);
//            }
//        }

        StringPattern stringPattern = new StringPattern();
        String result = stringPattern.hello(input);
        System.out.println(result);
    }

    public static void increment(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }
    }

    public static void decrement(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println();




        }
    }

    public String hello(String string){

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        Future task = executorService.submit(StringPattern::run);

        executorService.schedule(() -> {
            task.cancel(true);
            executorService.shutdown();
        }, 5, TimeUnit.SECONDS);

//        executorService.shutdown();

        return "hhee";
    }

    private static void run() {
        try {
            Thread.sleep(3000);
            System.out.println("done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
