# Java
My works related to Java programming language.

## Table of Contents
1. [Introduction.](#introduction)
2. [Official references websites.](#references)
3. [Java developers.](#javadevelopers)
4. [Java compiler : javac](#javac)
5. [GitHub notes.](#github)
6. [GitHub repository calculation.](#calculation)

<a name="introduction"></a>
## 1. Introduction.
<img src="java.jpg" height="150">
Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. As of 2019, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers.
<br /><br />
Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Meanwhile, others have developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).
<br /><br />
The latest versions are Java 13, released in September 2019, and Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018; Oracle released for the legacy Java 8 LTS the last free public update in January 2019 for commercial use, while it will otherwise still support Java 8 with public updates for personal use up to at least December 2020. Oracle (and others) highly recommend uninstalling older versions of Java because of serious risks due to unresolved security issues. Since Java 9 (and 10 and 12) is no longer supported, Oracle advises its users to immediately transition to the latest version (currently Java 13) or an LTS release.

<a name="references"></a>
## 2. Official references websites. <br />
Java official website : https://www.oracle.com/java/ <br />
Java SE official download page : https://www.oracle.com/java/technologies/javase-downloads.html <br />
JDK 13 documentation : https://docs.oracle.com/en/java/javase/13/index.html <br />
Oracle official website : https://www.oracle.com <br />

**_Java text editor_** <br />
Eclipse Foundation official website : https://www.eclipse.org <br />
Eclipse IDE for Java Developers : https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers <br />
IntelliJ IDEA : https://www.jetbrains.com/idea/ <br />

**_Java documentation by oracle.com_** <br />
Class System by oracle.com : https://docs.oracle.com/javase/7/docs/api/java/lang/System.html <br />
Class String by oracle.com : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html <br />
Class PrintStream by oracle.com : https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html<br />
Primitive Data Types by oracle.com : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html<br />
The while and do-while Statements by oracle.com : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html <br />
javac - Java programming language compiler by oracle.com : https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html <br />
Java SE Security by oracle.com : https://www.oracle.com/technetwork/java/javase/jaas/index.html <br />
Differences between Java EE and Java SE by oracle : https://docs.oracle.com/javaee/6/firstcup/doc/gkhoy.html <br />

**_Java documentation by w3schools.com_**
Java Packages by w3schools.com : https://www.w3schools.com/java/java_packages.asp <br />
Java public Keyword by w3schools.com : https://www.w3schools.com/java/ref_keyword_public.asp <br />
Java void Keyword : https://www.w3schools.com/java/ref_keyword_void.asp <br />
Java If ... Else by w3schools.com : https://www.w3schools.com/java/java_conditions.asp <br />
Java For Loop by w3schools.com : https://www.w3schools.com/java/java_for_loop.asp <br />
Java While Loop by w3schools.com : https://www.w3schools.com/java/java_while_loop.asp <br />

**_Java documentation by Javatpoint_**
Java static keyword by Javatpoint : https://www.javatpoint.com/static-keyword-in-java <br />
Java String equals() by Javatpoint : https://www.javatpoint.com/java-string-equals <br />

**_Java questions and answers by Stack Overflow_**
What is “String args[]”? parameter in main method Java by Stack Overflow : https://stackoverflow.com/questions/890966/what-is-string-args-parameter-in-main-method-java#:~:text=In%20Java%20args%20contains%20the,%22%2C%20%22two%22%5D%20. <br />

**_Java related articles_** <br />
public static void main(String[] args) – Java main method by JournalDev : https://www.journaldev.com/12552/public-static-void-main-string-args-java-main-method <br />
Classes and Objects in Java by GeeksforGeeks : https://www.geeksforgeeks.org/classes-objects-java <br />
System.out.println by javapapers : https://javapapers.com/core-java/system-out-println/ <br />
javac : command not found by Stack Overflow : https://stackoverflow.com/questions/5407703/javac-command-not-found <br />
Java 8 – How to set JAVA_HOME on Windows10 by chandrashekhar : https://www.onlinetutorialspoint.com/java8/java-8-how-to-set-java_home-on-windows10.html <br />
Setting the JAVA_HOME Variable in Windows by Confluence Support : https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html <br />

**_Java related articles_** <br />
PascalCase by TechTerms : https://techterms.com/definition/pascalcase <br />

**_Java developers_** <br />
Moshfegh Hamedani : https://twitter.com/moshhamedani <br />

<a name="javadevelopers"></a>
## 3. Java developers.
James Gosling : https://twitter.com/errcraft <br />
Patrick Naughton : https://github.com/naughton <br />

<a name="javac"></a>
## 4. Java compiler : javac
The javac command in Java compiles  a program from a command prompt. It reads a Java source program from a text file and creates a compiled Java class file. The javac tool reads class and interface definitions, written in the Java programming language, and compiles them into bytecode class files. It can also process annotations in Java source files and classes.

To setup javac in windows environment, on the right hand side of **[ ⊞ ]**, type `edit environment` and then **[ Mouse Left Click ]** the shown text `edit environment variables for your account`, **Environment Variables** menu will appear, press **[ Tab ]**, **[ N ]**, type `Java_home`, then press **[ Tab ]**, type `C:\Program Files\Java\jdk-12.0.2`, then press **[ Enter ]**, then press **[ Tab ]** 10x, the press **[ P ]**, make sure the `Path` is highlighted on the screen and then press **[ Tab ]**, **[ E ]**, **[ Tab ]**, **[ N ]**, then type `C:\Program Files\Java\jdk-12.0.2\bin`, then press **[ Enter ]**, press **[ Tab ]** 6x, then press **[ Enter ]**, **[ Tab ]**, **[ Enter ]**.

Press **[ ⊞ ]** + **[ R ]**, then press **[ C ]**, **[ M ]**, **[ D ]**, **[ Enter ]**, when the `cmd.exe` program appears, type `javac` and press **[ Enter ]** to test whether the Java compiler is running or not, and the check the java version by typing `java -version` and press **[ Enter ]**.

<a name="github"></a>
## 5. GitHub notes.
Clone the current GitHub remote repository contents into local machine.
```
$ git clone https://github.com/syakirharis25/Java.git
$ cd Java/
$ git remote -v
$ git status
```

<a name="calculation"></a>
## 6. GitHub repository calculation.
```
draft
```
Refer to : https://github.com/syakirharis25/cloc
