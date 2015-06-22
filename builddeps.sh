#!/bin/bash
echo "Updating builddeps..."
# Need absolute path for ivy...
OUTDIR=`pwd`/builddeps
exec ant -Divy.jar.file=/usr/local/Cellar/ivy/2.4.0/libexec/ivy-2.4.0.jar -Dbuilddeps.dir="$OUTDIR" -f builddeps.xml
