# Hamster-Befehle

Der Hamster kann mit einfachen Befehlen durch ein Territorium gesteuert werden.

Ein Programm besteht aus einzelnen Anweisungen.

Der Hamster führt diese Anweisungen der Reihe nach aus.

## Befehle

Bis hierhin verwenden wir vier Befehle:

| Befehl | Wirkung |
|---|---|
| `vor();` | Der Hamster geht ein Feld vorwärts. |
| `linksUm();` | Der Hamster dreht sich um 90° nach links. |
| `nimm();` | Der Hamster nimmt ein Korn vom aktuellen Feld auf. |
| `gib();` | Der Hamster legt ein Korn auf dem aktuellen Feld ab. |

Der Hamster kennt keinen Befehl für eine Rechtsdrehung.

Eine Rechtsdrehung kann mit drei Linksdrehungen ausgeführt werden:

~~~java
linksUm();
linksUm();
linksUm();
~~~

## Die Methode `main()`

Die Befehle für den Hamster schreiben wir in die Methode `main()`.

Die Methode `main()` ist der Startpunkt unseres Programms.

Ein einfaches Programm sieht so aus:

~~~java
void main() {
    vor();
    vor();
    linksUm();
    vor();
    nimm();
}
~~~

Der Hamster führt die Befehle von oben nach unten aus.

In diesem Beispiel geht der Hamster zwei Felder vorwärts.

Danach dreht er sich nach links.

Er geht nochmals ein Feld vorwärts.

Zum Schluss nimmt er ein Korn auf.

## Wichtig

Ein Befehl endet mit einem Semikolon `;`.

Der Hamster kann nur einen gültigen Schritt ausführen.

Mit `vor();` darf er beispielsweise nicht gegen eine Mauer laufen.

Mit `nimm();` kann er nur ein Korn aufnehmen, wenn auf seinem Feld ein Korn liegt.

Mit `gib();` kann er nur ein Korn ablegen, wenn er ein Korn im Maul hat.

# Aufgaben

1. [Geh zum Korn](tasks/01-geh-zum-korn/readme.md)
2. [Sammle die Körner](tasks/02-sammle-die-koerner/readme.md)
3. [Erklimme den Berg](tasks/03-erklimme-den-berg/readme.md)