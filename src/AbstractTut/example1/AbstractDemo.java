package AbstractTut.example1;

public class AbstractDemo extends SampleAbstractClass {

    @Override
    void getDisplay(int id, String name) {
        System.out.print(id+ "," + name);
    }

    public void print(){
        SampleAbstractClass sampleAbstractClass = new AbstractDemo();

        sampleAbstractClass.beforeStart();
        sampleAbstractClass.getDisplay(4217,"Sangeeth");
        sampleAbstractClass.afterEnd();
    }
}

class AbstractDemo2 extends SampleAbstractClass{
    @Override
    void getDisplay(int id, String name){
        System.out.print(id+ "<--->"+ name);
    }

    public void print(){
        SampleAbstractClass sampleAbstractClass = new AbstractDemo2();

        sampleAbstractClass.beforeStart();
        sampleAbstractClass.getDisplay(4217,"Sangeeth");
        sampleAbstractClass.afterEnd();
    }
}

class Test{
    public static void main(String...args){
        AbstractDemo abstractDemo = new AbstractDemo();
        AbstractDemo2 abstractDemo2 = new AbstractDemo2();

        System.out.println(abstractDemo.HELLO);
        abstractDemo.print();;
        abstractDemo2.print();
    }
}