package class_28_variableScope.com;

public class Main {

    static int x = 3; // class scope


    public static void main(String[] args){



        int x = 1; // local variable

        System.out.println(x);

        doSomething();
    }

    static void doSomething(){
        int x = 2;

        System.out.println(x);

    }
}
