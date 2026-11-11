package tau.game.units;

public interface UnitFactory {
    Unit createUnit(int x, int y);
}


//public static Unit createUnit(UnitType type) {
//    return switch(type) {
//        case SWORDSMAN -> new Swordsman();
//        case IRONCLAD -> new Ironclad();
//        case SCOUT -> new Scout();
//        case CROSSBOWMAN -> new Crossbowman();
//        case CHARIOT -> new Chariot();
//        case HORSEMAN -> new Horseman();
//    };
//}