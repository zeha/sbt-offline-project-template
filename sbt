#!/bin/bash
SBT_VERSION=$(grep '^sbt\.version' "project/build.properties" | tr '=\r' ' ' | awk '{ print $2; }' )

# Need absolute path for ivy...
BASEDIR=`pwd`

# Basically what sbt -v -no-share would print
BASIC_OPTS="-Xms1024m -Xmx1024m -XX:ReservedCodeCacheSize=128m -XX:MaxPermSize=256m -Dsbt.boot.directory=project/boot -Dsbt.ivy.home=project/ivy"
OFFLINE_OPTS="-Dbuilddeps.dir=$BASEDIR/builddeps -Dsbt.repository.config=project/repo.properties -Dsbt.override.build.repos=true"
OPTS="$BASIC_OPTS $OFFLINE_OPTS"
exec java $OPTS -jar builddeps/org.scala-sbt/sbt-launch/$SBT_VERSION/jars/sbt-launch.jar "$@"
