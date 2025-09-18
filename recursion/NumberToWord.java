public class NumberToWord {
    public static void convertToWord(int num) {
        if(num == 0) {
            return;
        }
        convertToWord(num / 10);
        int digit = num % 10;
        if(digit == 1) {
            System.out.print("one ");
        }
        else if(digit == 2) {
            System.out.print("two ");
        }
        else if(digit == 3) {
            System.out.print("three ");
        }
        else if(digit == 4) {
            System.out.print("four ");
        }
        else if(digit == 5) {
            System.out.print("five ");
        }
        else if(digit == 6) {
            System.out.print("six ");
        }
        else if(digit == 7) {
            System.out.print("seven ");
        }
        else if(digit == 8) {
            System.out.print("eight ");
        }
        else if(digit == 9) {
            System.out.print("nine ");
        }
        else {
            System.out.print("zero ");
        }
    }
    public static void main(String[] args) {
        int num = 2025;
        convertToWord(num);
    }
}