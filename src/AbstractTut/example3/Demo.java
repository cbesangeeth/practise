package AbstractTut.example3;

abstract class Demo {

    public int a;

    Demo(){
     a =  10;
    }

    abstract public void set(int a);
}


class Test extends Demo{
    public static void main(String...args){
        Test obj = new Test();
        System.out.println(obj.a);
        obj.set(222);
        System.out.println(obj.a);
        obj.a = 20;
        System.out.println(obj.a);

    }

    @Override
    public void set(int a) {
        this.a = a;
    }
}