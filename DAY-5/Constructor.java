// Base class: A
class A {
    public A() {
        System.out.println("Constructor of A is called");
    }
}

// Subclass: B that inherits from A
class B extends A {
    public B() {
        super(); // Calls the constructor of class A (optional, Java does it implicitly)
        System.out.println("Constructor of B is called");
    }
}

// Subclass: C that inherits from B
class C extends B {
    public C() {
        super(); // Calls the constructor of class B (optional)
        System.out.println("Constructor of C is called");
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        C c = new C();  // This will call constructors in the chain (A, B, C)
    }
}
