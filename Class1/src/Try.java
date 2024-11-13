// public class Try {
//     public static void main(String[] args) {
//         new Try(25, 50, 75);
//     }

//     Try() {
//         System.out.println("No-args Constructor");
//     }

//     Try(int i) {
//         super();
//         System.out.println("One-args constructor" + i);
//     }

//     Try(int i, int j) {
//         this();
//         System.out.println("Two-args constructor" + i + ", " + j);
//     }

//     Try(int i, int j, int k) {
//         this(j, k);
//         System.out.println("Three-args constructor" + i);
//     }
// }

// public class Try {
//     static {
//         System.out.println("B");
//     }

//     public Try() {
//         System.out.println("Constructor S");
//     }

//     public static void main(String[] args) {
//         System.out.println("S");
//         Try a = new Try();
//     }

//     static {
//         System.out.println("E");
//     }
// }

class A {
    int i = 10;
}

class B extends A {
    int i = 20;
}

public class Try {
    public static void main(String[] args) {
        // A a = new B();

        // System.out.println(a.i);
        // Create two points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        // Display the distance between point1 and point2
        System.out.println("The distance between ("
                + point1.getX() + ", " + point1.getY() + ") and ("
                + point2.getX() + ", " + point2.getY() + ") is: " +
                point1.distance(point2));
    }
}