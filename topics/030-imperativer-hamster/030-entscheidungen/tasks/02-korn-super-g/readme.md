# Aufgabe – Korn-Super-G

Der Hamster fährt einen Super-G.

Wie beim Korn-Slalom muss er Hindernisse links oder rechts umfahren.

Die Hindernisse stehen diesmal in unterschiedlichen Abständen.

![Territorium Korn-Super-G](../../../../../img/030-030-02-korn-super-g-ter.png)

Der Hamster weiss nicht, wann das nächste Hindernis kommt.

Er muss deshalb mit `vornFrei()` selbst erkennen, ob er vor einem Hindernis steht.

Liegt vor einem Hindernis ein Korn, soll der Hamster das Hindernis **links** umgehen.

Liegt kein Korn vor dem Hindernis, soll der Hamster das Hindernis **rechts** umgehen.

## Lernziel

Ich kann mit `vornFrei()` erkennen, ob der Hamster vor einem Hindernis steht, und mit `if` und `else` abhängig von `kornDa()` entscheiden, auf welcher Seite er das Hindernis umgeht.

## Auftrag

1. Erstelle den Ordner `030-030-02-korn-super-g` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Programmiere den Hamster so, dass er die Strecke bis zum Ende durchläuft.
4. Der Hamster muss mit `vornFrei()` selbst erkennen, ob er vor einem Hindernis steht.
5. Ist das Feld vor ihm frei, soll er weiterfahren.
6. Steht er vor einem Hindernis, soll er mit `kornDa()` prüfen, auf welcher Seite er das Hindernis umgehen muss.
7. Liegt ein Korn da, soll er das Hindernis links umgehen.
8. Liegt kein Korn da, soll er das Hindernis rechts umgehen.
9. Verwende `if` und `else` für die Entscheidungen.
10. Verwende eigene Funktionen für wiederkehrende Bewegungsabläufe.
11. Teste dein Programm im Hamster-Simulator.

Dein Programm ist fertig, wenn der Hamster alle Hindernisse auf der richtigen Seite umgangen hat und das Ende der Strecke erreicht.