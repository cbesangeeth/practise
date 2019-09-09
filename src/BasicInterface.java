public class BasicInterface implements helloInterface{
    @Override
    public void display() {
        System.out.println("This display is from BasicInterface");
    }

    public static void main(String str[]){
        // variable 'a' from interface
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // local redeclaration of 'a'
        String a = "i";
        String b = "j";
        String c = "k";

        // shadowing
        System.out.println(a);

        // Assigning new object of this class to an interface
        helloInterface anInterface = new BasicInterface();
        anInterface.display();

        // static interface method
        helloInterface.staticDisplay();

        // new object of this class
        BasicInterface basicInterface = new BasicInterface();
        basicInterface.display();
    }
}
