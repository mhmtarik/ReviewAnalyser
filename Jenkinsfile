pipeline 
{
	agent any
	stages {
		stage('Compile') {
			agent {
				label 'Slave1'
				 }
			steps {
				 sh "mvn compile"
				 }
						}
		stage('Unit Test') {
			agent {
				label 'Slave2'
				 }
			steps {
				 sh "mvn test"
				  }
							}
			}
	post {
	 always {
	 step([$class: 'JacocoPublisher',
		execPattern: 'target/*.exec',
		classPattern: 'target/classes',
		sourcePattern: 'src/main/java',
		exclusionPattern: 'src/test*'
	 ])
	 }   
	}		
}
