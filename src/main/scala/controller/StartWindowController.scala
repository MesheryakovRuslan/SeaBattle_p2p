package controller

import javafx.event.ActionEvent
import javafx.fxml.{FXML, Initializable}
import javafx.scene.control.{Button, TextField}
import javafx.scene.layout.{AnchorPane, Pane}

import java.net.URL
import java.util.ResourceBundle

class StartWindowController extends Initializable {

  @FXML protected var Rule: Pane = _
  @FXML protected var IconNameCreate: Pane = _
  @FXML protected var IconIP: Pane = _
  @FXML protected var IconPort: Pane = _
  @FXML protected var IconNameConnection: Pane = _
  @FXML protected var MainPanel: AnchorPane = _
  @FXML protected var TextField1: TextField = _
  @FXML protected var TextField2: TextField = _
  @FXML protected var TextField3: TextField = _
  @FXML protected var TextField4: TextField = _
  @FXML var BTNConnectRoom: Button = _
  @FXML var BTNCreateRoom: Button = _

  @FXML def BTNConnectRoomAction(Event: ActionEvent): Unit = {}

  @FXML def BTNCreateRoomAction(Event: ActionEvent): Unit = {}

  override def initialize(location: URL, resources: ResourceBundle): Unit = {}
}
