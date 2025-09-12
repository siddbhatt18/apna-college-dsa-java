public class ReverseGivenNumber {
    public static void main(String[] args) {
        int orgNum = 10899;
        int revNum = 0;
        while(orgNum != 0) {
            int lastDigit = orgNum % 10;
            revNum = (revNum * 10) + lastDigit;
            orgNum = orgNum / 10;
        }
        System.out.println(revNum);
    }
}