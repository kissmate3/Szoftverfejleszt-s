package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.ResourceBundle;

import Diary.KMDiary;
import Diary.MarkDao;
import Student.StudentDao;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableColumn<KMDiary, Integer> Mark;

    @FXML
    private TableColumn<KMDiary, String> comment;

    @FXML
    private TableColumn<KMDiary, ZonedDateTime> created;

    public void initdata(String username, int studentId) {
        this.username = username;
        this.studentId =studentId;
        studentLabel.setText(this.username);
    }

    @FXML
    void addJegy(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/addJegy.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<addJegyC>getController().initdata2(username,studentId);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void deleteMark(ActionEvent actionEvent) throws IOException {}

    @FXML
    void average(ActionEvent actionEvent) throws IOException {}

    @FXML
    void initialize() {
        markDao = MarkDao.getInstance();

        Platform.runLater(() -> {
        List<KMDiary> markList = markDao.searchSID(studentId);

        Mark.setCellValueFactory(new PropertyValueFactory<>("Jegy"));
        comment.setCellValueFactory(new PropertyValueFactory<>("Megjegyzes"));
        created.setCellValueFactory(new PropertyValueFactory<>("Időpont"));

        ObservableList<KMDiary> observableList = FXCollections.observableArrayList();
        observableList.addAll(markList);
        markTable.setItems(observableList);
        });
    }
}