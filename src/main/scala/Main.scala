import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

class Main extends Application {

  def start(stage: Stage): Unit = {
    val loader = new FXMLLoader(getClass.getResource("view/FXML/StartWindow.FXML"))
    val root: Parent = loader.load()
    val scene = new Scene(root)
    stage.setScene(scene)
    scene.getStylesheets.add(getClass.getResource("view/css/styleApp.css").toExternalForm)
    stage.setResizable(false)
    stage.show()
  }

  override def stop(): Unit = {
    super.stop()
  }
}