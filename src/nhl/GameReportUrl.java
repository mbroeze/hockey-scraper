package nhl;

/**
 * The GameReportUrl enum is used to generate url Strings for each of the NHL HTML game report pages.
 * This enum provides one method {@code getUrl} which accepts arguments for season, game type, and game number
 * to generate this game report url.
 */
public enum GameReportUrl {
    GAME_SUMMARY("GS"),
    PLAY_BY_PLAY("PL"),
    FACEOFF_SUMMARY("FS"),
    FACEOFF_COMPARISON("FC"),
    TOI_SHIFT_REPORT_AWAY("TV"),
    TOI_SHIFT_REPORT_HOME("TH"),
    EVENT_SUMMARY("ES"),
    ROSTER_REPORT("RO"),
    SHOT_SUMMARY("SS");

    /**
     * The url format for NHL html game reports.
     * Arguments should be provided to String.format in the following order:
     * <ol>
     *     <li>season: An eight character String; e.g., "20202021"</li>
     *     <li>reportCode: GameReportUrl.reportCode; e.g., "ES"</li>
     *     <li>gameType: GameType.typeCode; e.g., GameType.REGULAR_SEASON.code or "02"</li>
     *     <li>gameNumber: A four character String of numerals; e.g., "0329"</li>
     * </ol>
     *  e.g., "http://www.nhl.com/scores/htmlreports/[season]/[reportCode][gameType][gameNumber].HTM"
     */
    private static final String URL_FORMAT = "http://www.nhl.com/scores/htmlreports/%s/%s%s%s.HTM";

    /** The report code used in generating the URL for this game report; e.g., "TV" */
    private final String reportCode;

    /**
     * GameReport constructor. Sets the reportCode field.
     * @param reportCode the two character String used in the NHL HTML game report URLs; e.g., "RO"
     */
    GameReportUrl(String reportCode) {
        this.reportCode = reportCode;
    }

    /**
     * Returns a URL String for this game report for the given parameters.
     * @param season An eight character String representing the NHL season; e.g., "20202021"
     * @param gameType A GameType enum; e.g., GameType.REGULAR_SEASON
     * @param gameNumber A four character String of numerals representing the game number for the given season; e.g., "0329"
     * @return
     */
    public String getUrl(String season, GameType gameType, String gameNumber) {
        return String.format(URL_FORMAT, season, reportCode, gameType.typeCode, gameNumber);
    }
}
