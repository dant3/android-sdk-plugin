import android.Keys._

android.Plugin.androidBuild

platformTarget in Android := "android-17"

name := "hello-multidex"

resolvers += bintray.Opts.resolver.jcenter

libraryDependencies += aar("com.google.android" % "multidex" % "0.1")

proguardScala in Android := false

additionalDexParameters in Android <<= baseDirectory{ base =>
    "--multi-dex" :: s"--main-dex-list=${base.getAbsolutePath}/main-dex.txt" :: Nil
}