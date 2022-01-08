package com.codelamps.belajarspring.belajarspring.server;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    public void mulai(){
      log.info("Memulai Server");
    }

    public void berhenti(){
        log.info("Menghentikan Server");
    }
}
