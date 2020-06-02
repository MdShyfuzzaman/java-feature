package main.java.features;

public class PrivateInterfaceMethodsJava9Example implements PrivateMethodInsideJava9Interface {
    public static void main(String[] args) {
        PrivateMethodInsideJava9Interface privateInterface = new PrivateInterfaceMethodsJava9Example();
        privateInterface.get();
    }
}
