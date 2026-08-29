# 3 LP Gen — Lesson Plan Generator

Android/Kotlin replacement project based on the supplied `3_LP_Gen.apk` and its generated lesson-plan PDF.

## Important improvements in v2.0

### 1. One-time teacher registration
Teacher information is stored locally with `SharedPreferences`.

- Registration is shown only on first launch.
- Later launches go directly to Home.
- Teacher information can be edited from Profile.
- A Reset Profile action is available.

### 2. A real lesson plan
The generator now produces a structured plan rather than three broad paragraphs.

Each plan contains:

- Lesson identification
- Learning objectives
- Target competencies
- Subsidiary objectives
- Core values
- Language focus
- Materials
- Prerequisites
- Anticipated difficulties and solutions
- Detailed lesson procedure
- Stage, time, teacher activity, pupil activity, interaction, materials and assessment
- Differentiation / support
- Assessment and evidence of learning
- Homework / follow-up
- Teacher reflection

The default template is designed around the structure visible in the supplied PDF: identification, objectives, competencies, values, materials and session stages. The short three-stage procedure in the supplied PDF is expanded into teachable classroom steps.

## Build

Open this folder in Android Studio and run:

```bash
./gradlew assembleDebug
```

The project uses Android Gradle Plugin 8.2.2 and Kotlin 1.9.22.

## Package

`com.benaichouba.lessonplangenerator`

## Note

The APK supplied in the conversation is a compiled artifact, not the original Android Studio source project. This repository is therefore a clean reconstruction/reimplementation of the app's purpose and visible output structure, with the requested fixes.
