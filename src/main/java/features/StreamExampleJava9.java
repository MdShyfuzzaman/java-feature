package main.java.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Stream example java 9.
 */
public class StreamExampleJava9 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("StreamTakeWhileExample1 : #######################");
        StreamTakeWhileExample1();
        System.out.println("StreamTakeWhileExample2 : #######################");
        StreamTakeWhileExample2();
        System.out.println("StreamDropWhileExample1 : #######################");
        StreamDropWhileExample1();
        System.out.println("StreamDropWhileExample2 : #######################");
        StreamDropWhileExample2();
        System.out.println("StreamOfNullableExample1 : #######################");
        StreamOfNullableExample1();
        System.out.println("StreamOfNullableExample2 : #######################");
        StreamOfNullableExample2();
        System.out.println("StreamIterateExample : #######################");
        StreamIterateExample();

    }

    /**
     * Stream take while example 1.
     * It returns, if this stream is ordered, a stream consisting of the longest prefix of elements
     * taken from this stream that match the given predicate. Otherwise returns, if this stream is unordered,
     * a stream consisting of a subset of elements taken from this stream that match the given predicate.
     */
    private static void StreamTakeWhileExample1() {
        List<Integer> list
                = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * Stream take while example 2.
     */
    private static void StreamTakeWhileExample2() {
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * Stream drop while example 1.
     * It returns, if this stream is ordered, a stream consisting of the remaining elements of
     * this stream after dropping the longest prefix of elements that match the given predicate.
     * Otherwise returns, if this stream is unordered,
     * a stream consisting of the remaining elements of this stream after dropping a subset of elements
     * that match the given predicate.
     */
    private static void StreamDropWhileExample1() {
        List<Integer> list
                = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * Stream drop while example 2.
     */
    private static void StreamDropWhileExample2() {
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * Stream of nullable example 1.
     * It returns a sequential Stream containing a single element,
     * if non-null, otherwise returns an empty Stream.
     */
    private static void StreamOfNullableExample1() {
        Stream<Integer> val
                = Stream.ofNullable(1);
        val.forEach(System.out::println);
    }

    /**
     * Stream of nullable example 2.
     */
    private static void StreamOfNullableExample2() {
        Stream<Integer> val
                = Stream.ofNullable(null);
        val.forEach(System.out::println);
    }

    /**
     * Stream iterate example.
     * It returns a sequential ordered Stream produced by iterative application of the given next function to an initial element,
     * conditioned on satisfying the given hasNext predicate.
     * The stream terminates as soon as the hasNext predicate returns false.
     */
    private static void StreamIterateExample() {
        Stream.iterate(1, i -> i <= 10, i -> i*3)
                .forEach(System.out::println);
    }
}
