# Eigene Hamster-Klassen

Bisher haben wir Objekte der vorhandenen Klasse `Hamster` erzeugt und verwendet.

Nun erstellen wir **eigene Hamster-Klassen**.

Damit können wir den Hamster um eigene Fähigkeiten erweitern.

## Eine eigene Klasse

Eine eigene Hamster-Klasse kann die vorhandene Klasse `Hamster` erweitern.

~~~java
class RechtsUmHamster extends Hamster {

}
~~~

`extends Hamster` bedeutet:

> `RechtsUmHamster` erweitert die Klasse `Hamster`.

Ein `RechtsUmHamster` kann deshalb die bereits vorhandenen Methoden eines Hamsters verwenden.

Zum Beispiel:

~~~java
hamster.vor();
hamster.linksUm();
hamster.nimm();
hamster.gib();
~~~

## Eigene Methoden

Unsere Klasse kann zusätzliche Methoden erhalten.

Der normale Hamster kennt beispielsweise keine Methode `rechtsUm()`.

Diese können wir selbst ergänzen:

~~~java
class RechtsUmHamster extends Hamster {

    void rechtsUm() {
        linksUm();
        linksUm();
        linksUm();
    }
}
~~~

Ein Objekt unserer neuen Klasse kann danach die neue Methode verwenden:

~~~java
RechtsUmHamster hamster = new RechtsUmHamster();

hamster.rechtsUm();
~~~

Die eigene Klasse verbindet damit die vorhandenen Fähigkeiten von `Hamster` mit unseren zusätzlichen Fähigkeiten.

## Eigene Konstruktoren

Unsere eigene Klasse kann auch einen Konstruktor besitzen.

Soll beim Erzeugen unseres Hamsters ein Konstruktor der Klasse `Hamster` aufgerufen werden, verwenden wir `super(...)`.

~~~java
class SuperHamster extends Hamster {

    SuperHamster(/* Parameter */) {
        super(/* Argumente */);
    }
}
~~~

`super(...)` ruft den Konstruktor der übergeordneten Klasse auf.

In diesem Fall ist die übergeordnete Klasse `Hamster`.

So können wir die vorhandene Klasse `Hamster` als Grundlage für unsere eigenen Hamster-Klassen verwenden.

# Aufgaben

1. [RechtsUmHamster](tasks/01-rechts-um-hamster/readme.md)
2. [Der Super-Hamster](tasks/02-der-super-hamster/readme.md)
3. [Körnerleiter](tasks/03-koerner-leiter/readme.md)