public class GenericSum {

    // Generic method to find the sum of two numbers or concatenate two strings
    public static <T> T add(T num1, T num2) {
        if (num1 instanceof Number && num2 instanceof Number) {
            // If both are numbers, perform addition
            double sum = ((Number) num1).doubleValue() + ((Number) num2).doubleValue();
            return (T) Double.valueOf(sum);
        } else if (num1 instanceof String || num2 instanceof String) {
            // If at least one is a string, concatenate
            String result = String.valueOf(num1) + String.valueOf(num2);
            return (T) result;
        } else {
            // Unsupported types
            throw new IllegalArgumentException("Unsupported types for addition: " + num1.getClass() + " and " + num2.getClass());
        }
    }

    public static void main(String[] args) {
        // Example usage
        int intSum = GenericSum.add(5, 10);
        double doubleSum = GenericSum.add(3.5, 7.2);
        String strConcat = GenericSum.add("Hello", " World");

        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
        System.out.println("Concatenation of strings: " + strConcat);
    }
}
