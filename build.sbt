import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "io.sciencebird"
ThisBuild / organizationName := "ScienceBird"

lazy val root = (project in file("."))
  .settings(name := "sps")
  .aggregate(core, coreTestkit, persistenceInmemory)

//TODO: Continue adding libraries from the pfp book
lazy val core = (project in file("modules/core"))
  .settings(
    name := "sps-core",
    scalafmtOnCompile := true,
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies += compilerPlugin(kindProjector),
    libraryDependencies += compilerPlugin(contextApplied),
    libraryDependencies += catsCore,
    libraryDependencies += catsEffect,
    libraryDependencies += console4Cats,
    libraryDependencies += derevoCats,
    libraryDependencies += derevoCatsTagless,
    libraryDependencies += fs2,
    libraryDependencies += meowMtlCore,
    libraryDependencies += meowMtlEffects,
    libraryDependencies += newType,
    libraryDependencies += refined,
    libraryDependencies += monocleCore,
    libraryDependencies += monocleMacro,
    libraryDependencies += scalaCheck, //TODO: Remove. Added for experimenting
    libraryDependencies += scalaTest % Test
  )

lazy val coreTestkit = (project in file("modules/core-testkit"))
  .settings(
    name := "core-testkit",
    scalacOptions += "-Ymacro-annotations",
    scalafmtOnCompile := true,
    libraryDependencies += scalaCheck
  )
  .dependsOn(core)

lazy val persistenceInmemory = (project in file("modules/persistence-inmemory"))
  .settings(
    name := "sps-persistence-inmemory",
    scalacOptions += "-Ymacro-annotations",
    scalafmtOnCompile := true,
    libraryDependencies += scalaTest  % Test,
    libraryDependencies += scalaCheck % Test
  )
  .dependsOn(core, coreTestkit)
