# How to initialize the project

1) Make sure that you have cloned the Supersymmetry project in the same folder as this

2) Build the project, or simply run the command below:

    ```shell
    ./gradlew build
    ```
3) Run the command below:

   For Windows users:

    ```shell
    New-Item -ItemType Junction -Path "src/main/groovy" -Target "../Supersymmetry/groovy"
    ```

   For Linux / OSX users:
    ```shell
    ln -s "<path_to_your_idea_project_folder>/Supersymmetry/groovy" "src/main/groovy"
    ```