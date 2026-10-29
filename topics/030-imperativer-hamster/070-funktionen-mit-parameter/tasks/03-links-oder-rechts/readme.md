# Aufgabe – Links oder rechts

Der Hamster muss mehrere Hindernisse umgehen.

![Territorium Links oder rechts](../../../../../img/030-070-03-links-oder-rechts-ter.png)

Ein Korn vor einem Hindernis gibt die Richtung vor.

Liegt ein Korn da, soll der Hamster das Hindernis **links** umgehen.

Liegt kein Korn da, soll er das Hindernis **rechts** umgehen.

Für beide Möglichkeiten soll dieselbe Funktion verwendet werden.

## Lernziel

Ich kann eine Funktion mit einem `boolean`-Parameter definieren und beim Aufruf mit einem `boolean`-Argument bestimmen, ob der Hamster ein Hindernis links oder rechts umgeht.

## Auftrag

1. Erstelle den Ordner `030-070-03-links-oder-rechts` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Erstelle eine Funktion `umgehe(boolean links)`.
4. Der Parameter `links` bestimmt, auf welcher Seite der Hamster das Hindernis umgeht.
5. Bei `true` soll der Hamster das Hindernis links umgehen.
6. Bei `false` soll der Hamster das Hindernis rechts umgehen.
7. Prüfe vor jedem Hindernis mit `kornDa()`, auf welcher Seite der Hamster vorbeigehen soll.
8. Rufe `umgehe()` mit dem passenden Argument auf.
9. Verwende für beide Richtungen dieselbe Funktion `umgehe()`.
10. Nimm die Körner nicht auf.
11. Teste dein Programm im Hamster-Simulator.

Dein Programm ist fertig, wenn der Hamster alle Hindernisse auf der vorgegebenen Seite umgangen hat.

Die Funktion `umgehe(boolean links)` darf nur einmal definiert werden.