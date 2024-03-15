#!/bin/sh
if [ $# -ne 1 ]; then
   echo "-----------------------------------"
   echo "       Undefined parameter"
   echo "./startApi.sh [application name]"
   echo "-----------------------------------"
   exit 1
fi

if [ ! -f "../$1.jar" ]; then
   echo "==================================="
   echo "  $1.jar file not exist"
   echo "==================================="
   exit 1
fi

echo "================================"
echo "  $1 application start"
echo "================================"
JAVA_HOME=/lib/jvm/java-17-openjdk
export JAVA_HOME
nohup $JAVA_HOME/bin/java -Dspring.profiles.active=prod -jar /applications/mens/$1.jar > /dev/null &
