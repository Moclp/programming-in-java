package agh.ii.prinjava.lab04.exc04_01;

public class Pair<F, S> implements Cloneable {
    private F fst;
    private S snd;

    public Pair(F fst, S snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public F getFirst() {
        return fst;
    }

    public void setFirst(F fst) {
        this.fst = fst;
    }

    public S getSecond() {
        return snd;
    }

    public void setSecond(S snd) {
        this.snd = snd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (fst != null ? !fst.equals(pair.fst) : pair.fst != null) return false;
        return snd != null ? snd.equals(pair.snd) : pair.snd == null;
    }

    @Override
    public int hashCode() {
        int result = fst != null ? fst.hashCode() : 0;
        result = 31 * result + (snd != null ? snd.hashCode() : 0);
        return result;
    }

    @Override
    public Pair<F, S> clone() {
        try {
            return (Pair<F, S>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported");
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Hello");
        Pair<Integer, String> pair2 = new Pair<>(1, "Hello");

        System.out.println("pair1: " + pair1);
        System.out.println("pair2: " + pair2);

        System.out.println("pair1 equals pair2: " + pair1.equals(pair2));
        System.out.println("pair1.hashCode: " + pair1.hashCode());
        System.out.println("pair2.hashCode: " + pair2.hashCode());

        Pair<Integer, String> pair3 = pair1.clone();
        System.out.println("pair3 (clone of pair1): " + pair3);
    }
}
