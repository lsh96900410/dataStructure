package generic.test.ex2;

public class Pair<T, T1> {

    private T firstValue;
    private T1 secondValue;

    public void setSecond(T1 secondValue) {
        this.secondValue=secondValue;
    }

    public void setFirst(T firstValue) {
        this.firstValue=firstValue;
    }

    public T getFirst() {
        return firstValue;
    }

    public T1 getSecond() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
