# 🛠️ IT Support Logger App

The **IT Support Logger App** is an Android-based tool that allows IT support personnel to log and track issues quickly and locally on their devices. This project demonstrates how to build a functional, user-friendly app using Java, SQLite, and Android Studio.

---

## ✨ Features

- 🔐 **Login Authentication** – Users must log in with a username and password.
- 📝 **Record Logs** – Track support issues with date, problem description, actions taken, and resolution status.
- 📄 **View Logs** – All saved logs are displayed in a scrollable, user-specific list using RecyclerView.
- 🧠 **User-Friendly UI** – Simple, clear layout for real-world usability.
- 💾 **SQLite Database** – Stores logs per user account locally.

---

## 🚀 Screenshots

### 🔐 Login Screen
![Login](screenshots/login.png)

---

### 📝 Record Log (Empty Form)
![Empty Log Form](screenshots/recordingscreen.png)

---

### ✅ Record Log (Filled Out & Saved)
![Filled Log Form](screenshots/recordlogsaved.png)

---

### 📄 View Logs
![Log View](screenshots/logviewfixed.png)

---

## 📦 How to Use

1. Clone this repository:
   ```bash
   git clone https://github.com/mcphammer/IT-Support-Logger-App.git

   ---

## 🧠 What I Learned from Building the IT Support Logger App

### 🔧 Project Summary:
I built a complete Android app called **IT Support Logger**, designed to let technicians log technical issues, actions taken, and resolutions. Users can log in, record logs, view past entries, and navigate between screens. The app uses a local SQLite database and is designed for a smooth user experience.

---

### ✅ Key Skills and Concepts I Learned

#### 📱 Android Studio Development
- Understanding project structure, Gradle files, XML layouts
- Using emulators to test the app

#### 🔐 User Authentication (Login Screen)
- Built a login form using `EditText` and `Button`
- Used `SQLiteOpenHelper` to store user credentials
- Saved login state using `SharedPreferences`

#### 🗄️ Database Design and Integration
- Created user and log tables in SQLite
- Wrote methods to insert and retrieve logs per user
- Learned how database structure affects data flow

#### 🎨 UI/UX Enhancements
- Added welcoming prompts ("Welcome to IT Support Logger!")
- Aligned elements using gravity and layout spacing
- Centered content for better readability

#### 🐞 Bug Debugging & Crash Handling
- Fixed crashes from:
  - Missing layout files (e.g. `activity_log_list.xml`)
  - Not declaring activities in `AndroidManifest.xml`
  - Inconsistent view IDs
- Used Logcat to identify and test issues

#### 🔄 Dynamic UI with RecyclerView
- Displayed logs in a scrollable list with custom adapter
- Created a custom XML (`item_log.xml`) for each log item
- Used data classes (`LogEntry`) and adapters to pass data

#### 🧭 Navigation & User Flow
- Realized "just functionality" isn't enough
- Added a View Logs button for history access
- Added a Back button for intuitive screen navigation

#### 🧪 Version Control and GitHub
- Initialized a Git repo and learned commit workflow
- Connected to GitHub and fixed push errors
- Wrote a complete, professional `README.md` with screenshots

---

### 🛠 How I Solved Key Errors

| Error                              | Cause                                     | Fix                                                            |
|------------------------------------|-------------------------------------------|----------------------------------------------------------------|
| App crashed when viewing logs      | Missing `LogListActivity` in Manifest     | Added `<activity android:name=".LogListActivity" />`          |
| Login didn’t persist               | Forgot to store `user_id`                 | Used `SharedPreferences` to save and retrieve it              |
| `R.layout` or `R.id` turned red    | Layout files or IDs were missing/wrong    | Created missing XML files and matched correct IDs             |
| Couldn’t see RecyclerView content  | Adapter not set or layout missing         | Set LayoutManager and attached adapter correctly              |
| UI was stuck to the left           | Misused `textAlignment` vs `gravity`      | Switched to `android:gravity="center"`                        |
| Couldn’t go back from logs screen  | No navigation logic                       | Added a Back button and used `finish()`                       |

---

### 🔁 Overall Reflection

Each time I completed a core step, I realized how to go further:

- After login worked, I needed to **save the logs**
- After saving logs, I wanted to **view them**
- After viewing logs, I realized I needed **navigation, a back button**
- Then I wanted it to look **welcoming and professional**

**Through this project, I learned that building an app is not just writing code. It’s thinking like a user, debugging like a developer, and evolving like a designer**.

---


