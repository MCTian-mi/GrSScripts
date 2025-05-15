plugins {
    id("java")
    id("java-library")
    id("groovy")
    id("org.jetbrains.gradle.plugin.idea-ext") version("1.1.8")
    id("com.gtnewhorizons.retrofuturagradle") version("1.4.0")
}

group = "scripts"
version = "1.0-SNAPSHOT"

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
}

repositories {
    mavenCentral()
    exclusiveContent {
        forRepository {
            maven {
                name = "Curse Maven"
                url = uri("https://curse.cleanroommc.com/")
            }
        }
        filter {
            includeGroup("curse.maven")
        }
    }
    maven {
        name = "Cleanroom Maven"
        url = uri("https://maven.cleanroommc.com")
    }
    maven {
        name = "GTNH Maven"
        url = uri("https://nexus.gtnewhorizons.com/repository/public/")
    }
    maven {
        name = "GTCEu Maven"
        url = uri("https://maven.gtceu.com")
    }
    maven {
        name = "BlameJared Maven"
        url = uri("https://maven.blamejared.com")
    }
    mavenLocal()
}

minecraft {
    mcVersion.set("1.12.2")

    // MCP Mappings
    mcpMappingChannel.set("stable")
    mcpMappingVersion.set("39")

    // Set username here, the UUID will be looked up automatically
    username.set("Developer")
}

dependencies {
    implementation("org.apache.groovy:groovy:4.0.14")

    compileOnly("gregtech:gregtech:2.8.10-beta") { isTransitive = false }
    compileOnly("gregicality:GregicalityMultiblocks:1.2.11") { isTransitive = false }
    compileOnly("com.cleanroommc:groovyscript:1.2.4") { isTransitive = false }

    compileOnly(rfg.deobf("curse.maven:susycore-846224:6527834"))
    compileOnly(rfg.deobf("curse.maven:supercritical-1185871:6493239"))
    compileOnly(rfg.deobf("curse.maven:gregtech-food-option-477021:6472136"))
}