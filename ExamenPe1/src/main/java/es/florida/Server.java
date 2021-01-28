package es.florida;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static final int SERVER_PORT = 6789;

    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ServerSocket server = new ServerSocket(SERVER_PORT);
        Socket clientConnection = null;
        while (true) {
            clientConnection = server.accept();
            System.out.println("client connected on port " + clientConnection.getPort());
            OutputStream outputStream = clientConnection.getOutputStream();
            InputStream input = clientConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            PrintWriter printer = new PrintWriter(new OutputStreamWriter(outputStream));

        }
    }

}


