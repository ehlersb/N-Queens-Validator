import java.util.ArrayList;

/**
 * Created by Benjamin Ehlers on 1/1/2019.
 */
public class QueenCheck {

    private static double EPSILON = 0.0001;
    private ArrayList<Integer> queenPositions;

    public QueenCheck(ArrayList<Integer> queenPositions) {
        this.queenPositions = queenPositions;
    }

    public int letterToInt(String letter) {
        return letter.charAt(0) - 97;
    }

    public boolean check() {
        for(int i = 0; i < queenPositions.size(); i++) {
            if(checkHorizontal(i)) return false;
            if(checkDiagonal(i)) return false;
        }
        return true;
    }

    private boolean checkHorizontal(int xCoordinate) {
        for(int i = 0; i < queenPositions.size(); i++) {
            if(xCoordinate == i) continue;
            if(queenPositions.get(xCoordinate) == queenPositions.get(i)) return true;
        }
        return false;
    }

    private boolean checkDiagonal(int xCoordinate) { // true means queencheck fails
        for(int i = 0; i < queenPositions.size(); i++) {
            if(i == xCoordinate && queenPositions.get(i) == queenPositions.get(xCoordinate)) continue;
            if(calculateSlope(queenPositions.get(i), queenPositions.get(xCoordinate), i, xCoordinate) == 1 ) return true;

        }
        return false;
    }
    private int calculateSlope(int y2, int y1, int x2, int x1) {
        double Y2 = y2 + 0.0;
        double Y1 = y1 + 0.0;
        double X2 = x2 + 0.0;
        double X1 = x1 + 0.0;
        double slope = Math.abs(((Y2 - Y1) / (X2 - X1)));
        if(Math.abs(1.0 - slope) < EPSILON) return 1;
        else return 0;

    }
}
