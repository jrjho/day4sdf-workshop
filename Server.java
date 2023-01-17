package day4_sdfserver;

import java.io.File;

/**
 * Hello world!
 */
public final class Server {
    private Server() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        String dirPath = "CookieFolder";
        File newDirectory = new File(dirPath);
        if(newDirectory.exists())
            System.out.println("Directory Exists!");
        else
            newDirectory.mkdir();
    }
}
