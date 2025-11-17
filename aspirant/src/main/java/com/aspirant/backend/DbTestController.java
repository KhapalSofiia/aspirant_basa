package com.aspirant.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.DataSource;

@RestController
public class DbTestController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/test-db")
    public String testDb() throws Exception {
        var conn = dataSource.getConnection();
        return "Connected to: " + conn.getMetaData().getURL();
    }
}

