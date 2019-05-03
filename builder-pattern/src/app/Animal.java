package app;

import java.util.List;

public class Animal {

    private final String id;
    private String name;
    private String pedigreeName;
    private String owner;
    private String race;
    private String residence;
    private Boolean isVaccinated;
    private Boolean isChampion;
    private List<String> sons;
    private Sex sex;
    private Double weight;
    private Double height;


    public Animal(String name, String pedigreeName, String id, String owner, String race, String residence, 
                  Boolean isVaccinated, Boolean isChampion, List<String> sons, Sex sex, Double weight, Double height) {
        this.name = name;
        this.pedigreeName = pedigreeName;
        this.id = id;
        this.owner = owner;
        this.race = race;
        this.residence = residence;
        this.isVaccinated = isVaccinated;
        this.isChampion = isChampion;
        this.sons = sons;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public Animal(String id,String name, String pedigreeName) {
        this.name = name;
        this.pedigreeName = pedigreeName;
        this.id = id;
    }

    public Animal(String id, String owner, String race, String residence) {
        this.id = id;
        this.owner = owner;
        this.race = race;
        this.residence = residence;
    }

    public Animal(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.pedigreeName + " " + this.id + " " + this.owner + " " + this.race + " " + this.residence + " " + 
               this.isVaccinated + " " + this.isChampion + " " + this.sons + " " + this.sex + " " + this.weight + " " + this.height;
    }
}