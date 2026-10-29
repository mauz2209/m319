# Git

Git ist ein **Versionsverwaltungssystem**.

Wir verwenden Git, um unsere Programme zu verwalten und die Lösungen der Aufgaben auf [Codevogel](https://codevogel.ch) abzugeben.

Git speichert nicht einfach nur den aktuellen Stand eines Projekts.

Mit **Commits** hält Git die einzelnen Änderungen an einem Projekt fest.

Dadurch können wir nachvollziehen, wann etwas geändert wurde und wie sich ein Programm entwickelt hat.

## Git und Codevogel

Git läuft auf deinem Computer.

Codevogel basiert auf GitLab und stellt unsere Git-Repositories auf einem Server zur Verfügung.

Der typische Ablauf sieht so aus:

1. Du **klonst** das Repository auf deinen Computer.
2. Du arbeitest in deinem **eigenen Branch**.
3. Du bearbeitest eine Aufgabe.
4. Du speicherst deine Änderungen mit einem **Commit**.
5. Du überträgst deine Commits mit **Push** auf Codevogel.

## Repository

Ein **Repository** ist ein von Git verwaltetes Projekt.

Das Repository enthält die Dateien des Projekts und die mit Git gespeicherte Versionsgeschichte.

Das Repository für dieses Modul enthält beispielsweise:

~~~text
m319/
├── hamster-sim/
└── topics/
~~~

Unter `topics/` findest du die Unterlagen und Aufgaben.

Unter `hamster-sim/Programme/` speicherst du deine Lösungen zu den Hamsteraufgaben.

## Branches

Ein Repository kann mehrere **Branches** besitzen.

Der Branch `main` enthält die Unterlagen und Aufgaben der Lehrperson.

Du arbeitest auf einem persönlichen Branch mit deinem Nachnamen.

Beispiel:

~~~text
main
│
├── schneller
├── mueller
└── meier
~~~

Dadurch können alle mit demselben Repository arbeiten, ohne die Lösungen der anderen Lernenden zu verändern.

Es werden keine Lösungen in den Branch `main` gemergt.

## Commits

Ein **Commit** speichert einen Stand deiner Änderungen in der Versionsgeschichte.

Ein typischer Ablauf ist:

~~~bash
git add .
git commit -m "solution: 020-010-20-beispiel"
git push
~~~

Die Commit-Message beschreibt, was du gespeichert hast.

Für die Abgabe von Aufgaben verwenden wir eine vorgegebene Nomenklatur.

## Git LFS

Wir verwenden zusätzlich **Git LFS**.

LFS steht für **Large File Storage**.

Git LFS wird für bestimmte grössere Dateien verwendet, die sich nicht gut für die normale Git-Versionsverwaltung eignen.

Die notwendigen Regeln sind bereits im Repository eingerichtet.

## Aufträge

1. [Git installieren](tasks/10-git-installieren/readme.md)
2. [Das Projekt klonen](tasks/20-das-pojekt-klonen/readme.md)
3. [Den eigenen Branch erstellen](tasks/30-den-eigenen-branch-erstellen/readme.md)
4. [Hamsteraufgaben abgeben](tasks/40-hamsteraufgaben-abgeben/readme.md)
5. [Unterlagen aktualisieren](tasks/50-unterlagen-aktualisieren/readme.md)
6. [Mehr zu Git](tasks/60-mehr-zu-git/readme.md)

Nach diesen Aufträgen kennst du die wichtigsten Git-Befehle, die du für die Arbeit im Modul 319 benötigst.