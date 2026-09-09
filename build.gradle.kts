import godot.annotation.processor.classgraph.AnnotationProcessingMode
import godot.gradle.GodotLanguage

plugins {
    id("com.utopia-rise.godot-jvm") version "1.0.0-rc1"
}

repositories {
    mavenCentral()
    google()
}

godot {
    // --------- Setup ---------

    // JVM source languages that participate in the Godot-JVM build pipeline.
    languages.set(setOf(GodotLanguage.KOTLIN, GodotLanguage.JAVA, GodotLanguage.SCALA))

    registration.annotationProcessingMode.set(AnnotationProcessingMode.Inferred)

    // Override the toolchain or language versions only when you need something newer than the defaults.
    // toolchain.javaVersion.set(17)
    // toolchain.kotlinVersion.set("2.3.20")
    // toolchain.scalaVersion.set("3.6.3")

    // Only change this if the Gradle project is not the Godot project root containing project.godot.
    // godotProjectDirectory.set(file("."))

    // Keep the default short registered class names instead of using fully qualified names.
    // registration.nameMode.set(RegisteredNameMode.SIMPLE_NAME)

    // Enables the coroutine support library for Godot lifecycle integration.
    // isGodotCoroutinesEnabled.set(true)

    // --------- Android ---------

    // Path to the Android d8 executable used to build dex artifacts.
    // Defaults to the d8 of the highest build-tools found under $ANDROID_SDK_ROOT.
    // android.d8ToolPath.set("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/36.0.0/d8")

    // Path to the Android SDK platform directory used for compilation.
    // android.compileSdkDirectory.set("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-36")

    // Minimum Android API level passed to d8 during Android export.
    // android.minApiLevel.set(21)

    // --------- Graal / iOS ---------

    // GraalVM home directory used to locate the native-image tool.
    // graal.homeDirectory.set(System.getenv("GRAALVM_HOME"))

    // Windows Visual Studio developer environment script required for native-image on Windows.
    // graal.windowsDeveloperVcVarsPath.set(System.getenv("VC_VARS_PATH"))

    // Extra native-image configuration files if your project needs custom JNI, reflection, or resources.
    // graal.additionalJniConfigurationFiles.set(arrayOf("my-jni-config.json"))
    // graal.additionalReflectionConfigurationFiles.set(arrayOf("my-reflection-config.json"))
    // graal.additionalResourceConfigurationFiles.set(arrayOf("my-resource-config.json"))

    // Enables verbose logging while building the Graal native image.
    // graal.verbose.set(true)

    // --------- Library Authors ---------

    // Set this to true when this Gradle project is a reusable Godot-JVM library instead of a runnable game project.
    // isLibrary.set(true)

    // Alternative registered-name strategies:
    // - SIMPLE_NAME: MyClass
    // - FQ_NAME: my.package.MyClass
    // - PROJECT_PREFIX: externalProject_MyClass
    // registration.nameMode.set(RegisteredNameMode.FQ_NAME)
}
