def call(){
                env.NEXUS_VERSION = "nexus3"
                env.NEXUS_PROTOCOL = "https"
                env.NEXUS_URL = "nexus.example.com"
                env.NEXUS_GROUP = "com.example"
                env.NEXUS_CREDENTIAL_ID = "nexus-credentials"
                env.MAVEN_SNAPSHOT_REPO = "repo-snapshot"
                env.MAVEN_RELEASE_REPO = "repo-release"
		env.TARGET = "QA"
                env.TEST = """${sh(script: 'echo "$JOB_NAME/test"', returnStdout: true).trim().toLowerCase()}"""
}
