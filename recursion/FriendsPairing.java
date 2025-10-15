public class FriendsPairing {
    public static int pairFriends(int friends) {
        if(friends == 1) {
            return 1;
        }
        if(friends == 2) {
            return 2;
        }
        int singleChoice = pairFriends(friends - 1);
        int pairChoice = (friends - 1) * pairFriends(friends - 2);
        return singleChoice + pairChoice;
    }
    public static void main(String[] args) {
        int friends = 3;
        System.out.println(pairFriends(friends));
    }
}