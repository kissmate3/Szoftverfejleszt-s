package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.ResourceBundle;

import Diary.KMDiary;
import Diary.MarkDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class AlapC {

    private String username;
    private int studentId;
    private MarkDao markDao;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label studentLabel;

    @FXML
    private TableView<KMDiary> markTable;

    @FXML
    private TableColumn<KMDiary, String> Mark;

    @FXML
    private TableColumn<KMDiary, String> comment;

    @FXML
    private TableColumn<KMDiary, ZonedDateTime> created;

    @FXML
    void addJegy(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/addJegy.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();    }

    public void initdata(String username, int studentId) {
        this.username = username;
        this.studentId =studentId;
        studentLabel.setText(this.username);
    }


    @FXML
    void deleteMark(ActionEvent actionEvent) throws IOException {}

    @FXML
    void average(ActionEvent actionEvent) throws IOException {}

    @FXML
    void initialize() {
        markDao = MarkDao.getInstance();
    }
}