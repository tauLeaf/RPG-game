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