public interface helloInterface {

    // non static
    int a = 10;

    // static variable
    static int b =100;


    // static final variable
    static int c =1000;

    // default public & abstract method
    // same like : public abstract void display();
    void display();

    // this static method cannot override in implemented classes
    static void staticDisplay(){
        System.out.println("This is static display from interface");
    }
}
