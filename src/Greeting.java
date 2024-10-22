import FunctionalProgramming.GreetingMessage;

public class Greeting {
    public static void main(String[] args) {

        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("World");

        GreetingMessage gm2 = (String name)->{
            System.out.println("Hello " + name);
        };

        /**
         * Shapes shapes = Square::calculateArea; // method reference of a class.
         */

    }
}
