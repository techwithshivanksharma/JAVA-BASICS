package LabSheet6;

import java.io.*;

public class code12 {
    public static void main(String[] args) {
        try {
            throw new IOException("IO problem");
        } catch (IOException e) {
            System.out.println("Caught IOException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}

