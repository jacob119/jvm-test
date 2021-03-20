1. Download VisualVm for monitoring of Java VM from https://visualvm.github.io/download.html

2. Maven Build: 
   mvn clean package -DskipTests

3. Exec cmd :
   java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError  -jar ./target/jvm-test-1.0-SNAPSHOT.jar
