package t2.gevorderdecursusttwo.les07_streams.movies;

import java.util.Arrays;
import java.util.List;

public class MovieDatabase {

    public List<Movie> getMovies() {
        Movie joker = new Movie(1,
                "Joker",
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                8.5,
                456.653);
        Movie terminator = new Movie(2,
                "Terminator: Dark Fate",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her.",
                6.5,
                327.332);
        Movie lionKing = new Movie(3,
                "The Lion King",
                "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own.",
                7.1,
                205.572);
        Movie maleficent = new Movie(4,
                "Maleficent: Mistress of Evil",
                "Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they are pulled in different directions by impending nuptials, unexpected allies, and dark new forces at play.",
                7.2,
                197.485);
        Movie fastFurious = new Movie(5,
                "Fast & Furious Presents: Hobbs & Shaw",
                "Ever since US Diplomatic Security Service Agent Hobbs and lawless outcast Shaw first faced off, they just have swapped smacks and bad words. But when cyber-genetically enhanced anarchist Brixton's ruthless actions threaten the future of humanity, both join forces to defeat him.",
                6.5,
                168.459);
        Movie cars = new Movie(6,
                "Cars",
                "Lightning McQueen, a hotshot rookie race car driven to succeed, discovers that life is about the journey, not the finish line, when he finds himself unexpectedly detoured in the sleepy Route 66 town of Radiator Springs.",
                6.7,
                175.745);
        Movie onePiece = new Movie(7,
                "One Piece: Stampede",
                "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the \"One Piece\" TV series",
                7.4,
                155.195);
        Movie doctorSleep = new Movie(8,
                "Doctor Sleep",
                "A traumatized, alcoholic Dan Torrance meets Abra, a kid who also has the ability to \"shine.\" He tries to protect her from the True Knot, a cult whose goal is to feed off of people like them in order to remain immortal.",
                7,
                127.085);
        Movie theKing = new Movie(9,
                "The King",
                "England, 15th century. Hal, a capricious prince who lives among the populace far from court, is forced by circumstances to reluctantly accept the throne and become Henry V.",
                7.3,
                111.631);
        Movie aladdin = new Movie(10,
                "Aladdin",
                "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
                7.1,
                111.102);
        return Arrays.asList(joker, terminator, lionKing, maleficent, fastFurious, cars, onePiece, doctorSleep, theKing, aladdin);
    }

}