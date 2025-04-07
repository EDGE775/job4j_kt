plugins {
    kotlin("jvm") version "1.6.20" // JVM 17 - Kotlin 1.6.20 - Gradle 7.4.2
    checkstyle
    id("io.gitlab.arturbosch.detekt") version "1.20.0"
}
checkstyle {
    configFile = rootProject.file("checkstyle.xml")
}

group = "ru.job4j"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
}

detekt {
    toolVersion = "1.20.0" // Версия Detekt
    config = files("$projectDir/config/detekt/detekt.yml") // Путь к конфигурационному файлу
    buildUponDefaultConfig = true // Настройки будут расширять дефолтный конфиг Detekt
    allRules = true // Использовать только правила, указанные в конфиге
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<io.gitlab.arturbosch.detekt.Detekt> {
    reports {
        html.required.set(true) // Отчет в формате HTML
        xml.required.set(true)  // Отчет в формате XML
        txt.required.set(false) // Текстовый отчет
    }
}