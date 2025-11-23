# 📱 EventEase

A modern event-details UI built with **Android Studio** and **Jetpack Compose**.
EventEase provides a clean and intuitive interface for browsing event information, schedules, and attendee reviews — with smooth scrollable sections and elegant Material Design components.

---

## ✨ Features

### 🎫 Event Details

* Event title, location, and distance
* High-quality event banner
* Overview/description section

### 🗓️ Event Schedule

* Horizontally scrollable schedule cards
* Time-tagged sessions
* Clean card-based layout for readability

### ⭐ User Reviews

* Scrollable reviews list
* Reviewer name, avatar, rating, and feedback
* Neatly spaced and easy to navigate

### 🧭 Actions

* **Buy Tickets** CTA button
* **Add to Calendar** button
* **Share** icon
* **Back** navigation support

---

## 🛠️ Tech Stack

| Layer        | Technology                          |
| ------------ | ----------------------------------- |
| UI           | Jetpack Compose                     |
| Architecture | MVVM (recommended)                  |
| Design       | Material 3                          |
| Language     | Kotlin                              |
| IDE          | Android Studio (Giraffe/Koala/etc.) |

---

## 📂 Project Structure (Suggested)

```
app/
 ├─ ui/
 │   ├─ screens/
 │   │   └─ EventDetailsScreen.kt
 │   ├─ components/
 │   │   ├─ ScheduleCard.kt
 │   │   ├─ ReviewCard.kt
 │   │   └─ ActionButtons.kt
 │   └─ theme/
 ├─ data/
 │   ├─ models/
 │   │   ├─ Event.kt
 │   │   ├─ ScheduleItem.kt
 │   │   └─ Review.kt
 │   └─ repository/
 ├─ MainActivity.kt
 └─ README.md
```

---

## 📸 Screenshots

(Replace with your actual image paths)

| Event Details                                  | Schedule                                       | Reviews                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| ![Tech_Conference_1](https://github.com/user-attachments/assets/6a9cd247-d768-4281-84c0-cf5c46be1cd3)| ![Tech_Conference_2](https://github.com/user-attachments/assets/6ca32fb6-14c0-4c58-ad68-8bc934f309a8) | ![Tech_Conference_3](https://github.com/user-attachments/assets/ef0b0afa-7b45-4aca-aefe-92e73afa143a) |

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/EventEase.git
```

### 2. Open in Android Studio

* File → Open → Select folder
* Ensure **Compose Compiler**, **Kotlin**, and **Material 3** dependencies are updated

### 3. Run the App

* Connect a device or use an emulator
* Hit **Run ▶**

---

## 📦 Dependencies (Example)

```kotlin
implementation("androidx.compose.ui:ui:1.6.0")
implementation("androidx.compose.material3:material3:1.2.0")
implementation("androidx.compose.ui:ui-tooling-preview:1.6.0")
implementation("androidx.activity:activity-compose:1.8.0")
implementation("androidx.navigation:navigation-compose:2.7.0")
```

---

## 🧩 How It Works

The app uses:

* **LazyColumn** for scrolling
* **LazyRow** for horizontal schedule list
* **Card**, **Row**, **Column**, **Text**, **IconButton** for UI
* **Material3 styles** for modern look
* **Data classes** for schedules & review
