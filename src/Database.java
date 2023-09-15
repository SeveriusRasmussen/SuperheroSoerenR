import java.util.ArrayList;

public class Database {

    //Array
    private ArrayList<Superhero> superherolist;

    //array
    public Database() {
        this.superherolist = new ArrayList<>();
    }

    //get metode
    public ArrayList<Superhero> getSuperherolist() {
        return superherolist;
    }

    //metode til at adde til arraylist
    public void addSuperhero(Superhero superhero) {
        superherolist.add(superhero);
    }

    public Superhero findSuperhero(String searchTerm){
        searchTerm = searchTerm.toLowerCase();

        for (Superhero hero : superherolist) {
            String heroName = hero.getName().toLowerCase();
            if (heroName.equals(searchTerm) || heroName.startsWith(searchTerm))
                return hero;
        }

        return null;
    }
// updated with Nikolaj and Usman 14 sept.
}
