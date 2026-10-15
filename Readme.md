# H250013G LESLIE SARAI SOFTWARE ENGINEERING OBJECT ORIENTED PROGRAMMING

This repository contains ten Java lab sessions. Each lab includes five exercise
programs and a Word report with the exercise questions, source code, sample
output, and explanations.

## Repository layout

```text
Lab_01/
  Java_Files/   Exercise1Cars.java ... Exercise5PersonAddress.java
  LAB Exercises report (1).docx
...
Lab_10/
  Java_Files/   Exercise1SaveReadLines.java ... Exercise5LearnerReports.java
  LAB Exercises report (10).docx
```

Each `Java_Files` directory contains the runnable `.java` source files for
that lab. The matching `.docx` file is the written report.

## Lab topics

| Lab | Main concepts |
| --- | --- |
| [Lab 01](Lab_01/) | Classes and objects, fields and methods, object references, and null checks |
| [Lab 02](Lab_02/) | Constructors, static members, initialization order, and temperature factories |
| [Lab 03](Lab_03/) | Encapsulation, validation, account history, immutability, and temperature conversion |
| [Lab 04](Lab_04/) | Inheritance, method overriding, constructor chaining, and composition |
| [Lab 05](Lab_05/) | Method overloading, polymorphism, overriding, and payment processing |
| [Lab 06](Lab_06/) | Abstract classes, interfaces, comparable objects, and default-method conflicts |
| [Lab 07](Lab_07/) | Built-in and custom exceptions, validation, and `finally` behavior |
| [Lab 08](Lab_08/) | Lists, sets, maps, generics, stacks, and sorting |
| [Lab 09](Lab_09/) | Enums, records, sets, iterators, and coin change |
| [Lab 10](Lab_10/) | File input/output, predicates, text statistics, streams, and reports |

## Open and run an exercise

1. Open the repository or the lab module in IntelliJ IDEA or VS Code with Java
   support.
2. Open the appropriate file under `Lab_nn/Java_Files/`.
3. Run its `main` method using the IDE's run action.

For the command line, open a terminal in that lab's `Java_Files` directory and
compile and run a single exercise. For example:

```powershell
cd Lab_01\Java_Files
javac Exercise1Cars.java
java Exercise1Cars
```

Replace the filename and class name with the exercise you want to run. A JDK
that supports Java 17 or later is recommended; several exercises use records,
modern switch syntax, and newer collection APIs. Some exercises read console
input or create sample data files in the current working directory.