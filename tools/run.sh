#! /bin/bash

set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
PROJECT_ROOT=$(dirname $SCRIPT_DIR)
EXECUTABLE_NAME="app.jar"
TARGET_EXECUTABLE=$(find $PROJECT_ROOT -iname $EXECUTABLE_NAME)

if [[ -z "$TARGET_EXECUTABLE" ]]
then
	echo "Not found"
	exit 1
else
	echo "Found executable $TARGET_EXECUTABLE"
fi

cd $SCRIPT_DIR && java -jar $TARGET_EXECUTABLE
