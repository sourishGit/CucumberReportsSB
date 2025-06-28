pipleline{
	
		agent any
		stages {
			stage ('Compile Stage') {
				
				steps {
					
					withMaven(maven:'maven_3_9_10') {
						sh 'mvn clean install'
					}
				}
			}
			
			stage ('Test Stage') {
				
				steps {
					
					withMaven(maven:'maven_3_9_10') {
						sh 'mvn test -PCucumberTests'
					}
				}
			}
			
			stage ('Cucumber Reports') {
				
				steps {
					
					cucumber buildStatus: "UNSTABLE",
					fiileIncludePattern: "**/cucumber.json",
					jsonReportDirectory: 'target'
					}
				}
			}
		}
		
