def call(){
	environment {
                NEXUS_VERSION = "nexus3"
                NEXUS_PROTOCOL = "https"
                NEXUS_URL = "nexus.example.com"
                NEXUS_GROUP = "com.example"
                NEXUS_CREDENTIAL_ID = "nexus-credentials"
                MAVEN_SNAPSHOT_REPO = "repo-snapshot"
                MAVEN_RELEASE_REPO = "repo-release"
		TARGET = "Staging"
                TEST = """${sh(script: 'echo "$JOB_NAME/test"', returnStdout: true).trim().toLowerCase()}"""
	}
}
