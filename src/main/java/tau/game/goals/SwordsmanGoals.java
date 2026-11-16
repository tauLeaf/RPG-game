package tau.game.goals;

import tau.game.field.GameField;

public class SwordsmanGoals extends Goals {

    public SwordsmanGoals(GameField field) {
        this.field = field;
    }
    @Override
    public void decideWhatToDo() {
//        if (isEnemyNear()) {
//            attackEnemy();
//        }
//        else {
//
//        }
    }

    public boolean isEnemyNear() {
        int x = unit.getX();
        int y = unit.getY();

        return false;
    }


}


//
//if (x == field.getWidth()) {
//
//        }
//
//        if (field.unitsOnField[y][x - 1] != null) {
//        return true;
//        }
//        else if (field.unitsOnField[y][x + 1] != null) {
//        return true;
//        }
//        else if (field.unitsOnField[y + 1][x] != null) {
//        return true;
//        }
//        else if (field.unitsOnField[y - 1][x] != null) {
//        return true;
//        }
//        else {
//        return false;
//        }