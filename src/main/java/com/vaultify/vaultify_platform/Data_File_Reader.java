package com.vaultify.vaultify_platform;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Data_File_Reader {

    public String DataKeys(String key) throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Datas\\data.properties");
        Properties p = new Properties();
        p.load(fis);
        String value = p.getProperty(key);
        return value;
    }
}
