#!/bin/bash

is_local=true

if [ "$is_local" = "true" ]; then
  prefix=docker.quncrm.com
else
  prefix=ccr.ccs.tencentyun.com
fi

docker build -t $prefix/alct/lbs-service docker
docker push $prefix/alct/lbs-service