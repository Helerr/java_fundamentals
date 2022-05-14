package labs_examples.packages.labs.labs_examples2;


import labs_examples.packages.labs.labs_examples1.ClassA;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA.publicMethod();
        //protectedMethod can only be called if the classes in other packages are sub-classes
        ClassA.protectedMethod();
        //default methods can only be accessed within the same package
    }
}
