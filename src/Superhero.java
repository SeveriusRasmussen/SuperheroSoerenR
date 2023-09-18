public class Superhero {

    //delopgave #1 Creating data on a Superhero. Attributes, constructor and get metodes

    //Attributes
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private int strength;

    // Set metoder
    public void setName(String name) {
        this.name = name;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setIsHuman(String isHuman) {
        this.isHuman = isHuman;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //this konstruktør
    public Superhero(String name, String realName, String superPower,
                     int yearCreated, String isHuman, int strength) {
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

    public int getStrength() {
        return strength;
    }


    @Override
    public String toString() {
        return
                "\nSuperhero name: " + name +
                "\nRealName: " + realName +
                "\nSuperPower: " + superPower +
                "\nYear Created: " + yearCreated +
                "\nIs Human: " + isHuman +
                "\nStrength: " + strength + "\n";
    }
}
