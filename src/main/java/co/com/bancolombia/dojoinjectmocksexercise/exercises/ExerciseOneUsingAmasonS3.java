package co.com.bancolombia.dojoinjectmocksexercise.exercises;

import co.com.bancolombia.dojoinjectmocksexercise.fakelibraries.AmazonS3;

import java.util.List;

public class ExerciseOneUsingAmasonS3 {

    private String bucketName = "MyBucket";

    public String createBucketS3 () {
        AmazonS3 awsS3 = new AmazonS3();
        boolean response = awsS3.createBucket(bucketName);
        if (response) {
            return "Created";
        }
        return "Not created";
    }

    public String checkListObjectsS3 () {
        AmazonS3 awsS3 = new AmazonS3();
        List<String> response = awsS3.listObjects(bucketName);
        if (response.get(0).equals("ValidObject")) {
            return "Validated";
        }
        return "Validation error";
    }

    public boolean saveObjectS3 () {
        AmazonS3 awsS3 = new AmazonS3();
        return awsS3.putObject(bucketName, "This is my content");
    }
}
