# ⚔️ Aetherfall - A Console-Based Fantasy Battle Game in Java

Welcome to **Aetherfall**, a console-based turn-based battle game written in Java using object-oriented programming (OOP) principles. Choose your hero, face off against powerful villains, and use unique special abilities to win the battle!

---

## 🚀 Features

- ✅ Multiple character classes with unique stats and abilities
- 🧠 Inheritance, method overriding, encapsulation, and polymorphism
- 🔥 Special effects: freezing, weakening, shielding, arrow limits, mana regeneration
- 🎲 Randomized enemy attacks and curses for dynamic gameplay
- 💬 Interactive text-based gameplay in the terminal

---

## 👾 Character Overview

### 🧙 Mage
- Health: 80 | Power: 100
- **Special Ability:** Spell casting
- **Unique Trait:** Mana regeneration every turn

### 🏹 Archer
- Health: 100 | Power: 100
- **Special Moves:** Quick Shot (30 dmg), Multi Shot (60 dmg)
- **Unique Trait:** Limited arrows

### 🛡 Warrior
- Health: 120 | Power: 100
- **Special Move:** Mighty Strike
- **Unique Trait:** Can block attacks with shield if attacker’s health is lower

---

## 😈 Villain Overview

### ☠ Dark Overlord
- Health: 200 | Power: 150
- **Special Move:** Summon Darkness
- **Effect:** Weakens opponent’s next attack

### 🧊 Regional Warlord
- Health: 130 | Power: 110
- **Special Move:** Toxic Aura
- **Effect:** Freezes opponent for 2 turns

### 👹 Corrupted Mortal
- Health: 90 | Power: 90
- **Special Move:** Random Curse (Poison, Burn, Blind, Fear)
- **Effect:** Displays a unique curse on use

---

## 📁 Project Structure

```
/Aetherfall-Game
│
├── Character.java
├── Mage.java
├── Archer.java
├── Warrior.java
├── DarkOverlord.java
├── RegionalWarlord.java
├── CorruptedMortal.java
└── Main.java
```

---

## 🛠 How to Run

1. Make sure you have **Java 8 or later** installed.
2. Open your terminal and navigate to the project directory.
3. Compile the code:

```bash
javac Characters/*.java Main.java
```

4. Run the game:

```bash
java Main
```

---

## 🎓 OOP Concepts Used

- **Abstract Classes**
- **Inheritance & Method Overriding**
- **Encapsulation (private attributes + getters/setters)**
- **Polymorphism (Character references with child instances)**

---

## 📌 Controls

- Type `attack` to perform a standard attack.
- Type `special` to use your character's special move.
- If you’re an Archer, choose between `quick` and `multi` shot.

---

## 📬 Author

Made with ❤️ for Object Oriented Programming Lab  
**Student:** MD Jahirul Islam Shifat  
**University:** Islamic University of Technology  
**Course:** SWE4202 - OOP Concepts I Lab

---

## 📝 License

This project is for educational purposes only.