clear
echo "javac src/*java -d classes"
javac src/*java -d classes
echo "java -cp classes Test.java"
java -cp classes Test
