package t2.gevorderdecursusttwo.les05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FilesApp {
    /**
     * =>h10 in handboek
     * mappenstructuur aanmaken
     * Aanmaken van een bestand
     * Tekstregels wegschrijven
     * tekstregels lezen
     * Een kopie maken van het bestand
     * bestand verwijderen
     */

    public static void main(String[] args) {
        //todo: see how we can get this so can be executed everywhere (mac, linux, windows)
        String rootProject = "/Users/alexanderboffin/Documents/developmentPersonal/sources/JavaBeginnercoursT2";

        try {
            //create map
            String newFolder = "/sandbox";
            Path pathNewDirectory = Paths.get(rootProject + newFolder);
            if (!Files.exists(pathNewDirectory)) {
                Files.createDirectory(pathNewDirectory);
                System.out.println("We created a directory: " + rootProject + newFolder);
            } else {
                System.out.println("the following directory already exists: " + rootProject + newFolder);
            }

            String fileName = "/theNewFile.txt";
            String fileNamePath = rootProject + newFolder + fileName;
            Path pathNewFile = Paths.get(fileNamePath);
            //create file
            if (Files.notExists(pathNewFile)) { //can also use filewriter
                Files.createFile(pathNewFile);
                System.out.println("The following file was made anew: " + fileNamePath);
            } else {
                System.out.println("The following file already exists: " + fileNamePath);
            }

            //writing lines to the file
            List<String> linesForTheNewDoc = new ArrayList<>();
            linesForTheNewDoc.add("our first line");
            linesForTheNewDoc.add("Our second line");
            linesForTheNewDoc.add("Fin");

            Files.write(pathNewFile, linesForTheNewDoc, Charset.defaultCharset(), StandardOpenOption.APPEND);
            System.out.println("Our lines are written to the file");

            //reading the file
            //ArrayList<String> readLinesFile= Files.lines(pathNewFile).toArray();
            System.out.println("\nReading from the file first time");
            Files.lines(pathNewFile).forEach(System.out::println);

            //make a copy
            Path copyFilePath = Paths.get(rootProject + newFolder + "/copiedFile");
            Files.copy(pathNewFile, copyFilePath, StandardCopyOption.COPY_ATTRIBUTES);


            //adapt the first file
            linesForTheNewDoc = new ArrayList<>();
            linesForTheNewDoc.add("newline");

            Files.write(pathNewFile, linesForTheNewDoc, Charset.defaultCharset(), StandardOpenOption.APPEND);

            System.out.println("\nReading from the file second time");
            Files.lines(pathNewFile).forEach(System.out::println);

            System.out.println("\nReading the copy ");
            Files.lines(copyFilePath).forEach(System.out::println);

            //remove the first file
            Files.deleteIfExists(pathNewFile);
            System.out.println("\nDeleted the first file");

            Files.deleteIfExists(copyFilePath);
            System.out.println("Also deleted second. So all files cleaned");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
