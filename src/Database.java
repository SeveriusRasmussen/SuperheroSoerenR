public class Database {

private Superhero[] superheroList;
int count= 0;
private int listSize = 5;
public Database() {
this.superheroList = new Superhero[listSize];

}

public void addHero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
superheroList[count++] = new Superhero(name,realName,superPower,yearCreated,isHuman,strength);
}

public Superhero[] getSuperheroList() {
    return superheroList;
}

public int getListSize() {
    return listSize;
    }


}
