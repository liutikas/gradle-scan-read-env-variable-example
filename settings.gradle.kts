plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    id("com.gradle.develocity") version("4.1")
}

develocity {
    val bar = providers.environmentVariable("BAR").orElse("unset2")
    buildScan.buildFinished {
        buildScan.value("foo", bar.get())
    }
}

rootProject.name = "scan"
include("lib")
