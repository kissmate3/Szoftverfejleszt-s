package sample;

import Student.Student;
import Student.StudentDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class Controller {

    @FXML
    private TextField username;

    @FXML
    private Label errorm;

    private StudentDao studentDao;
    private Student newstudent;
    private Student oldstudent;
    private int olderID;
    private int newID;

    private Student getStudent(){
        Student stud = Student.builder().name(username.getText()).build();
        return stud;
    }

    @FXML
    void startButton(ActionEvent actionEvent) throws IOException {
        if (username.getText().isEmpty()) {
            errorm.setText("Adja meg a diak nevet!");
        }
        else {
            if(studentDao.searchID(username.getText())!=null){
                oldstudent=(studentDao.searchID(username.getText()));
                olderID=oldstudent.getStudentId();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Alap.fxml"));
                Parent root = fxmlLoader.load();
                fxmlLoader.<AlapC>getController().initdata(username.getText(),olderID);
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
                log.info("Loading studnet and Loading Launcher");
            }
            if(studentDao.searchID(username.getText())==null) {

                studentDao.persist(getStudent());
                newstudent=(studentDao.searchID(username.getText()));
                newID=newstudent.getStudentId();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Alap.fxml"));
                Parent root = fxmlLoader.load();
                fxmlLoader.<AlapC>getController().initdata(username.getText(),newID);
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
                log.info("Create a new student and loading Launcher");
            }
        }
    }



    @FXML
    void initialize() {
        studentDao = StudentDao.getInstance();
    }
}
