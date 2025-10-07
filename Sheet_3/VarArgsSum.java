class VarArgsSum {

    // Method using varargs to calculate sum
    static int calculateSum(int... numbers) {
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Calling the method with different number of arguments
        System.out.println("Sum of 2, 3, 4 = " + calculateSum(2, 3, 4));
        System.out.println("Sum of 10, 20 = " + calculateSum(10, 20));
        System.out.println("Sum of 5, 10, 15, 20, 25 = " + calculateSum(5, 10, 15, 20, 25));
        System.out.println("Sum with no arguments = " + calculateSum());
    }
}
