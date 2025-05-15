For windows users:

```shell
New-Item -ItemType Junction -Path "src/main/groovy/scripts" -Target "../Supersymmetry/groovy"
```

For Linux / OSX users:
```shell
ln -s "src/main/groovy/scripts" "../Supersymmetry/groovy"
```