import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.script

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "org.example.kobwebtest"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")

        }


    }
}

kotlin {
    configAsKobwebApplication("kobwebtest")

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)

        }


        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            //            Kotlin Bootstrap
            implementation("com.github.stevdza-san:KotlinBootstrap:0.1.0")

        }
    }
}
