pipeline {
    agent any

    stages {
        stage('Build the image') {
            steps {
                bat "docker build -t=cucumbertestimage ."
            }
        }

        stage('Making the infra ready') {
            steps {
                bat "docker-compose up -d chrome hub firefox"
            }
        }

        stage('Parallel test execution') {

            parallel
            {
          stage('Execution of code on Chrome Browser') {
            steps {
                bat "docker-compose up cucumber-testcases-chrome"
            }
        post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'chromeexecutionreport/cucumber-reports/reports.html', body: '''<div style="font-family: Arial, sans-serif; line-height: 1.6;">
  <h2 style="color: #2E86C1;">🚀 Project Name: <span style="color: #1ABC9C;">Execution of a project</span></h2>
  
  
  
  <p>
    <strong>Description:</strong><br>
    <span style="color: #34495E;">
      This project is responsible for the automated build, test, and deployment of the <strong>AwesomeApp</strong> application.
      It integrates with GitHub, runs unit tests, performs static analysis, and deploys to the staging environment.
    </span>
  </p>

  <hr style="border-top: 1px dashed #ccc;">

  <h3 style="color: #8E44AD;">📦 Things to remember</h3>
  <ul style="color: #2C3E50;">
    <li>🔧 Dont need to get the latest code</li>
    <li>🧪 Directly execute the test</li>
    <li>🔍 click build now button</li>
  </ul>

  <h3 style="color: #E67E22;">📅 Last Updated:</h3>

  <h3 style="color: #C0392B;">🧑‍💻 Maintainer</h3>
</div>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email service for Chrome Browser', to: 'att25jan@gmail.com gouravatttest@gmail.com'
        }
    }

        }

        stage('Execution of code on Firefox Browser') {
            steps {
                bat "docker-compose up cucumber-testcases-firefox"
            }
        post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'firfoxexecutionreport/cucumber-reports/reports.html', body: '''<div style="font-family: Arial, sans-serif; line-height: 1.6;">
  <h2 style="color: #2E86C1;">🚀 Project Name: <span style="color: #1ABC9C;">Execution of a project</span></h2>
  
  
  
  <p>
    <strong>Description:</strong><br>
    <span style="color: #34495E;">
      This project is responsible for the automated build, test, and deployment of the <strong>AwesomeApp</strong> application.
      It integrates with GitHub, runs unit tests, performs static analysis, and deploys to the staging environment.
    </span>
  </p>

  <hr style="border-top: 1px dashed #ccc;">

  <h3 style="color: #8E44AD;">📦 Things to remember</h3>
  <ul style="color: #2C3E50;">
    <li>🔧 Dont need to get the latest code</li>
    <li>🧪 Directly execute the test</li>
    <li>🔍 click build now button</li>
  </ul>

  <h3 style="color: #E67E22;">📅 Last Updated:</h3>

  <h3 style="color: #C0392B;">🧑‍💻 Maintainer</h3>
</div>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email service for Firefox Browser', to: 'att25jan@gmail.com gouravatttest@gmail.com'
        }
    }

        }






      
    }


}

stage('Making the infra down') {
            steps {
                bat "docker-compose down"
            }

}

}
}