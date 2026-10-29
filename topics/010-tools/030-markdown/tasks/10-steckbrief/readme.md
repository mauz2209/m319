# Steckbrief mit Markdown erstellen

Auf Codevogel findest du viele Texte, die mit **Markdown** geschrieben sind.

Auch die Aufgaben in diesem Modul sind Markdown-Dateien.

In diesem Auftrag lernst du die wichtigsten Grundlagen von Markdown kennen und erstellst damit einen Steckbrief über dich.

## Lernziele

- Ich kann erklären, dass Markdown Text mit einfachen Auszeichnungen ist.
- Ich kann Überschriften, Listen, Hervorhebungen und Codeblöcke mit Markdown erstellen.
- Ich kann ein Bild mit einem relativen Pfad in eine Markdown-Datei einbinden.
- Ich kann einen persönlichen Steckbrief als Markdown-Datei erstellen und auf Codevogel abgeben.

## Was ist Markdown?

Markdown ist eine einfache **Auszeichnungssprache für Text**.

Eine Markdown-Datei ist eine normale Textdatei.

Sie hat normalerweise die Dateiendung:

```text
.md
```

Mit bestimmten Zeichen zeichnest du Teile des Textes aus.

Aus:

```markdown
# Mein Steckbrief

Ich lerne **Applikationsentwicklung**.
```

wird bei Codevogel eine formatierte Darstellung mit einer Überschrift und fettem Text.

> **Wichtig:** Markdown ist keine Programmiersprache.
>
> Wir speichern diese Aufgabe trotzdem unter `hamster-sim/Programme/`.
>
> Das machen wir hier zu **Übungszwecken**, damit du bereits den gleichen Ablauf für die späteren Hamsterprogramme verwendest.

## Die wichtigsten Markdown-Auszeichnungen

### Überschriften

Überschriften werden mit `#` erstellt.

```markdown
# Überschrift 1

## Überschrift 2

### Überschrift 3
```

Je mehr `#` du verwendest, desto kleiner ist die Überschrift.

### Text hervorheben

Text kann fett oder kursiv dargestellt werden.

```markdown
Das ist **fett**.

Das ist *kursiv*.

Das ist `Code`.
```

### Listen

Eine Liste kannst du mit `-` erstellen.

```markdown
- Java
- Python
- JavaScript
```

Eine nummerierte Liste erstellst du mit Zahlen:

```markdown
1. Programmieren lernen
2. Erfahrungen sammeln
3. Lehrabschluss bestehen
```

### Links

Links werden so geschrieben:

```markdown
[Codevogel](https://codevogel.ch)
```

### Bilder

Bilder werden ähnlich wie Links eingebunden.

Vor dem Link steht zusätzlich ein `!`.

```markdown
![Beschreibung des Bildes](img/profilbild.jpg)
```

Wir verwenden **relative Pfade**.

Dadurch bezieht sich der Pfad auf die Dateien innerhalb unseres Projekts.

### Codeblöcke

Programmcode oder andere vorformatierte Inhalte können in einem Codeblock dargestellt werden.

Ein Beispiel für Java:

~~~markdown
```java
System.out.println("Hallo Welt!");
```
~~~

Durch die Angabe von `java` kann Markdown den Programmcode passend darstellen.

## Auftrag

Erstelle einen persönlichen Steckbrief über dich.

### 1. Verzeichnis erstellen

Auch diese Aufgabe legst du unter folgendem Verzeichnis ab:

```text
hamster-sim/Programme/
```

Beachte die bekannte Ordnernomenklatur.

Der Pfad dieser Aufgabe lautet:

```text
topics/010-tools/030-markdown/tasks/10-steckbrief/
```

Dein Lösungsverzeichnis lautet deshalb:

```text
hamster-sim/Programme/010-030-10-steckbrief/
```

Erstelle darin eine Datei:

```text
readme.md
```

### 2. Profilbild ablegen

Verwende das Profilbild, das du bereits für Codevogel erstellt hast.

Erstelle in deinem Lösungsverzeichnis ein Verzeichnis `img`.

Lege dein Profilbild dort ab.

Die Struktur sieht beispielsweise so aus:

```text
hamster-sim/
└── Programme/
    └── 010-030-10-steckbrief/
        ├── readme.md
        └── img/
            └── profilbild.jpg
```

Binde das Bild mit einem **relativen Pfad** in deinen Steckbrief ein.

Beispiel:

```markdown
![Mein Profilbild](img/profilbild.jpg)
```

### 3. Steckbrief schreiben

Dein Steckbrief enthält mindestens folgende Angaben:

- Vorname
- Nachname
- Geburtsdatum
- Lehrbetrieb
- Lehrberuf
- Motivation für deine Lehre
- Interessen oder Hobbys

Du darfst weitere Informationen ergänzen.

### 4. Markdown verwenden

Dein Steckbrief muss mindestens folgende Markdown-Elemente enthalten:

- eine Überschrift der Stufe 1 mit `#`
- mindestens eine weitere Überschrift
- **fetten** oder *kursiven* Text
- eine Liste
- einen Link
- dein Profilbild
- einen Codeblock

Für den Codeblock kannst du beispielsweise ein kleines Stück Programmcode verwenden, das du bereits kennst.

### 5. Aufgabe abgeben

Kontrolliere zuerst deine Änderungen:

```bash
git status
```

Füge deine Änderungen hinzu:

```bash
git add .
```

Erstelle den Commit mit der bekannten Commit-Message:

```bash
git commit -m "solution: 010-030-10-steckbrief"
```

Übertrage deine Lösung auf Codevogel:

```bash
git push origin [lastname]
```

Nutze für `[lastname]` deinen Branchnamen, sprich Nachnamen, also z.B. `meier` ohne `[]`

### 6. Vorschau kontrollieren

Öffne deine `readme.md` auf Codevogel.

Codevogel stellt Markdown automatisch formatiert dar.

Kontrolliere insbesondere:

- Sind die Überschriften richtig dargestellt?
- Wird die Liste richtig dargestellt?
- Funktioniert dein Link?
- Wird dein Profilbild angezeigt?
- Wird dein Codeblock richtig dargestellt?

Falls etwas nicht funktioniert, vergleiche deinen Markdown-Text mit den Beispielen in diesem Auftrag.

## Fertig, wenn ...

- dein Steckbrief unter `hamster-sim/Programme/010-030-10-steckbrief/` liegt.
- dein Steckbrief in einer `readme.md` gespeichert ist.
- du Überschriften, Hervorhebungen und eine Liste verwendet hast.
- du einen Link eingefügt hast.
- du einen Codeblock verwendet hast.
- dein Profilbild unter `img/` liegt.
- du dein Profilbild mit einem relativen Pfad eingebunden hast.
- dein Steckbrief auf Codevogel korrekt dargestellt wird.
- du die Aufgabe mit der korrekten Commit-Message abgegeben hast.