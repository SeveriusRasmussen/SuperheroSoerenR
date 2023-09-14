public class Superhero {

    private String name;
    private String realName;
    private String superPower;
    private double yearCreated;
    private String isHuman;
    private double strength;
/* Hvis man vil ændre nogle af disse overstående skal man ændre i "this"-konstruktør på linje 11
   og i return del under "this" og endelig på public void i database på linje 13. */

    public Superhero(String name, String realName, String superPower,
                     double yearCreated, String isHuman, double strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public double getYearCreated() {
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
                "name: " + name + "\n" +
                "realName:'" + realName + "\n" +
                "superPower:'" + superPower + "\n" +
                "yearCreated:" + yearCreated + "\n" +
                "isHuman:" + isHuman + "\n" +
                "strength:'" + strength;
    }
} //updated with Usman
