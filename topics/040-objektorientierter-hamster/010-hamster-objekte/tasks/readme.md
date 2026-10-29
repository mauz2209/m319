# Hamster-Objekte

Bisher haben wir mit einem einzelnen Hamster programmiert.

Nun wechseln wir zur **objektorientierten Programmierung**.

Dabei betrachten wir einen Hamster als **Objekt**.

## Objekte

Ein Objekt besitzt **Eigenschaften** und **Verhalten**.

Ein Hamster kennt beispielsweise:

- seine Position,
- seine Blickrichtung,
- die Anzahl Körner in seinem Maul.

Ein Hamster kann beispielsweise:

- vorwärtsgehen,
- sich drehen,
- Körner aufnehmen,
- Körner ablegen.

Eigenschaften beschreiben, was ein Objekt **weiss oder kennt**.

Methoden beschreiben, was ein Objekt **kann oder tut**.

## Mehrere Hamster

In der objektorientierten Programmierung können wir mehrere Hamster erzeugen.

~~~java
Hamster anna = new Hamster();
Hamster ben = new Hamster();
~~~

`anna` und `ben` sind zwei unterschiedliche Hamster-Objekte.

Mit `new` wird ein neues Objekt erzeugt.

## Methoden aufrufen

Bisher haben wir beispielsweise geschrieben:

~~~java
vor();
~~~

Bei mehreren Hamstern müssen wir angeben, **welcher Hamster** etwas tun soll.

~~~java
anna.vor();
ben.vor();
~~~

Der Punkt `.` verbindet das Objekt mit seiner Methode.

~~~text
anna.vor()
│    │
│    └── Methode
│
└── Objekt
~~~

So können verschiedene Hamster unabhängig voneinander handeln.

# Aufgaben

1. [Wimmel-Objekte](tasks/01-wimmel-objekte/readme.md)
2. [Hamster-Objekte](tasks/02-hamster-objekte/readme.md)
3. [Hamster-API](tasks/03-hamster-api/readme.md)
4. [Hamster-Konstruktoren](tasks/04-hamster-konstruktoren/readme.md)