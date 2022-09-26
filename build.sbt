// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "latex.classicbook.g8",
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedBufferLog := false
  )
