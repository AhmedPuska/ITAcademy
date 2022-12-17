package javaapplication307;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class login implements AHMOResponse {

    @Override
    public void proces(OutputStream izlaz) throws SQLException, IOException {
        izlaz.write("<html><a href='products.ahmo'>products</a><form>Username: <input type='text'/> <br>Password: <input type='password'/><br> <input type='submit' value='Login'/><br></form></html>".getBytes());
    }
    
}
