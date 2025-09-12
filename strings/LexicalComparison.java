public class LexicalComparison {
    public static void main(String[] args) {
        String fruits[] = {"apple", "orange", "banana", "mango"};
        String largest = fruits[0];
        String smallest = fruits[0];
        for(int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
            if(smallest.compareTo(fruits[i]) > 0) {
                smallest = fruits[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}