# Design Patterns in Java

A collection of practical, self-contained examples of software design patterns implemented in Java. Each example focuses on the problem a pattern solves, the roles of its participants, and the trade-offs involved in using it.

The repository covers the complete **23/23 Gang of Four catalog**: 5 creational, 7 structural, and 11 behavioral patterns.

## What each example contains

Every pattern lives in its own directory and includes:

- A small Java program with no external dependencies
- A `Main.java` entry point that demonstrates the pattern
- A dedicated README with a definition and role breakdown
- Mermaid diagrams showing the important relationships or workflow
- Guidance about when to use the pattern and how it differs from related patterns

The examples prioritize clarity and pattern structure over production-level infrastructure.

## Requirements

- Java Development Kit (JDK) 11 or newer
- A terminal capable of running `javac` and `java`

No build tool or third-party library is required.

## Running an example

Open any pattern directory, compile its Java files, and run `Main`:

```bash
cd Strategy
javac *.java
java Main
```

The examples use Java's default package so that each directory can be compiled independently.

## Pattern catalog

### Creational patterns

Creational patterns control how objects are constructed and help clients remain independent of concrete creation details.

| Pattern | Example scenario |
|---|---|
| [Abstract Factory](AbstractFactory/) | Create matching Victorian or modern furniture families |
| [Builder](Builder/) | Assemble gaming and office PCs through the same construction steps |
| [Factory Method](FactoryMethod/) | Let specialized factories create different cricket formats |
| [Prototype](Prototype/) | Clone configured game troops directly or through a prototype registry |
| [Singleton](SingletonPattern/) | Share one CPU instance among multiple processes |

### Structural patterns

Structural patterns organize classes and objects into larger structures while keeping those structures flexible.

| Pattern | Example scenario |
|---|---|
| [Adapter](Adapter/) | Connect a checkout service to an incompatible legacy banking API |
| [Bridge](Bridge/) | Vary remote controls and electronic devices independently |
| [Composite](Composite/) | Treat files and nested folders through one file-system interface |
| [Decorator](Decorator/) | Add alternate audio and subtitles to a video stream dynamically |
| [Facade](Facade/) | Hide a complex video-conversion subsystem behind one simple API |
| [Flyweight](Flyweight/) | Share intrinsic tree data while keeping coordinates unique |
| [Proxy](Proxy/) | Delay loading a high-resolution image until it is displayed |

### Behavioral patterns

Behavioral patterns define how objects communicate, divide responsibilities, and vary algorithms or workflows.

| Pattern | Example scenario |
|---|---|
| [Chain of Responsibility](ChainOfResponsibility/) | Pass HTTP requests through a configurable middleware pipeline |
| [Command](Command/) | Represent text-editor actions as objects with undo support |
| [Interpreter](Interpreter/) | Evaluate arithmetic expression trees with four basic operators |
| [Iterator](Iterator/) | Traverse song libraries that use different storage structures |
| [Mediator](Mediator/) | Coordinate authentication-form components through a dialog mediator |
| [Memento](Memento/) | Save and restore a game checkpoint without exposing internal state |
| [Observer](Observer/) | Publish weather readings to subscribed displays and alerts |
| [State](State/) | Model a simplified TCP-style connection lifecycle |
| [Strategy](Strategy/) | Select insertion sort or merge sort from the input size |
| [Template Method](TemplateMethod/) | Keep deployment steps ordered while subclasses customize selected stages |
| [Visitor](Visitor/) | Let an insurance agent offer policies based on each building type |


There are no shared source files between pattern directories. This intentional isolation makes it possible to study, modify, and run one pattern without understanding the rest of the repository first.

## Suggested learning path

1. Read the pattern directory's README to understand the problem and participants.
2. Start with `Main.java` to see how the client uses the pattern.
3. Follow the interfaces or abstract classes to the concrete implementations.
4. Compile and run the example, then change the client scenario or add another implementation.
5. Compare the pattern with the related alternatives described in its README.

The categories are useful for navigation, but patterns should be chosen from the design problem—not from a goal of using a pattern everywhere. A straightforward class or function is preferable when it already solves the problem cleanly.

## Complete GoF coverage

All **23/23 classic Gang of Four patterns** are implemented and linked in the catalog above.
