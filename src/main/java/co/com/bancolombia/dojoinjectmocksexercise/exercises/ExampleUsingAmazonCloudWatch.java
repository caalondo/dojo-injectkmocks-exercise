package co.com.bancolombia.dojoinjectmocksexercise.exercises;

import co.com.bancolombia.dojoinjectmocksexercise.fakelibraries.AmazonCloudWatch;

public class ExampleUsingAmazonCloudWatch {

    private AmazonCloudWatch acw;

    // Alternative 1
    public ExampleUsingAmazonCloudWatch(AmazonCloudWatch acw) {
        this.acw = acw;
    }

    // Alternative 2
//    public void setAcw(AmazonCloudWatch acw) {
//        this.acw = acw;
//    }

    public void putAlarmCloudWatchService () {
        String response = acw.putMetricAlarm("Alarm 1");
        System.out.println("RESP: " + response);
    }

    public String getMetricsCloudWatchService () {
        String metrics = acw.getMetrics();
        if (metrics.equals("good")) {
            return "It's really good :D";
        }
        return "No Metrics :(";
    }

    public String putMetricDataCloudWatchService () {
        boolean response = acw.putMetricData("Metric 1");
        if (response) {
            return "Done";
        }
        return "Try again";
    }

}
