import sbt._
object PluginDef extends Build {
  override def projects = Seq(root)
  lazy val root = Project("plugins", file(".")) dependsOn(git)
  lazy val git = uri("git://github.com/sbt/sbt-git-plugin.git#scala-build")
}
