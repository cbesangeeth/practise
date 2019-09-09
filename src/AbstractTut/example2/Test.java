package AbstractTut.example2;

public class Test extends B {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    public static void main(String...args){
        A obj = new Test();
        obj.a();
        obj.b();
        ((Test) obj).c();

    }
}
