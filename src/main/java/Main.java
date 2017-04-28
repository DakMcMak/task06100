import com.sun.org.apache.xalan.internal.xsltc.dom.MultiDOM;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static String readString() throws Exception {
        return scanner.next();
    }

    public static int readInt() throws Exception {
        return scanner.nextInt();
    }

    public static double readDouble() throws Exception {
        return scanner.nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        return scanner.nextBoolean();
    }

    public static void main(String[] args) throws Exception {
        readString();
        readInt();
        readDouble();
        readBoolean();
    }
}
