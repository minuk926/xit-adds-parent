#!/bin/sh
if [ $# -ne 1 ]; then
   echo "-----------------------------------"
   echo "       Undefined parameter"
   echo "./deployApi.sh [application name]"
   echo "-----------------------------------"
   exit 1
fi

if [ ! -f "../$1.jar" ]; then
   echo "==================================="
   echo "  $1.jar file not exist"
   echo "==================================="
   exit 1
fi

mv /applications/mens/$1.jar /applications/mens/$1.jar_backup
cp /var/lib/jenkins/workspace/MENS-API/mens-api/target/$1.jar /applications/mens/$1.jar
