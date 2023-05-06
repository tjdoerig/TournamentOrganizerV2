package com.example.demo.controllers.ftp.client





/*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main() {
    val jsonString = """{"name": "John", "age": 30}"""

    val person = Json.decodeFromString<Person>(jsonString)
    println("Name: ${person.name}, Age: ${person.age}")
}

@Serializable
data class Person(val name: String, val age: Int)


interface IFtpController {
    fun connect() {}
}


class FtpController : IFtpController {
    init {
        connect()
    }

    fun connect(   Address: String? = null,
                   userName: String? = null,
                   password: String? = null) {

        if (!connected) {
            try {
                val address = hostField.text
                val login = loginField.text
                val password = passwordField.text
                val port = portField.text.toInt()

                ftpClient = FTPClient()
                ftpClient.connect(address)

                if (ftpClient.login(login, password)) {
                    ftpClient.enterLocalPassiveMode()
                    ftpClient.setFileType(FTP.BINARY_FILE_TYPE)

                    connected = true
                    connectButton.text = "Disconnect"
                    setUIEnabled(true)

                    remoteFiles.addAll(ftpClient.listFiles(remoteDirField.text))

                    logger.debug("You successfully connected")
                }
            } catch (e: Exception) {
                val alert = Alert(Alert.AlertType.ERROR)
                alert.initStyle(StageStyle.UTILITY)
                alert.title = "Error"
                alert.headerText = "Could not connect"
                alert.contentText = "Reason: ${e.message}"
                alert.showAndWait()
            }
        } else {
            disconnect()
        }
     }
}
*/