package frc.robot.utils;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class MetricTracker {
    public MetricTracker(String instrumentedClassNAme, String metrics) {
    }

    public static MetricTracker createMetricTracker(String instrumentedClassNAme, String metrics) {
        MetricTracker newMetricTracker = new MetricTracker(instrumentedClassNAme, metrics);
        return newMetricTracker;
    }
}