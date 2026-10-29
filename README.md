# Modul 319 – Applikationen entwerfen und implementieren

In diesem Modul lernst du die Grundlagen der Programmierung.

Wir beginnen mit einfachen Abläufen.

Danach programmieren wir den Hamster zuerst imperativ und später objektorientiert.

Dabei lernst du Schritt für Schritt wichtige Konzepte wie Entscheidungen, Schleifen, Variablen, Funktionen und Arrays kennen.

Am Ende übertragen wir diese Grundlagen auf normale Java-Programme.

## Inhalte

### 1. Werkzeuge

Bevor wir programmieren, richten wir unsere Arbeitsumgebung ein.

Du lernst die Werkzeuge kennen, die wir während des Moduls verwenden.

➡️ [Werkzeuge](topics/010-tools/readme.md)

Dazu gehören unter anderem:

- Codevogel
- Git
- Markdown
- Java
- Hamster-Simulator
- Visual Studio Code

### 2. Lineare Abläufe

Bevor wir Programmcode schreiben, beschäftigen wir uns mit Abläufen.

Wir zerlegen ein Problem in einzelne Schritte und bringen diese in eine sinnvolle Reihenfolge.

➡️ [Lineare Abläufe](topics/020-lineare-ablaeufe/readme.md)

### 3. Imperativer Hamster

Mit dem imperativen Hamster lernst du die wichtigsten Grundlagen der Programmierung.

➡️ [Imperativer Hamster](topics/030-imperativer-hamster/readme.md)

Die Themen bauen aufeinander auf:

1. [Hamster-Befehle](topics/030-imperativer-hamster/010-hamster-befehle/readme.md)
2. [Struktur mit Funktionen](topics/030-imperativer-hamster/020-struktur-mit-funktionen/readme.md)
3. [Entscheidungen](topics/030-imperativer-hamster/030-entscheidungen/readme.md)
4. [`while`-Schleifen](topics/030-imperativer-hamster/040-while-schleifen/readme.md)
5. [Variablen](topics/030-imperativer-hamster/050-variablen/readme.md)
6. [`for`-Schleifen](topics/030-imperativer-hamster/060-for-schleifen/readme.md)
7. [Funktionen mit Parametern](topics/030-imperativer-hamster/070-funktionen-mit-parameter/readme.md)
8. [Funktionen mit Rückgabewert](topics/030-imperativer-hamster/080-funktionen-mit-rueckgabewert/readme.md)
9. [Eindimensionale Arrays](topics/030-imperativer-hamster/090-eindimensionale-arrays/readme.md)
10. [Logische Operatoren](topics/030-imperativer-hamster/100-logische-operatoren/readme.md)
11. [Challenges](topics/030-imperativer-hamster/110-challenges/readme.md)

### 4. Objektorientierter Hamster

Danach wechseln wir zur objektorientierten Programmierung.

Wir arbeiten mit mehreren Hamster-Objekten und erstellen eigene Hamster-Klassen.

Die Themen sind:

1. [Hamster-Objekte](topics/040-objektorientierter-hamster/010-hamster-objekte/readme.md)
2. [Eigene Hamster-Klassen](topics/040-objektorientierter-hamster/020-eigene-hamster-klassen/readme.md)
3. [Herausforderungen](topics/040-objektorientierter-hamster/030-herausforderungen/readme.md)

### 5. Java-Programme

Die mit dem Hamster erlernten Konzepte übertragen wir anschliessend auf normale Java-Programme.

➡️ [Java-Programme](topics/050-java-programme/readme.md)

## Hamster-Simulator

Der Hamster-Simulator ist direkt im Projekt enthalten.

Du findest ihn im Ordner:

~~~text
hamster-sim/
~~~

Deine eigenen Hamster-Programme speicherst du unter:

~~~text
hamster-sim/Programme/
~~~

Zum Starten des Simulators stehen Skripte für Windows und Linux zur Verfügung:

- [Windows: `hamster-start.bat`](hamster-sim/hamster-start.bat)
- [Linux: `hamster-start.sh`](hamster-sim/hamster-start.sh)

## Arbeiten mit Git

Du arbeitest während des Moduls in deinem eigenen Branch.

Der Branch `main` enthält die aktuellen Unterlagen und Aufgaben.

Deine Lösungen speicherst du mit Commits und überträgst sie mit Git auf Codevogel.

Die nötigen Schritte lernst du in den [Git-Unterlagen](topics/010-tools/020-git/readme.md).

## Aufbau der Unterlagen

Die Unterlagen sind nach Themen gegliedert.

Ein Thema kann folgende Verzeichnisse enthalten:

~~~text
thema/
├── readme.md
├── slides/
└── tasks/
~~~

Die Datei `readme.md` führt in ein Thema ein.

Unter `tasks/` findest du die dazugehörenden Aufgaben.

Unter `slides/` können weitere Unterrichtsunterlagen liegen.

## Aufgaben bearbeiten

Lies zuerst die Einführung zum jeweiligen Thema.

Bearbeite danach die Aufgaben in der angegebenen Reihenfolge.

Bei den Hamster-Aufgaben erstellst du für jede Aufgabe einen eigenen Ordner unter:

~~~text
hamster-sim/Programme/
~~~

Halte dich dabei an den in der Aufgabe angegebenen Ordnernamen.

Speichere deine Arbeit regelmässig mit Git.

Teste deine Programme und achte darauf, dass sie nicht nur für einen zufälligen Testfall funktionieren.

## Ressourcen

Im Projekt findest du zusätzliche Unterlagen zum Hamster-Modell:

- [Der imperative Hamster](resources/der-imperative-hamster.pdf)
- [Der objektorientierte Hamster](resources/der-objektorientierte-hamster.pdf)