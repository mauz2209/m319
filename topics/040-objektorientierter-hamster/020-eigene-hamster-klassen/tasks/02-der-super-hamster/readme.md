# Aufgabe – Der Super-Hamster

Deine eigene Hamster-Klasse soll nun einen Konstruktor erhalten.

Dabei lernst du `super()` kennen.

Mit `super()` rufst du den Konstruktor der übergeordneten Klasse `Hamster` auf.

## Lernziel

Ich kann in einer eigenen Hamster-Klasse einen Konstruktor erstellen und mit `super()` den passenden Konstruktor der Klasse `Hamster` aufrufen.

## Auftrag

1. Erstelle für die Aufgabe einen eigenen Ordner nach Vorgabe.
2. Erstelle die Klasse `SuperHamster`.
3. `SuperHamster` soll die Klasse `Hamster` erweitern.
4. Erstelle einen Konstruktor für `SuperHamster`.
5. Der Konstruktor soll die benötigten Werte als Parameter erhalten.
6. Rufe im Konstruktor mit `super(...)` den Konstruktor der Klasse `Hamster` auf.
7. Erstelle in `main()` ein Objekt der Klasse `SuperHamster`.
8. Übergib beim Erstellen des Objekts passende Argumente an den Konstruktor.
9. Lass den Super-Hamster einige Hamster-Methoden ausführen.
10. Teste dein Programm im Hamster-Simulator.

## `super()`

Ein Konstruktor der eigenen Klasse kann beispielsweise so aufgebaut sein:

~~~java
class SuperHamster extends Hamster {

    SuperHamster(/* Parameter */) {
        super(/* Argumente */);
    }
}
~~~

`super(...)` ruft den Konstruktor der übergeordneten Klasse auf.

In unserem Fall ist die übergeordnete Klasse `Hamster`.

Wichtig ist:

> `super(...)` muss im Konstruktor vor den eigenen Anweisungen stehen.

Deine Aufgabe ist fertig, wenn du einen `SuperHamster` mit deinem eigenen Konstruktor erzeugst und der Konstruktor von `Hamster` über `super(...)` aufgerufen wird.