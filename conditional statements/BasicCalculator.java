import java.util.*; 
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt(); 
        char choice = sc.next().charAt(0); 
        switch(choice) {
            case '+': 
                System.out.println(num1 + num2);
                break;
            case '-': 
                System.out.println(num1 - num2);
                break;
            case '*': 
                System.out.println(num1 * num2);
                break;
            case '/': 
                System.out.println(num1 / num2);
                break;
            default: 
                System.out.println("invalid");
        }
        sc.close(); 
    }
}