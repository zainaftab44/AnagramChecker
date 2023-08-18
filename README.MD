# Anagram Checker

This Java program checks if two texts are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once.

## How to Run

1. Clone this repository to your local machine using `git clone <repository-url>`.

2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Navigate to the `src` directory and locate the `anagram.AnagramChecker.java` file.

4. In the `anagram.AnagramChecker` class, you'll find a method named `areAnagrams(String text1, String text2)` that checks if two texts are anagrams. You can call this method with the two texts you want to check.

5. To run the program, you can compile the provided main class or use the provided `AnagramCheckerTest.java` JUnit test class. Open the test class and run the test methods to see the results.


## Running Main
Navigate to the src directory:

```
cd src
```

Compile and run the AnagramCheckerTest.java file using jUnit as follows:

For windows
```
javac .\Main.java .\anagram\AnagramChecker.java
java Main
```


## Running the Tests
Navigate to the src directory:

```
cd src
```

Compile and run the AnagramCheckerTest.java file using jUnit as follows:

For windows
```
javac  -cp "..\lib\junit-4.13.1.jar;..\lib\hamcrest-core-1.3.jar;." .\test\AnagramCheckerTest.java .\anagram\AnagramChecker.java
java  -cp "..\lib\junit-4.13.1.jar;..\lib\hamcrest-core-1.3.jar;." org.junit.runner.JUnitCore  test.AnagramCheckerTest
```