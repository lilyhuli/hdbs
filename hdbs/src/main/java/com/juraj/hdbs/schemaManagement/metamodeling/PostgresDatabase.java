package com.juraj.hdbs.schemaManagement.metamodeling;

import com.juraj.hdbs.utils.DBVendor;

import java.util.List;

/** Represents a PostgreSQL database
 * @author Juraj
 */
public class PostgresDatabase extends Database {

    private DBVendor dbVendor;

    /** Constructor
     * @param name Name of the database
     * @param tables List of tables in the database
     * @param localRelationships List of localRelationships among the tables in the database
     */
    public PostgresDatabase(String name, List<Table> tables, List<LocalRelationship> localRelationships) {
        super(name, tables, localRelationships);
        dbVendor = DBVendor.POSTGRESQL;
    }


    /** Gets the database vendor
     * @return POSTGRESQL value of DBVendor enum
     */
    @Override
    public DBVendor getDbVendor() {
        return dbVendor;
    }
}
