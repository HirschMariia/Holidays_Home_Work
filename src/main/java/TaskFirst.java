import java.util.ArrayList;

public class TaskFirst {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);

        // Search Sum of all elements ArrayList
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        // Search Average value of elements ArrayList
        double average = (double) sum / arrayList.size();
        System.out.println("Average value of elements: " + average);

        // Search Smallest element ArrayList
        int min = Integer.MAX_VALUE;
        for (int num : arrayList) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest element: " + min);

        // Search Sum of the squares of all elements ArrayList
        int squareSum = 0;
        for (int num : arrayList) {
            squareSum += num * num;
        }
        System.out.println("Sum of the squares of all elements: " + squareSum);

        // delete od numbers
        arrayList.removeIf(num -> num % 2 == 0);
        System.out.println("ArrayList after deleting od numbers: " + arrayList);

        // Search Second by magnitude element
        int secondMagnitude = Integer.MIN_VALUE;
        int magnitude = Integer.MIN_VALUE;
        for (int num : arrayList) {
            if (num > magnitude) {
                secondMagnitude = magnitude;
                magnitude = num;
            } else if (num > secondMagnitude && num < magnitude) {
                secondMagnitude = num;
            }
        }
        System.out.println("Second by magnitude element: " + secondMagnitude);
    }
}
