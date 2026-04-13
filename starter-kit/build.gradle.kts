plugins {
    kotlin("android")
    id("com.android.library")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "ly.img.editor.configuration"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
        targetSdk = 36

        ndk {
            abiFilters += listOf("arm64-v8a", "armeabi-v7a", "x86_64", "x86")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    api("ly.img:editor:1.73.0-rc.2")
    // Required for enableEdgeToEdge
    implementation("androidx.activity:activity-ktx:1.9.0")
}
