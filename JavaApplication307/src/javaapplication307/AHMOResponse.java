package javaapplication307;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public interface AHMOResponse {
    public void proces(OutputStream izlaz)throws SQLException, IOException;
}
