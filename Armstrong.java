import java.util.*;

class Armstrong {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // Function to check if a number is a Perfect number
    public static boolean isPerfect(int num) {
        if (num < 2)
            return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i)
                    sum += num / i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        List<Integer> armstrongNumbers = new ArrayList<>();
        List<Integer> perfectNumbers = new ArrayList<>();

        for (String s : input) {
            int num = Integer.parseInt(s);
            if (isArmstrong(num))
                armstrongNumbers.add(num);
            if (isPerfect(num))
                perfectNumbers.add(num);
        }

        System.out.println("Armstrong numbers: " + armstrongNumbers);
        System.out.println("Perfect numbers: " + perfectNumbers);
        scanner.close();
    }
}
