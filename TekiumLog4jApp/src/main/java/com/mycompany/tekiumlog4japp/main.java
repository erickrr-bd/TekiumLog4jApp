/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tekiumlog4japp;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main class of the application.
 * @author Erick Rodriguez
 */
public class main {
    /**
     * Object used for the application log.
     */
    static Logger log = LogManager.getLogger("TekiumLog4jApp");

    /**
     * Main method of the TekiumLog4jApp application.
     * 
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("  _______   _    _                 _                 _  _   _                      \n" +
" |__   __| | |  (_)               | |               | || | (_)   /\\                \n" +
"    | | ___| | ___ _   _ _ __ ___ | |     ___   __ _| || |_ _   /  \\   _ __  _ __  \n" +
"    | |/ _ \\ |/ / | | | | '_ ` _ \\| |    / _ \\ / _` |__   _| | / /\\ \\ | '_ \\| '_ \\ \n" +
"    | |  __/   <| | |_| | | | | | | |___| (_) | (_| |  | | | |/ ____ \\| |_) | |_) |\n" +
"    |_|\\___|_|\\_\\_|\\__,_|_| |_| |_|______\\___/ \\__, |  |_| | /_/    \\_\\ .__/| .__/ \n" +
"                                                __/ |     _/ |        | |   | |    \n" +
"                                               |___/     |__/         |_|   |_|    \n" +
"");
        log.info("Version: 1.0");
        log.info("Author: Erick Rodriguez");
        log.info("Email: erodriguez@tekium.mx, erickrr.tbd93@gmail.com");
        log.info("License: GPLv3");
        log.info("Starting TekiumLog4jApp using Java 1.8.0");
        log.info("Server initialized with pórt: 8080 (HTTP)");
        log.info("Completed initialization");
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new VulnerabilityLog4j());
        server.setExecutor(null);
        server.start();
    }
}
