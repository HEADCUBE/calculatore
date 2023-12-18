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
}
}
