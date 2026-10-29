# Hamster-Objekte

Bisher haben wir mit dem **imperativen Hamster** gearbeitet.

Dabei gab es genau einen Hamster.

Befehle konnten wir direkt aufrufen:

~~~java
vor();
linksUm();
nimm();
~~~

Nun wechseln wir zur **objektorientierten Programmierung**.

Dabei arbeiten wir mit **Objekten**.

## Ein Hamster als Objekt

Ein Hamster ist ein Objekt.

Ein Objekt besitzt einen Zustand und kann bestimmte Dinge tun.

Ein Hamster kennt beispielsweise:

- seine Position,
- seine Blickrichtung,
- die Anzahl Körner in seinem Maul.

Ein Hamster kann beispielsweise:

- vorwärtsgehen,
- sich nach links drehen,
- ein Korn aufnehmen,
- ein Korn ablegen.

Die Aktionen eines Objekts nennen wir **Methoden**.

## Methoden aufrufen

Beim objektorientierten Hamster geben wir an, welches Objekt eine Methode ausführen soll.

~~~java
paul.vor();
paul.linksUm();
paul.nimm();
~~~

`paul` ist das Hamster-Objekt.

`vor()` ist eine Methode des Hamsters.

Der Punkt `.` verbindet das Objekt mit seiner Methode.

~~~text
paul.vor()
│    │
│    └── Methode
│
└── Objekt
~~~

## Mehrere Hamster

Ein wichtiger Vorteil wird sichtbar, wenn wir mehrere Hamster verwenden.

~~~java
anna.vor();
ben.linksUm();
anna.nimm();
~~~

`anna` und `ben` sind zwei verschiedene Hamster-Objekte.

Jeder Hamster besitzt seine eigene Position, Blickrichtung und Anzahl Körner.

Wir können deshalb gezielt bestimmen, welcher Hamster eine Aktion ausführt.

## Klasse und Objekt

Die Klasse `Hamster` beschreibt, was ein Hamster kann.

Ein konkreter Hamster ist ein **Objekt** dieser Klasse.

Aus derselben Klasse können mehrere Objekte entstehen.

~~~text
Klasse Hamster
     │
     ├── Hamster-Objekt anna
     ├── Hamster-Objekt ben
     └── Hamster-Objekt paul
~~~

Die Klasse ist also die gemeinsame Beschreibung.

Die einzelnen Hamster sind konkrete Objekte.

## Ein Hamster-Objekt erzeugen

Ein neues Hamster-Objekt erzeugen wir mit `new`.

~~~java
Hamster paul = new Hamster();
~~~

`Hamster` ist die Klasse.

`paul` ist die Variable, über die wir auf das Objekt zugreifen.

`new Hamster()` erzeugt das neue Hamster-Objekt.

Danach können wir seine Methoden verwenden:

~~~java
paul.vor();
paul.linksUm();
~~~

# Aufgaben

1. [Wimmel-Objekte](tasks/01-wimmel-objekte/readme.md)
2. [Hamster-Objekte](tasks/02-hamster-objekte/readme.md)
3. [Hamster-API](tasks/03-hamster-api/readme.md)
4. [Hamster-Konstruktoren](tasks/04-hamster-konstruktoren/readme.md)