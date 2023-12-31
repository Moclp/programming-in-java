package agh.ii.prinjava.lab03.lst03_10;

import java.util.Arrays;

/**
 * The {@link Cloneable} marker interface specifies that the objects of this class can be cloned.
 *
 * <p>To define a custom class that implements the {@code Cloneable} interface, the class must override
 * the {@code clone()} method (from the {@code Object} class).
 *
 * @see <a href="https://github.com/AdoptOpenJDK/openjdk-jdk16/blob/master/src/java.base/share/classes/java/lang/Cloneable.java">Cloneable</a>
 * @see <a href="https://github.com/AdoptOpenJDK/openjdk-jdk16/blob/master/src/java.base/share/classes/java/lang/Object.java">Object</a>
 */


/**
 * DeepCloner constructs a deep copy of the source object
 *
 * @see <a href="https://en.wikipedia.org/wiki/Object_copying">Object copying</a>
 */


public class Main {
    private static void shalowCloneDemo() {
        System.out.println("shalowCloneDemo...");

        ShalowCloner sc1 = new ShalowCloner();
        System.out.println("sc1: " + sc1);
        try {
            ShalowCloner sc1Clone = (ShalowCloner) sc1.clone(); // <- Object clone() throws...;
            System.out.println("sc1Clone: " + sc1Clone);

            System.out.println("\nUpdating the clone (setting ints[0] to 100)...");
            sc1Clone.setIntAtIdx(0, 100);

            System.out.println("sc1Clone: " + sc1Clone);
            System.out.println("sc1: " + sc1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void deepCloneDemo() {
        System.out.println("deepCloneDemo...");

        DeepCloner dc1 = new DeepCloner();
        System.out.println("dc1: " + dc1);
        try {
            DeepCloner dc1Clone = (DeepCloner) dc1.clone();
            System.out.println("dc1Clone: " + dc1Clone);

            System.out.println("\nUpdating the clone (setting ints[0] to 100)...");
            dc1Clone.setIntAtIdx(0, 100);

            System.out.println("dc1Clone: " + dc1Clone);
            System.out.println("dc1: " + dc1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        shalowCloneDemo();
        System.out.println();
        deepCloneDemo();
    }
}
