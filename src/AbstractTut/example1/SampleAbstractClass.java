package AbstractTut.example1;

abstract class SampleAbstractClass {

    abstract void getDisplay(int id, String name);

    final String HELLO = "hello";

    private int id;
    private String name;

    public SampleAbstractClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    SampleAbstractClass(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void beforeStart(){
        System.out.print("Start******************<");
    }

    public void afterEnd(){
        System.out.println("********************End>");
    }
}
