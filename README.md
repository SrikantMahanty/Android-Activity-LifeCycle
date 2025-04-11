# 📱 Android Activity Lifecycle Demo

This project is a simple Android app built to **visualize and understand the Android Activity Lifecycle** using `Toast` messages and `Logcat` logging.

It includes two activities:
- `MainActivity`
- `AnotherActivity`

---

## 🚀 Features

- Shows **Toast messages** for every lifecycle method.
- Logs all lifecycle callbacks using `Log.e`.
- Demonstrates activity switching and back stack behavior.
- Uses Kotlin and clean Android architecture.

---

## 🧠 Lifecycle Flow Example

Here’s how the lifecycle behaves as the user navigates between activities:

```text
1️⃣ Open MainActivity
→ onCreate()
→ onStart()
→ onResume()

2️⃣ Click button to open AnotherActivity
MainActivity:
    → onPause()
    → onStop()
AnotherActivity:
    → onCreate()
    → onStart()
    → onResume()

3️⃣ Press Back button
AnotherActivity:
    → onPause()
    → onStop()
    → onDestroy()
MainActivity:
    → onRestart()
    → onStart()
    → onResume()
                    [Start App]
                         ↓
                   onCreate() → UI setup
                         ↓
                    onStart()
                         ↓
                    onResume()
                         ↓
         ┌───────── User interacts ─────────┐
         ↓                                  ↓
   onPause() ← Back pressed          New Activity launched
         ↓                                  ↓
   onStop()                          → onCreate()
         ↓                           → onStart()
   onDestroy()                       → onResume()
         ↓                                  ↓
   [MainActivity Recalled]         Back pressed
         ↓                                  ↓
   onRestart()                   → onPause()
         ↓                       → onStop()

https://github.com/user-attachments/assets/33109251-cab9-4f81-b9e9-3bdac4059a88



Uploading WhatsApp Video 2025-04-11 at 17.39.13.mp4…


   onStart()                     → onDestroy()
         ↓
   onResume()
