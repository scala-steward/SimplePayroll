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

scalacOptions += "-Ymacro-annotations"
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
