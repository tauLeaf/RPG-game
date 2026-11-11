package tau.game.trash;

interface List {
    public final int baseSize = 1;

    void add();
    void remove();
    default void contains() {
        System.out.println("base");
    }
}

public class Base  {
    private int baseSize;
    public void foo() {
        System.out.println("Base method");
    }
}

class A extends Base {
    private B fieldB;
    @Override
    public void foo() {
        System.out.println("A method");
    }

    public static void main(String[] args) {
        Base obj = new A();
        obj.foo();

        List list;
    }
}

class B {
    private int b;
}


