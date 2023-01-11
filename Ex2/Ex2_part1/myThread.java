package Ex2_part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class myThread extends Thread {
    private int linesCount;

    myThread(String name) {
        super(name);
    }

    public int getLines() {
        return linesCount;
    }

    /**
     * Count the lines of the file
     */
    @Override
    public void run() {
        try {
            FileReader fr = new FileReader(this.getName());
            BufferedReader br = new BufferedReader(fr);
            while (br.readLine() != null) {
                linesCount++;
            }
            br.close();
        } catch (IOException ex) {
            System.out.print("Error reading file\n" + ex);
            System.exit(2);
        }
    }
}