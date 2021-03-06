plugins {
    `java-library`
}
repositories {
    jcenter()
}

// tag::config-logic[]
dependencies {
    implementation("log4j:log4j:1.2.17")
}

task("printArtifactNames") {
    doLast {
        val libraryNames = configurations.compileClasspath.map { it.name }
        logger.quiet(libraryNames.toString())
    }
}
// end::config-logic[]
