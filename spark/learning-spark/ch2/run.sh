#!/bin/zsh

spark-submit --class main.learning.spark.ch2.MnMCount ./target/scala-2.12/ch2.jar ./mnm_dataset.csv
