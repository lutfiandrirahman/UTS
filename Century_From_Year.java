public class Century_From_Year {
    public static int century(int number) {
        // Check if the number is divisible by 100
        if (number % 100 == 0) {
            // If divisible, return the number divided by 100
            return number / 100;
        } else {
            // If not divisible, return the number divided by 100 plus 1
            return (number / 100) + 1;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(century(1705)); // Output: 18
        System.out.println(century(1900)); // Output: 19
        System.out.println(century(1601)); // Output: 17
        System.out.println(century(2000)); // Output: 20
        System.out.println(century(2742)); // Output: 28
    }
}
