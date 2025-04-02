# Mitgliedschaften-Manager - Spring Boot Version

Dieses Repository enthält die Spring Boot-Variante einer Webanwendung zur Verwaltung von Mitgliedschaften. Die Anwendung wurde im Rahmen eines Framework-Vergleichs zwischen Spring Boot und Quarkus entwickelt.

---

## ✨ Features

- Mitgliederverwaltung (Erstellen, Anzeigen, Bearbeiten, Löschen)
- Suchfunktion für Mitglieder
- Benutzeroberfläche basierend auf Figma-Prototyp
- PostgreSQL-Datenbank via Docker
- MVC-Architektur mit Spring Boot & Thymeleaf
- Saubere Projektstruktur mit Maven

---

## 🛠️ Technologien

- Java 17
- Spring Boot
- Thymeleaf
- Maven
- PostgreSQL (Docker)
- Lombok
- HTML, CSS, Vanilla JavaScript

---

## 🚀 Quickstart

### 1️⃣ PostgreSQL-Datenbank starten (Docker)

```bash
docker run --name MitgliedschaftenManager -e POSTGRES_PASSWORD=app -p 5432:5432 -d postgres
```

---

## 2️⃣ Spring Boot Anwendung starten

- Projekt importieren:

    `File -> Import -> Maven -> Existing Maven Project`

- Anwendung starten über:

    `MitgliedschaftsmanagerSpringApplication.java`

- Öffne die Anwendung unter:

    [http://localhost:8088](http://localhost:8088)

---

## 💡 Hinweise

- Die Datenbank-Tabellen werden automatisch beim Start erzeugt.
- Suchfunktion über Name, E-Mail, Telefonnummer und Status.
- Fokus auf Stabilität und klare Projektstruktur.

---

## 🟣 Hintergrund

Diese Anwendung wurde erstellt, um die Eigenschaften und den Workflow von **Spring Boot** praxisnah zu analysieren. Sie eignet sich als Grundlage für kleine bis mittelgroße Projekte im klassischen Java-Enterprise-Umfeld.
