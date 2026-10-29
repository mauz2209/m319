# Aufgabe – Gerade oder ungerade

Auf dem Startfeld des Hamsters liegt eine unbekannte Anzahl Körner.

![Territorium Gerade oder ungerade](../../../../../img/030-080-02-gerade-oder-ungerade-ter.png)

Der Hamster soll alle Körner aufnehmen und zählen.

Danach soll eine Funktion mit Rückgabewert bestimmen, ob die Anzahl gerade ist.

Bei einer geraden Anzahl geht der Hamster nach Osten.

Bei einer ungeraden Anzahl geht er nach Westen.

## Lernziel

Ich kann eine Funktion mit dem Rückgabetyp `boolean` erstellen, die mit `return` zurückgibt, ob eine übergebene Anzahl gerade ist, und diesen Rückgabewert für eine Entscheidung verwenden.

## Auftrag

1. Erstelle den Ordner `030-080-02-gerade-oder-ungerade` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Nimm alle Körner auf dem Startfeld auf und zähle sie.
4. Speichere die Anzahl Körner in einer Variable.
5. Erstelle die Funktion `boolean istGerade(int anzahl)`.
6. Der Parameter `anzahl` enthält die zu prüfende Anzahl.
7. Die Funktion soll `true` zurückgeben, wenn die Anzahl gerade ist.
8. Die Funktion soll `false` zurückgeben, wenn die Anzahl ungerade ist.
9. Verwende den Rückgabewert von `istGerade()` als Bedingung für eine Entscheidung.
10. Bei einer geraden Anzahl soll der Hamster nach Osten gehen.
11. Bei einer ungeraden Anzahl soll der Hamster nach Westen gehen.
12. Lege am Ziel alle eingesammelten Körner ab.
13. Teste dein Programm mit einer geraden und mit einer ungeraden Anzahl Körner.

Dein Programm ist fertig, wenn `istGerade()` einen `boolean`-Wert zurückgibt und der Hamster abhängig davon die Körner auf der richtigen Seite ablegt.