import java.util.*;
public class CutChocolate {
    public static int cutChocolate(Integer verticalCost[], Integer horizontalCost[]) {
        Arrays.sort(verticalCost, Collections.reverseOrder());
        Arrays.sort(horizontalCost, Collections.reverseOrder());
        int horizontalCut = 0;
        int verticalCut = 0;
        int horizontalPiece = 1;
        int verticalPiece = 1;
        int totalCost = 0;
        while(horizontalCut < horizontalCost.length && verticalCut < verticalCost.length) {
            if(verticalCost[verticalCut] <= horizontalCost[horizontalCut]) {
                totalCost = totalCost + (horizontalCost[horizontalCut] * verticalPiece);
                horizontalPiece++;
                horizontalCut++;
            }
            else {
                totalCost = totalCost + (verticalCost[verticalCut] * horizontalPiece);
                verticalPiece++;
                verticalCut++;
            }
        }
        while(horizontalCut < horizontalCost.length) {
            totalCost = totalCost + (horizontalCost[horizontalCut] * verticalPiece);
            horizontalPiece++;
            horizontalCut++;
        }
        while(verticalCut < verticalCost.length) {
            totalCost = totalCost + (verticalCost[verticalCut] * horizontalPiece);
            verticalPiece++;
            verticalCut++;
        }
        return totalCost;
    }
    public static void main(String[] args) {
        Integer verticalCost[] = {2, 1, 3, 1, 4};
        Integer horizontalCost[] = {4, 1, 2};
        System.out.println(cutChocolate(verticalCost, horizontalCost));
    }
}