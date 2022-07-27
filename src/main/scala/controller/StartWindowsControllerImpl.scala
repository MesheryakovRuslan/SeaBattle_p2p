package controller

import javafx.event.ActionEvent

import java.net.URL
import java.util.ResourceBundle

class StartWindowsControllerImpl extends StartWindowController {

  override def BTNConnectRoomAction(Event: ActionEvent): Unit = {
    println(TextField1.getText)
    println(TextField2.getText)
    println(TextField3.getText)
    println(TextField4.getText)
    println("click")
  }

  override def BTNCreateRoomAction(Event: ActionEvent): Unit = {
    println("click2222")
  }

  override def initialize(location: URL, resources: ResourceBundle): Unit = super.initialize(location, resources)
}
