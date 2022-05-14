package labs_examples.static_nonstatic.labs.exercise_1;

public class ClassB {
    public static void firstStaticMethodClassB(){
        System.out.println("Inside first static method");
    }
    public static void secondStaticMethodClassB(){
        ClassA.firstStaticMethod();
        ClassA obj = new ClassA();
        obj.firstNonStaticMethod();
    }
    public void firstNonStaticMethodClassB(){
        System.out.println("Inside first non-static method");
    }
    public void secondNonStaticMethodClassB(){
        ClassA obj = new ClassA();
        obj.firstNonStaticMethod();
        ClassB objB = new ClassB();
        objB.firstNonStaticMethodClassB();
        firstStaticMethodClassB();
        ClassA.firstStaticMethod();
    }
}
