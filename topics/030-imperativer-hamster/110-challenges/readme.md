# Aufgaben

* [Stufen-Hamster](./tasks/01-stufen-hamster/readme.md)
* [Einkaufs-Hamster](./tasks/02-einkaufs-hamster/readme.md)
* [Additions-Hamster](./tasks/03-additions-hamster/readme.md)
* [Abbild-Hamster](./tasks/04-abbild-hamster/readme.md)
* [Sortier-Hamster](./tasks/05-sortier-hamster/readme.md)

Beachte bei den Aufgaben die **Namenskonventionen**!

# Namenskonventionen und Einrückung

Einheitliche Schreibregeln machen Programme einfacher lesbar.

## Variablen

Variablennamen schreiben wir in **camelCase**.

Das erste Wort beginnt mit einem Kleinbuchstaben.

Weitere Wörter beginnen mit einem Grossbuchstaben.

~~~java
int anzahlKoerner = 0;
int groessterHaufen = 0;
boolean zielErreicht = false;
~~~

Variablennamen sollen beschreiben, **was in der Variable gespeichert wird**.

Vermeide Namen wie `x`, `a` oder `wert`, wenn ein aussagekräftiger Name möglich ist.

## Funktionen und Prozeduren

Auch Namen von Funktionen und Prozeduren schreiben wir in **camelCase**.

Das erste Wort beginnt mit einem Kleinbuchstaben.

~~~java
void rechtsUm() {
    linksUm();
    linksUm();
    linksUm();
}

int zaehleKoerner() {
    // ...
}
~~~

Der Name soll beschreiben, **was die Funktion oder Prozedur macht**.

Für Aktionen eignen sich Verben besonders gut:

~~~text
geheSchritte()
zaehleKoerner()
baueHaufen()
findeMaximum()
~~~

## Einrückung

Befehle innerhalb eines Blocks werden eingerückt.

Wir verwenden **4 Leerzeichen** pro Ebene.

Die öffnende geschweifte Klammer `{` bleibt auf derselben Zeile.

~~~java
void main() {
    int anzahlKoerner = 0;

    while (kornDa()) {
        nimm();
        anzahlKoerner = anzahlKoerner + 1;
    }

    if (anzahlKoerner > 0) {
        for (int i = 0; i < anzahlKoerner; i++) {
            vor();
        }
    }
}
~~~

Die schliessende Klammer `}` steht auf derselben Einrückungsebene wie die Anweisung, zu der der Block gehört.

Bei `else` schreiben wir die schliessende Klammer, `else` und die neue öffnende Klammer auf dieselbe Zeile:

~~~java
if (kornDa()) {
    nimm();
} else {
    vor();
}
~~~

Eine saubere Einrückung zeigt die Struktur des Programms auf einen Blick.