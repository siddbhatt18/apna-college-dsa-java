public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        Bishop b = new Bishop();
        b.moves();
    }
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("vertically, horizontally, diagonally");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("vertically, horizontally");
    }
}
class Bishop implements ChessPlayer {
    public void moves() {
        System.out.println("diagonally");
    }
}