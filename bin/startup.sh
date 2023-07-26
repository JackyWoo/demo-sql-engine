#!/bin/bash

binDir=`dirname $0`
libDir=$binDir/../lib
confDir=$binDir/../conf

jars=(`ls $libDir`)

classpath='.'
for j in ${jars[*]}
do
    classpath=$classpath:$libDir/$j
done

classpath=$confDir:$classpath
#echo $classpath

java -cp $classpath woo.TestMain "$@"