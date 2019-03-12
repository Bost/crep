### Build

```fish
# check java - see GraalVM config in the ~/.config/fish/config.fish
source ~/.config/fish/config.fish
java -version
lein uberjar; and \
set jarFile (find -iname 'crep*standalone.jar'); and \
native-image --no-server --static -jar $jarFile; and \
set cmdGraal (find -iname 'crep*standalone')
```

### Usage

```fish
set textToFind "foo"
set prm '{:cmt-str "#" :files ["'$HOME'/dev/cheatsheet/cmds/linux.sh"]}'
set javaBin /usr/lib/jvm/java-11-openjdk-amd64/bin/java
# set cmdJava $javaBin -jar $jarFile
set cmdJava $javaBin -XX:TieredStopAtLevel=1 -jar $jarFile

$cmdJava $prm $textToFind
"Elapsed time: 370.321501 msecs"

$cmdGraal $prm $textToFind
"Elapsed time: 929.66596 msecs"
```

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
