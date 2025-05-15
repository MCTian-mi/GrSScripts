# How to initialize the project

1) Make sure that you have cloned the Supersymmetry project in the same folder as this

2) Run the command below:

    For Windows users:
    
    ```shell
    New-Item -ItemType Junction -Path "src/main/groovy" -Target "../Supersymmetry/groovy"
    ```
    
    For Linux / OSX users:
    ```shell
    ln -s "src/main/groovy" "../Supersymmetry/groovy"
    ```
3) Build the project, or simply run the command below:

    ```shell
    ./gradlew build
    ```
