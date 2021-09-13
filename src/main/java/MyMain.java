public class MyMain {
    // Warm-up: This method returns true if the input num is
    // divisible by 4, and false otherwise
    // Ex. divisibleByFour(16) -> true
    //     divisibleByFour(5) -> false
    public static boolean divisibleByFour(int num) {
        // REPLACE WITH YOUR CODE HERE

        return num % 4 == 0;
    }

    // This method prints every number from 1 up to and including the input biggest
    // There should be **5 numbers** printed per line, such as:
    // 1 2 3 4 5
    // 6 7 8 9 10
    // ...
    public static void printNumsUpTo(int biggest) {
        // REPLACE THIS WITH YOUR CODE
        String line = "";
        int LineStuff = 0;
        for (int i = 1; i <= biggest; i++) {
            if (LineStuff == 4) {
                System.out.println(line+" "+i);
                line = "";
                LineStuff = 0;
            } else {
                LineStuff += 1;
                line = line + " " + i;
            }
        }
    }

    // This method is given an input x, and it adds up the sum of its digits
    // Ex. sumDigits(61) -> 7 because 6 + 1 = 7
    //     sumDigits(123) -> 6 because 1 + 2 + 3 = 6
    public static int sumDigits(int x) {
        int l = (String.valueOf(x)).length();
        int a = 0;
        int lp = x;
        for (int i = 10; i <= x*10;i*= 10) {
            a = a + (lp % 10);
            lp = lp/10;
        }
        return a;
        // REPLACE THIS WITH YOUR CODE
    }

    // Bonus: This method returns true if the input num is a "self-divisor",
    // and false otherwise.
    // A positive integer is called a "self-divisor" if the number is divisible
    // by every one of its digits.
    // Ex. isSelfDivisor(128) -> true because 128 is divisible by 1, 2, and 8
    //     isSelfDivisor(26) -> false because 26 is not divisible by 26

    // Note that 0 is not considered to be a divisor of any number, so any number containing a 0
    // digit is NOT a self-divisor.
    public static boolean isSelfDivisor(int num) {
        // REPLACE THIS WITH YOUR CODE
        int lp = num;
        for (int i = 10; i <= num*10;i*= 10) {
            if ((lp % 10) == 0 || num % (lp % 10) != 0) {
                return false;
            }
            lp = lp/10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("divisibleByFour Tests:");
        System.out.println(divisibleByFour(128)); // true
        System.out.println(divisibleByFour(14)); // false
        System.out.println(divisibleByFour(12)); // true
        System.out.println(divisibleByFour(3)); // false

        System.out.println();
        System.out.println("printNumsUpTo Tests:");
        printNumsUpTo(20);
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
        // 16 17 18 19 20

        System.out.println();
        sumDigits(61);
        System.out.println("sumDigits Tests:");
        System.out.println(sumDigits(61)); // 7 because 6 + 1 = 7
        System.out.println(sumDigits(123)); // 6 because 1 + 2 + 3 = 6
        System.out.println(sumDigits(4096)); // 19

        System.out.println();
        System.out.println("isSelfDivisor Tests:");
        System.out.println(isSelfDivisor(128)); // true
        System.out.println(isSelfDivisor(36)); // true
        System.out.println(isSelfDivisor(144)); // true
        System.out.println(isSelfDivisor(4096)); // false
        System.out.println(isSelfDivisor(26)); // false
        System.out.println(isSelfDivisor(10)); // false
    }
}