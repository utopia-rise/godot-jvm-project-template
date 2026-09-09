This is a simple Godot 4 project with the additional Gradle parts necessary to build and run scripts written in Kotlin, Java, or Scala.
It will simply display text on screen written by unique Kotlin, Java, and Scala source files.

## Run a release

Download the zip attached to a [release](https://github.com/utopia-rise/godot-kotlin-project-template/releases). It contains the Godot-JVM addon and the built JARs. Unzip it and open `project.godot` with the matching Godot editor; a JDK 17+ must be available through `JAVA_HOME` or `PATH`.

## Build from source

1. Download the `godot-jvm-addon-<version>.zip` of the Godot-JVM version declared in `build.gradle.kts` from https://github.com/utopia-rise/godot-jvm/releases and unzip it at the root of the project, so that `addons/jvm/` exists.
2. Build the project with `./gradlew build` (JDK 17+ required). The JARs are written to `jvm/` and picked up by the editor automatically.
3. Open the project with the Godot editor whose version matches the `compatibility_minimum` of `addons/jvm/jvm.gdextension`.

For more information, check the documentation: https://godot-kotl.in
