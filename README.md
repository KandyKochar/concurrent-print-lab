# Concurrent Print Lab

An enhanced Java concurrency lab refining the print queue system with improved thread safety and cleaner synchronization design.

## Overview
Builds on the print system concept with a more robust implementation. Each class is independently refined for better separation of concerns and cleaner thread management.

## Features
- Improved synchronized Printer resource
- Enhanced PrintJob with cleaner encapsulation
- Refined User thread implementation
- Demonstrates iterative improvement of concurrent design

## Technologies Used
- **Language:** Java (JDK 8+)
- **Concepts:** Concurrency, synchronized blocks, thread pools

## Project Structure
```
src/
+-- Printer.java    # Enhanced synchronized printer
+-- PrintJob.java   # Refined print job model
+-- User.java       # Improved user thread
+-- Main.java       # Thread pool coordinator
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ Lab4.Main
```

## Author
Kandy Kochar
