import java.util.*;
public class ArraysBasics {
    public static void updateMarks(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        updateMarks(marks);
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}