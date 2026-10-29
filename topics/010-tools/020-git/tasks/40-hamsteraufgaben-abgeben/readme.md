# Hamsteraufgaben abgeben

In diesem Auftrag gibst du eine bearbeitete Hamsteraufgabe mit Git ab.

Alle Hamsteraufgaben werden in deinem **eigenen Branch** gespeichert.

Die Lösungen liegen im Verzeichnis:

~~~text
hamster-sim/Programme/
~~~

Für jede Aufgabe gibt es ein eigenes Verzeichnis.

## Lernziele

- Ich kann meine Hamsteraufgabe im richtigen Verzeichnis ablegen.
- Ich kann den Verzeichnisnamen anhand der vorgegebenen Nomenklatur bilden.
- Ich kann die richtigen Dateien für eine Hamsteraufgabe abgeben.
- Ich kann meine Lösung mit einer passenden Commit-Message speichern und auf Codevogel übertragen.

## 1. Eigenen Branch kontrollieren

Kontrolliere zuerst, ob du auf deinem eigenen Branch arbeitest.

~~~bash
git branch
~~~

Dein eigener Branch muss mit `*` markiert sein.

Beispiel:

~~~text
  main
* schneller
~~~

Falls du auf `main` bist, wechselst du zuerst auf deinen eigenen Branch.

~~~bash
git checkout [nachname]
~~~

## 2. Verzeichnis für die Aufgabe erstellen

Alle Hamsteraufgaben werden unter folgendem Pfad gespeichert:

~~~text
hamster-sim/Programme/
~~~

Für jede Aufgabe erstellst du dort ein eigenes Verzeichnis.

Der Verzeichnisname ergibt sich aus dem Pfad der Aufgabe.

Beispiel:

~~~text
topics/
└── 010-tools/
    └── 020-git/
        └── tasks/
            └── 40-hamsteraufgaben-abgeben/
~~~

Daraus wird:

~~~text
010-020-40-hamsteraufgaben-abgeben
~~~

Die Lösung liegt damit unter:

~~~text
hamster-sim/
└── Programme/
    └── 010-020-40-hamsteraufgaben-abgeben/
~~~

## 3. Ordnernomenklatur beachten

Für die Verzeichnisnamen gelten folgende Regeln:

- Die Nummern aus dem Verzeichnisbaum werden übernommen.
- Die Nummern werden mit `-` getrennt.
- Danach folgt der Name der Aufgabe.
- Es werden nur Kleinbuchstaben verwendet.
- Es werden keine Leerzeichen verwendet.
- Es werden keine Umlaute verwendet.
- Als Sonderzeichen wird nur `-` verwendet.

Beispiel:

~~~text
010-020-40-hamsteraufgaben-abgeben
~~~

## 4. Dateien ablegen

Kopiere deine Lösung in das Verzeichnis der Aufgabe.

Folgende Dateitypen werden abgegeben:

~~~text
*.ham
*.ter
*.java
~~~

Dazu gehören:

- die Hamsterprogramm-Datei mit der Endung `.ham`
- die verwendete Hamster-Territorium-Datei mit der Endung `.ter`
- die Java-Datei mit der Endung `.java`

Kontrolliere, dass alle Dateien vorhanden sind, die für deine Lösung benötigt werden.

## 5. Änderungen kontrollieren

Führe aus:

~~~bash
git status
~~~

Kontrolliere die Ausgabe.

Es sollen nur Dateien enthalten sein, die zu deiner Abgabe gehören.

## 6. Dateien für den Commit auswählen

Führe aus:

~~~bash
git add *.ham *.ter *.java
~~~

Kontrolliere danach erneut:

~~~bash
git status
~~~

Die Dateien deiner Aufgabe müssen jetzt für den Commit vorgemerkt sein.

## 7. Commit erstellen

Für jede abgegebene Aufgabe erstellst du einen Commit.

Die Commit-Message verwendet folgendes Format:

~~~text
solution: [aufgabenname]
~~~

Der Aufgabenname entspricht dem Namen deines Lösungsverzeichnisses.

Beispiel:

~~~bash
git commit -m "solution: 010-020-40-hamsteraufgaben-abgeben"
~~~

Achte darauf, dass die Commit-Message genau zur abgegebenen Aufgabe passt.

## 8. Lösung auf Codevogel übertragen

Übertrage deine Änderungen auf Codevogel:

~~~bash
git push
~~~

## 9. Abgabe kontrollieren

Öffne dein Repository auf Codevogel.

Wähle deinen eigenen Branch.

Öffne:

~~~text
hamster-sim/Programme/
~~~

Kontrolliere deine Abgabe.

Prüfe insbesondere:

- Ist das richtige Aufgabenverzeichnis vorhanden?
- Entspricht der Verzeichnisname der Nomenklatur?
- Sind die benötigten `.ham`, `.ter` und `.java` Dateien vorhanden?
- Befindet sich die Lösung auf deinem eigenen Branch?

## Fertig, wenn ...

- deine Lösung unter `hamster-sim/Programme/` liegt.
- die Lösung in einem eigenen Verzeichnis liegt.
- der Verzeichnisname der vorgegebenen Nomenklatur entspricht.
- die benötigten `*.ham`, `*.ter` und `*.java` Dateien abgegeben sind.
- die Commit-Message dem vorgegebenen Format entspricht.
- die Lösung auf deinem eigenen Branch bei Codevogel sichtbar ist.