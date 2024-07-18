package com.besscroft.api.moss.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.besscroft.api.moss")
public class MossApplication {

    public static void main(String[] args) {
        SpringApplication.run(MossApplication.class, args);
        log.info("(♥◠‿◠)ﾉﾞ  MOSS 启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }

}
