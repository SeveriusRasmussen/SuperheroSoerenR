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

    public Superhero findSuperhero(String superheroName){
        for (Superhero hero : superherolist) {
            //Hvis man vil have toLowerCase så gøre man det her i "if"
            if (hero.getName().toLowerCase().contains(superheroName.toLowerCase()))
                return hero;
        }

        return null;
    }

    public ArrayList<Superhero> findSuperheroes(String superheroName){
        ArrayList<Superhero> superheroes = new ArrayList<>();
        for (Superhero superhero : superherolist) {
            //Hvis man vil også have toLowerCase her, så gøre det igen som overstående.
            if (superhero.getName().toLowerCase().contains(superheroName.toLowerCase())){
                superheroes.add(superhero);
            }
        }
        return superheroes;
    }

}
