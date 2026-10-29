# `for`-Schleifen

Mit einer `while`-Schleife wiederholen wir Befehle, solange eine Bedingung erfüllt ist.

~~~java
while (kornDa()) {
    nimm();
}
~~~

Diese Schleife eignet sich gut, wenn wir **vorher nicht wissen**, wie oft etwas wiederholt werden muss.

Manchmal kennen wir die Anzahl Wiederholungen aber bereits.

Der Hamster soll zum Beispiel genau fünf Schritte gehen.

Dafür eignet sich eine `for`-Schleife.

## Die `for`-Schleife

Eine `for`-Schleife kann so aussehen:

~~~java
for (int i = 0; i < 5; i++) {
    vor();
}
~~~

Der Hamster führt `vor()` genau fünfmal aus.

Eine `for`-Schleife besteht aus drei Teilen:

~~~java
for (Initialisierung; Bedingung; Veränderung) {
    // Befehle
}
~~~

Schauen wir die drei Teile einzeln an:

~~~java
int i = 0;
~~~

Die Variable `i` wird erstellt und mit `0` initialisiert.

~~~java
i < 5
~~~

Dies ist die Bedingung.

Die Schleife läuft so lange, wie `i` kleiner als `5` ist.

~~~java
i++
~~~

Nach jedem Durchlauf wird `i` um `1` erhöht.

`i++` ist eine Kurzform für:

~~~java
i = i + 1;
~~~

## Ablauf einer `for`-Schleife

Bei dieser Schleife

~~~java
for (int i = 0; i < 5; i++) {
    vor();
}
~~~

passiert Folgendes:

1. `i` wird mit `0` initialisiert.
2. Das Programm prüft `i < 5`.
3. Ist die Bedingung `true`, geht der Hamster einen Schritt.
4. `i` wird um `1` erhöht.
5. Die Bedingung wird erneut geprüft.
6. Der Ablauf wiederholt sich.

Die Werte von `i` sind dabei:

~~~text
0
1
2
3
4
~~~

Danach hat `i` den Wert `5`.

Die Bedingung `i < 5` ist jetzt `false`.

Die Schleife endet.

Der Hamster ist genau fünf Schritte gegangen.

## Die Zählvariable verwenden

Die Variable `i` können wir auch innerhalb der Schleife verwenden.

Zum Beispiel können wir bei jedem zweiten Durchlauf etwas machen:

~~~java
for (int i = 0; i < 10; i++) {
    vor();

    if (i % 2 == 0) {
        gib();
    }
}
~~~

Damit können wir Schleifen mit Bedingungen und mathematischen Operatoren kombinieren.

## Eine Variable als Anzahl verwenden

Die Anzahl Wiederholungen muss keine feste Zahl sein.

Sie kann auch in einer Variable stehen.

~~~java
int anzahlSchritte = 7;

for (int i = 0; i < anzahlSchritte; i++) {
    vor();
}
~~~

Der Hamster geht so viele Schritte, wie in `anzahlSchritte` gespeichert sind.

Die Variable könnte vorher auch durch das Programm bestimmt worden sein.

Zum Beispiel können wir zuerst Körner zählen und anschliessend für jedes Korn etwas machen.

## `while` oder `for`?

`while` und `for` können beide Befehle wiederholen.

Sie eignen sich aber für unterschiedliche Situationen.

### `while`

Verwende `while`, wenn die Anzahl Wiederholungen **nicht bekannt** ist.

~~~java
while (kornDa()) {
    nimm();
}
~~~

Wir wissen vorher nicht, wie viele Körner auf dem Feld liegen.

### `for`

Verwende `for`, wenn die Anzahl Wiederholungen **bekannt oder in einer Variable gespeichert** ist.

~~~java
for (int i = 0; i < anzahl; i++) {
    vor();
}
~~~

Wir wissen, wie oft die Befehle wiederholt werden sollen.

Als Merkhilfe:

> `while`: Wiederhole etwas **so lange wie** eine Bedingung erfüllt ist.

> `for`: Wiederhole etwas **eine bestimmte Anzahl Mal**.

# Vorschläge für Aufgaben

## 01 – Körner verteilen

Der Hamster startet mit einer bestimmten Anzahl Körner im Maul.

Vor ihm liegt ein gerader Weg.

Er soll eine vorgegebene Anzahl Felder ablaufen und auf jedem Feld genau ein Korn ablegen.

Die Anzahl Felder wird in einer Variable gespeichert.

Die Bewegung und das Ablegen erfolgen mit einer `for`-Schleife.

**Lernziel:**

Ich kann mit einer `for`-Schleife einen Ablauf eine in einer Variable festgelegte Anzahl Mal wiederholen.

---

## 02 – Treppe bauen

Der Hamster hat genügend Körner im Maul.

Er läuft an mehreren Feldern vorbei.

Auf das erste Feld legt er ein Korn.

Auf das zweite Feld legt er zwei Körner.

Auf das dritte Feld legt er drei Körner.

So entsteht eine Treppe aus Körnern.

Hier wird die Zählvariable der `for`-Schleife selbst benötigt.

Beispielsweise bestimmt `i`, wie viele Körner auf einem Feld abgelegt werden.

**Lernziel:**

Ich kann die Zählvariable einer `for`-Schleife verwenden, um die Anzahl ausgeführter Befehle während der einzelnen Durchläufe zu verändern.

---

## 03 – Kornquadrat

Der Hamster soll ein quadratisches Gebiet umrunden.

Die Seitenlänge steht in einer Variable.

Für jede Seite geht er mit einer `for`-Schleife die entsprechende Anzahl Schritte.

Danach dreht er sich um 90 Grad.

Das Ganze wird viermal wiederholt.

Hier können erstmals **verschachtelte `for`-Schleifen** sinnvoll eingesetzt werden.

Eine Schleife zählt die vier Seiten.

Die innere Schleife zählt die Schritte einer Seite.

**Lernziel:**

Ich kann zwei `for`-Schleifen verschachteln, um einen wiederkehrenden Ablauf mit einer festgelegten Anzahl Seiten und Schritten zu programmieren.

# Aufgaben

1. [Körner verteilen](tasks/01-koerner-verteilen/readme.md)
2. [Treppe bauen](tasks/02-treppe-bauen/readme.md)
3. [Kornquadrat](tasks/03-kornquadrat/readme.md)