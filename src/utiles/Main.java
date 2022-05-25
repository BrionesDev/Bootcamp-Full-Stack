package utiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Elian Briones
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // List content of a directory (given as a param) sorted alphab
        firstProblem();

        // 
        secondProblem();
    }

    // Java class which list content of a directory give as a param soreted alf
    public static void firstProblem() throws IOException {
        System.out.print("Enter path: ");
        String path = sc.next();

        try {
            File file = new File(path);
            file.setReadable(true);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String[] fileList = file.list();
            
            if (fileList != null) {
                String res = "";
                for (String fileDir : fileList) {
                    File fileOrDir = new File(path + "\\" + fileDir);
                    if (fileOrDir.isDirectory()) {
                        System.out.println("<DIR> " + fileDir);
                        res += "<DIR>" + fileDir;
                    } else {
                        System.out.println("<FILE> " + fileDir);
                        res += "<FILE>" + fileDir;
                    }
                }
                System.out.println("Do you want to save this data yo any file?\n1. Yes\n2. No");
                if (sc.nextInt() == 1) {
                    System.out.println("Enter name of your file");
                    FileWriter fw = new FileWriter("C:\\Users\\formación\\Desktop\\" + sc.next());
                    fw.write(res);
                    fw.close();
                } else {
                    System.out.println("Goodbye!");
                }
            } else {
                System.out.println("The is no files or directory at the specified path");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void secondProblem() {

    }

    public static void thirdProblem() {

    }

    public static void fourthProblem() {

    }

    public static void fifthProblem() {

    }

}
