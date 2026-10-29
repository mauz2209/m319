# `while`-Schleifen

Bisher können wir mit `if` eine Entscheidung treffen.

Mit einer Schleife können wir Befehle **mehrfach ausführen**.

Dafür verwenden wir zuerst die `while`-Schleife.

## Von `if` zu `while`

Die Bedingung einer `while`-Schleife funktioniert grundsätzlich gleich wie die Bedingung bei `if`.

Bei `if` können wir sagen:

> **Wenn** eine Bedingung erfüllt ist, führe die Befehle aus.

Zum Beispiel:

~~~java
if (kornDa()) {
    nimm();
}
~~~

Der Hamster nimmt **ein** Korn, wenn ein Korn da liegt.

Bei `while` können wir sagen:

> **So lange wie** eine Bedingung erfüllt ist, wiederhole die Befehle.

Zum Beispiel:

~~~java
while (kornDa()) {
    nimm();
}
~~~

Der Hamster nimmt **so lange** ein Korn, wie auf seinem Feld ein Korn liegt.

Damit kann er alle Körner auf einem Feld aufnehmen, ohne dass wir vorher wissen müssen, wie viele Körner dort liegen.

## Die `while`-Schleife

Eine `while`-Schleife hat folgenden Aufbau:

~~~java
while (Bedingung) {
    // Befehle
}
~~~

Der Ablauf ist:

1. Die Bedingung wird geprüft.
2. Ist die Bedingung `true`, werden die Befehle zwischen `{` und `}` ausgeführt.
3. Danach wird die Bedingung erneut geprüft.
4. Dies wiederholt sich, solange die Bedingung `true` ist.
5. Ist die Bedingung `false`, wird die Schleife beendet.

## Beispiel mit `vornFrei()`

Der Hamster soll so lange vorwärtsgehen, bis er vor einer Mauer steht.

~~~java
while (vornFrei()) {
    vor();
}
~~~

Solange das Feld vor dem Hamster frei ist, geht er weiter.

Sobald er vor einer Mauer steht, liefert `vornFrei()` den Wert `false`.

Die Schleife wird beendet.

## Bedingungen umkehren

Wie bei `if` können wir eine Bedingung mit `!` umkehren.

Der Hamster soll zum Beispiel so lange vorwärtsgehen, bis er ein Korn erreicht:

~~~java
while (!kornDa()) {
    vor();
}

nimm();
~~~

`!kornDa()` bedeutet:

> Es ist kein Korn da.

Der Hamster geht also so lange weiter, wie kein Korn auf seinem Feld liegt.

Sobald er ein Korn erreicht, wird die Schleife beendet.

Danach nimmt er das Korn auf.

## Endlosschleifen

Bei einer Schleife müssen wir darauf achten, dass die Bedingung irgendwann `false` werden kann.

Dieses Programm ist beispielsweise problematisch:

~~~java
while (vornFrei()) {
    linksUm();
}
~~~

Der Hamster dreht sich immer wieder.

Dadurch kann sich auch das Ergebnis von `vornFrei()` immer wieder verändern.

Eine Schleife, die niemals beendet wird, nennen wir eine **Endlosschleife**.

Überlege deshalb bei jeder Schleife:

> Was verändert sich bei jedem Durchlauf und warum wird die Schleife irgendwann beendet?

## Die `do...while`-Schleife

Eine weitere Möglichkeit ist die `do...while`-Schleife.

Sie sieht so aus:

~~~java
do {
    vor();
} while (vornFrei());
~~~

Der wichtige Unterschied liegt darin, **wann die Bedingung geprüft wird**.

Bei `while` wird die Bedingung **vor** dem ersten Durchlauf geprüft.

~~~java
while (Bedingung) {
    // Befehle
}
~~~

Ist die Bedingung bereits am Anfang `false`, werden die Befehle kein einziges Mal ausgeführt.

Bei `do...while` wird die Bedingung **nach** dem Durchlauf geprüft.

~~~java
do {
    // Befehle
} while (Bedingung);
~~~

Die Befehle werden deshalb **mindestens einmal** ausgeführt.

## `while` oder `do...while`?

Verwende `while`, wenn zuerst geprüft werden soll, ob etwas gemacht werden muss.

~~~java
while (kornDa()) {
    nimm();
}
~~~

Es kann sein, dass auf dem Feld kein Korn liegt.

Dann wird `nimm()` kein einziges Mal ausgeführt.

Verwende `do...while`, wenn der Ablauf mindestens einmal ausgeführt werden soll.

Der Unterschied ist also:

- `while` prüft **vor** dem Durchlauf.
- `do...while` prüft **nach** dem Durchlauf.

## `if` und `while`

`if` und `while` verwenden dieselben Arten von Bedingungen.

Zum Beispiel:

- `vornFrei()`
- `kornDa()`
- `maulLeer()`
- `!vornFrei()`
- `!kornDa()`
- `!maulLeer()`

Der Unterschied liegt darin, was mit dem Ergebnis passiert.

**`if` bedeutet:**

> **Wenn** die Bedingung erfüllt ist, führe die Befehle aus.

**`while` bedeutet:**

> **So lange wie** die Bedingung erfüllt ist, wiederhole die Befehle.

# Aufgaben

1. [Geh bis zum Korn](tasks/01-geh-bis-zum-korn/readme.md)
2. [Alle Körner sind mir](tasks/02-alle-koerner-sind-mir/readme.md)
3. [Körner-Runden](tasks/03-koerner-runden/readme.md)