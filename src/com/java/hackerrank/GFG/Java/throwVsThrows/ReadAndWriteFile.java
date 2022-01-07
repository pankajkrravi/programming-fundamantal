package com.java.hackerrank.GFG.Java.throwVsThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Author pankaj
 * @create 1/5/22 5:59 PM
 */
public class ReadAndWriteFile {
    void readFile() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("path");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("save file path");
    }
}

class TestMain {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        try {
            readAndWriteFile.readFile();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.out.println("ExceptionHandled-------");
        }
        try {
            readAndWriteFile.saveFile();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.out.println(" ------------ save() ExceptionHandled-------");
        }
    }
}
