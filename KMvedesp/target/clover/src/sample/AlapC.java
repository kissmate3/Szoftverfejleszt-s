/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;

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
public class AlapC {public static class __CLR4_4_15a5akakuckrz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006b\u0069\u0073\u0073\u006d\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u004b\u004d\u0076\u0065\u0064\u0065\u0073\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590311403973L,8589935092L,231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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


    public void initdata(String username, int studentId) {try{__CLR4_4_15a5akakuckrz.R.inc(190);
        __CLR4_4_15a5akakuckrz.R.inc(191);this.username = username;
        __CLR4_4_15a5akakuckrz.R.inc(192);this.studentId =studentId;
        __CLR4_4_15a5akakuckrz.R.inc(193);studentLabel.setText(this.username);
    }finally{__CLR4_4_15a5akakuckrz.R.flushNeeded();}}

    @FXML
    void addJegy(ActionEvent actionEvent) throws IOException {try{__CLR4_4_15a5akakuckrz.R.inc(194);
        __CLR4_4_15a5akakuckrz.R.inc(195);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/addJegy.fxml"));
        __CLR4_4_15a5akakuckrz.R.inc(196);Parent root = fxmlLoader.load();
        __CLR4_4_15a5akakuckrz.R.inc(197);fxmlLoader.<addJegyC>getController().initdata2(username,studentId);
        __CLR4_4_15a5akakuckrz.R.inc(198);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_15a5akakuckrz.R.inc(199);stage.setScene(new Scene(root));
        __CLR4_4_15a5akakuckrz.R.inc(200);stage.show();
        __CLR4_4_15a5akakuckrz.R.inc(201);log.info("Add Mark to Student");
    }finally{__CLR4_4_15a5akakuckrz.R.flushNeeded();}}


    @FXML
    void Exit(ActionEvent actionEvent) throws IOException {try{__CLR4_4_15a5akakuckrz.R.inc(202);
        __CLR4_4_15a5akakuckrz.R.inc(203);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/sample.fxml"));
        __CLR4_4_15a5akakuckrz.R.inc(204);Parent root = fxmlLoader.load();
        __CLR4_4_15a5akakuckrz.R.inc(205);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_15a5akakuckrz.R.inc(206);stage.setScene(new Scene(root));
        __CLR4_4_15a5akakuckrz.R.inc(207);stage.show();
        __CLR4_4_15a5akakuckrz.R.inc(208);log.info("Go back to Launcher");
    }finally{__CLR4_4_15a5akakuckrz.R.flushNeeded();}}


    @FXML
    void average(ActionEvent actionEvent) throws IOException {try{__CLR4_4_15a5akakuckrz.R.inc(209);
        __CLR4_4_15a5akakuckrz.R.inc(210);avgLabel.setText(String.valueOf(avgc));
        __CLR4_4_15a5akakuckrz.R.inc(211);log.info("Calculating the average of Marks");
    }finally{__CLR4_4_15a5akakuckrz.R.flushNeeded();}}

    public void deleteMark(ActionEvent actionEvent) throws IOException {try{__CLR4_4_15a5akakuckrz.R.inc(212);
        __CLR4_4_15a5akakuckrz.R.inc(213);removeButton.setOnAction(event -> {
            __CLR4_4_15a5akakuckrz.R.inc(214);KMDiary selectedItem = markTable.getSelectionModel().getSelectedItem();
            __CLR4_4_15a5akakuckrz.R.inc(215);markTable.getItems().remove(selectedItem);
            __CLR4_4_15a5akakuckrz.R.inc(216);markDao.remove(selectedItem);
            __CLR4_4_15a5akakuckrz.R.inc(217);log.info("Delete Mark");
        });
    }finally{__CLR4_4_15a5akakuckrz.R.flushNeeded();}}

    @FXML
    void initialize() {try{__CLR4_4_15a5akakuckrz.R.inc(218);
        __CLR4_4_15a5akakuckrz.R.inc(219);markDao = MarkDao.getInstance();

        __CLR4_4_15a5akakuckrz.R.inc(220);Platform.runLater(() -> {
        __CLR4_4_15a5akakuckrz.R.inc(221);List<KMDiary> markList = markDao.searchSID(studentId);
        __CLR4_4_15a5akakuckrz.R.inc(222);avgo=markList.size();
        __CLR4_4_15a5akakuckrz.R.inc(223);markcount=markDao.countMark(studentId);
        __CLR4_4_15a5akakuckrz.R.inc(224);avgc=avg.avgMark(avgo,markcount);
        __CLR4_4_15a5akakuckrz.R.inc(225);Mark.setCellValueFactory(new PropertyValueFactory<>("Mark"));
        __CLR4_4_15a5akakuckrz.R.inc(226);comment.setCellValueFactory(new PropertyValueFactory<>("comment"));
        __CLR4_4_15a5akakuckrz.R.inc(227);created.setCellValueFactory(new PropertyValueFactory<>("created"));

        __CLR4_4_15a5akakuckrz.R.inc(228);ObservableList<KMDiary> observableList = FXCollections.observableArrayList();
        __CLR4_4_15a5akakuckrz.R.inc(229);observableList.addAll(markList);
        __CLR4_4_15a5akakuckrz.R.inc(230);markTable.setItems(observableList);
        });
    }finally{__CLR4_4_15a5akakuckrz.R.flushNeeded();}}
}