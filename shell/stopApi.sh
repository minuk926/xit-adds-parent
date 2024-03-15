#!/bin/sh
if [ $# -ne 1 ]; then
   echo "-----------------------------------"
   echo "       Undefined parameter"
   echo "./stopApi.sh [application name]"
   echo "-----------------------------------"
   exit 1
fi

PID=`ps -ef | grep java | grep $1 | awk '{print $2}'`
echo "Process ID: $PID"
if [ -z $PID ]; then
  echo "=============================="
  echo "  No $1 deamon is running"
  echo "=============================="
else
  echo "Kill $1[$PID] process"
  kill $PID
  echo "==============================="
  echo "  $1[$PID] application stop"
  echo "==============================="
fi
