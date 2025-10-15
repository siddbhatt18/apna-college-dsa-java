public class RemoveDuplicates {
    public static String removeDuplicate(String orgStr, int index, String newStr, int flag[]) {
        if(index == orgStr.length()) {
            return newStr;
        }
        char currChar = orgStr.charAt(index);
        if(flag[currChar - 97] == 1) {
            return removeDuplicate(orgStr, index + 1, newStr, flag);
        }
        else {
            flag[currChar - 97] = 1;
            return removeDuplicate(orgStr, index + 1, newStr + currChar, flag);
        }   
    }
    public static void main(String[] args) {
        String orgStr = "helloworld";
        int flag[] = new int[26];
        System.out.println(removeDuplicate(orgStr, 0, "", flag));
    }
}