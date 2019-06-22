! code gescreven door leraar. Werd gewoon bekeken en besproken hoe werkte

Doel van het spel
Minesweeper (oftewel mijnenveger) is een strategisch spel waarbij het de bedoeling is om alle
bommen in het raster bloot te leggen, zonder ze aan te raken. De bedoeling is om alle vakjes in het
raster om te draaien, buiten die waar een bom zit. Indien je hierin slaagt win je het spel. Draai je
toch een vakje om waar een bom achter verstopt zit, dan verlies je automatisch het spel.
Werking van het spel
Het raster is een vierkant van 8x8 vakjes, in totaal 64. In deze 64 vakjes zitten er 10 bommen
verstopt op willekeurige plaatsen. Wanneer het spel start zal er worden gevraag om een coördinaat
in te geven, door eerst de X (1 – 8) en dan de Y (1 – 8) in te geven. De 1,1 positie is het vakje
linksboven in het raster, de 8, 8 rechtsonder.
Als men een vakje omdraait waar geen bom in zit, krijgt men een getal te zien in dit vakje. Dit getal
staat gelijk met het aantal bommen dat tegen het omgedraaide vakje zitten. Het potentieel hoogste
getal is 8, omdat een vakje omringd wordt door maximaal 8 andere vakjes (NO, N, NW, O, W, ZO, Z,
ZW).
Wanneer men een vakje omdraait waarin geen enkele “buur” een bom bevat wordt 0 in het vakje
gezet en worden er ook andere vakjes omgedraaid, tot dat er een vakje is dat door minstens 1 bom
wordt aangeraakt. Bijvoorbeeld, ik heb het vakje 1, 1 omgedraaid en dit is het resultaat:
0 0 1
0 0 2
1 1
Als alle vakjes zijn omgedraaid, behalve die waar een bom zit, dan win je het spel. In totaal moet je
hiervoor dus 54 vakjes hebben omgedraaid.
Raak je een bom aan door een vakje om te draaien waar een bom achter zit, verlies je het spel.
Nadat het spel gedaan is door winst of verlies heb je de mogelijkheid om een nieuw spel te spelen.