

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface Isolution {
    int dothis();
}

public class Solution implements Isolution {

//    Access Levels
//    Modifier	  Class	Package	Subclass	World
//    public	    Y	    Y	    Y	        Y
//    protected	    Y	    Y	    Y	        N
//    package   	Y	    Y	    N	        N
//    private	    Y	    N	    N	        N


    int amount = 4;

    @Override
    public int dothis() {
        return 0;
    }

    protected int dothis(int x) {
        return 0;
    }

    public static void main(int[]args) {

    }
    static int x = 0;
    String nullString;

    Solution() {
        System.out.println(nullString);
    }

    //  will find simplest method
    public void varArg(int ... i) {
        System.out.println("Multi arg method");
    }
    public void varArg(int i) {
        System.out.println("Single arg method");
    }

    public static void main(String[]args) {

        Solution solution = new Solution();
        solution.varArg(); // multi
        solution.varArg(null); // multi
        solution.varArg(1); //single
        solution.varArg(1, 2, 3); // multi


        final int fin;
        fin = 3;
//        fin = 4; //cannot reassign.

        System.out.println(2 + 4 * 3- 7 );
        System.out.println((2 + 4) * (3 - 7) );
        System.out.println(2 + (4 * 3) - 7 );
        System.out.println(((2 + 4) * 3) - 7 );
        int amount = x;
        StringBuilder sb = new StringBuilder("s");
        String s = "s";
        String t = "s";
        System.out.println(s.equalsIgnoreCase(t)); // trues
        System.out.println(s == t);
        System.out.println(s.equals(t));
        System.out.println(sb.toString().equals(s));
        System.out.println(s == sb.toString()); // falses
        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
        System.out.println(s.toString().equals(sb));

        int i = 5;
        int j = 10;
        while((i = 12)!=5) {
            System.out.println("In while:" + (i = 12));
            break;
        }

        final int notCompileTimeConstant;
        notCompileTimeConstant = 5; // cant be used in case
        int int5 = 5;
        switch(notCompileTimeConstant) {
            default:
                System.out.println("In default");
                break;
//            case 3+2: // evaluated at compile time, cannot duplicate case statements
//                System.out.println(5);
//                break;
            case 5:
                System.out.println(5);
                break;
//            case notCompileTimeConstant:
//                System.out.println(5);
//                break;
        }


        int[] arr = {1,2,053};
        arr = new int[5];

        Float f = 3.154f;
        Double d = 100.5;
        Double dd = 100d;

        float f2 = 3.0f;
        double d2 = 1;
        int q = 0;
//        System.out.println(i instanceof Object);
//
        List names = new ArrayList();
        names.add("Brian");
        names.remove("Brian");
        String mask = "XXXX-XXXX-XXXX-";
        String cc = "1234-2345-3456-4567";
        StringBuilder ccsb = new StringBuilder(mask);
        ccsb.append(cc, 15, 19);
        System.out.println(mask + cc.substring(15,19));
        System.out.println(ccsb.toString());

        try (MyResource1 r1 = new MyResource1();
             MyResource2 r2 = new MyResource2();) {
            System.out.print("T ");  // close is called before exiting try block.
        } catch (IOException ioe) {
            System.out.print("IOE ");
        } finally {
            System.out.print("F ");
        }

        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        //int firstElmnt = elements.get(1);  // indexOOB
        //System.out.println(firstElmnt);

        AbstractWriter w = new Programmer();
        w.write(); // cant override static
        Programmer p = new Programmer();
        p.write(); // uses implementation
        AbstractWriter.write();
        Programmer.write();

        System.out.println(Nav.Direction.NORTH);
        Nav.Direction n = Nav.Direction.NORTH;

    }
}

class MyResource1 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("1 ");
    }
}
class MyResource2 implements Closeable {
    class NotWeirdButOk {

    }
    public void close() throws IOException {
        class WeirdButOk {

        }
        throw new IOException();
    }
}

class NotAbstract {
    private static int $;
    protected NotAbstract(String s) {

    }
}

class _ExtendsNotAbstract extends NotAbstract { // no default ctor in parent
    _ExtendsNotAbstract() {
        super("s"); // needs this if not default ctor;
    };
}

interface AbsClassInterface {
    int getInt();
}

abstract class AbsClass implements AbsClassInterface {  // does not need to implement iface
    public static void isStatic() {

    }
}

class ExtendsAbsClass extends AbsClass {
    public static void isStatic() {

    }

    @Override
    public int getInt() {  // needds this
        return 0;
    }
}

abstract class AbstractWriter {
    public static void write() {
        System.out.println("Abstract Writing...");
    }
    public static void foo() {
        System.out.println("foo...");
    }

}
class Author extends AbstractWriter {
    public static void write() {
        System.out.println(" Author Writing book");
    }
}
class Programmer extends AbstractWriter {
    public static void write() {
        System.out.println("Programmer Writing code");
    }

//    public void foo() { // cant override static method
//        System.out.println("foo...");
//    }

}

class Nav {
    public enum Direction { NORTH; }
}


