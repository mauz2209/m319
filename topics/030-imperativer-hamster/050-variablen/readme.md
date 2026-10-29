# Variablen

Bisher konnte unser Hamster Entscheidungen treffen und Befehle wiederholen.

Manchmal muss sich ein Programm aber auch einen Wert merken.

Dafür verwenden wir **Variablen**.

Eine Variable können wir uns wie einen Behälter mit einem Namen vorstellen.

In diesem Behälter speichern wir einen Wert.

## Variablen vom Typ `int`

Mit `int` speichern wir ganze Zahlen.

Zum Beispiel können wir zählen, wie viele Körner der Hamster aufgenommen hat.

~~~java
int anzahlKoerner = 0;
~~~

Die Variable heisst `anzahlKoerner`.

Der Datentyp ist `int`.

Der aktuelle Wert ist `0`.

Wir können den Wert verändern:

~~~java
anzahlKoerner = anzahlKoerner + 1;
~~~

Nach dieser Anweisung ist der Wert um `1` grösser.

## Initialisierung und Zuweisung

**Initialisierung** und **Zuweisung** sind nicht dasselbe.

Bei der Initialisierung erstellen wir eine Variable und geben ihr einen ersten Wert.

~~~java
int anzahlKoerner = 0;
~~~

`int` legt den Datentyp fest.

`anzahlKoerner` ist der Name der neuen Variable.

`0` ist ihr erster Wert.

Das ist eine **Initialisierung**.

Später können wir der bestehenden Variable einen neuen Wert zuweisen:

~~~java
anzahlKoerner = 5;
~~~

Das ist eine **Zuweisung**.

Wir erstellen dabei keine neue Variable.

Wir verändern den Wert der bereits vorhandenen Variable.

Das Zeichen `=` bedeutet bei einer Zuweisung:

> Speichere den Wert auf der rechten Seite in der Variable auf der linken Seite.

Deshalb ist auch diese Anweisung möglich:

~~~java
anzahlKoerner = anzahlKoerner + 1;
~~~

Zuerst wird `anzahlKoerner + 1` berechnet.

Danach wird das Ergebnis wieder in `anzahlKoerner` gespeichert.

## Variablen vom Typ `boolean`

Mit `boolean` speichern wir einen Wahrheitswert.

Ein `boolean` kann genau zwei Werte haben:

- `true`
- `false`

Zum Beispiel:

~~~java
boolean fertig = false;
~~~

Später können wir den Wert ändern:

~~~java
fertig = true;
~~~

`boolean`-Variablen eignen sich besonders gut für Bedingungen.

~~~java
if (fertig) {
    linksUm();
}
~~~

Sie können auch bei Schleifen verwendet werden:

~~~java
while (!fertig) {
    vor();

    if (kornDa()) {
        fertig = true;
    }
}
~~~

## Mathematische Operatoren

Mit Variablen vom Typ `int` können wir rechnen.

| Operator | Bedeutung | Beispiel |
|---|---|---|
| `+` | Addition | `a + b` |
| `-` | Subtraktion | `a - b` |
| `*` | Multiplikation | `a * b` |
| `/` | Division | `a / b` |
| `%` | Rest einer Division | `a % b` |

Zum Beispiel:

~~~java
int anzahl = 5;

anzahl = anzahl + 2;
~~~

Danach enthält `anzahl` den Wert `7`.

## Der Modulo-Operator `%`

Der Operator `%` liefert den Rest einer Division.

Zum Beispiel:

~~~java
int rest = 7 % 2;
~~~

`7` geteilt durch `2` ergibt einen Rest von `1`.

`rest` enthält deshalb den Wert `1`.

Damit können wir beispielsweise prüfen, ob eine Zahl gerade ist:

~~~java
if (anzahl % 2 == 0) {
    // Anzahl ist gerade
}
~~~

Eine gerade Zahl lässt sich ohne Rest durch `2` teilen.

## Vergleichsoperatoren

Mit Vergleichsoperatoren vergleichen wir zwei Werte.

Das Ergebnis eines Vergleichs ist immer `true` oder `false`.

| Operator | Bedeutung | Beispiel |
|---|---|---|
| `==` | gleich | `a == b` |
| `!=` | ungleich | `a != b` |
| `<` | kleiner als | `a < b` |
| `>` | grösser als | `a > b` |
| `<=` | kleiner oder gleich | `a <= b` |
| `>=` | grösser oder gleich | `a >= b` |

Zum Beispiel:

~~~java
int anzahlKoerner = 5;

if (anzahlKoerner > 3) {
    vor();
}
~~~

Der Hamster geht vorwärts, wenn `anzahlKoerner` grösser als `3` ist.

## `=` und `==` sind nicht dasselbe

Dieser Unterschied ist wichtig.

Ein einzelnes `=` ist eine **Zuweisung**:

~~~java
anzahl = 5;
~~~

Das bedeutet:

> Speichere `5` in `anzahl`.

Zwei Gleichheitszeichen `==` bilden einen **Vergleich**:

~~~java
anzahl == 5
~~~

Das bedeutet:

> Ist `anzahl` gleich `5`?

Das Ergebnis ist `true` oder `false`.

Deshalb können wir den Vergleich als Bedingung verwenden:

~~~java
if (anzahl == 5) {
    vor();
}
~~~

## Variablen zählen lassen

Variablen können wir mit einer Schleife kombinieren.

Der Hamster soll beispielsweise alle Körner auf seinem Feld aufnehmen und zählen:

~~~java
int anzahlKoerner = 0;

while (kornDa()) {
    nimm();
    anzahlKoerner = anzahlKoerner + 1;
}
~~~

Bei jedem Durchlauf passiert Folgendes:

1. Der Hamster nimmt ein Korn.
2. `anzahlKoerner` wird um `1` erhöht.

Nach der Schleife enthält die Variable die Anzahl der aufgenommenen Körner.

## Variablen vergleichen

Variablen können wir auch verwenden, um uns einen bisherigen Wert zu merken.

~~~java
int maximum = 0;
int anzahl = 5;

if (anzahl > maximum) {
    maximum = anzahl;
}
~~~

Ist `anzahl` grösser als `maximum`, erhält `maximum` einen neuen Wert.

Damit können wir beispielsweise den grössten Körner-Haufen oder die tiefste Mulde suchen.

# Aufgaben

1. [Schritte](tasks/01-schritte/readme.md)
2. [Mulden](tasks/02-mulden/readme.md)
3. [Körner-Haufen](tasks/03-koerner-haufen/readme.md)
4. [Gerade oder ungerade](tasks/04-gerade-oder-ungerade/readme.md)
5. [Jeder zweite Durchgang](tasks/05-jeder-zweite-durchgang/readme.md)