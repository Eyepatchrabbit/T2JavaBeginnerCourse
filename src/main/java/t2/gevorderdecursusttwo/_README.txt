For the gevorderde cursus
=========================
Lesson 1
--------
!zie ook terug cursusboek 1 =>overerving en zo staat hier in!
=>refresh of previous course!

when use static in method -> niet in eidere instantie -> slechts 1 x bestaan!

classes kunnen niets van

(try and be more entousiastic! -> you are doing this to get ahead in workplace && life)

* Overerving:
    -> hergebruiken van elementen
    -> unieke + gemeenschappelijke kenmerken
    -> maak 1 classe waar je alle code in gaat steken -> niet steeds hetzelfde opnieuw schrijven.
    -> overerven variabelen && methoden
    -> @Override op methoden
    ->voor classe zet "extend"

    ! ieder object erft over van Object classe!


            | eigen | package  |  sub klasse | andere module
private     |   v
 - (pakage) |   v       v
 protected  |   v       v              v
 public     |   v       v              v            v

 (?)=>why in shapeMain no need to import the other classes ->look into  this

constructors:
->moet dan meegegeven worden aan andere

!kunnen sp elementen verplict maken dat iedere subclasse zijn eigen  methode toe te voegen -> door maken abstract
    ->hierbinnen aanduiden abstract

waarom extenden klassen -> onder zelfde noemer groeperen
    ->in zelfde lijst/array steken omdat ze dezelfde klasse extenden !

     ook kunnen we iets als Shape circle = new Circle();
     MAAR NIET Circle circle= new Shape();


Lesson 2
--------
Wanneer abstracte klasse gebruiken:
-Meerdere klassen met gemeenschappelijke klasse en 1 verschllend
-

Nadeel:
-kunnen enkel van 1 klasse Extenden
-niet geschikt voor werken met derde partijen
-moeilijk combineerbaar met populaire frameworks

    =>oplossing gebruik maken interfaces
        ->elke methode abstract
        ->mogelijk om multiple interfaces te implementeren
        =>gebruikt 'implements'

Exception handeling
    -> applicatie stopt (vb: delen door 0)
       ->kunnen fout opvangen en zorgen dat iets nieuws kan worden ingevoerd/uitgevoerd

        ->kunnen zien wat we doen met specifieke errors

Lesson 3
--------
2soorten exceptions:
    -checked exceptions:
        ->verplicht op te vangen->anders compilatiefout
        =>gebruik wanneer hoge kans om een fout in te geven
    -runtime exception: (unchecked exception)
        -niet verplicht om op te vangen (zoals michmatch exception)
        ->omdat niet altijd zeker kan zijn wat een gebruiker zal ingeven! =>weet niet altijd dat deze effectief can gebeuren

We kunnen zelf exceptions gooien met "throw" keyword

doorgooien
    ->als tussenpartij zijn best fouten van andere partij doorgeven naar groter geheel
    =>meestal de meest logische keuze
      ->"throws" gebruiken
        ->enkel bruikbaar op methodes!

Kunnen zelf ook een exception aanmaken
    ->java klasse die extend van exception of klasse die zelf van exception extends

    als zelfgemaakte exception van Runtimeexception extends->niet nodig door te geven!

Lesson 4
--------
Generieken->gebruikt als we op voorhand niet weten met wat we te maken gaan hebben
    vb: list->gaan we specifieren wat we er gaan inzetten
    ->ook bij het uitsuren van vb json data->hier hervormen van de data naar een Object waar je mee kunyt gaan werken in code

    =>klasse die intern een bepaald type gebruikt, dat pas bekend wordt wanneer men een instantie maakt van deze klasse

/!\ mogelijk om meerdere genrieken te definieren ->order T, S,U,V,W,...

kunnen ook per methode apart defieneren
    ->anders voor ieder type een klasse maken


(-)=>soms zijn generieken te generiek!!
    ->dus moeten ietswat richtlijnen geven
        ->regels opleggen!

    <T Extends Animal>  ->Animal of iets dat er van overerft (elke subklasse)
    <T super Animal>    ->Animal of superklasse (Object)

Lesson 5
--------
JavaDock ->maken van documentatie

    //commentaar op 1 regel
    /* ... */ =  commentaar multiline
    /** ...*/ = documentatie

    !code moet leesbaar zijn!
        ->duidelijke naamgeving
        ->code als "levende documentatie"!

    Moet niet het enige zijn om de code te begrijpen
        ->beter goede code zonder veel doc dan slechte code met veel documentatie

Lezen en schrijven =>i/O operaties
    wegschrijven -> data en configuratie!

    path -> waar bestand terugvinden



Lesson 6
--------
Lambda's
    syntax:
        (variabelennaam)    -> variabelenaam.doSomething();
        formele parameters -> inhoud
        vb: String s ->s.contains("s")

    indien geen parameters: () =>ronde haken!

    indien meerdere lijnen => {}

    veelgebruikte functioneme interfaces die al bestaan:
        Predicate<T>
            public boolean test(T t) ->voor decreet datatype

        Function<T,R>
            public R apply (T t)
                ->omvorming

        Consumer<T>
            ->voor aanpassingen (in "foreach" part of the stream)





Lesson 7
--------
Streams
    ->interne iteratie!
        ->over alle elementen lopen
        ->enkel behandeling van de elementen (lus voor u afgehandeld)

        vb: source->iterator->stream ->{operatie op elk element}->stream->{terminal operation}


        alles op een stream kan ook op een List gedaan worden
            (niet een array!!!!->dan Arrays.stream(array) nodig

        Stream<T> =>99% gebruikt (de generieken)
        IntStream, LongStream, DoubleStream -> gebruikt als er een som of iets dergelijks nodig is

    2 soorten bewerkingen;
        -eindbewerkingen    ->sluit stream af
            RESULTATEN:
                -niets->consumerend bewerking, void
                -enkel->reducerend bewerking => omvorming, zoals som (bijna nooit gebruikt)
                -nieuwe verzameling->collecterende bewerking ->"collect()" methode ->meest voorkomende!
        -Tussenbewerkingen

Lesson 8
--------

Lesson 9
--------

Lesson 10
---------

Following dates:
================
(from cusrust.synt side)
4)  16-11-2019 09:00
3)  23-11-2019 09:00
2)  30-11-2019 09:00
x
1)  14-12-2019 09:00

Onderdelen te zien:
===================
Programma
- Het opsommingstype =>enumeraties
- Eenvoudige klassen
- Interfaces
- Geneste en anonieme klassen
- Lamba expressions
- Exception handling
- Javadoc
- Generieken
- Collections
- Lezen en schrijven
- Systeembronnen gebruiken


nice :https://stackoverflow.com/questions/184618/what-is-the-best-comment-in-source-code-you-have-ever-encountered