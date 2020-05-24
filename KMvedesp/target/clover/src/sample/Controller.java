/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;

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
public class Controller {public static class __CLR4_4_16f6fkakuckuf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006b\u0069\u0073\u0073\u006d\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u004b\u004d\u0076\u0065\u0064\u0065\u0073\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590311403973L,8589935092L,266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    private TextField username;

    @FXML
    private Label errorm;

    private StudentDao studentDao;
    private Student newstudent;
    private Student oldstudent;
    private int olderID;
    private int newID;

    private Student getStudent(){try{__CLR4_4_16f6fkakuckuf.R.inc(231);
        __CLR4_4_16f6fkakuckuf.R.inc(232);Student stud = Student.builder().name(username.getText()).build();
        __CLR4_4_16f6fkakuckuf.R.inc(233);return stud;
    }finally{__CLR4_4_16f6fkakuckuf.R.flushNeeded();}}

    @FXML
    void startButton(ActionEvent actionEvent) throws IOException {try{__CLR4_4_16f6fkakuckuf.R.inc(234);
        __CLR4_4_16f6fkakuckuf.R.inc(235);if ((((username.getText().isEmpty())&&(__CLR4_4_16f6fkakuckuf.R.iget(236)!=0|true))||(__CLR4_4_16f6fkakuckuf.R.iget(237)==0&false))) {{
            __CLR4_4_16f6fkakuckuf.R.inc(238);errorm.setText("Adja meg a diak nevet!");
        }
        }else {{
            __CLR4_4_16f6fkakuckuf.R.inc(239);if((((studentDao.searchID(username.getText())!=null)&&(__CLR4_4_16f6fkakuckuf.R.iget(240)!=0|true))||(__CLR4_4_16f6fkakuckuf.R.iget(241)==0&false))){{
                __CLR4_4_16f6fkakuckuf.R.inc(242);oldstudent=(studentDao.searchID(username.getText()));
                __CLR4_4_16f6fkakuckuf.R.inc(243);olderID=oldstudent.getStudentId();
                __CLR4_4_16f6fkakuckuf.R.inc(244);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Alap.fxml"));
                __CLR4_4_16f6fkakuckuf.R.inc(245);Parent root = fxmlLoader.load();
                __CLR4_4_16f6fkakuckuf.R.inc(246);fxmlLoader.<AlapC>getController().initdata(username.getText(),olderID);
                __CLR4_4_16f6fkakuckuf.R.inc(247);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                __CLR4_4_16f6fkakuckuf.R.inc(248);stage.setScene(new Scene(root));
                __CLR4_4_16f6fkakuckuf.R.inc(249);stage.show();
                __CLR4_4_16f6fkakuckuf.R.inc(250);log.info("Loading student and Loading Launcher");
            }
            }__CLR4_4_16f6fkakuckuf.R.inc(251);if((((studentDao.searchID(username.getText())==null)&&(__CLR4_4_16f6fkakuckuf.R.iget(252)!=0|true))||(__CLR4_4_16f6fkakuckuf.R.iget(253)==0&false))) {{

                __CLR4_4_16f6fkakuckuf.R.inc(254);studentDao.persist(getStudent());
                __CLR4_4_16f6fkakuckuf.R.inc(255);newstudent=(studentDao.searchID(username.getText()));
                __CLR4_4_16f6fkakuckuf.R.inc(256);newID=newstudent.getStudentId();
                __CLR4_4_16f6fkakuckuf.R.inc(257);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Alap.fxml"));
                __CLR4_4_16f6fkakuckuf.R.inc(258);Parent root = fxmlLoader.load();
                __CLR4_4_16f6fkakuckuf.R.inc(259);fxmlLoader.<AlapC>getController().initdata(username.getText(),newID);
                __CLR4_4_16f6fkakuckuf.R.inc(260);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                __CLR4_4_16f6fkakuckuf.R.inc(261);stage.setScene(new Scene(root));
                __CLR4_4_16f6fkakuckuf.R.inc(262);stage.show();
                __CLR4_4_16f6fkakuckuf.R.inc(263);log.info("Create a new student and loading Launcher");
            }
        }}
    }}finally{__CLR4_4_16f6fkakuckuf.R.flushNeeded();}}



    @FXML
    void initialize() {try{__CLR4_4_16f6fkakuckuf.R.inc(264);
        __CLR4_4_16f6fkakuckuf.R.inc(265);studentDao = StudentDao.getInstance();
    }finally{__CLR4_4_16f6fkakuckuf.R.flushNeeded();}}
}
