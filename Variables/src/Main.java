public class Main {


    public static void main(String[] args) {
    /**
     * <h1>Primitive and Reference Variables!</h1>
     * <p>
     * The Variables program implements an application that
     * simply assign data or address reference to declared variable.
     * </p>
     *
     *
     * @author  Kamyab Rouhifar
     * @version 0.0.2
     * @since   2022-05-31]
     * {@link Variables}
     */

        int x;  // Declaration
                //     +
        x = 123; // assignment

        // --- OR

        int y = 123; // Simple way :)

        // Result output
        System.out.println(x);
        System.out.println(y);

        // String literal + variables
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        // this is an ERROR !!! int type can only accept 4 bytes data
        /**
         * {@code int errNum = 326432136432; }
         */
        //  Solution
        long z = 326432136432L;
        System.out.println("z : " + z);
        float f = 3.14f;
        System.out.println("f : " + f);
        boolean b = true;
        System.out.println("b : " + b);
        char symbol = '@';
        System.out.println(symbol);
        String name = "Kamyab";
        System.out.println("Hello " + name);
    }



}
