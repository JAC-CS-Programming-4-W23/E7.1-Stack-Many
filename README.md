# Exercise 4.2 - 🚏 Queue Array

## 🎯 Objectives

- **Implement** extend the features of the basic Stack with the ability 

## 🔨 Setup

1. Clone the repo (or download the zip) for this exercise, which you can find [here](https://github.com/JAC-CS-Programming-4-W23/E4.2-Queue-Array).
2. Start IntelliJ, go to `File -> Open...`, and select the cloned/downloaded folder.
3. If at the top it says "Project JDK is not defined", click "Setup JDK" on the top right, and select the JDK version you have installed on your machine.

   ![Setup JDK](./images/Setup-JDK.png)

4. To get the unit tests to work, open `QueueTest.java` and add JUnit to the classpath:

   ![Setup Tests](./images/Setup-Tests.png)

   - Just click "OK" on the resulting dialogue window and all the test-related red squigglies should disappear.

## 🔍 Context

### Extending the Stack

Create a class called `StackMany` that supports the original stack operations with two new ones:

<!-- tabs:start -->

#### **pushMany**

| Signature    | `void pushMany(T[] elements)`                        |
| ------------ | ---------------------------------------------------- |
| Description  | Push multiple elements onto the stack in LIFO order. |
| Precondition | Stack has room for the number of elements.           |
| Mutator      | Yes.                                                 |
| Returns      | None.                                                |

#### **popMany**

| Signature    | `T[] popMany(int amount)`                           |
| ------------ | --------------------------------------------------- |
| Description  | Pop multiple elements from the stack in LIFO order. |
| Precondition | Stack has the number of elements, `amount > 0`.     |
| Mutator      | Yes.                                                |
| Returns      | The popped elements in LIFO order.                  |

<!-- tabs:end -->

## 🚦 Let's Go

Let's set this up:

1. Create a class called `StackMany`.
3. Create two constructors: one where the queue `capacity` is provided and one where it is not, relying on a default `QUEUE_CAPACITY`.
4. Implement the methods of the `Queue` API: `enqueue(..)`, `dequeue()`, `front()`, `isEmpty()` and `isFull()`.
5. Throw exception `QueueOverflowException` and `QueueUnderflowException` when the caller has not met the operation preconditions.
6. Pass the unit tests in the class `TestQueue`.

## 🔬 Observations

- From the Which type of methods are `pushMany` and `popMany`




