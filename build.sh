#!/bin/bash
docker run --rm -i -v ~/.m2:/root/.m2 -v $(pwd):/app maven:3.5-jdk-8-alpine sh -c "cd /app && mvn -DskipTests clean package"
cp target/lbs-service.jar docker/

