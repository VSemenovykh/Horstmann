package ru.ncedu.horstmann.interfacesandlabdaexpressions;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * This class ListFile
 * Exercises  11
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
 * class, write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object. Repeat with a
 * method expression and an anonymous inner class.
 *
 * Exercises  12
 * Using the list(FilenameFilter) method of the java.io.File class, write a method
 * that returns all files in a given directory with a given extension. Use a
 * lambda expression, not a FilenameFilter.
 *
 * Exercises  13
 * Given an array of File objects, sort it so that directories come before files,
 * and within each group, elements are sorted by path name. Use a lambda
 * expression to specify the Comparator.
 * @version 1.0, 8 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ListFile {
    private String nameDir;
    private File dir;
    private String ext;

    /**
     * Constructor - creating a new instance with specific values
     * @see #ListFile(String)
     */
    public ListFile(){}

    /**
     * Constructor - creating a new instance with specific values
     * @see #ListFile(String,String)
     */
    public ListFile(String nameDir){
        dir = new File(nameDir);
    }

    /**
     * Constructor - creating a new instance with specific values
     * @see #ListFile()
     */
    public ListFile(String nameDir, String ext){
        this.ext = ext;
        dir = new File(nameDir);
    }

    /*Exercises 11*/
    /**
     * Method using lambda expression
     * @return list subdirectories
     */
    public File[] listSubDirsLambdaExpression() {
        File[] subDirs = dir.listFiles((dir) -> {
            return dir.isDirectory();
        });
        return subDirs;
    }

    /**
     * Method using anonymous inner class
     * @return list subdirectories
     */
    public File[] listSubDirsAnonymousClass() {
        File[] subDirs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        return subDirs;
    }

    /*Exercises 12*/
    /**
     * @return all files in a given directory with a given extension
     */
    public String[] listFilesLambdaExpression() {
        String[] extFiles = dir.list((d, s) -> {
            return s.toLowerCase().endsWith(ext);
        });
        if (extFiles.length == 0)
            return null;
        return extFiles;
    }

    /**
     * Method print result of method {@link #listFilesLambdaExpression()}
     */
    public void printListFiles(){
        System.out.println("Using Lambda Expression");
        for (String extFile : listFilesLambdaExpression())
            System.out.println(extFile);
    }

    /*Exercises 13*/
    private static void sort(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
    }
}
