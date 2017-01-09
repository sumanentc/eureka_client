#!/bin/bash
set -e
set -x

DEFAULT_APP_ENV="testing"
DEFAULT_APP_STACK="testing"
DEFAULT_APP_OWNER="testing"

if [ -n "$APP_ENV" ]; then
    echo ""
else
    export APP_ENV=$DEFAULT_APP_ENV
    echo "setting APP_ENV"
fi

if [ -n "$APP_STACK" ]; then
    echo ""
else
    export APP_STACK=$DEFAULT_APP_STACK
    echo "setting DEFAULT_APP_STACK"
fi

if [ -n "$APP_OWNER" ]; then
    echo ""
else
    export APP_OWNER=$DEFAULT_APP_OWNER
    echo "setting DEFAULT_APP_STACK"
fi

APP_HOSTNAME=$(hostname)

HOSTNAME=REPLACE_CONTENT_NAME"-"$APP_HOSTNAME

sed -i.bak s/%APP_ENV%/${APP_ENV}/g /etc/telegraf/telegraf.conf
sed -i.bak s/%APP_STACK%/${APP_STACK}/g /etc/telegraf/telegraf.conf
sed -i.bak s/%APP_OWNER%/${APP_OWNER}/g /etc/telegraf/telegraf.conf
sed -i.bak s/%APP_ENV%/${APP_ENV}/g /etc/telegraf/telegraf.conf
sed -i.bak s:%JOLOKIA%:JOLOKIA_URL:g /etc/telegraf/telegraf.conf
sed -i.bak s/%APP_NAME%/REPLACE_CONTENT_NAME/g /etc/telegraf/telegraf.conf
sed -i.bak s:%APP_HOSTNAME%:$HOSTNAME:g /etc/telegraf/telegraf.conf

service telegraf start
service td-agent start
exec java  -jar instruction-service-1.0-SNAPSHOT.jar
