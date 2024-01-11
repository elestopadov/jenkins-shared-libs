#!groovy

def call(Map config){
    node {
        echo "This is project ${config.name}"
        // Get some code from a GitHub repository
        git 'https://github.com/jglick/simple-maven-project-with-tests.git'

        // Run Maven on a Unix agent.
        sh 'mvn -Dmaven.test.failure.ignore=true clean package'

        // Grouping steps
        // sh '...'
        // archiveArtifacts artifacts: '1', followSymlinks: false
    }
}
