package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Main();
    }

        public Main(){

            // upis linje u fajl sa birsanjema svega u fajlu do sada
            PrintWriter upisUFajl;
            try {
                upisUFajl = new PrintWriter("text.txt");
                upisUFajl.println("Upisana jedna linija u fajlu");
                upisUFajl.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // Dodavanje linije na postojeci fajl
            try {
                upisUFajl = new PrintWriter(new FileWriter("text.txt",true));
                upisUFajl.println("Dodali smo jos jednu liniju u file");
                upisUFajl.flush();
                upisUFajl.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
}
