package org.example;

public class StringExample {
    public static void main(String[] args) {
//        String name = "Java";
//        System.out.println(name);
//        // A String in Java is a sequence of characters. It is used to store and manipulate text
//        String word = "Hello";  // String
//        char letter = 'H';
//        System.out.println(word);   // Output: Hello
//        System.out.println(letter);
//        // Strings are enclosed in double quotes ("") → "Hello"
//        //Characters are enclosed in single quotes ('') → 'H'
//
//        //  Strings are NOT Primitive Data Types
//        int num = 10;
//        String text = "Java"; // object text
//        // Java provides primitive types like int, char, and double, but String is a Class.
//        String str1 = new String("Hello");
//        String textNew = new String("Java");
//        System.out.print(str1);
//        // Normally, objects in Java are created using the new keyword. Strings can also be created this way.

        // Java stores strings in Heap Memory and uses a special String Pool to optimize memory usage.
//        String s1 = "Java";
//        String s2 = "Java";


        // Since "Java" is already in the pool, s2 does not create a new object.
        // Since "Java" is already in the pool, s2 does not create a new object.
        //This saves memory and improves performance.

        // String pool
        // Java -> s1 s2
        //

        //String s1 = "Hello"; // string pool
//        String s2 = "Hello"; // string pool
        //String s5 = "Hello World";
//        // "Hello"  <---- s1, s2 (Both refer to the same object)
        // "Hello World <------ s5
//        String s3 = new String("Hello"); // heap memory (Outside String pool)
        //String s4 = new String("Hello");
        // The new keyword forces Java to create a new object in Heap Memory (outside String Pool).
        // So, even though "Hello" is already in the String Pool, s3 gets a new object.
        // String Pool in Heap Memory:
        //--------------------------------
        //"Hello"  <---- s1, s2 (Reused)
        //
        //Heap Memory (Outside String Pool):
        //----------------------------------
        //"Hello"  <---- s3 (New Object)
        //"Hello"  <---- s4 (New Object)

//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = "hello";
//        String s4 = new String("Hello");
//        String s5 = new String("Hello");

//

//        System.out.println(s4.equals("Hello"));

        // "Hello"  <---- s1, s2 (Reused)
        // "hello" <----- s3

//        String str1 = "Hello"; // string pool
//        str1 = "World";
//        System.out.print(str1);

        // // Hello --->
        //        //  World ----> str1

        //  immutable in Java, meaning once created, it cannot be changed.
        // String is immutable
//        String str1 = "Hello";
//        str1 = str1 + " World";

        // Hello --->
        // Hello World ----> str1

        // "Hello" is stored in memory.
        //When " World" is added, a new string object "Hello World" is created.

//        String s1 = "Java";
//        String s2 = s1;
//
//        s1 = "Python";
//
//        System.out.println(s1);
//        System.out.println(s2);

        // "Java" --->   s2
        // "Python" ----> s1
        // Even though s2 = s1; was used, s1 now refers to "Python", but s2 still refers to "Java" because the original "Java" string was not changed.

    // Instead of creating multiple copies of the same book, the library keeps only one copy.
        //If a new person asks for the same book, the librarian just gives them the reference to the existing book instead of printing a new one.
        //This saves memory because no duplicate books (String objects) are created.

        // Think of the String Pool as a shared playlist on Spotify.
        //If two users add the same song, Spotify does not duplicate it; they both listen to the same track.
        //But if someone uploads a personal copy, it exists separately.

        String s1 = "Hello";
        String s4 = new String("Hello").intern();
        System.out.println(s1 == s4); // (Now both refer to the String Pool)
        // intern() forces the new object to be stored in the String Pool, not Heap Memory

    }
}
