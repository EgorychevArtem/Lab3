package com.examples.Laba;

import org.apache.spark.Sparkconf;
public class App {
    SparkConf conf = new SparkConf().setAppName("lab5");
    JavaSparkContext sc = new JavaSparkContext(conf);
}
