package com.github.demidko.webquick

import org.junit.jupiter.api.Test
import se.vidstige.jadb.JadbConnection
import se.vidstige.jadb.RemoteFile
import java.io.File

@Suppress("NonAsciiCharacters")
class InvestorTest {

  @Test
  fun `Мы можем подключиться к терминалу брокера`() {
    val d = JadbConnection().anyDevice
    d.executeShell("")
    println(d.list("/sdcard/Downloads/").map { it.path })
    println(d.push(File("/Users/admin/Downloads/Telegram Desktop/base-patched.apk"), RemoteFile("/sdcard/Downloads/app.apk")))
  }
}