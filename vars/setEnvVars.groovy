def call(target) {
	if (target == "qa") {
                env.NEXUS_VERSION = "nexus3"
                env.NEXUS_PROTOCOL = "https"
                env.NEXUS_URL = "nexus.example.com"
                env.NEXUS_GROUP = "com.example"
                env.NEXUS_CREDENTIAL_ID = "nexus-credentials"
                env.MAVEN_SNAPSHOT_REPO = "repo-snapshot"
                env.MAVEN_RELEASE_REPO = "repo-release"
		env.TARGET = "QA"
                env.TEST = env.JOB_NAME.trim().toLowerCase().replaceAll("/",":")
	}

	if (target == "stg") {
                env.NEXUS_VERSION = "nexus3"
                env.NEXUS_PROTOCOL = "https"
                env.NEXUS_URL = "nexus.example.com"
                env.NEXUS_GROUP = "com.example"
                env.NEXUS_CREDENTIAL_ID = "nexus-credentials"
                env.MAVEN_SNAPSHOT_REPO = "repo-snapshot"
                env.MAVEN_RELEASE_REPO = "repo-release"
                env.TARGET = "STG"
                env.TEST = env.JOB_NAME.trim().toLowerCase().replaceAll("/",":")
	}
	
	env.TARGET_UPPER = env.TARGET.toUpperCase()
	env.TARGET_LOWER = env.TARGET.toLowerCase()
	env.TARGET_CAMEL = env.TARGET.capitalize()
}

