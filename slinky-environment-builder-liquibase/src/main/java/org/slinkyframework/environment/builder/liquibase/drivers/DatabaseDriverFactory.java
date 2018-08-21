package org.slinkyframework.environment.builder.liquibase.drivers;

import org.apache.commons.lang3.NotImplementedException;
import org.slinkyframework.environment.builder.liquibase.drivers.oracle.OracleProperties;
import org.slinkyframework.environment.builder.liquibase.drivers.oracle.OracleDatabaseDriver;

public class DatabaseDriverFactory {

    private DatabaseDriverFactory() {
    }

    public static DatabaseDriver getInstance(DatabaseProperties databaseProperties) {

        if (databaseProperties instanceof OracleProperties) {
            return new OracleDatabaseDriver((OracleProperties) databaseProperties);
        } else {
            throw new NotImplementedException("Database properties not yet implmented: " + databaseProperties.getClass());
        }
    }
}
