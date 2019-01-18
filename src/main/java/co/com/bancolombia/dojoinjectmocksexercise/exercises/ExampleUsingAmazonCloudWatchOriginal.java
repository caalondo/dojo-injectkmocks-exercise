package co.com.bancolombia.dojoinjectmocksexercise.exercises;

import co.com.bancolombia.dojoinjectmocksexercise.fakelibraries.AmazonCloudWatch;

public class ExampleUsingAmazonCloudWatchOriginal {

    public void putAlarmCloudWatchService () {
        AmazonCloudWatch acw = new AmazonCloudWatch();
        String response = acw.putMetricAlarm("Alarm 1");
    }

    public String getMetricsCloudWatchService () {
        AmazonCloudWatch acw = new AmazonCloudWatch();
        String metrics = acw.getMetrics();
        if (metrics.equals("good")) {
            return "It's really good :D";
        }
        return "No Metrics :(";
    }

    public String putMetricDataCloudWatchService () {
        AmazonCloudWatch acw = new AmazonCloudWatch();
        boolean response = acw.putMetricData("Metric 1");
        if (response) {
            return "Done";
        }
        return "Try again";
    }
}
