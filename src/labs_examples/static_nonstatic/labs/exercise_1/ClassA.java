package labs_examples.static_nonstatic.labs.exercise_1;

public class ClassA {
    public static void firstStaticMethod(){
        System.out.println("Inside first static method");
    }
    public static void secondStaticMethod(){
        firstStaticMethod();
        ClassA obj = new ClassA();
        obj.firstNonStaticMethod();
    }
    public void firstNonStaticMethod(){
        System.out.println("Inside first non-static method");
    }
    public void secondNonStaticMethod(){
        ClassA obj = new ClassA();
        obj.firstNonStaticMethod();
    }
}
