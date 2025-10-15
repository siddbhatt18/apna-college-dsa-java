public class TowerOfHanoi {
    public static void towerOfHanoi(int num, char src, char help, char dest) {
        if(num == 1) {
            System.out.println("transfer disk " + num + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(num - 1, src, dest, help);
        System.out.println("transfer disk " + num + " from " + src + " to " + dest);
        towerOfHanoi(num - 1, help, src, dest);
    }
    public static void main(String[] args) {
        int num = 3;
        towerOfHanoi(num, 'S', 'H', 'D');
    }
}