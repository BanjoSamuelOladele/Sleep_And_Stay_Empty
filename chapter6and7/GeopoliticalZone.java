package chapter6and7;

public enum GeopoliticalZone {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara","NAsarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "KAstina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra","Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross_River", "De;ta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Ondo", "Ogun", "Oyo");

    private String[] state;
    GeopoliticalZone(String... state){this.state = state;}
    public String[] getGeoZone(){return state;}
}
