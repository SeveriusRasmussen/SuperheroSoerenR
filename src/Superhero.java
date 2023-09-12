public class Superhero {
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private String strength;

public Superhero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
this.name= name;
this.realName = realName;
this.superPower = superPower;
this.yearCreated = yearCreated;
this.isHuman = String.valueOf(isHuman);
this.strength=strength;
}

public String getName(){
    return name;
}
public String getRealName(){
    return realName;
}
public String getSuperPower(){
    return superPower;
}
public int getYearCreated(){
    return yearCreated;
}
public String getisHuman(){
    return isHuman;
}
public String getStrength(){
    return strength;
}
public void setName(String name) {
    this.name=name;
}

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHuman=" + isHuman +
                ", strength='" + strength + '\'' +
                '}';
    }
}
