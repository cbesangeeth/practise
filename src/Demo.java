public class Demo {

    public static void getSomeName() {
        System.out.print("Hello from DemoInterface");
    }

    public static void main(String a[]) {
        DemoInterface demoInterface = Demo::getSomeName;

        demoInterface.getName();
    }
}
