package tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import sun.security.x509.EDIPartyName;

/**
 *
 * @author Elian Briones
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Leer fichero y copiarlo a otro. Opcion de revertir el texto
//        firstProblem();

        // Lo mismo pero con InputStream y OutputStream + renombrar un fichero
//        secondProblem();
        // Mostrar contenido carpeta, marca <DIR> subcarpetas, <FILE> archivos
//        thirdProblem();
        // Serializa datos de X objetos en un archivo. Usa FileOutputStream and ObjectOutputStream
        fourthProblem();

        // Deserializar el archivo. FileInputStram and ObjectInputStream
        fifthProblem();

        // Leer varios archivos de texto
        sixthProblem();
    }

    public static void firstProblem() {
        StringBuilder sb = new StringBuilder();
        String content = "";
        try {
            String path = "C:\\Users\\formación\\Desktop\\ex1.txt";
            String exitPath = "C:\\Users\\formación\\Desktop\\ex2.txt";
            File txt = new File(path);
            File txtExit = new File(exitPath);
            BufferedReader bf = new BufferedReader(new FileReader(txt));
            FileWriter fwExit = new FileWriter(txtExit);

            String ln = bf.readLine();

            while (ln != null) {
                System.out.println(ln);
                ln = bf.readLine();
                if (ln != null) {
                    System.out.println(ln);
                    sb.append(ln);
                }
            }
            System.out.println("¿Quieres invertir el texto?\n1. Si\n2. No");
            if (sc.nextInt() == 1) {
                ln = sb.reverse().toString();
            } else {
                ln = sb.toString();
            }
            System.out.println(ln);
            fwExit.write(ln);
            fwExit.close();

        } catch (IOException e) {
            System.err.println("Excepción: " + e.getMessage());
        }
    }

    public static void secondProblem() {
        String pathCopy = "C:\\Users\\formación\\Desktop\\ex3.txt";
        File filePathCopy = new File(pathCopy);

        String originalPath = "C:\\Users\\formación\\Desktop\\ex1.txt";
        File originalFilePath = new File(originalPath);

        try {
            InputStream in = new FileInputStream(originalFilePath);
            OutputStream out = new FileOutputStream(filePathCopy);
            int i = in.read();

            while (i != -1) {
                out.write(i);
                i = in.read();
            }
            boolean nameChanged = filePathCopy.renameTo(originalFilePath);
            if (!nameChanged) {
                System.out.println("File successfully renamed!");
            }
            in.close();
            out.close();
            System.out.println("Archivo duplicado con éxito");
        } catch (IOException e) {
            System.err.println("Excepción: " + e.getMessage());
        }
    }

    public static void thirdProblem() {
        System.out.print("Escribe la ruta: ");
        String path = sc.next();
        File file = new File(path);
        String[] fileList = file.list();

        if (fileList != null) {
            for (String fileList1 : fileList) {
                File fileOrDir = new File(path + "\\" + fileList1);
                if (fileOrDir.isDirectory()) {
                    System.out.println("<DIR> " + fileList1);
                } else {
                    System.out.println("<FILE> " + fileList1);
                }
            }
        } else {
            System.out.println("No hay fichero en el directorio especificado");
        }
    }

    public static void fourthProblem() {
        Vehiculo[] vh = new Vehiculo[3];

        Vehiculo c1 = (Vehiculo) new Coche();
        Vehiculo m1 = (Vehiculo) new Moto();
        Vehiculo c2 = (Vehiculo) new Coche();

        vh[0] = c1;
        vh[1] = m1;
        vh[2] = c2;

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\formación\\Desktop\\ex4.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Vehiculo vehiculo : vh) {
                oos.writeObject(vehiculo);
            }
            oos.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void fifthProblem() {
        Vehiculo[] vh = new Vehiculo[3];
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\formación\\Desktop\\ex4.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (Vehiculo vehiculo : vh) {
                vehiculo = (Vehiculo) ois.readObject();
                if (vehiculo instanceof Coche) {
                    System.out.println("Es " + vehiculo + " Coche");
                } else {
                    System.out.println("Es " + vehiculo + " Moto");
                }
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            System.err.println(e.getLocalizedMessage());
        }
    }

    public static void sixthProblem() {
        String path = "C:\\Users\\formación\\Desktop\\";
        StringBuilder sb = new StringBuilder();
        try {
            System.out.println("Introduce el fichero a agregar (Escribe '-1' para finalizar)");
            String fichero = sc.next();

            while (!fichero.equals("-1")) {
                fichero = path + fichero;
                BufferedReader bf = new BufferedReader(new FileReader(fichero));
                sb.append(bf.readLine());
                sb.append("\n");
                System.out.println("Agrega un nuevo fichero. (Escribe '-1' para finalizar)");
                fichero = sc.next();
            }
            System.out.println("Info leída:\n" + sb.toString());
            System.out.println("Introduce el nombre del fichero donde has guardado la info");
            String nombreFichero = sc.next();

            FileWriter fw = new FileWriter(path + nombreFichero);
            fw.write(sb.toString());
            fw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        }
    }

}
