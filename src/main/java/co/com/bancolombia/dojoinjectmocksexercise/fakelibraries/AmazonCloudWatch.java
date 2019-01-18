package co.com.bancolombia.dojoinjectmocksexercise.fakelibraries;

public class AmazonCloudWatch {

    public String getMetrics () {
        return "Real ACW Metrics";
    }

    public boolean putMetricData (String newMetric) {
        return true;
    }

    public String putMetricAlarm (String newAlarm) {
        return newAlarm;
    }
}
