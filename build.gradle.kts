plugins {
    kotlin("multiplatform") version "1.9.23"
    kotlin("plugin.serialization") version "1.9.23"
}

group = "com.github.tedblair2"
version = "1.0.0"

repositories {
    google()
    mavenCentral()
}

kotlin{
    js(IR) {
        moduleName="main"
        nodejs()
        binaries.executable()
    }
    sourceSets {
        commonMain.dependencies{
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
        }
        val jsMain by getting {
            dependencies {
                implementation(npm("express","4.19.2"))
            }
        }
    }
}

