# Aufgabe – Finde den grössten Haufen

Auf mehreren Feldern liegen unterschiedlich viele Körner.

![Territorium Grösster Haufen](../../../../../img/030-080-03-groesster-haufen-ter.png)

Der Hamster soll herausfinden, auf welchem Feld der grösste Körner-Haufen liegt.

Dazu soll eine Funktion die Körner auf einem Feld zählen und die Anzahl zurückgeben.

Eine weitere Funktion soll zwei Anzahlen vergleichen und die grössere Anzahl zurückgeben.

## Lernziel

Ich kann Funktionen mit dem Rückgabetyp `int` erstellen und ihre Rückgabewerte verwenden, um mehrere Körner-Haufen zu zählen und die grösste Anzahl zu bestimmen.

## Auftrag

1. Erstelle den Ordner `030-080-03-groesster-haufen` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Erstelle eine Funktion `int zaehleHaufen()`.
4. Die Funktion soll alle Körner auf dem aktuellen Feld aufnehmen und zählen.
5. Gib die gezählte Anzahl mit `return` zurück.
6. Erstelle eine Funktion `int maximum(int a, int b)`.
7. Die Funktion `maximum()` soll die beiden Parameter vergleichen und den grösseren Wert zurückgeben.
8. Gehe nacheinander zu allen Körner-Haufen.
9. Verwende `zaehleHaufen()`, um die Grösse jedes Haufens zu bestimmen.
10. Verwende `maximum()`, um die bisher grösste Anzahl zu bestimmen.
11. Speichere das aktuelle Maximum in einer Variable.
12. Teste dein Programm mit unterschiedlichen Anzahlen Körner.

Dein Programm ist fertig, wenn der Hamster alle Haufen gezählt hat und die Variable für das Maximum die Anzahl Körner des grössten Haufens enthält.

Das Programm soll auch funktionieren, wenn die Anzahl Körner in den einzelnen Haufen verändert wird.