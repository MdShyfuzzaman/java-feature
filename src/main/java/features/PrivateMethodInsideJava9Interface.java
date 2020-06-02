package main.java.features;

public interface PrivateMethodInsideJava9Interface {
    default void get() {
        productExample();
    }
    // Private method inside interface
    private void productExample() {
        System.out.println("Java 9 test private method");
    }
}
