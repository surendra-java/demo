node {
    def app
    stage('Clone repository') {
        checkout scm
    }
   stage('Maven Build') { 
    	withEnv(["JAVA_HOME=${tool name: 'java-9', type: 'jdk'}"]) {
    	   def mvnHom = tool name: 'maven-3', type: 'maven'
           sh "${mvnHom}/bin/mvn package"
           }
        }
    stage('Build image') {
        app = docker.build("surmis/onetoonejpa")
    }

    stage('Test image') {
        app.inside {
            sh 'echo "Tests passed"'
        }
    }
    stage('Push image') {
            docker.withRegistry('https://registry.hub.docker.com', 'DockerHub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
    stage('Deploy to Kubernetes'){
    	try {
           		kubernetesDeploy(configs: "deployment.yaml", kubeconfigId: "kubeconfig1")
           }catch (e) {
    			println e
		   }
           
    }
    
}