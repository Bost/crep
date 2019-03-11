### Build

```fish
# check java - see GraalVM config in the ~/.config/fish/config.fish
source ~/.config/fish/config.fish
java -version
lein uberjar; and native-image --no-server --static -jar (find -iname 'crep*standalone.jar')
```

### Usage

```fish
set textToFind "foo"
set prm '{:cmt-str "#" :files ["'$HOME'/dev/cheatsheet/cmds/linux.sh"]}'
set javaCmd /usr/lib/jvm/java-11-openjdk-amd64/bin/java -jar (find -iname 'crep*standalone.jar')
set graalCmd (find -iname 'crep*standalone')  # the binary not the jar file

$javaCmd $prm $textToFind
"Elapsed time: 370.321501 msecs"

$graalCmd $prm $textToFind
"Elapsed time: 929.66596 msecs"
```

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
