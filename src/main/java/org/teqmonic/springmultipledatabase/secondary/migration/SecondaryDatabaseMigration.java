package org.teqmonic.springmultipledatabase.secondary.migration;

import jakarta.annotation.PostConstruct;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SecondaryDatabaseMigration {

    @Autowired
    @Qualifier("secondaryDbDataSource")
    private DataSource secondaryDatasource;

    @Value("${spring.flyway.secondary.locations}")
    private String secondaryLocations;

    @PostConstruct
    public void migrateSecondaryDatabase() {
        Flyway.configure()
                .dataSource(secondaryDatasource)
                .locations(secondaryLocations)
                .load()
                .migrate();
    }
}
