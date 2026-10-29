# Das Projekt klonen

In diesem Auftrag lädst du das Repository für das Modul 319 auf deinen Computer.

Diesen Vorgang nennt man bei Git **klonen**.

Beim Klonen erstellt Git eine lokale Kopie des Projekts auf deinem Computer.

## Lernziele

- Ich kann ein vorhandenes Git-Repository von Codevogel auf meinen Computer klonen.
- Ich kann mit der Git Bash oder dem Terminal zu einem gewünschten Verzeichnis navigieren.
- Ich kann in das geklonte Repository wechseln.
- Ich kann kontrollieren, ob das Repository korrekt geklont wurde.

## Auftrag

### 1. Projekt auf Codevogel öffnen

Öffne das Repository für das Modul 319 auf Codevogel.

Die Lehrperson gibt dir den Link zum Repository.

### 2. Repository-Adresse kopieren

Klicke auf Codevogel auf den blauen **Code**-Button.

Kopiere unter **Clone with HTTPS** die HTTPS-Adresse des Repositorys.

Sie beginnt mit:

```text
https://codevogel.ch/...
```

### 3. Kommandozeile öffnen

Je nach Betriebssystem verwendest du ein anderes Programm.

**Windows:** Öffne die **Git Bash**.

**macOS:** Öffne das **Terminal**.

Die folgenden Git-Befehle funktionieren in beiden Programmen.

### 4. Speicherort wählen

Wähle einen geeigneten Ort für deine Git-Repositories.

> **Wichtig:** Speichere Git-Repositories nach Möglichkeit nicht in einem Verzeichnis, das von OneDrive oder einem anderen Synchronisationsprogramm synchronisiert wird.
>
> Git verwaltet die Dateien selbst. Eine zusätzliche Synchronisation kann zu Problemen führen.

#### Windows mit Git Bash

Die Git Bash verwendet für Laufwerke eine Unix-ähnliche Schreibweise.

Das Windows-Laufwerk:

```text
C:\
```

wird in der Git Bash als:

```text
/c/
```

angesprochen.

Um beispielsweise nach `C:\Users` zu wechseln, verwendest du:

```bash
cd /c/Users
```

Mit `ls` kannst du anzeigen, welche Dateien und Verzeichnisse vorhanden sind:

```bash
ls
```

Wechsle mit `cd` in das Verzeichnis, in welchem du das Repository speichern möchtest.

#### macOS mit Terminal

Auf macOS kannst du beispielsweise in dein Verzeichnis `Documents` wechseln:

```bash
cd ~/Documents
```

Mit `ls` kannst du anzeigen, welche Dateien und Verzeichnisse vorhanden sind:

```bash
ls
```

Wechsle mit `cd` in das Verzeichnis, in welchem du das Repository speichern möchtest.

### 5. Speicherort kontrollieren

Kontrolliere mit:

```bash
pwd
```

in welchem Verzeichnis du dich gerade befindest.

`pwd` zeigt dir den vollständigen Pfad des aktuellen Verzeichnisses.

Erstelle das Verzeichnis `m319` **nicht** selbst.

Git erstellt dieses Verzeichnis beim Klonen automatisch.

### 6. Repository klonen

Führe folgenden Befehl aus:

```bash
git clone [url]
```

Ersetze `[url]` durch die HTTPS-Adresse, die du auf Codevogel kopiert hast.

Beispiel:

```bash
git clone https://codevogel.ch/...
```

Git lädt nun das Repository herunter und erstellt das Verzeichnis `m319`.

Es kann sein, dass du nach deinem Benutzernamen und Passwort gefragt wirst.

Verwende deinen **Codevogel-Benutzernamen** und dein **Codevogel-Passwort**.

### 7. In das Repository wechseln

Wechsle in das geklonte Projekt:

```bash
cd m319
```

Kontrolliere mit:

```bash
pwd
```

ob du dich im richtigen Verzeichnis befindest.

### 8. Inhalt kontrollieren

Zeige den Inhalt des Repositorys an:

```bash
ls
```

Du solltest unter anderem folgende Verzeichnisse sehen:

```text
hamster-sim/
topics/
```

Damit weisst du, dass du dich im geklonten Repository befindest.

## Wichtig

Das Repository wird nur **einmal** geklont.

Wenn du später neue Aufgaben oder Änderungen der Lehrperson erhältst, klonst du das Repository nicht erneut.

Die Änderungen werden mit Git in das bereits vorhandene Repository übernommen.

## Fertig, wenn ...

- sich das Repository auf deinem Computer befindet.
- du unter Windows die Git Bash oder unter macOS das Terminal verwendet hast.
- das Repository nicht in einem von OneDrive synchronisierten Verzeichnis liegt.
- du dich im Verzeichnis `m319` befindest.
- du mit `ls` die Verzeichnisse `hamster-sim` und `topics` sehen kannst.