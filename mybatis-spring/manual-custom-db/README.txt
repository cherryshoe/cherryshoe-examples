This is the annotation-custom-database module.

UNIT TESTING
1.  Integration tests include a hsqldb in memory database, that sql script is located in src/test/resources/database and will be run when the 
junit integration tests are run.  You can configure the test spring-custom-database-test to switch between the three to test that the mybatis mappers work.

- hsqldb (default)
- postgresql
- oracle

2.  Unfortunately due the binary license there is no public repository with the Oracle Driver JAR.  You will need to install the oracle ojdbc.jar into the local maven repository.
i.e.  mvn install:install-file -Dfile=/Users/cherryshoe/Downloads/ojdbc6.jar -DgroupId=ojdbc -DartifactId=ojdbc -Dversion=6 -Dpackaging=jar
