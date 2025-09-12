public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.username = "tonystark";
        acc.setPassword("qwerty");
        System.out.println(acc.username);
        acc.showPassword();
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String newPassword) {
        password = newPassword;
    }
    public void showPassword() {
        System.out.println(password);
    }
}