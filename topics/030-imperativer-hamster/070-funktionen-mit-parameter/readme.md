# Funktionen mit Parametern

Bisher haben wir eigene Funktionen ohne Parameter verwendet.

Zum Beispiel:

~~~java
void rechtsUm() {
    linksUm();
    linksUm();
    linksUm();
}
~~~

Diese Funktion führt immer genau denselben Ablauf aus.

Manchmal soll eine Funktion aber mit unterschiedlichen Werten arbeiten.

Dafür verwenden wir **Parameter**.

## Warum Parameter?

Ohne Parameter könnten wir für verschiedene Anzahlen eigene Funktionen schreiben.

Zum Beispiel:

~~~java
void geheDreiSchritte() {
    vor();
    vor();
    vor();
}

void geheFuenfSchritte() {
    vor();
    vor();
    vor();
    vor();
    vor();
}
~~~

Das funktioniert.

Der Code ist aber schlecht wiederverwendbar.

Besser ist eine Funktion, welche die Anzahl Schritte erhält:

~~~java
void gehe(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        vor();
    }
}
~~~

Jetzt können wir dieselbe Funktion für unterschiedliche Anzahlen verwenden.

~~~java
gehe(3);
gehe(5);
gehe(10);
~~~

Die Funktion `gehe()` ist dadurch wiederverwendbar.

## Parameter

Ein **Parameter** gehört zur Definition einer Funktion.

Im folgenden Beispiel ist `anzahl` ein Parameter:

~~~java
void gehe(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        vor();
    }
}
~~~

Der Parameter besteht aus:

- dem Datentyp `int`
- dem Namen `anzahl`

Der Parameter beschreibt, welchen Wert die Funktion beim Aufruf erwartet.

## Argument

Ein **Argument** steht beim Aufruf einer Funktion.

Zum Beispiel:

~~~java
gehe(5);
~~~

Die Zahl `5` ist das Argument.

Das Argument wird beim Aufruf an den Parameter übergeben.

Man kann sich das so vorstellen:

~~~text
Argument 5  --->  Parameter anzahl
~~~

Innerhalb der Funktion hat `anzahl` dann den Wert `5`.

## Parameter und Argument unterscheiden

Diese beiden Begriffe sind wichtig.

Bei der Funktionsdefinition:

~~~java
void gehe(int anzahl) {
    ...
}
~~~

ist `anzahl` der **Parameter**.

Beim Funktionsaufruf:

~~~java
gehe(7);
~~~

ist `7` das **Argument**.

Merksatz:

> Der Parameter steht in der Definition der Funktion.

> Das Argument steht beim Aufruf der Funktion.

## Argumente können Variablen sein

Ein Argument muss keine feste Zahl sein.

Wir können auch eine Variable übergeben:

~~~java
int schritte = 6;

gehe(schritte);
~~~

Beim Aufruf enthält `schritte` den Wert `6`.

Dieser Wert wird an den Parameter `anzahl` übergeben.

## Mehrere Parameter

Eine Funktion kann mehrere Parameter haben.

Zum Beispiel:

~~~java
void legeKoerner(int anzahl, boolean danachVor) {
    for (int i = 0; i < anzahl; i++) {
        gib();
    }

    if (danachVor) {
        vor();
    }
}
~~~

Diese Funktion hat zwei Parameter:

- `anzahl` vom Typ `int`
- `danachVor` vom Typ `boolean`

Ein möglicher Aufruf ist:

~~~java
legeKoerner(3, true);
~~~

Hier sind:

- `3` das erste Argument
- `true` das zweite Argument

Die Reihenfolge der Argumente muss zur Reihenfolge der Parameter passen.

## Parameter vom Typ `int`

Mit einem `int`-Parameter können wir beispielsweise eine Anzahl übergeben.

~~~java
void gehe(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        vor();
    }
}
~~~

Oder wir bestimmen, wie viele Körner abgelegt werden:

~~~java
void gibKoerner(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        gib();
    }
}
~~~

## Parameter vom Typ `boolean`

Mit einem `boolean`-Parameter können wir zwischen zwei Verhaltensweisen wählen.

~~~java
void drehe(boolean nachLinks) {
    if (nachLinks) {
        linksUm();
    } else {
        linksUm();
        linksUm();
        linksUm();
    }
}
~~~

Zum Beispiel:

~~~java
drehe(true);
drehe(false);
~~~

Beim ersten Aufruf dreht sich der Hamster nach links.

Beim zweiten Aufruf dreht er sich nach rechts.

## Wiederverwendbarkeit

Der grosse Vorteil von Parametern ist die Wiederverwendbarkeit.

Diese Funktion:

~~~java
void gehe(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        vor();
    }
}
~~~

kann an vielen Stellen verwendet werden:

~~~java
gehe(2);
linksUm();

gehe(6);
rechtsUm();

gehe(4);
~~~

Wir müssen nicht für jede Anzahl eine neue Funktion schreiben.

Die Funktion beschreibt **was** gemacht wird.

Das Argument bestimmt **mit welchem Wert** die Funktion arbeitet.

# Aufgaben

1. [Gehe eine bestimmte Anzahl Schritte](tasks/01-gehe-schritte/readme.md)
2. [Baue Körner-Haufen](tasks/02-baue-koerner-haufen/readme.md)
3. [Links oder rechts](tasks/03-links-oder-rechts/readme.md)