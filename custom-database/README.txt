This is the custom-database module.

Real database scripts to be run on Oracle are located in src/main/scripts.  

UNIT TESTING
1.  Integration tests include a hsqldb in memory database, that sql script is located in src/test/resources/database and will be run when the 
junit integration tests are run.  The test datasources are named defaultDataSource.  
You can also configure the test spring-custom-database-test.xml to switch between the two to test that the mybatis mappers work.
- hsqldb (default)
- oracle

2.  Unfortunately due the binary license there is no public repository with the Oracle Driver JAR.  You will need to install the oracle ojdbc.jar into the local maven repository.
i.e. mvn install:install-file -Dfile=C:\ojdbc.jar -DgroupId=ojdbc -DartifactId=ojdbc -Dversion=6 -Dpackaging=jar