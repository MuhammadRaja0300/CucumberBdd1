pipeline {
  agent any
  stages {
    stage('Check Versions') {
      parallel {
        stage('Maven Version') {
          steps {
            bat 'mvn -v' // Use 'sh' if on Unix
          }
        }

        stage('Java Version') {
          steps {
            bat 'java -version' // Use 'sh' if on Unix
          }
        }
      }
    }

    stage('Running Test') {
      steps {
        bat 'mvn clean test' // Use 'sh' if on Unix
      }
    }

    stage('Report Generation') {
      steps {
        cucumber(
          failedFeaturesNumber: -1, 
          failedScenariosNumber: -1, 
          failedStepsNumber: -1, 
          fileIncludePattern: '**/*.json', 
          pendingStepsNumber: -1, 
          skippedStepsNumber: -1, 
          sortingMethod: 'ALPHABETICAL', 
          undefinedStepsNumber: -1
        )
      }
    }
  }
}








// pipeline {
//   agent any
//   stages {
//     stage('Maven Version') {
//       parallel {
//         stage('Maven Version') {
//           steps {
//             bat 'mvn -v'
//           }
//         }

//         stage('Java Version') {
//           steps {
//             bat 'java -version'
//           }
//         }

//       }
//     }

//     stage('Running Test') {
//       steps {
//         bat 'mvn clean test'
//       }
//     }

//     stage('Report Generation') {
//       steps {
//         cucumber(failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1)
//       }
//     }

//   }
// }
