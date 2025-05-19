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

    api("gregtech:gregtech:2.8.10-beta") { isTransitive = false }
    api("gregicality:GregicalityMultiblocks:1.2.11") { isTransitive = false }
    api("com.cleanroommc:groovyscript:1.2.4") { isTransitive = false }

    api(rfg.deobf("curse.maven:susycore-846224:6527834"))
    api(rfg.deobf("curse.maven:supercritical-1185871:6493239"))
    api(rfg.deobf("curse.maven:gregtech-food-option-477021:6472136"))

//    api(rfg.deobf("curse.maven:techguns-244201:2958103"))
//    api(rfg.deobf("curse.maven:ae2-extended-life-570458:6302098"))
//    api(rfg.deobf("curse.maven:fluidlogged-api-485654:4564413"))
//    api(rfg.deobf("curse.maven:universal-mod-core-371784:4975229"))
//    api(rfg.deobf("curse.maven:track-api-282613:2825260"))
//    api(rfg.deobf("curse.maven:immersive-railroading-277736:4970105"))
//    api(rfg.deobf("curse.maven:athenaeum-284350:4633750"))
//    api(rfg.deobf("curse.maven:pyrotech-306676:6253355"))
}