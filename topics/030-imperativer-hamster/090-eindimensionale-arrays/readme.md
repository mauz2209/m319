# Eindimensionale Arrays

Bisher haben wir einzelne Werte in Variablen gespeichert.

Zum Beispiel:

~~~java
int anzahl = 4;
~~~

Eine Variable kann genau einen Wert speichern.

Manchmal möchten wir aber mehrere zusammengehörende Werte speichern.

Zum Beispiel haben wir fünf Körner-Haufen gezählt:

~~~text
2, 5, 3, 7, 4
~~~

Wir könnten dafür fünf Variablen erstellen:

~~~java
int haufen1 = 2;
int haufen2 = 5;
int haufen3 = 3;
int haufen4 = 7;
int haufen5 = 4;
~~~

Das wird bei vielen Werten schnell unübersichtlich.

Dafür verwenden wir ein **Array**.

## Ein `int`-Array

Ein Array kann mehrere Werte desselben Datentyps speichern.

Ein Array mit fünf ganzen Zahlen können wir so erstellen:

~~~java
int[] haufen = {2, 5, 3, 7, 4};
~~~

`int[]` ist der Datentyp.

`haufen` ist der Name des Arrays.

Die Werte stehen zwischen `{` und `}`.

Unser Array enthält fünf Elemente:

~~~text
2   5   3   7   4
~~~

## Der Index

Jedes Element eines Arrays hat eine Position.

Diese Position nennen wir **Index**.

Wichtig ist:

> Der erste Index ist `0`.

Für unser Array

~~~java
int[] haufen = {2, 5, 3, 7, 4};
~~~

gelten folgende Indizes:

| Index | Wert |
|---:|---:|
| `0` | `2` |
| `1` | `5` |
| `2` | `3` |
| `3` | `7` |
| `4` | `4` |

Auf einen einzelnen Wert greifen wir mit dem Index zu:

~~~java
int anzahl = haufen[2];
~~~

`haufen[2]` enthält den Wert `3`.

## Werte verändern

Wir können ein Element des Arrays verändern.

~~~java
haufen[2] = 8;
~~~

Danach enthält das Array:

~~~text
2   5   8   7   4
~~~

Auch hier handelt es sich um eine Zuweisung.

## Ein leeres Array erstellen

Wir können zuerst festlegen, wie viele Elemente ein Array haben soll.

~~~java
int[] haufen = new int[5];
~~~

Damit erstellen wir ein Array mit fünf Elementen.

Die Indizes sind:

~~~text
0, 1, 2, 3, 4
~~~

Alle Elemente haben am Anfang den Wert `0`.

Wir können die Werte später setzen:

~~~java
haufen[0] = 2;
haufen[1] = 5;
haufen[2] = 3;
haufen[3] = 7;
haufen[4] = 4;
~~~

## Die Länge eines Arrays

Mit `.length` erhalten wir die Anzahl Elemente eines Arrays.

~~~java
int[] haufen = {2, 5, 3, 7, 4};

int anzahl = haufen.length;
~~~

`anzahl` enthält jetzt den Wert `5`.

Damit müssen wir die Länge eines Arrays nicht selbst in einer zusätzlichen Variable speichern.

## Arrays und `for`-Schleifen

Arrays und `for`-Schleifen passen gut zusammen.

Mit einer `for`-Schleife können wir alle Elemente eines Arrays durchlaufen.

~~~java
int[] haufen = {2, 5, 3, 7, 4};

for (int i = 0; i < haufen.length; i++) {
    int anzahl = haufen[i];
}
~~~

Die Variable `i` dient gleichzeitig als Index.

Beim ersten Durchlauf verwenden wir:

~~~java
haufen[0]
~~~

Beim zweiten Durchlauf:

~~~java
haufen[1]
~~~

Danach:

~~~java
haufen[2]
~~~

und so weiter.

Die Schleife endet, sobald `i` nicht mehr kleiner als `haufen.length` ist.

## Werte in einem Array speichern

Ein Hamster kann beispielsweise mehrere Körner-Haufen nacheinander zählen.

Die Ergebnisse können wir in einem Array speichern.

~~~java
int[] haufen = new int[5];

for (int i = 0; i < haufen.length; i++) {
    haufen[i] = zaehleHaufen();
    vor();
}
~~~

Jedes Ergebnis von `zaehleHaufen()` wird an einer anderen Position im Array gespeichert.

Nach der Schleife stehen alle gezählten Werte im Array zur Verfügung.

## Werte aus einem Array verwenden

Wir können die gespeicherten Werte später wieder verwenden.

Zum Beispiel kann der Hamster für jeden gespeicherten Wert einen neuen Körner-Haufen bauen:

~~~java
for (int i = 0; i < haufen.length; i++) {
    baueHaufen(haufen[i]);
    vor();
}
~~~

Das Array dient damit als **Speicher für mehrere zusammengehörende Werte**.

Der Hamster kann Informationen zuerst erfassen und später wieder verwenden.

## Wichtig

Ein `int` speichert eine ganze Zahl:

~~~java
int anzahl = 5;
~~~

Ein `int[]` speichert mehrere ganze Zahlen:

~~~java
int[] zahlen = {2, 5, 3, 7, 4};
~~~

Auf ein Element greifen wir über seinen Index zu:

~~~java
zahlen[0]
~~~

Der erste Index ist immer `0`.

Die Anzahl Elemente erhalten wir mit:

~~~java
zahlen.length
~~~

Mit einer `for`-Schleife können wir alle Elemente eines Arrays durchlaufen.

# Aufgaben

1. [Körner-Haufen merken](tasks/01-koerner-haufen-merken/readme.md)
2. [Körner-Haufen umkehren](tasks/02-koerner-haufen-umkehren/readme.md)