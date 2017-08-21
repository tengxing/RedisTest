#!/bin/sh
echo "连接redis端口：$1"
sudo /usr/local/bin/redis-cli -c -h 127.0.0.1 -p $1 

