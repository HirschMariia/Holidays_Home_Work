import java.util.ArrayList;

public class TaskSecond {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("avocado");
        arrayList.add("grapefruit");

        char letterToFind = 'a';
        int countStartingWithLetter = 0;
        StringBuilder allElements = new StringBuilder();
        String shortestString = null;

        for (String element : arrayList) {
            if (element.charAt(0) == letterToFind) {
                countStartingWithLetter++;
            }
            allElements.append(element).append(" ");

            if (shortestString == null || element.length() < shortestString.length()) {
                shortestString = element;
            }
        }

        System.out.println("Number of elements, starting from letter " + letterToFind + ": " + countStartingWithLetter);
        System.out.println("All elements in one string: " + allElements);
        System.out.println("The shortest string: " + shortestString);
    }
}