// class A {

// }

// class B extends A {

// }

// class C extends B {

// }

// public class MainClass {
//     static void overloadedMethod(A a) {
//         System.out.println("ONE");
//     }

//     static void overloadedMethod(B b) {
//         System.out.println("TWO");
//     }

//     static void overloadedMethod(Object obj) {
//         System.out.println("THREE");
//     }

//     public static void main(String[] args) {
//         C c = new C();

//         overloadedMethod(c);
//     }
// }

// class X {
//     int method(int i, int d) {
//         return i + d + 1;
//     }

//     static int method(int i, double d) {
//         return (int) (i + d + 2.5);
//     }

//     double method(double i, int d) {
//         return i + d + 3.5;
//     }

//     static double method(double i, double d) {
//         return i + d + 4.5;
//     }
// }

// public class MainClass {

//     public static void main(String[] args) {
//         X obj = new X();
//         System.out.println(obj.method(20, 20.0));
//         System.out.println(obj.method(10, 20.0));
//     }
// }

// public class MainClass {
//     public static void main(String[] args) {
//         C c = new C();
//         c.methodOne();
//         c.methodTwo();
//         System.out.println(c.i);
//         System.out.println(c.j);
//     }
// }

// abstract class A {
//     int i = 111, j = 222;

//     abstract void methodOne();

//     abstract void methodTwo();
// }

// abstract class B extends A {
//     void methodOne() {
//         System.out.println(i);
//         System.out.println(j);
//         i = ++i;
//         j = --j;
//     }
// }

// class C extends B {
//     void methodTwo() {
//         System.out.println(i);
//         System.out.println(j);
//         i = i++;
//         j = j--;
//     }
// }

// abstract class X {
//     public X() {
//         System.out.println("From X");
//     }

//     abstract void abstractMethod();
// }

// class Y extends X {
//     public Y() {
//         System.out.println("From Y");
//     }

//     void abstractMethod() {
//         System.out.println("From M");
//     }
// }

// public class MainClass {

//     public static void main(String[] args) {
//         X x = new Y();
//         x.abstractMethod();
//     }
// }

// abstract class AbstractClass {
//     private abstract int abstractMethod();
// }

// interface A {
//     int i = 10;
// }

// class B implements A {
//     void methodB() {
//         i = 100;
//         System.out.println(i);
//     }
// }