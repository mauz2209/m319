# Aufgabe – Körner-Haufen umkehren

Vor dem Hamster liegen mehrere Körner-Haufen.

![Territorium Körner-Haufen umkehren](../../../../../img/030-090-02-koerner-haufen-umkehren-ter.png)

Der Hamster soll die Körner auf jedem Feld aufnehmen und zählen.

Die Anzahl Körner jedes Haufens soll er in einem `int`-Array speichern.

Danach soll er die Körner-Haufen in **umgekehrter Reihenfolge** wieder aufbauen.

Aus

~~~text
1   0   4   0   6   9   0   3
~~~

wird beispielsweise

~~~text
3   0   9   6   0   4   0   1
~~~

## Lernziel

Ich kann die Anzahl Körner mehrerer Haufen in einem `int`-Array speichern und mit den Indizes in umgekehrter Reihenfolge auf die gespeicherten Werte zugreifen.

## Auftrag

1. Erstelle den Ordner `030-090-02-koerner-haufen-umkehren` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Erstelle ein `int`-Array für die fünf Körner-Haufen.
4. Gehe von Feld zu Feld.
5. Nimm auf jedem Feld alle Körner auf und zähle sie.
6. Speichere die Anzahl Körner im entsprechenden Element des Arrays.
7. Verwende eine `for`-Schleife und ihren Zähler als Index des Arrays.
8. Drehe am Ende der Strecke um.
9. Gehe auf dem Rückweg wieder von Feld zu Feld.
10. Greife jetzt in **umgekehrter Reihenfolge** auf die Elemente des Arrays zu.
11. Baue mit den gespeicherten Werten die Körner-Haufen wieder auf.
12. Teste dein Programm mit anderen Grössen der Körner-Haufen.

Dein Programm ist fertig, wenn die Reihenfolge der Körner-Haufen gegenüber dem Anfang umgekehrt ist.

Die Lösung soll weiterhin funktionieren, wenn die Anzahl Körner in den einzelnen Haufen verändert wird.