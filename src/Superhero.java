public class Superhero {
    private String name;
    private String realname;
    private String superPower;
    private int yearCreated;
    private boolean isHuman;
    private String strength;

    public Superhero(String name, String realName, String superPower,
                     int yearCreated, boolean isHuman, String strength) {
        this.name = name;
        this.realname = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }


    public String name(){
        return name;
    }

    public String realname(){
        return realname;
    }

    public String superPower(){
        return superPower;
    }

    public int yearCreated(){
        return yearCreated;
    }

    public boolean isHuman(){
        return isHuman;
    }

    public String strength(){
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }


    /* public String toString() {

    } */

}
