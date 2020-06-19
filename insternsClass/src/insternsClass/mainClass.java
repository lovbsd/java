package insternsClass;

public class mainClass {
public static void main(String[] args) {

    Parent obj1 = new Parent();
    Parent obj2 = new Child();
//    obj1은 instanceof 부모: true
//    obj1은 instanceof 자식: false
//    obj1은 instanceof MyInterface: false
//    obj2은 instanceof 부모: true
//    obj2은 instanceof 자식: true
//    obj2은 instanceof MyInterface: true

    System.out.println("obj1 instanceof 부모: "
        + (obj1 instanceof Parent));
    System.out.println("obj1 instanceof 자식: "
        + (obj1 instanceof Child));
    System.out.println("obj1 instanceof MyInterface: "
        + (obj1 instanceof MyInterface));
    System.out.println("obj2 instanceof 부모: "
        + (obj2 instanceof Parent));
    System.out.println("obj2 instanceof 자식: "
        + (obj2 instanceof Child));
    System.out.println("obj2 instanceof MyInterface: "
        + (obj2 instanceof MyInterface));
}
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}	
