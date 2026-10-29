# Aufgabe – Körner-Haufen merken

Vor dem Hamster liegen mehrere Körner-Haufen.

![Territorium Körner-Haufen merken](../../../../../img/030-090-01-koerner-haufen-merken-ter.png)

Der Hamster soll die Körner auf jedem Feld aufnehmen und zählen.

Die Anzahl Körner jedes Haufens soll er in einem `int`-Array speichern.

Anschliessend dreht der Hamster um.

Auf dem Rückweg baut er die Körner-Haufen wieder auf.

## Lernziel

Ich kann die Anzahl Körner mehrerer Haufen in einem `int`-Array speichern und die gespeicherten Werte später über ihren Index wieder verwenden, um die Haufen erneut aufzubauen.

## Auftrag

1. Erstelle den Ordner `030-090-01-koerner-haufen-merken` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Erstelle ein `int`-Array für die fünf Körner-Haufen.
4. Gehe von Feld zu Feld.
5. Nimm auf jedem Feld alle Körner auf und zähle sie.
6. Speichere die Anzahl Körner im entsprechenden Element des Arrays.
7. Verwende eine `for`-Schleife und ihren Zähler als Index des Arrays.
8. Drehe am Ende der Strecke um.
9. Gehe auf dem Rückweg wieder von Feld zu Feld.
10. Lies für jedes Feld die gespeicherte Anzahl aus dem Array.
11. Lege auf jedem Feld wieder die ursprüngliche Anzahl Körner ab.
12. Teste dein Programm mit anderen Grössen der Körner-Haufen.

Dein Programm ist fertig, wenn nach dem Hin- und Rückweg auf jedem Feld wieder gleich viele Körner liegen wie zu Beginn.

Die fünf Anzahlen sollen während des Hinwegs in einem einzigen `int`-Array gespeichert werden.