package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        } else if (a || b) {
            System.out.println("short-circuit or");
        } else if (a & b) {
            System.out.println("and");
        } else if (a && b) {
            System.out.println("short-circuit and");
        } else if (a ^ b) {
            System.out.println("XOR");
        } else if (!b) {
            System.out.println("NOT");
        }

        // write your code below

    }

}

