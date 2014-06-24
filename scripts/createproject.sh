#!/bin/sh
git clone git@github.com:fkab/jradle.git $1
cd $1
rm README.md
echo $1 > README.md
echo "Project $1 created!"
