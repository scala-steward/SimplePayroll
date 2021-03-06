import sbt._

object Dependencies {
  lazy val catsCore          = "org.typelevel"              %% "cats-core"           % "2.1.1"
  lazy val catsEffect        = "org.typelevel"              %% "cats-effect"         % "2.1.3"
  lazy val console4Cats      = "dev.profunktor"             %% "console4cats"        % "0.8.1"
  lazy val derevoCats        = "org.manatki"                %% "derevo-cats"         % "0.11.3"
  lazy val derevoCatsTagless = "org.manatki"                %% "derevo-cats-tagless" % "0.11.3"
  lazy val fs2               = "co.fs2"                     %% "fs2-core"            % "2.3.0"
  lazy val meowMtlCore       = "com.olegpy"                 %% "meow-mtl-core"       % "0.4.0"
  lazy val meowMtlEffects    = "com.olegpy"                 %% "meow-mtl-effects"    % "0.4.0"
  lazy val newType           = "io.estatico"                %% "newtype"             % "0.4.4"
  lazy val refined           = "eu.timepit"                 %% "refined"             % "0.9.14"
  lazy val monocleCore       = "com.github.julien-truffaut" %% "monocle-core"        % "2.0.4"
  lazy val monocleMacro      = "com.github.julien-truffaut" %% "monocle-macro"       % "2.0.4"
  lazy val scalaTest         = "org.scalatest"              %% "scalatest"           % "3.1.2"
  lazy val scalaCheck        = "org.scalacheck"             %% "scalacheck"          % "1.14.3"
  lazy val contextApplied    = "org.augustjune"             %% "context-applied"     % "0.1.4"
  lazy val kindProjector     = "org.typelevel"              %% "kind-projector"      % "0.11.0" cross CrossVersion.full
}
