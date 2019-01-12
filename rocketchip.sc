import mill._
import mill.scalalib._
import ammonite.ops._

import $file.^.`scala-wake`.common, common._

trait RocketChipCommonModule extends SbtModule with CommonOptions {
  val macroPlugins = Agg(ivy"org.scalamacros:::paradise:2.1.0")
  def scalacPluginIvyDeps = macroPlugins
  def compileIvyDeps = macroPlugins

  override def ivyDeps = Agg(
    ivy"org.json4s::json4s-jackson:3.5.3"
  )
}

trait RocketChipBase extends RocketChipCommonModule with WakeModule with SingleJar {

  object macros extends RocketChipCommonModule

  def moduleDeps: Seq[ScalaModule] = Seq(macros)
}

