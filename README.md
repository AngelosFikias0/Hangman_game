# Hangman (Java)

> **A classic word-puzzle engine built in Java, featuring persistent session statistics and dynamic guessing mechanics.**

This project is a robust, console-based implementation of the traditional Hangman game. It demonstrates core Java programming principles including **state management**, **string manipulation**, and **interactive user loops**.

---

## 🕹️ Game Overview

The application operates as a finite state machine, transitioning between menu navigation and active gameplay based on user input and game results.

```text
       [ Main Menu ]
             |
     /-------+-------\
     |               |
 [ Start Game ] [ View Stats ] [ Exit ]
     |               |
     v               v
 [ Game Loop ]   [ Display Session ]
 (Guess Logic)   (W/L Record)
     |
     v
 [ End Game ]
 (Update Stats)
```

---

## 🚀 Key Features

* **Intelligent Dictionary:** Utilizes a predefined collection of words for varied and reliable gameplay.
* **Flexible Guessing:** Support for both single-letter guesses and full-word attempts, allowing for high-risk/high-reward strategy.
* **Dynamic Difficulty:** The number of allowed guesses is calculated relative to the word length, ensuring a fair challenge across different word types.
* **Session Tracking:** An internal statistics engine monitors **total games played, games won, and games lost**.

---

## 📌 How to Play

### 1️⃣ Installation & Compilation
Ensure you have the Java Development Kit (JDK) installed.
```bash
# Compile the program
javac Hangman.java

# Run the game
java Hangman
```

### 2️⃣ Menu Options
| Option | Action |
| :--- | :--- |
| **Start Game** | Initiates a new round with a random word from the dictionary. |
| **Statistics** | View your current win/loss record for the active session. |
| **Exit** | Terminate the application. |



### 3️⃣ Gameplay Mechanics
1. **Input:** Enter a letter to uncover part of the hidden word.
2. **Strategy:** If you are confident, input the entire word to win instantly.
3. **Feedback:** The game provides real-time updates on remaining guesses and revealed letters.
4. **Conclusion:** If you run out of guesses, the game reveals the correct word and updates your statistics.

---

## 🛠️ Technical Highlights

* **Input Validation:** Handles case-sensitivity and ensures only valid alphabetical inputs are processed.
* **String Processing:** Efficiently uses `StringBuilder` or character arrays to track and display revealed vs. hidden letters.
* **Algorithm Logic:** Implements a search-and-replace algorithm to update the hidden word mask every time a correct letter is guessed.

---

## 📈 Future Enhancements

- [ ] **External Dictionary:** Load thousands of words from a `.txt` file using Java I/O.
- [ ] **Graphical Hangman:** Implement an ASCII art representation of the "Hangman" that builds with every mistake.

- [ ] **Categories:** Add specialized word banks for themes like "Programming," "Geography," or "Movies."
- [ ] **Persistence:** Save statistics to a local file so records remain after the program closes.

---

## 📄 License
This project is open-source and available under the **MIT License**.

---
**Developed by Angelos Fikias** *Building classic logic games with clean, efficient Java code.*
