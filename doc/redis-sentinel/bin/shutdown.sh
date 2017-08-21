#!/bin/sh
sudo /usr/local/bin/redis-cli -h 127.0.0.1 -p 8001 shutdown
sudo /usr/local/bin/redis-cli -h 127.0.0.1 -p 8101 shutdown
sudo /usr/local/bin/redis-cli -h 127.0.0.1 -p 8201 shutdown
sudo /usr/local/bin/redis-cli -h 127.0.0.1 -p 8301 shutdown
sudo /usr/local/bin/redis-cli -h 127.0.0.1 -p 8015 shutdown
sudo /usr/local/bin/redis-cli -h 127.0.0.1 -p 8006 shutdown
