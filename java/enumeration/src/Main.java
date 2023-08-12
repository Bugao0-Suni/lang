
class PetSpecies {
    enum PetSpeciesType{ CAT, DOG , BIRD }
    PetSpeciesType Pettypd;
}

public class Main {
    public static void main(String[] args) {
        PetSpecies pet = new PetSpecies();
        pet.Pettypd = PetSpecies.PetSpeciesType.DOG;
    }
}