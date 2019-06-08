For the beginnercourse
======================
Lesson 1
--------
=>using jdk 8 (java SE Development kit 8)
=>ide used: Intellij

"static"->geen object nodig (meer hierover later!)
"void": returns niets, na lopen instructies kun je gewoon stoppen. In ander geval geef je iets terug (als int, String, ...)

Variablele
    -> 3 kenmerken: type naam en bereik (scope)
    =>best 1 variabele per lijn declareren

    char ->enkel '' ! (single quotes)
    String -> double "" !

    Primitive types != objecten
    reference types = ref nr objecten ->weggeschreven naar ram geheugen

    neem naam die iets nuttigs zegt


operatoren;

    delen: / => delen van de waarden
    rest: % => restwaarde na absolute deling

    voor het hebben van kommagetallen iets doen in vorm van "7 / 2.0" => zal gebruik dan moeten maken van double (of float)

    getal++ =>verhogen met 1
    getal++ =>verlagen met 1
    -getal => negatieve getal nemen
    +getal => byte/short/char neer int zetten


LESSON 02:
==========

/!\ DON'T FORGET TO CLOSE ELEMENTS LIKE THE SCANNER /!\ -> resourses use!!!!!

!!Don't think you know everything kid!!

=> Learn to research for possible solutions!->read online documentations

relationele operatoren->return booleans (>,>=,<,<=,==, !=)
    !there is an order in which the statements are done (or not done)
        && -> both need to be true
        || -> one needs to be true (mac->shift+alt+l)

        order-> brackets (), and && , or ||
        Always try to make it as simple as possible

Shortcut operators: +=, -=, *=, /=


Exercises for home!


LESSON 03:
==========
=>conditionals


LESSON 04:
==========
=>iterate
    lus voortijdig breken=> "break;"

Object oriented programmming
    scope
        private -> enkel binnen eigen class
            ->best practice->afsherming data
        public -> iedere classe in program kunnen het gebruiken
        protected
        package-private
    constructur => verplicht in te vullen
    methode     -> optionele properties

    groepeer logisherwijs om code te kunnen gaan herbruiken






LESON06
=======
    static methods
        => dont need an object first
        ->are inherent to the class themself
    non static methods
        =>do need an object to be initiated before it can be used
        ->doing something with the elements created in the object self


met objecten->verwijzing object in ramgeheugen
    dus object1 == object2 is altijd vals (tenzij object1 = object2)

    om toch iets te hebben om te vergelijken => .equals
        ->overerfd van de object methode!

ARRAYS
    ->verzameling van objecten (van hetzelfde type)
    =>lijst objecten met bepaalde volgorde
    ! heeft bepaalde grootte



LES07
=====
Array->altijd vaste grote
    1e element = 0

    !kan een 2D array maken!=>niet aangeraden

alternatief: List
    ArrayList!
        ->enkel werken met objecten!
        =>werkt niet met primitieve datatypes :<
            oplossing=>use elements like 'Integer' in plaats van 'int'
           ook meer functionaliteit
           kan gesorteerd worden

JDK =bekijken van enkele veel gebruikte klassen
    String
        -> meest gebruikte
        -> immutable: blijft altijd hetzelfde->eigen waarde nooit zelf gaan aanpassen!
    Math
        ->ook altijd geimporteerd


LES 08
======


Nog te gaan:
============
9)  15-6-2019 09:00
10) 22-6-2019 09:00

