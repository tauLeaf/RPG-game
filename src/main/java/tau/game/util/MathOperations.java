package tau.game.util;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class MathOperations {
    public static int getFieldDiagonal(int width, int height) {
        return (int) sqrt(pow(width, 2) + pow(height, 2));
    }

    public static boolean isFieldHadUncheckedTile(Boolean[][] checkedUnits) {
        for (Boolean[] isCheckedLine : checkedUnits) {
            for (Boolean isCheckedTile : isCheckedLine) {
                if (isCheckedTile == false) {
                    return true;
                }
            }
        }
        return false;
    }
}
