package sample;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;

import Diary.KMDiary;
import Diary.MarkDao;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlapC {

    private String username;
    private int studentId;
    private MarkDao markDao;
    private int avgo;
    private int markcount;
    private double avgc;


    @FXML
    private Button removeButton;

    @FXML
    private Label studentLabel;

    @FXML
    private Label avgLabel;

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
        log.info("Add Mark to Student");
    }


    @FXML
    void Exit(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/sample.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    @FXML
    void average(ActionEvent actionEvent) throws IOException {
        avgLabel.setText(String.valueOf(avgc));
    }

    public void deleteMark(ActionEvent actionEvent) throws IOException {
        removeButton.setOnAction(event -> {
            KMDiary selectedItem = markTable.getSelectionModel().getSelectedItem();
            markTable.getItems().remove(selectedItem);
            markDao.remove(selectedItem);
        });
    }

    @FXML
    void initialize() {
        markDao = MarkDao.getInstance();

        Platform.runLater(() -> {
        List<KMDiary> markList = markDao.searchSID(studentId);
        avgo=markList.size();
            System.out.println(avgo);
        markcount=markDao.countMark(studentId);
            System.out.println(markcount);
        avgc=avg.avgMark(avgo,markcount);
            System.out.println(avgc);
        Mark.setCellValueFactory(new PropertyValueFactory<>("Mark"));
        comment.setCellValueFactory(new PropertyValueFactory<>("comment"));
        created.setCellValueFactory(new PropertyValueFactory<>("created"));

        ObservableList<KMDiary> observableList = FXCollections.observableArrayList();
        observableList.addAll(markList);
        markTable.setItems(observableList);
        });
    }
}