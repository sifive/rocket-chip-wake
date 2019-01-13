import mill._
import mill.scalalib._
import ammonite.ops._

import $file.^.`scala-wake`.common, common._

trait HardfloatBase extends SbtModule with WakeModule with CommonOptions {
  def millSourcePath = os.pwd / up / "berkeley-hardfloat"
}
