# Aufgabe – Gehe eine bestimmte Anzahl Schritte

Auf dem Startfeld des Hamsters liegt eine unbekannte Anzahl Körner.

![Territorium Gehe Schritte](../../../../../img/030-070-01-gehe-schritte-ter.png)

Der Hamster soll zuerst die Körner aufnehmen und zählen.

Danach soll er für jedes gezählte Korn genau einen Schritt vorwärtsgehen.

Für das Gehen sollst du eine wiederverwendbare Funktion mit einem Parameter erstellen.

## Lernziel

Ich kann eine Funktion mit einem `int`-Parameter definieren und beim Aufruf die gezählte Anzahl Körner als Argument übergeben, damit der Hamster eine bestimmte Anzahl Schritte geht.

## Auftrag

1. Erstelle den Ordner `030-070-01-gehe-schritte` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Nimm alle Körner auf dem Startfeld auf und zähle sie.
4. Speichere die Anzahl Körner in einer Variable.
5. Erstelle eine Funktion `gehe(int anzahl)`.
6. Der Parameter `anzahl` bestimmt, wie viele Schritte der Hamster geht.
7. Verwende in der Funktion eine `for`-Schleife.
8. Rufe `gehe()` in `main()` auf.
9. Übergib die Variable mit der gezählten Anzahl Körner als Argument.
10. Teste dein Programm mit unterschiedlichen Anzahlen Körner auf dem Startfeld.

Dein Programm ist fertig, wenn der Hamster für jedes Korn auf dem Startfeld genau einen Schritt vorwärtsgeht.

Die Funktion `gehe(int anzahl)` soll auch mit anderen Argumenten wiederverwendet werden können.