/**
 * Solve the FizzBuzz challenge.
 */

/* Taking notes while coding is not like Python, which is simply putting # bla  */

class FizzBuzz {
    /* Have to create some class, while in Python I don't */

    public static void main(String[] args) {
        /* Don't understand what this is */

        for (int i = 1; i < 100; i++) {
            /* For loop is quite different */

            doFizzBuzz(i);
        }
    }

    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        /* Different styles of assignments */

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            /* Seems like && here means what 'and' is in Python */

            System.out.println("Fizz Buzz");
            /* Different style of printing (a bit more complicated) */

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}


class FizBuzzWithWhile {
    public static void main(String[] args) {

        int i = 1;

        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        i++;
        return i;
    }
}

