${spark-install-dir}/bin/spark-submit --class by.vadim.spark.WordCount  
--master local ${WordCount-MavenProject}/target/calculating-word-counts-1.0-SNAPSHOT.jar  
${WordCount-MavenProject}/src/main/resources/text.txt  