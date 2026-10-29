# Absolute und relative Pfade

Du hast das Repository für das Modul 319 bereits auf deinen Computer geklont.

Das Repository besteht aus vielen Verzeichnissen und Dateien.

In diesem Auftrag lernst du, dich mit der **Git Bash** in dieser Verzeichnisstruktur zu bewegen.

Dabei unterscheidest du zwischen **absoluten** und **relativen Pfaden**.

## Lernziele

- Ich kann einen absoluten Pfad von einem relativen Pfad unterscheiden.
- Ich kann mit `pwd` meinen aktuellen Pfad anzeigen.
- Ich kann mit `ls` den Inhalt eines Verzeichnisses anzeigen.
- Ich kann mit `cd` in ein anderes Verzeichnis wechseln.
- Ich kann mit `..` in das übergeordnete Verzeichnis wechseln.
- Ich kann mit absoluten und relativen Pfaden zu einem Verzeichnis navigieren.
- Ich kann die unterschiedliche Schreibweise von Pfaden in der Git Bash und unter Windows erkennen.

## 1. Git Bash öffnen

Öffne die **Git Bash**.

Wechsle in dein geklontes Repository `m319`.

Falls du nicht mehr weisst, wo du das Repository gespeichert hast, suche es zuerst mit dem Datei-Explorer.

> **Wichtig:** Die Befehle und Pfade in diesem Auftrag verwenden die Schreibweise der **Git Bash**.
>
> Windows verwendet für Pfade eine andere Schreibweise.

## 2. Wo bin ich?

Mit folgendem Befehl kannst du anzeigen, in welchem Verzeichnis du dich gerade befindest:

```bash
pwd
```

`pwd` steht für **Print Working Directory**.

Die Ausgabe kann beispielsweise so aussehen:

```text
/c/Users/max/Documents/m319
```

Dieser Pfad beschreibt den vollständigen Weg zu deinem Repository.

Es handelt sich um einen **absoluten Pfad**.

## 3. Pfade in Git Bash und Windows

Die Git Bash verwendet für Pfade eine Schreibweise, wie sie unter Linux üblich ist.

Ein Pfad kann dort beispielsweise so aussehen:

```text
/c/Users/max/Documents/m319
```

Im Windows-Datei-Explorer wird derselbe Pfad so dargestellt:

```text
C:\Users\max\Documents\m319
```

Es gibt zwei wichtige Unterschiede.

### Laufwerk

Windows verwendet einen Laufwerkbuchstaben mit Doppelpunkt:

```text
C:
```

Die Git Bash schreibt das Laufwerk als Teil des Pfades:

```text
/c
```

### Trennzeichen

Windows verwendet einen **Backslash** `\`:

```text
C:\Users\max\Documents\m319
```

Die Git Bash verwendet einen **Slash** `/`:

```text
/c/Users/max/Documents/m319
```

Beide Pfade können also denselben Ort auf deinem Computer beschreiben.

| Git Bash | Windows |
| --- | --- |
| `/c/Users/max` | `C:\Users\max` |
| `/c/Users/max/Documents` | `C:\Users\max\Documents` |
| `/d/Projekte/m319` | `D:\Projekte\m319` |

In diesem Auftrag verwendest du die **Git-Bash-Schreibweise**.

## 4. Was befindet sich hier?

Zeige den Inhalt des aktuellen Verzeichnisses an:

```bash
ls
```

Du solltest unter anderem die Verzeichnisse `topics` und `hamster-sim` sehen.

`ls` steht für **List**.

## 5. In ein Verzeichnis wechseln

Mit `cd` wechselst du das aktuelle Verzeichnis.

`cd` steht für **Change Directory**.

Wechsle vom Hauptverzeichnis des Repositorys nach `topics`:

```bash
cd topics
```

Kontrolliere anschliessend deinen aktuellen Pfad:

```bash
pwd
```

Du befindest dich jetzt beispielsweise hier:

```text
/c/Users/max/Documents/m319/topics
```

## 6. Relative Pfade

Beim Befehl:

```bash
cd topics
```

ist `topics` ein **relativer Pfad**.

Der Pfad wird ausgehend von deinem **aktuellen Verzeichnis** interpretiert.

Wenn du dich in:

```text
/c/Users/max/Documents/m319
```

befindest, bedeutet:

```text
topics
```

also:

```text
/c/Users/max/Documents/m319/topics
```

Ein relativer Pfad beschreibt den Weg **vom aktuellen Verzeichnis aus**.

## 7. Mehrere Verzeichnisse auf einmal wechseln

Du musst nicht jedes Verzeichnis einzeln mit `cd` öffnen.

Wechsle zuerst zurück in das Hauptverzeichnis `m319`.

Navigiere danach mit **einem Befehl** zu diesem Auftrag:

```bash
cd topics/010-tools/020-git/tasks/25-absolute-und-relative-pfade
```

Kontrolliere:

```bash
pwd
```

Der verwendete Pfad ist wieder ein **relativer Pfad**.

Er beginnt beim aktuellen Verzeichnis.

## 8. Eine Ebene zurück

Mit `..` sprichst du das übergeordnete Verzeichnis an.

Führe aus:

```bash
cd ..
```

Kontrolliere danach:

```bash
pwd
```

Du solltest dich jetzt im Verzeichnis `tasks` befinden.

Du kannst auch mehrere Ebenen auf einmal zurückgehen:

```bash
cd ../..
```

Jedes `..` bedeutet **eine Ebene nach oben**.

## 9. Absolute Pfade

Ein **absoluter Pfad** beschreibt den vollständigen Weg zu einer Datei oder einem Verzeichnis.

In der Git Bash sieht ein absoluter Pfad beispielsweise so aus:

```text
/c/Users/max/Documents/m319/topics/010-tools/020-git
```

Mit `cd` kannst du direkt zu diesem Verzeichnis wechseln:

```bash
cd /c/Users/max/Documents/m319/topics/010-tools/020-git
```

Dieser Befehl funktioniert unabhängig davon, in welchem Verzeichnis du dich vorher befunden hast.

Unter Windows würde derselbe Pfad beispielsweise so aussehen:

```text
C:\Users\max\Documents\m319\topics\010-tools\020-git
```

Dein tatsächlicher absoluter Pfad wird anders aussehen.

Finde ihn mit `pwd` heraus.

## 10. Absolut oder relativ?

Ordne die folgenden Pfade zu.

Gehe davon aus, dass du dich hier befindest:

```text
/c/Users/max/Documents/m319
```

| Pfad | absolut oder relativ? |
| --- | --- |
| `/c/Users/max/Documents/m319/topics` | ? |
| `topics` | ? |
| `topics/010-tools` | ? |
| `/c/Users/max/Documents` | ? |
| `../` | ? |
| `hamster-sim/Programme` | ? |

## 11. Navigieren

Beginne im Hauptverzeichnis des Repositorys.

Kontrolliere zuerst:

```bash
pwd
```

Löse danach die folgenden Aufgaben **nur mit Befehlen in der Git Bash**.

1. Wechsle mit einem relativen Pfad nach `topics/010-tools`.
2. Zeige deinen aktuellen Pfad an.
3. Zeige den Inhalt des Verzeichnisses an.
4. Wechsle nach `020-git`.
5. Wechsle wieder eine Ebene zurück.
6. Wechsle zurück in das Hauptverzeichnis `m319`.
7. Wechsle mit einem relativen Pfad nach `hamster-sim/Programme`.
8. Zeige deinen aktuellen absoluten Pfad an.
9. Wechsle mit diesem absoluten Pfad nochmals nach `hamster-sim/Programme`.

## 12. Merksatz

**Absoluter Pfad:**

Der vollständige Weg zu einer Datei oder einem Verzeichnis.

Git Bash:

```text
/c/Users/max/Documents/m319/hamster-sim/Programme
```

Windows:

```text
C:\Users\max\Documents\m319\hamster-sim\Programme
```

**Relativer Pfad:**

Der Weg ausgehend vom aktuellen Verzeichnis.

```text
hamster-sim/Programme
```

Welcher relative Pfad funktioniert, hängt davon ab, **wo du dich gerade befindest**.

Mit diesen drei Befehlen kannst du dich in der Git Bash orientieren und bewegen:

```bash
pwd
ls
cd
```

## Fertig, wenn ...

- du erklären kannst, was ein absoluter Pfad ist.
- du erklären kannst, was ein relativer Pfad ist.
- du die unterschiedliche Schreibweise von Pfaden in der Git Bash und unter Windows kennst.
- du weisst, dass Windows Laufwerkbuchstaben wie `C:` und den Backslash `\` verwendet.
- du weisst, dass die Git Bash beispielsweise `/c` und den Slash `/` verwendet.
- du mit `pwd` deinen aktuellen Pfad bestimmen kannst.
- du mit `ls` den Inhalt eines Verzeichnisses anzeigen kannst.
- du mit `cd` durch die Verzeichnisstruktur des Repositorys navigieren kannst.
- du mit `..` in übergeordnete Verzeichnisse wechseln kannst.
- du ein Verzeichnis sowohl mit einem absoluten als auch mit einem relativen Pfad erreichen kannst.