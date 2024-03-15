#!/bin/sh
if [ $# -ne 1 ]; then
   echo "-----------------------------------"
   echo "       Undefined parameter"
   echo "./backupApi.sh [application name]"
   echo "-----------------------------------"
   exit 1
fi

if [ ! -f "../$1.jar" ]; then
   echo "==================================="
   echo "  $1.jar file not exist"
   echo "==================================="
   exit 1
fi

source /applications/mens/bin/stopApi.sh $1

echo "-----------------------------------"
echo "  $1 application backup success!"
echo "-----------------------------------"
mv /applications/mens/$1.jar /applications/mens/$1.jar_backup
