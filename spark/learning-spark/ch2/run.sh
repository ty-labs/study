#!/bin/zsh

sbt clean compile package

spark-submit --class main.learning.spark.chapter2.MnMCount ./target/scala-2.12/learning-spark-chapter2_2.12-1.0.jar ./mnm_dataset.csv
