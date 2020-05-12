import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "io.sciencebird"
ThisBuild / organizationName := "ScienceBird"

lazy val root = (project in file("."))
  .settings(name := "sps")
  .aggregate(core)

//TODO: Continue adding libraries from the pfp book
lazy val core = (project in file("modules/core"))
  .settings(
    name := "sps-core",
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies += kindProjector,
    libraryDependencies += contextApplied,
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
    libraryDependencies += scalaTest % Test
  )
