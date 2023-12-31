package agh.ii.prinjava.lab02.lst02_05;

public class Main {

    /**
     * Working with static member classes
     */
    private static void demo1() {
        System.out.println("demo1...");
        OuterClass.StaticNestedClass snc1 = new OuterClass.StaticNestedClass();
        snc1.m1SNC();
    }

    /**
     * Working with inner (non-static member) classes
     *
     * <p>Since InnerClass belongs to the "instance-part" of OuterClass its instance have to be created
     * in a different way:
     * <ol>
     *     <li>create an instance of OuterClass</li>
     *     <li>use it to create an instance of InnerClass</li>
     * </ol>
     * That is why the following code causes a compilation error:
     * {@code OuterClass.InnerClass ic1 = new OuterClass.InnerClass(); // Error: OuterClass is not an enclosing class}
     */
    private static void demo2() {
        System.out.println("demo2...");
        OuterClass oc1 = new OuterClass(); // step (1)
        OuterClass.InnerClass ic1 = oc1.new InnerClass(); // step (2)
        ic1.m1IC();
    }

    /**
     * Working with local classes
     */
    private static void demo3() {
        System.out.println("demo3...");
        OuterClass oc1 = new OuterClass();
        oc1.localClassDemo();

        class LocalClassFromDemo3 {
            void m1() {
                System.out.println("Hello from LocalClassFromDemo3.m1()");
            }

            static void sm1() {
                System.out.println("Hello from LocalClassFromDemo3.sm1()");
            }
        }
        LocalClassFromDemo3.sm1();
        (new LocalClassFromDemo3()).m1();
    }

    /**
     * Working with local anonymous classes
     */
    private static void demo4() {
        System.out.println("demo4...");
        int lv = 100; // because of line (**) below this local variable becomes "automatically" effectively final
        BaseClass lac = new BaseClass() {
            @Override
            void m1() {
                super.m1();
                System.out.println("lac.m1()" + lv); // (**)
            }
        };
        lac.m1();

        (new BaseClass() {
            @Override
            void m1() {
                super.m1();
                System.out.println("anonymous.m1()" + lv); // (**)
            }
        }).m1();
    }

    public static void main(String[] args) {
        demo1();
        System.out.println();

        demo2();
        System.out.println();

        demo3();
        System.out.println();

        demo4();
    }
}
