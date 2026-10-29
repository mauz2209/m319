# Logische Operatoren

Bisher haben wir einzelne Bedingungen verwendet.

Zum Beispiel:

~~~java
if (vornFrei()) {
    vor();
}
~~~

Oder:

~~~java
if (kornDa()) {
    nimm();
}
~~~

Manchmal hängt eine Entscheidung aber von **mehreren Bedingungen gleichzeitig** ab.

Dafür verwenden wir logische Operatoren.

Wir betrachten drei logische Operatoren:

| Operator | Bedeutung |
|---|---|
| `&&` | AND – und |
| `||` | OR – oder |
| `!` | NOT – nicht |

Logische Operatoren arbeiten mit Wahrheitswerten.

Das Ergebnis ist immer `true` oder `false`.

## AND – `&&`

AND verwenden wir, wenn **beide Bedingungen** erfüllt sein müssen.

~~~java
if (vornFrei() && kornDa()) {
    vor();
}
~~~

Der Hamster geht nur vorwärts, wenn:

- das Feld vor ihm frei ist **und**
- auf seinem aktuellen Feld ein Korn liegt.

### Wahrheitstabelle AND

| A | B | A `&&` B |
|---|---|---|
| `false` | `false` | `false` |
| `false` | `true` | `false` |
| `true` | `false` | `false` |
| `true` | `true` | `true` |

AND liefert nur dann `true`, wenn **beide** Bedingungen `true` sind.

## OR – `||`

OR verwenden wir, wenn **mindestens eine** der beiden Bedingungen erfüllt sein muss.

~~~java
if (kornDa() || maulLeer()) {
    vor();
}
~~~

Der Hamster geht vorwärts, wenn:

- ein Korn auf seinem Feld liegt **oder**
- sein Maul leer ist.

Sind beide Bedingungen `true`, ist die gesamte Bedingung ebenfalls `true`.

### Wahrheitstabelle OR

| A | B | A `\|\|` B |
|---|---|---|
| `false` | `false` | `false` |
| `false` | `true` | `true` |
| `true` | `false` | `true` |
| `true` | `true` | `true` |

OR liefert `true`, wenn **mindestens eine** Bedingung `true` ist.

## NOT – `!`

NOT kehrt einen Wahrheitswert um.

~~~java
if (!vornFrei()) {
    linksUm();
}
~~~

`vornFrei()` bedeutet:

> Das Feld vor dem Hamster ist frei.

`!vornFrei()` bedeutet:

> Das Feld vor dem Hamster ist nicht frei.

### Wahrheitstabelle NOT

| A | `!A` |
|---|---|
| `false` | `true` |
| `true` | `false` |

NOT macht aus `true` ein `false`.

NOT macht aus `false` ein `true`.

## Logische Operatoren kombinieren

Wir können mehrere logische Operatoren in einer Bedingung kombinieren.

Zum Beispiel:

~~~java
if (!maulLeer() && vornFrei()) {
    vor();
}
~~~

Der Hamster geht vorwärts, wenn sein Maul **nicht leer** und das Feld vor ihm **frei** ist.

Auch komplexere Bedingungen sind möglich:

~~~java
if (kornDa() || !maulLeer() && vornFrei()) {
    vor();
}
~~~

Bei solchen Bedingungen müssen wir wissen, in welcher Reihenfolge die Operatoren ausgewertet werden.

## Präzedenz

Operatoren haben eine festgelegte Reihenfolge.

Diese Reihenfolge nennen wir **Präzedenz**.

Für unsere logischen Ausdrücke gilt:

1. `()` – Klammern
2. `!` – NOT
3. `&&` – AND
4. `||` – OR

Merke:

> **Klammer vor NOT vor AND vor OR.**

Der Ausdruck

~~~java
kornDa() || !maulLeer() && vornFrei()
~~~

wird deshalb so ausgewertet:

~~~java
kornDa() || ((!maulLeer()) && vornFrei())
~~~

Zuerst wird NOT ausgewertet.

Danach wird AND ausgewertet.

Zum Schluss wird OR ausgewertet.

## Klammern verwenden

Mit Klammern können wir die Reihenfolge verändern.

Vergleiche:

~~~java
kornDa() || maulLeer() && vornFrei()
~~~

mit:

~~~java
(kornDa() || maulLeer()) && vornFrei()
~~~

Diese beiden Bedingungen bedeuten nicht dasselbe.

Im zweiten Beispiel wird wegen der Klammer zuerst

~~~java
kornDa() || maulLeer()
~~~

ausgewertet.

Danach wird das Ergebnis mit `vornFrei()` verknüpft.

Klammern helfen auch dabei, Bedingungen besser lesbar zu machen.

## Wahrheitstabelle mit mehreren Operatoren

Betrachten wir:

~~~text
A || B && !C
~~~

Wegen der Präzedenz entspricht dies:

~~~text
A || (B && (!C))
~~~

| A | B | C | `!C` | B `&&` `!C` | A `\|\|` (B `&&` `!C`) |
|---|---|---|---|---|---|
| `false` | `false` | `false` | `true` | `false` | `false` |
| `false` | `false` | `true` | `false` | `false` | `false` |
| `false` | `true` | `false` | `true` | `true` | `true` |
| `false` | `true` | `true` | `false` | `false` | `false` |
| `true` | `false` | `false` | `true` | `false` | `true` |
| `true` | `false` | `true` | `false` | `false` | `true` |
| `true` | `true` | `false` | `true` | `true` | `true` |
| `true` | `true` | `true` | `false` | `false` | `true` |

## Logische Operatoren mit Variablen

Logische Operatoren funktionieren auch mit `boolean`-Variablen.

~~~java
boolean wegFrei = vornFrei();
boolean hatKorn = kornDa();

if (wegFrei && hatKorn) {
    vor();
}
~~~

Auch Vergleiche liefern einen `boolean`-Wert.

Deshalb können wir Vergleiche ebenfalls verknüpfen:

~~~java
int anzahl = 5;

if (anzahl > 0 && anzahl < 10) {
    vor();
}
~~~

Der Hamster geht nur vorwärts, wenn `anzahl` grösser als `0` **und** kleiner als `10` ist.

## Wichtig

`&&` bedeutet:

> Beide Bedingungen müssen `true` sein.

`||` bedeutet:

> Mindestens eine Bedingung muss `true` sein.

`!` bedeutet:

> Der Wahrheitswert wird umgekehrt.

Für die Reihenfolge gilt:

> **Klammer vor NOT vor AND vor OR.**

### Lernziel

Ich kann AND, OR und NOT in einer gemeinsamen Bedingung kombinieren und mit Klammern festlegen, in welcher Reihenfolge Teile der Bedingung ausgewertet werden.

# Aufgaben

1. [Der richtige Durchgang](tasks/01-der-richgige-durchgang/readme.md)