public class StringComparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        if(str1 == str2) {
            System.out.println("str1 == str2");
        } 
        else {
            System.out.println("str1 != str2");
        }
        if(str1 == str3) {
            System.out.println("str1 == str3");
        } 
        else {
            System.out.println("str1 != str3");
        }
        if(str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } 
        else {
            System.out.println("str1 not equals str2");
        }
        if(str1.equals(str3)) {
            System.out.println("str1 equals str3");
        } 
        else {
            System.out.println("str1 not equals str3");
        }
    }
}