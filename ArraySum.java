public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {100, 52, 43, 99, 42, 40, 91};
        
        int totalSum = 0;
        
        for (int num : numbers) {
            if (num % 5 == 0 && num % 2 == 0) {
                totalSum += num;
            }
        }
        
        System.out.println("Sum of numbers divisible by 5 and 2: " + totalSum);
    }
}
