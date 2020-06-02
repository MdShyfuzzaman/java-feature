package main.java.features;

public class MethodReferenceJava8 {
    public static void getProduct(){
        System.out.println("Item 1");
    }
    public static void main(String[] args) {
        // Referring static method
        ProductInterface product = MethodReferenceJava8::getProduct;
        // Calling interface method
        product.get();
    }
}
