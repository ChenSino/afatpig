package com.example.demo6666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class Demo6666Application {

    public static void main(String[] args) {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = new Socket(6666);
        SpringApplication.run(Demo6666Application.class, args);
    }

}
