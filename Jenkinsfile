pipeline {
agent any
stages {
stage("Compilation") {
steps {
sh "./gradlew compileJava"
}
}
stage("test unitaire") {
steps {
sh "./gradlew test"
}
}
stage("Code coverage") {
steps {
sh "./gradlew jacocoTestReport"
sh "./gradlew jacocoTestCoverageVerification"
}
}
stage("Analyse statistique du code") {
steps {
sh "./gradlew checkstyleMain"
}
}
stage("Package") {
steps {
sh "./gradlew build"
}
}
stage("Docker build") {
steps {
sh "sudo docker build -t calculator ."
}
}
stage("Docker push") {
steps {
sh "sudo docker push localhost:5000/calculator"
}
}
stage("Déploiement sur staging") {
steps {
sh "sudo docker run -d --rm -p 8765:8080 --name calculator localhost:5000/calculator"
}
}
}
}
