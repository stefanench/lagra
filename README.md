# Local Backup Manager

Local Backup Manager is a Java console application that simulates incremental backups for local files.

Instead of copying every file each time, the application stores only modified files as new versions and keeps a history of previous backups.

## Features

- Incremental backups
- Version history
- Modified file detection
- Backup reports
- Modular architecture

---

## Workflow

Source Files

↓

File Scanner

↓

Incremental Backup

↓

Version Repository

↓

Backup Report

---

## Example

```
Scanning files...

Files detected: 5

Modified

report.docx

notes.txt

Backup Version

v3

Files stored

2

History

v1
v2
v3
```

Run

```bash
mvn compile exec:java
```

The demo works with sample file metadata.
