import sbt._

object Dependencies {
  lazy val catsCore = "org.typelevel" %% "cats-core" % "2.1.0"
  lazy val catsEffect = "org.typelevel" %% "cats-effect" % "2.1.3"
  lazy val console4Cats = "dev.profunktor" %% "console4cats" % "0.8.1"
  lazy val derevoCats = "org.manatki" %% "derevo-cats" % "0.10.5"
  lazy val derevoCatsTagless = "org.manatki" %% "derevo-cats-tagless" % "0.10.5"
  lazy val fs2 = "co.fs2" %% "fs2-core" % "2.2.2"
  lazy val meowMtlCore = "com.olegpy" %% "meow-mtl-core" % "0.4.0"
  lazy val meowMtlEffects = "com.olegpy" %% "meow-mtl-effects" % "0.4.0"
  lazy val newType = "io.estatico" %% "newtype" % "0.4.3"
  lazy val refined = "eu.timepit" %% "refined" % "0.9.12"
  lazy val monocleCore = "com.github.julien-truffaut" %% "monocle-core" % "2.0.1"
  lazy val monocleMacro = "com.github.julien-truffaut" %% "monocle-macro" % "2.0.1"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"

  lazy val contextApplied = compilerPlugin(
    "org.augustjune" %% "context-applied" % "0.1.2"
  )
  lazy val kindProjector = compilerPlugin(
    "org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full
  )
}
