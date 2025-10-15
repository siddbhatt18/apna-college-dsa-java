import java.util.*;
public class PQForObjects {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student other) {
            return this.rank - other.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pque = new PriorityQueue<>();
        pque.add(new Student("A", 4));
        pque.add(new Student("B", 5));
        pque.add(new Student("C", 2));
        pque.add(new Student("D", 12));
        while(pque.isEmpty() != true) {
            System.out.print(pque.peek().name + ":" + pque.peek().rank + " ");
            pque.remove();
        }
    }
}