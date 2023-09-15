public class Superhero {

    //Attributes
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private double strength;

    //Konstruktør
    public Superhero(String name, String realName, String superPower,
                     int yearCreated, String isHuman, double strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    //get metoder
    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public double getStrength() {
        return strength;
    }


    @Override
    public String toString() {
        return "\nSuperhero\n" +
                "\nname: " + name +
                "\nrealName:'" + realName +
                "\nsuperPower:'" + superPower +
                "\nyearCreated:" + yearCreated +
                "\nisHuman:" + isHuman +
                "\nstrength:'" + strength;
    }
} //updated with Nikolaj and Usman 14 sept
