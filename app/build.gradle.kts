plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.benaichouba.lessonplangenerator"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.benaichouba.lessonplangenerator"
        minSdk = 23
        targetSdk = 34
        versionCode = 2
        versionName = "2.0"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2024.06.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.8.2")
}
