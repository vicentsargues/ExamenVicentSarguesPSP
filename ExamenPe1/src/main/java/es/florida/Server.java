package es.florida;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int SERVER_PORT = 6789;

    public Server() {
    }

    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ServerSocket server = new ServerSocket(6789);
        Socket clientConnection = null;

        label80:
        while(true) {
            clientConnection = server.accept();
            System.out.println("client connected on port " + clientConnection.getPort());
            OutputStream outputStream = clientConnection.getOutputStream();
            InputStream input = clientConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            PrintWriter printer = new PrintWriter(new OutputStreamWriter(outputStream));
            String command = "ENEMY_SPOTTED";

            new ArrayList();
            printer.println("Bienvenidos");

                String line;

                        if ((line = reader.readLine()) == null) {
                            continue label80;
                        }
                        System.out.println("Introduce un comando");

                            if (line.equals(command) ) {
                                System.out.println("Enemy spotted");

                            }

            }
        }
    }

