package co.com.bancolombia.dojoinjectmocksexercise.exercises;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import co.com.bancolombia.dojoinjectmocksexercise.fakelibraries.AmazonCloudWatch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UsingAmazonCloudWatchTest {

    @Mock
    private AmazonCloudWatch awsMock;

    @InjectMocks
    private ExampleUsingAmazonCloudWatch exampleUsingAmazonCloudWatch;

    @Test
    public void testCloudWatchPutAlarm () {
        when(awsMock.putMetricAlarm(any(String.class))).thenReturn("Mock");
        exampleUsingAmazonCloudWatch.putAlarmCloudWatchService();
        verify(awsMock).putMetricAlarm(any(String.class));
    }

    @Test
    public void getMetricsGood () {
        when(awsMock.getMetrics()).thenReturn("good");
        String resp = exampleUsingAmazonCloudWatch.getMetricsCloudWatchService();
        assertEquals(resp, "It's really good :D");
    }

    @Test
    public void getMetricsWrong () {
        when(awsMock.getMetrics()).thenReturn("abcd");
        String resp = exampleUsingAmazonCloudWatch.getMetricsCloudWatchService();
        assertEquals(resp, "No Metrics :(");
    }
}
