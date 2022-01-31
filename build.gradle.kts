repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  `java-library`
  `maven-publish`
  kotlin("jvm") version "1.6.10"
}
dependencies {
  implementation("ch.qos.logback:logback-classic:1.2.10")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
  testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.25")
  testImplementation("io.mockk:mockk:1.12.2")
}
tasks.compileKotlin {
  kotlinOptions.jvmTarget = "11"
}
tasks.compileTestKotlin {
  kotlinOptions.jvmTarget = "11"
}
tasks.test {
  useJUnitPlatform()
}
publishing {
  publications {
    create<MavenPublication>("webquick") {
      from(components["java"])
    }
  }
}
