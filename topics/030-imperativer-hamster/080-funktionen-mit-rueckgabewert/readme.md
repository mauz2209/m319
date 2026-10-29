# Funktionen mit Rückgabewert

Bisher haben unsere eigenen Funktionen Befehle ausgeführt.

Zum Beispiel:

~~~java
void gehe(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        vor();
    }
}
~~~

Diese Funktion führt eine Aktion aus.

Sie gibt aber keinen Wert zurück.

Das erkennen wir am Rückgabetyp `void`.

## Was ist ein Rückgabewert?

Eine Funktion kann einen Wert berechnen und an die aufrufende Stelle zurückgeben.

Dafür verwenden wir statt `void` einen Datentyp.

Wir beschränken uns auf:

- `int`
- `boolean`

Zum Beispiel:

~~~java
int doppelt(int zahl) {
    return zahl * 2;
}
~~~

Die Funktion erhält einen Parameter vom Typ `int`.

Sie berechnet einen neuen Wert.

Mit `return` gibt sie diesen Wert zurück.

## Rückgabetyp

Vor dem Namen der Funktion steht der Rückgabetyp.

~~~java
int doppelt(int zahl)
~~~

`int` bedeutet:

> Diese Funktion gibt eine ganze Zahl zurück.

Bei einer Funktion mit einem Wahrheitswert sieht das so aus:

~~~java
boolean istGerade(int zahl) {
    return zahl % 2 == 0;
}
~~~

`boolean` bedeutet:

> Diese Funktion gibt `true` oder `false` zurück.

## `return`

Mit `return` wird der Wert zurückgegeben.

~~~java
int doppelt(int zahl) {
    return zahl * 2;
}
~~~

Beim Aufruf

~~~java
int ergebnis = doppelt(4);
~~~

passiert Folgendes:

1. Das Argument `4` wird an den Parameter `zahl` übergeben.
2. Die Funktion berechnet `4 * 2`.
3. `return` gibt den Wert `8` zurück.
4. Der Wert `8` wird in `ergebnis` gespeichert.

## Rückgabewert direkt verwenden

Ein Rückgabewert muss nicht immer zuerst in einer Variable gespeichert werden.

Zum Beispiel:

~~~java
if (istGerade(anzahl)) {
    vor();
}
~~~

Die Funktion `istGerade()` liefert `true` oder `false`.

Dieser Rückgabewert kann direkt als Bedingung verwendet werden.

## Funktion mit Rückgabewert vom Typ `int`

Eine Funktion kann beispielsweise Körner zählen.

~~~java
int zaehleKoerner() {
    int anzahl = 0;

    while (kornDa()) {
        nimm();
        anzahl = anzahl + 1;
    }

    return anzahl;
}
~~~

Der Aufruf kann so aussehen:

~~~java
int koerner = zaehleKoerner();
~~~

Die Funktion zählt die Körner.

Danach gibt sie die Anzahl zurück.

## Funktion mit Rückgabewert vom Typ `boolean`

Eine Funktion kann auch eine Frage beantworten.

Zum Beispiel:

~~~java
boolean istGerade(int zahl) {
    return zahl % 2 == 0;
}
~~~

Ein möglicher Aufruf:

~~~java
if (istGerade(6)) {
    vor();
}
~~~

Die Funktion liefert bei `6` den Wert `true`.

## Parameter und Rückgabewert kombinieren

Eine Funktion kann Parameter erhalten und gleichzeitig einen Wert zurückgeben.

~~~java
int groesser(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}
~~~

Die Parameter sind:

- `a`
- `b`

Die Argumente werden beim Aufruf übergeben:

~~~java
int maximum = groesser(4, 7);
~~~

Die Funktion gibt den grösseren Wert zurück.

`maximum` enthält danach `7`.

## `void` oder Rückgabewert?

Eine Funktion mit `void` führt eine Aufgabe aus.

~~~java
void rechtsUm() {
    linksUm();
    linksUm();
    linksUm();
}
~~~

Eine Funktion mit Rückgabewert liefert zusätzlich ein Ergebnis.

~~~java
boolean istGerade(int zahl) {
    return zahl % 2 == 0;
}
~~~

Der Unterschied ist:

> `void` führt etwas aus.

> `int` oder `boolean` liefert einen Wert zurück.

# Aufgaben

1. [Zähle die Körner](tasks/01-zaehle-die-koerner/readme.md)
2. [Gerade oder ungerade](tasks/02-gerade-oder-ungerade/readme.md)
3. [Finde den grössten Haufen](tasks/03-groesster-haufen/readme.md)