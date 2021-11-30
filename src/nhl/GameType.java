package nhl;

/**
 * A GameType is a data class for storing the code used by the NHL game report URLS to refer to
 * different types of games; e.g., regular season, or all-star.
 *
 */
public enum GameType {
    PRESEASON("01"),
    REGULAR_SEASON("02"),
    PLAYOFFS("03"),
    ALL_STAR("04");

    /**
     * A two character string of numbers used by the NHL API to denote a type of game.
     * e.g., preseason, or playoffs. The value of typeCode is a zero-padded integer as
     * a String, e.g., "02".
     * */
    public final String typeCode;

    GameType(String typeCode) {
        this.typeCode = typeCode;
    }
}
