//: operators/AutoInc.java
// Demonstrates the ++ and -- operators.
package com.chaoyue.thinkingInJava.operators;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.*;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.print;

public class AutoInc {
  public static void main(String[] args) {
    int i = 1;
    print("i : " + i);
    print("++i : " + ++i); // Pre-increment
    print("i++ : " + i++); // Post-increment
    print("i : " + i);
    print("--i : " + --i); // Pre-decrement
    print("i-- : " + i--); // Post-decrement
    print("i : " + i);
  }
} /* Output:
i : 1
++i : 2
i++ : 2
i : 3
--i : 2
i-- : 2
i : 1
*///:~
