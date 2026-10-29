# Git installieren

In diesem Auftrag installierst du **Git** und **Git LFS** auf deinem Computer.

Git ist ein Versionsverwaltungssystem.

Wir verwenden Git, um Änderungen an unserem Projekt zu speichern und mit Codevogel auszutauschen.

Git LFS erweitert Git für grössere Dateien.

## Lernziele

- Ich kann Git auf meinem Computer installieren.
- Ich kann Git LFS auf meinem Computer installieren.
- Ich kann mit Befehlen kontrollieren, ob Git und Git LFS korrekt installiert sind.
- Ich kann meinen Namen und meine E-Mail-Adresse für Git konfigurieren.
- Ich kann meine Git-Konfiguration kontrollieren.

## Auftrag

### 1. Prüfen, ob Git bereits installiert ist

Öffne ein Terminal.

Führe folgenden Befehl aus:

~~~bash
git --version
~~~

Wenn eine Versionsnummer angezeigt wird, ist Git bereits installiert.

Beispiel:

~~~text
git version 2.51.0
~~~

### 2. Git installieren

#### Windows

Falls Git noch nicht installiert ist, lade Git von der offiziellen Webseite herunter:

[https://git-scm.com](https://git-scm.com)

Installiere die aktuelle Version.

Du kannst bei der Installation grundsätzlich die vorgeschlagenen Einstellungen übernehmen.

#### macOS

Auf macOS verwendest du **Homebrew**.

Falls Homebrew noch nicht installiert ist, findest du die Installation unter:

[https://brew.sh](https://brew.sh)

Installiere Git mit:

~~~bash
brew install git
~~~

### 3. Git LFS installieren

Git LFS muss zusätzlich zu Git installiert werden.

#### Windows

Lade Git LFS von der offiziellen Webseite herunter:

[https://git-lfs.com](https://git-lfs.com)

Installiere Git LFS.

#### macOS

Installiere Git LFS mit Homebrew:

~~~bash
brew install git-lfs
~~~

### 4. Git LFS aktivieren

#### Windows

Öffne die **GitBash**. Führe nach der Installation folgenden Befehl aus:

~~~bash
git lfs install
~~~

Git LFS wird damit für deinen Benutzer eingerichtet.

#### macOS

Führe nach der Installation folgenden Befehl aus:

~~~bash
git lfs install
~~~

Git LFS wird damit für deinen Benutzer eingerichtet.

### 5. Installation kontrollieren

Schliesse nach der Installation das Terminal.

Öffne ein neues Terminal. Wenn du mit Windows arbeitest, nutze die **GitBash**.

Kontrolliere zuerst Git:

~~~bash
git --version
~~~

Kontrolliere danach Git LFS:

~~~bash
git lfs version
~~~

Beide Befehle müssen eine Versionsnummer anzeigen.

### 6. Benutzer konfigurieren

Wenn du mit Windows arbeitest, nutze die **GitBash**.

Git speichert bei jedem Commit, wer die Änderung erstellt hat.

Konfiguriere deshalb deinen Vor- und Nachnamen:

~~~bash
git config --global user.name "Vorname Nachname"
~~~

Beispiel:

~~~bash
git config --global user.name "Max Muster"
~~~

Konfiguriere danach deine E-Mail-Adresse:

~~~bash
git config --global user.email "deine.email@example.com"
~~~

Verwende die gleiche E-Mail-Adresse, die bei deinem Codevogel-Konto hinterlegt ist.

### 7. Konfiguration kontrollieren

Kontrolliere deinen Namen:

~~~bash
git config --global user.name
~~~

Kontrolliere deine E-Mail-Adresse:

~~~bash
git config --global user.email
~~~

Du kannst auch die gesamte Git-Konfiguration anzeigen:

~~~bash
git config --global --list
~~~

Kontrolliere, ob dein Name und deine E-Mail-Adresse korrekt sind.

## Fertig, wenn ...

- Git auf deinem Computer installiert ist.
- Git LFS auf deinem Computer installiert ist.
- `git --version` ohne Fehlermeldung ausgeführt wird.
- `git lfs version` ohne Fehlermeldung ausgeführt wird.
- `git lfs install` erfolgreich ausgeführt wurde.
- dein Vor- und Nachname mit `user.name` konfiguriert ist.
- deine bei Codevogel verwendete E-Mail-Adresse mit `user.email` konfiguriert ist.