# Aufgabe – Lokale und globale Variablen

Der Hamster soll mehrere Körner-Haufen nacheinander zählen.

Dabei sollst du untersuchen, wo eine Variable im Programm verwendet werden kann.

## Lernziel

Ich kann anhand eines Hamster-Programms lokale und globale Variablen unterscheiden und Variablen so deklarieren, dass ihr Gültigkeitsbereich zur Aufgabe passt.

## Auftrag

1. Erstelle den Ordner `030-050-06-lokale-und-globale-variablen` im Ordner `/hamster-sim/Programme`.
2. Erstelle ein einfaches Territorium mit mehreren Körner-Haufen.
3. Erstelle eine globale Variable `int gesamtKoerner`.
4. Erstelle eine Funktion `zaehleHaufen()`.
5. Verwende in `zaehleHaufen()` eine lokale Variable `int anzahl`.
6. Zähle mit `anzahl` die Körner des aktuellen Haufens.
7. Addiere für jedes aufgenommene Korn `1` zu `gesamtKoerner`.
8. Rufe `zaehleHaufen()` für mehrere Körner-Haufen auf.
9. Versuche nach dem Aufruf von `zaehleHaufen()` in `main()` auf die Variable `anzahl` zuzugreifen.
10. Erkläre als Kommentar im Programm, warum dieser Zugriff nicht funktioniert.
11. Verwende nach dem Zählen die globale Variable `gesamtKoerner`.
12. Teste dein Programm im Hamster-Simulator.

## Lokale Variable

Die Variable `anzahl` wird innerhalb von `zaehleHaufen()` deklariert.

~~~java
void zaehleHaufen() {
    int anzahl = 0;

    while (kornDa()) {
        nimm();
        anzahl = anzahl + 1;
    }
}
~~~

Sie ist **lokal**.

Sie kann nur innerhalb ihres Gültigkeitsbereichs verwendet werden.

## Globale Variable

Die Variable `gesamtKoerner` wird ausserhalb der Funktionen deklariert.

~~~java
int gesamtKoerner = 0;

void zaehleHaufen() {
    // ...
}

void main() {
    // ...
}
~~~

Sie ist **global**.

Mehrere Funktionen können auf diese Variable zugreifen.

## Wichtig

Verwende eine Variable nicht automatisch global, nur weil dies möglich ist.

Eine Variable soll nur dort sichtbar sein, wo sie benötigt wird.

Deine Aufgabe ist fertig, wenn du im Programm eine lokale und eine globale Variable sinnvoll verwendest und den Unterschied zwischen ihren Gültigkeitsbereichen erklären kannst.