copy Java2.g4 test\Java2.g4
copy Demo.java test\Demo.java
cd test
antlr4 Java2.g4
SET CLASSPATH=..\antlr-4.4-complete.jar;%CLASSPATH%
javac Java2*.java
grun Java2 compilationUnit -gui
