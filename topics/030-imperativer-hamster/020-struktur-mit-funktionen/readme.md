# Eigene Funktionen

Bisher haben wir die Befehle direkt in `main()` geschrieben.

Dabei wiederholen sich gewisse Befehlsfolgen immer wieder.

Ein typisches Beispiel ist eine Rechtsdrehung.

Der Hamster kennt nur den Befehl `linksUm()`.

Für eine Rechtsdrehung brauchen wir deshalb drei Linksdrehungen:

~~~java
linksUm();
linksUm();
linksUm();
~~~

Wenn wir diese Befehlsfolge mehrfach brauchen, wird der Code schnell unübersichtlich.

Wir können dafür eine eigene Funktion erstellen.

## Die Funktion `rechtsUm()`

Eine eigene Funktion fasst mehrere Befehle unter einem Namen zusammen.

~~~java
void rechtsUm() {
    linksUm();
    linksUm();
    linksUm();
}
~~~

Die Funktion heisst `rechtsUm`.

Mit `void` geben wir an, dass die Funktion keinen Wert zurückgibt.

Die Befehle der Funktion stehen zwischen `{` und `}`.

Danach können wir die Funktion wie einen normalen Hamster-Befehl verwenden:

~~~java
void main() {
    vor();
    rechtsUm();
    vor();
}
~~~

Beim Aufruf von

~~~java
rechtsUm();
~~~

führt das Programm die drei Befehle aus der Funktion aus.

Danach läuft das Programm in `main()` weiter.

## Warum verwenden wir Funktionen?

Funktionen helfen uns, ein Programm zu strukturieren.

Eine Funktion übernimmt eine klar definierte Aufgabe.

Der Name der Funktion beschreibt diese Aufgabe.

Statt

~~~java
linksUm();
linksUm();
linksUm();
~~~

steht im Programm nur noch

~~~java
rechtsUm();
~~~

Dadurch wird der Code einfacher zu lesen.

Ändert sich eine Befehlsfolge, müssen wir sie nur an einer Stelle ändern.

Wiederkehrende Abläufe müssen wir nicht jedes Mal neu schreiben.

## Eigene Funktionen und `main()`

Ein Programm kann aus `main()` und mehreren eigenen Funktionen bestehen.

Zum Beispiel:

~~~java
void rechtsUm() {
    linksUm();
    linksUm();
    linksUm();
}

void main() {
    vor();
    rechtsUm();
    vor();
    rechtsUm();
    vor();
}
~~~

`main()` beschreibt hier den groben Ablauf.

`rechtsUm()` beschreibt, wie eine Rechtsdrehung funktioniert.

# Aufgaben

1. [Geh zum Korn mit Funktionen](tasks/01-geh-zum-korn-function/)
2. [Sammle die Körner mit Funktionen](tasks/02-sammle-die-koerner-function/)
3. [Erklimme den Berg mit Funktionen](tasks/03-erklimme-den-berg-function/)