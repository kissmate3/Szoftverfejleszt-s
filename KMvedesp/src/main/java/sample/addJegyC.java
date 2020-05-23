package sample;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addJegyC {

    private int studentId;
    private String username;
    private MarkDao markDao;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField mark;

    @FXML
    private TextField comment;

    @FXML
    private Label errormark;

    public void initdata2(String username, int studentId){
        this.username = username;
        this.studentId =studentId;
    }

    /*private int getTextw(TextField marK) {
        try{
            int marKr=Integer.parseInt(marK.trim());
            return marKr;
        }catch(Exception e){
            return 0;
        }
    }*/

    private int getInt(TextField evt){
        int marKr=Integer.parseInt(mark.getText());
        return marKr;
    }

    private KMDiary addMarK(){

        KMDiary addmarks =KMDiary.builder().Mark(getInt(mark)).comment(comment.getText()).created(new Date()).studentID(studentId).build();
        return addmarks;
    }


    @FXML
    void addMark(ActionEvent actionEvent) throws IOException {
        if (mark.getText().isEmpty()) {
            errormark.setText("Add meg a jegyet");
        }
        else {
            markDao.persist(addMarK());
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Alap.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<AlapC>getController().initdata(username,studentId);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }


    @FXML
    void initialize() {
        markDao=MarkDao.getInstance();
    }
}