package co.com.bancolombia.dojoinjectmocksexercise.fakelibraries;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AmazonS3 {

    public boolean createBucket (String bucketName) {
        return true;
    }

    public boolean putObject (String bucketName, String content) {
        return true;
    }

    public List<String> listObjects (String bucketName) {
        List<String> listObj = new ArrayList<>();
        listObj.add("Object1");
        listObj.add("Object2");
        listObj.add("Object3");
        return listObj;
    }
}
