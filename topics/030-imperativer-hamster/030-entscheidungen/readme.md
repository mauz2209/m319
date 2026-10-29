# Entscheidungen mit `if` und `else`

Bisher führt der Hamster die Befehle in unserem Programm der Reihe nach aus.

Manchmal soll ein Befehl aber nur ausgeführt werden, wenn eine bestimmte Bedingung erfüllt ist.

Dafür verwenden wir eine **Entscheidung**.

## Bedingungen

Der Hamster kann seine Umgebung und seinen Zustand prüfen.

Dafür stehen uns neu diese Befehle zur Verfügung:

| Befehl | Bedeutung |
|---|---|
| `vornFrei()` | Prüft, ob das Feld vor dem Hamster frei ist. |
| `kornDa()` | Prüft, ob auf dem aktuellen Feld mindestens ein Korn liegt. |
| `maulLeer()` | Prüft, ob der Hamster kein Korn im Maul hat. |

Diese Befehle führen keine Aktion aus.

Sie beantworten eine Frage.

Die Antwort ist entweder `true` oder `false`.

## Eine Entscheidung mit `if`

Mit `if` führen wir Befehle nur dann aus, wenn eine Bedingung erfüllt ist.

Zum Beispiel:

~~~java
if (kornDa()) {
    nimm();
}
~~~

Der Hamster prüft zuerst `kornDa()`.

Liegt ein Korn auf dem Feld, ist die Bedingung `true`.

Dann führt der Hamster `nimm()` aus.

Liegt kein Korn auf dem Feld, ist die Bedingung `false`.

Dann überspringt das Programm den Befehl zwischen `{` und `}`.

## Beispiel mit `vornFrei()`

Der Hamster soll nur vorwärtsgehen, wenn sich vor ihm keine Mauer befindet.

~~~java
if (vornFrei()) {
    vor();
}
~~~

Damit läuft der Hamster nicht gegen eine Mauer.

## Eine Entscheidung mit `if` und `else`

Manchmal soll der Hamster bei einer nicht erfüllten Bedingung etwas anderes tun.

Dafür verwenden wir `else`.

~~~java
if (vornFrei()) {
    vor();
} else {
    linksUm();
}
~~~

Ist das Feld vor dem Hamster frei, geht er vorwärts.

Ist das Feld nicht frei, dreht er sich nach links.

Es wird immer genau einer der beiden Blöcke ausgeführt.

## Beispiel mit `maulLeer()`

Der Hamster kann auch prüfen, ob er Körner im Maul hat.

~~~java
if (maulLeer()) {
    vor();
} else {
    gib();
}
~~~

Ist das Maul leer, geht der Hamster vorwärts.

Hat der Hamster mindestens ein Korn im Maul, legt er ein Korn ab.

## Bedingungen umkehren

Mit `!` können wir eine Bedingung umkehren.

~~~java
if (!maulLeer()) {
    gib();
}
~~~

`maulLeer()` bedeutet:

> Das Maul ist leer.

`!maulLeer()` bedeutet:

> Das Maul ist **nicht** leer.

Der Hamster legt deshalb ein Korn ab, wenn er mindestens ein Korn im Maul hat.

Das funktioniert auch mit anderen Bedingungen:

~~~java
if (!vornFrei()) {
    linksUm();
}
~~~

Der Hamster dreht sich nach links, wenn das Feld vor ihm **nicht** frei ist.

## Entscheidungen in `main()`

Entscheidungen können direkt in `main()` verwendet werden.

~~~java
void main() {
    vor();

    if (kornDa()) {
        nimm();
    }

    if (vornFrei()) {
        vor();
    } else {
        linksUm();
    }
}
~~~

Das Programm kann jetzt abhängig vom Territorium unterschiedliche Befehle ausführen.

Damit muss beim Schreiben des Programms nicht mehr jede Situation bereits eindeutig feststehen.

## Wichtig

Eine `if`-Anweisung prüft eine Bedingung.

~~~java
if (Bedingung) {
    // wird ausgeführt, wenn die Bedingung true ist
}
~~~

Mit `else` können wir festlegen, was bei `false` passieren soll.

~~~java
if (Bedingung) {
    // Bedingung ist true
} else {
    // Bedingung ist false
}
~~~

Die Bedingungen `vornFrei()`, `kornDa()` und `maulLeer()` liefern immer `true` oder `false`.

Mit `!` kann eine Bedingung umgekehrt werden.

# Aufgaben

* [01-korn-slalom](tasks/01-korn-slalom/readme.md)
* [02-korn-super-g](tasks/02-korn-super-g/readme.md)