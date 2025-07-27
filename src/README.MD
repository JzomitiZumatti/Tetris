# Tetris – Stage 1: Getting Started

---

## 🧠 Description

The original Tetris game has 7 unique pieces, each made up of 4 segments: the `T` piece, the `O` piece, the `L` piece, the `J` piece, the `I` piece, the `S` piece, and the `Z` piece.

In this stage, you need to design the pieces and show how they can be rotated counterclockwise at 90 degrees inside a 4x4 grid.

```
00 01 02 03
04 05 06 07
08 09 10 11
12 13 14 15
```
The numbers `00 01 02 03` represent the first items on the four columns of the grid. The numbers below represent the first items of the grid rows.
```
00
04
08
12
```
So, a 4x4 grid should have four rows and columns — naturally, a 4x4 matrix. Every element in our matrix is filled with a hyphen, `-`, and one space.
```
- - - -
- - - -
- - - -
- - - -
```
Each piece is designed with the help of four zeros (0). They are our building segments. In the end, we should have the following:

The `I` piece:
```
- 0 - -
- 0 - -
- 0 - -
- 0 - -
```
The `S` piece:
```
- - - -
- 0 0 -
0 0 - -
- - - -
```
The `Z` piece:
```
- - - -
0 0 - -
- 0 0 -
- - - -
```
The `L` piece:
```
- 0 - -
- 0 - -
- 0 0 -
- - - -
```
The `J` piece:
```
- - 0 -
- - 0 -
- 0 0 -
- - - -
```
The `O` piece:
```
- - - -
- 0 0 -
- 0 0 -
- - - -
```
The `T` piece:
```
- 0 - -
0 0 0 -
- - - -
- - - -
```

---

## 🎯 Objectives

In this stage, your program should:

1. Create a 4x4 grid.
2. Design seven unique pieces: `I`, `S`, `Z`, `L`, `J`, `O`, `T`
3. Design the rotated states of the unique pieces.
4. The pieces and their rotated states should be placed inside one list. The unique piece should take the first position in the list. the next positions should be filled with the pieces rotated by 90 degrees counterclockwise.
5. Rotate the pieces inside the grid. The piece is rotated automatically and should appear in a new grid
6. Print and rotate the unique pieces in the order they were created. Separate each new grid with one empty line, as shown in the Examples below.