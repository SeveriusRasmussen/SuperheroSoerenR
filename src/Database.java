import java.util.ArrayList;

public class Database {

    private int listSize = 10;
    // private Superhero[] superheroList;
    private ArrayList<Superhero> superHeroList;
    // bla.
    public Database() {
        this.superHeroList = new ArrayList<>();
    }

    public void addSuperHero(
            String name, String realName, String superPower,
            double yearCreated, String isHuman, double strength) {

        Superhero superhero = new Superhero(
                name, realName, superPower, yearCreated, isHuman, strength);
        superHeroList.add(superhero);
        // superheroList[count++] = new Superhero(name,realName,superPower,yearCreated,isHuman,strength);
    }

    public ArrayList<Superhero> getSuperHeroList() {
        return superHeroList;
    }

    public int getCapacity() {
        return listSize;
    }


}
