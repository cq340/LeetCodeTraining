#!/bin/bash
function getdir(){
    cd $1
    for element in `ls $1`
    do
        dir_or_file=$element
        if [ $dir_or_file != 'b.txt' ] && [ $dir_or_file != 'c.txt' ]
        then
            rm -rf $dir_or_file
        fi
    done
}
input_dir="D:\11"
getdir $input_dir