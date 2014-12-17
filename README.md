To run the project:

1) Download the project
2) run command "mvn package" to build, package and execute junit test cases 
3) to execute the individual class run command   mvn exec:java -Dexec.mainClass="src.com.HelloApp"
    - It compiles and execute the class HelloApp and prints "Hello! This is SPRING Maven Project" 
4) to execute the individual class run command   mvn exec:java -Dexec.mainClass="src.com.App"
    - It prints a random unique ID.