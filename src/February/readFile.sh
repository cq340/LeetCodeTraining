#!/bin/bash
function readFile(){
    cd $1
    for line in `cat $1`
    do
        pwd=$line
    done
    echo $pwd > "D:\1.txt"
}
input_file="D:\2.txt"
readFile $input_file
