Doel van het spel
=================
Presidenten is een kaartspel waarbij het de bedoeling is altijd een hogere kaart op te leggen tot je
niet meer kan. Alle kaarten worden verdeeld onder de spelers. De speler die klaveren 2 heeft mag
uitkomen met deze kaart. De volgende speler legt een kaart op die hoger is of gelijk aan 2, de
volgende speler een kaart die hoger is of gelijk aan de kaart die de vorige speler heeft opgelegd, …
Als je geen hogere of gelijkwaardige kaart meer kan opleggen (geen hogere of gelijkwaardige kaart
in je handen, of de aas is gespeeld), dan moet je passen. Als een speler de aas speelt of de rest past
op een andere kaart heb je de ronde gewonnen en mag je weer uitkomen met een lage kaart. De
bedoeling is om zo snel mogelijk van al je kaarten af te raken. Het spel stopt ook nadat er een speler
geen kaarten meer heeft.
De speler kan altijd een nieuw spel starten.


Regels van het spel
====================
• Het aantal kaarten wordt eerlijk verdeeld over het aantal spelers dat meedoen. Indien er bv
5 spelers zijn, dan krijgen 3 spelers 10 kaarten en 2 spelers 11 kaarten. Dit kan zowel een
voordeel als een nadeel zijn.
• In tegenstelling tot de normale presidentregels, mag je hier ten alle tijden maar 1 kaart
tegelijk opleggen.


Functionele analyse
===================
Wanneer het spel start wordt aan de gebruiker gevraagd om aan te geven met hoeveel personen het
spel wordt gespeeld, hijzelf inclusief. Iedere speler krijgt een ID toegewezen, waarbij de menselijke
speler ID 1 krijgt. Hij is dus altijd speler 1. Hierna krijgt elke speler een evenredig aantal kaarten,
maar alle 52 kaarten moeten wel worden uitgedeeld. De eerste speler die een kaart krijgt is speler 1.
Bijvoorbeeld, speler 1 heeft 11 kaarten, speler 2 heeft 11 kaarten, speler 3 heeft 10 kaarten, speler 4
heeft 10 kaart en speler 5 heeft 10 kaarten.
De kaarten hebben een waarde van 2 tot en met 14, waarbij 11 de boer is, 12 de dam 13 de koning
en 14 de aas.
De speler met de klaveren 2 mag deze kaart als eerste leggen. Zolang het spel niet gedaan is zal er
altijd naar de volgende speler worden gedaan.
De volgende speler is altijd de speler met het ID gelijk aan die van de vorige speler + 1. Als de ID van
de vorige speler gelijk is aan het aantal spelers is de volgende speler terug speler 1. Als de huidige
speler niet de menselijke speler is, zal altijd de laagste mogelijke kaart worden gespeeld. Wanneer
de menselijke speler aan beurt is zal hij te zien krijgen welke kaarten hij nog in zijn handen heeft om
daarna een keuze te maken welke kaart hij zal spelen.

De speler geeft dan gewoon het getal in van de kaart die hij wil spelen.

Dit kan potentieel niet de laagste kaart zijn. De menselijke speler is dus de
enige speler die niet altijd de laagst mogelijke kaart hoeft te leggen.
Als een speler niet kan volgen (wanneer hij geen kaart heeft die gelijk aan of groter is dan de laatst
opgelegde kaart) zal de speler automatisch passen en zal er worden overgegaan naar de volgende
speler. Er zal geen rekening worden gehouden met een speler die heeft gepast in de huidige ronde.
Pas wanneer een nieuwe ronde start kan een speler die heeft gepast weer meespelen. De menselijke
speler kan ook manueel passen door -1 in te geven als er aan hem wordt gevraagd een kaart te
leggen. Indien de menselijke speler geen kaart kan leggen geldt dezelfde regel als voor alle andere
spelers, dat er automatisch wordt gepast.


Een nieuwe ronde begint wanneer alle spelers, buiten de speler die de laatste kaart heeft gelegd,
passen, of wanneer er een aas wordt gespeeld. De speler die mag uitkomen in de nieuwe ronde is de
laatste speler die een kaart heeft gelegd.
Het spel is gedaan wanneer er een speler is die geen kaarten meer heeft. Druk een tekst af met de
speler die heeft gewonnen. Vraag hierna of de menselijke speler nog eens opnieuw wil spelen. Hij zal
terug het aantal spelers moeten ingeven.