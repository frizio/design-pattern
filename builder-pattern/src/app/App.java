package app;

/*
* https://italiancoders.it/builder-pattern-un-ottima-alternativa-al-costruttore/
*/
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Demo BUILDER creational design pattern");

        //
        Animal pluto = new Animal("pluto", "123", "PlutoSecondo",
                                 "labrador","Marco Rossi","Via x",true, false,
                                  null, Sex.MALE,40.5,30.0);
        System.out.println(pluto.toString());

        //
        Animal pluto2 = AnimalBuilder
                            .newBuilder("0000001")
                            .name("0000001")
                            .pedigreeName("PlutoSecondo")
                            .owner("Marco Rossi")
                            .race("labrador")
                            .residence("Via x")
                            .isVaccinated(true)
                            .isChampion(false)
                            .sons(null)
                            .sex(Sex.MALE)
                            .weight(40.5)
                            .height(30.0)
                            .build();
        System.out.println(pluto2.toString());

        //
        AnimalBuilder animalBuilder = AnimalBuilder.newBuilder("0000001")
            .name("0000002")
            .pedigreeName("PlutoSecondo")
            .owner("Mario Bianchi")
            .race("labrador")
            .residence("Via x")
            .isVaccinated(true)
            .isChampion(false)
            .sons(null)
            .sex(Sex.MALE)
            .weight(40.5)
            .height(30.0);
        Animal animal3A = animalBuilder.build();
        Animal animal3AClone = animalBuilder.build();
        Animal animal3B = animalBuilder.sex(Sex.FEMALE).build();
        System.out.println(animal3A.toString());
        System.out.println(animal3AClone.toString());
        System.out.println(animal3B.toString());

    }
}