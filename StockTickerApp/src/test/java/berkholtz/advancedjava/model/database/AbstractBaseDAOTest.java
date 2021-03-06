package berkholtz.advancedjava.model.database;

import berkholtz.advancedjava.util.DatabaseInitializationException;
import berkholtz.advancedjava.util.DatabaseUtils;
import org.junit.After;
import org.junit.Before;

/**
 * Base class that handles common setup and tear down task for DAO test classes.
 *
 * NOTE: package scope because only only DAO tests should extend from this class.
 *
 */
class AbstractBaseDAOTest {

    @Before
    public void setUp() throws DatabaseInitializationException {
        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
    }

    @After
    public void tearDown() throws DatabaseInitializationException {
        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
    }
}
