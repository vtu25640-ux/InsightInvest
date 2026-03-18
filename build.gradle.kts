// Top-level Gradle build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.13.2" apply false
    id("com.android.library") version "8.13.2" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false // ✅ Required for Compose in Kotlin 2.0+
    id("com.google.gms.google-services") version "4.4.2" apply false // ✅ Firebase plugin
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
