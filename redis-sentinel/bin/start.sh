#!/bin/sh
sudo /usr/local/bin/redis-server  ~/Dtt/redis-sentinel/conf/redis_master_8001.conf
sudo /usr/local/bin/redis-server  ~/Dtt/redis-sentinel/conf/redis_slave_8005.conf
sudo /usr/local/bin/redis-server  ~/Dtt/redis-sentinel/conf/redis_slave_8006.conf
sudo /usr/local/bin/redis-sentinel ~/Dtt/redis-sentinel/conf/sentinel_8101.conf 
sudo /usr/local/bin/redis-sentinel ~/Dtt/redis-sentinel/conf/sentinel_8201.conf
sudo /usr/local/bin/redis-sentinel ~/Dtt/redis-sentinel/conf/sentinel_8301.conf 
echo "redis sentinel cluster start successful!"
sudo /usr/local/bin/redis-cli -c -h 127.0.0.1 -p 8101 info sentinel

