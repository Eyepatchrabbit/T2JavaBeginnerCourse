package personaltrincets.drawingexerciseelements;

import java.util.Random;
import java.util.Scanner;

public class NumberSmasherForDrawing {

    /**
     * Was made for mashing pokémons together
     * =>take a base and add "details to it"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Give highest possible number");
            int highestnumber = input.nextInt();

            System.out.println("Give number of repeats");
            int repeats = input.nextInt();

            System.out.println("Using PokemonList? (y,n)");
            boolean usingPokeList = input.next().equals("y");

            System.out.println("Base \t-\t addition");
            for (int randomNumberPrinted = 0; randomNumberPrinted < repeats; randomNumberPrinted++) {
                numberMasher(highestnumber, usingPokeList);
            }

        } finally {
            input.close();
        }
    }


    private static void numberMasher(int higest, boolean usingPokeList) {

        int firstNumber = 0;
        int secondNumber = 0;
        while (firstNumber == secondNumber) {
            firstNumber = randomNumber(higest);
            secondNumber = randomNumber(higest);
        }
        if (usingPokeList) {
            System.out.println(pokemonInList(firstNumber) +"("+ firstNumber+")\t-\t" + pokemonInList( secondNumber)+" ("+secondNumber+")");
        } else {
            System.out.println(firstNumber + "\t\t-\t\t" + secondNumber);
        }
    }

    private static int randomNumber(int higest) {
        //rand.nextInt((max - min) + 1) + min;
        return (new Random().nextInt(higest)) + 1;
    }

    private static String pokemonInList(int number) {
        String[] listingPokemons = pokemonList();

        if (number <= listingPokemons.length && number > 0) {
            return listingPokemons[number - 1];
        }

        return "Unknown";
    }

    private static String[] pokemonList() {
        String[] pokemonListing = {
                "Bulbasaur",
                "Ivysaur",
                "Venusaur",
                "Charmander",
                "Charmeleon",
                "Charizard",
                "Squirtle",
                "Wartortle",
                "Blastoise",
                "Caterpie",
                "Metapod",
                "Butterfree",
                "Weedle",
                "Kakuna",
                "Beedrill",
                "Pidgey",
                "Pidgeotto",
                "Pidgeot",
                "Rattata",
                "Raticate",
                "Spearow",
                "Fearow",
                "Ekans",
                "Arbok",
                "Pikachu",
                "Raichu",
                "Sandshrew",
                "Sandslash",
                "Nidoran",
                "Nidorina",
                "Nidoqueen",
                "Nidoran",
                "Nidorino",
                "Nidoking",
                "Clefairy",
                "Clefable",
                "Vulpix",
                "Ninetales",
                "Jigglypuff",
                "Wigglytuff",
                "Zubat",
                "Golbat",
                "Oddish",
                "Gloom",
                "Vileplume",
                "Paras",
                "Parasect",
                "Venonat",
                "Venomoth",
                "Diglett",
                "Dugtrio",
                "Meowth",
                "Persian",
                "Psyduck",
                "Golduck",
                "Mankey",
                "Primeape",
                "Growlithe",
                "Arcanine",
                "Poliwag",
                "Poliwhirl",
                "Poliwrath",
                "Abra",
                "Kadabra",
                "Alakazam",
                "Machop",
                "Machoke",
                "Machamp",
                "Bellsprout",
                "Weepinbell",
                "Victreebel",
                "Tentacool",
                "Tentacruel",
                "Geodude",
                "Graveler",
                "Golem",
                "Ponyta",
                "Rapidash",
                "Slowpoke",
                "Slowbro",
                "Magnemite",
                "Magneton",
                "elektrisch",
                "Farfetch'd",
                "Doduo",
                "Dodrio",
                "Seel",
                "Dewgong",
                "Grimer",
                "Muk",
                "Shellder",
                "Cloyster",
                "Gastly",
                "Haunter",
                "Gengar",
                "Onix",
                "Drowzee",
                "Hypno",
                "Krabby",
                "Kingler",
                "Voltorb",
                "Electrode",
                "Exeggcute",
                "Exeggutor",
                "Cubone",
                "Marowak",
                "Hitmonlee",
                "Hitmonchan",
                "Lickitung",
                "Koffing",
                "Weezing",
                "Rhyhorn",
                "Rhydon",
                "Chansey",
                "Tangela",
                "Kangaskhan",
                "Horsea",
                "Seadra",
                "Goldeen",
                "Seaking",
                "Staryu",
                "Starmie",
                "Mr Mime",
                "Scyther",
                "Jynx",
                "Electabuzz",
                "Magmar",
                "Pinsir",
                "Tauros",
                "Magikarp",
                "Gyarados",
                "Lapras",
                "Ditto",
                "Eevee",
                "Vaporeon",
                "Jolteon",
                "Flareon",
                "Porygon",
                "Omanyte",
                "Omastar",
                "Kabuto",
                "Kabutops",
                "Aerodactyl",
                "Snorlax",
                "Articuno",
                "Zapdos",
                "Moltres",
                "Dratini",
                "Dragonair",
                "Dragonite",
                "Mewtwo",
                "Mew"
        };
        return pokemonListing;
    }


}
