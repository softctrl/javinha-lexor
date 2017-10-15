# javinha-lexor
A project to implement a lexical analizer to the Javinha programming language.

To build this project you also need the Lexor project.

If you have maven + Java ok on your environment, you only need to execute this:

```
git clone https://github.com/softctrl/lexor.git && cd lexor/Lexor && mvn install &&  cd ../.. && \
git clone https://github.com/softctrl/javinha-lexor.git && cd javinha-lexor/javinha-lexor && mvn install && \
cd target && java -jar javinha-lexor-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

Also you can specify a file with valid Javinha source code.

```
java -jar javinha-lexor-0.0.1-SNAPSHOT-jar-with-dependencies.jar /path_to/Javinha_Source_Code.jvn
```
