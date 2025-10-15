public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setInkColour("blue");
        System.out.println(p1.getInkColour());
        p1.setTipSize(10);
        System.out.println(p1.getTipSize());
    }
}
class Pen {
    String inkColour;
    int tipSize;
    String getInkColour() {
        return this.inkColour;
    }
    int getTipSize() {
        return this.tipSize;
    }
    void setInkColour(String inkColour) {
        this.inkColour = inkColour;
    }
    void setTipSize(int tipSize) {
        this.tipSize = tipSize;
    }
}