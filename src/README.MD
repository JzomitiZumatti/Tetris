# Tetris – Stage 2: I Like to Move It!

---

## 🧠 Description

The original Tetris board design employs a 10x20 grid. Several variants of this design have emerged over the years, but the 10x24 option remains one of the most popular. Your game should allow for any board dimension, but use the 10x20 grid as the default one. The board is basically an MxN matrix, where M is the board width and N is the board height.

```
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
```
In the previous stage, we created our pieces in a 4x4 grid. At this stage, you need to simulate their movement on the Tetris board. The pieces should move from the top to the bottom every time a new command is printed. The player can also move the pieces to the left or right. Besides, the pieces can be rotated as they fall. Do not rotate them automatically. Your program should take instruction to rotate the piece or move it to the left or right.

The representation below shows how the unique pieces appear at the top of the game board:
```
- - - - 0 - - - - -
- - - - 0 - - - - -
- - - - 0 - - - - -
- - - - 0 - - - - -

- - - - 0 0 - - - -
- - - 0 0 - - - - -
- - - - - - - - - -
- - - - - - - - - -

- - - - 0 0 - - - -
- - - - - 0 0 - - -
- - - - - - - - - -
- - - - - - - - - -

- - - - 0 - - - - -
- - - - 0 - - - - -
- - - - 0 0 - - - -
- - - - - - - - - -

- - - - - 0 - - - -
- - - - - 0 - - - -
- - - - 0 0 - - - -
- - - - - - - - - -

- - - - 0 0 - - - -
- - - - 0 0 - - - -
- - - - - - - - - -
- - - - - - - - - -

- - - - 0 - - - - -
- - - - 0 0 - - - -
- - - - 0 - - - - -
- - - - - - - - - -
```

```
Integer[][] O = {{4, 14, 15, 5}};
Integer[][] I = {{4, 14, 24, 34}, {3, 4, 5, 6}};
Integer[][] S = {{5, 4, 14, 13}, {4, 14, 15, 25}};
Integer[][] Z = {{4, 5, 15, 16}, {5, 15, 14, 24}};
Integer[][] L = {{4, 14, 24, 25}, {5, 15, 14, 13}, {4, 5, 15, 25}, {6, 5, 4, 14}};
Integer[][] J = {{5, 15, 25, 24}, {15, 5, 4, 3}, {5, 4, 14, 24}, {4, 14, 15, 16}};
Integer[][] T = {{4, 14, 24, 15}, {4, 13, 14, 15}, {5, 15, 25, 14}, {4, 5, 6, 15}};
```
There are no border restrictions in this stage, so a piece can move through the bottom, left, and right borders:
```
- - - - - - - - - -
- - - - - - - - - -
- - - - 0 0 - - - -
- - - - 0 0 - - - -

> down
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - 0 0 - - - -
```
Mind that when you move the piece down, you need to move it down precisely one row in the grid.
```
- - - - - - - - - -
- - - - - - - - 0 0
- - - - - - - - 0 0
- - - - - - - - - -

> right
- - - - - - - - - -
- - - - - - - - - -
0 - - - - - - - - 0
0 - - - - - - - - 0
```

---

## 🎯 Objectives

In this stage, your program should:
1. Take the unique pieces from the list.
2. Move the piece to the left, right, and down.
3. Rotate the piece inside the game board.
4. 
At this stage, your program should deal with the `rotate`, `left`, `right`, `down`, and `exit` commands.