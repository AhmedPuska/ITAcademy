package javaapplication307;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class vrijeme implements AHMOResponse {

    @Override
    public void proces(OutputStream izlaz) throws IOException {
        izlaz.write((new Date().toString()).getBytes());
    }
}
