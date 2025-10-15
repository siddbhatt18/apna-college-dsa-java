import java.util.*;
public class SimplifyPath {
    public static String simplifyFilePath(String path) {
        Stack<String> stk1 = new Stack<>();
        String parts[] = path.split("/");
        for(int i = 0; i < parts.length; i++) {
            String currPath = parts[i];
            if(currPath.equals("") || currPath.equals(".")) {
                continue;
            }
            else if(currPath.equals("..")) {
                if(stk1.isEmpty() != true) {
                    stk1.pop();
                }
            }
            else {
                stk1.push(currPath);
            }
        }
        Stack<String> stk2 = new Stack<>();
        while(stk1.isEmpty() != true) {
            stk2.push(stk1.pop());
        }
        StringBuilder result = new StringBuilder();
        while(stk2.isEmpty() != true) {
            result.append("/").append(stk2.pop());
        }
        if(result.length() == 0) {
            return "/";
        }
        else {
            return result.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println(simplifyFilePath("/a/./b/../../c/"));
    }
}