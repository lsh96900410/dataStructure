package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object Print : " + obj);
        return obj;
    }

    /* Method Scope Generic Method */
    public static <T> T genericMethod(T t) {
        System.out.println("generic Print : " + t);
        return t;
    }
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound Print : " + t);
        return t;
    }
}
