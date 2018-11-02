
# Kotlin FHIR Model

Generator code based on https://github.com/smart-on-fhir/fhir-parser

To test things out, you can do, in order:

    mvn compile
    downloadFiles=true mvn exec:java # downloads files from FHIR
    mvn test



###Todo
* Implement primitive _ support.  https://www.hl7.org/fhir/json.html#primitive