/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;

import java.io.IOException;
import java.util.Date;


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
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class addJegyC {public static class __CLR4_4_13g3gkakpy45i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006b\u0069\u0073\u0073\u006d\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u004b\u004d\u0076\u0065\u0064\u0065\u0073\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590304010607L,8589935092L,148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int studentId;
    private String username;
    private MarkDao markDao;

    @FXML
    private TextField mark;

    @FXML
    private TextField comment;

    @FXML
    private Label errormark;

    public void initdata2(String username, int studentId){try{__CLR4_4_13g3gkakpy45i.R.inc(124);
        __CLR4_4_13g3gkakpy45i.R.inc(125);this.username = username;
        __CLR4_4_13g3gkakpy45i.R.inc(126);this.studentId =studentId;
    }finally{__CLR4_4_13g3gkakpy45i.R.flushNeeded();}}


    private int getInt(TextField evt){try{__CLR4_4_13g3gkakpy45i.R.inc(127);
        __CLR4_4_13g3gkakpy45i.R.inc(128);int marKr=Integer.parseInt(mark.getText());
        __CLR4_4_13g3gkakpy45i.R.inc(129);return marKr;
    }finally{__CLR4_4_13g3gkakpy45i.R.flushNeeded();}}

    private KMDiary addMarK(){try{__CLR4_4_13g3gkakpy45i.R.inc(130);

        __CLR4_4_13g3gkakpy45i.R.inc(131);KMDiary addmarks =KMDiary.builder().Mark(getInt(mark)).comment(comment.getText()).created(new Date()).studentID(studentId).build();
        __CLR4_4_13g3gkakpy45i.R.inc(132);return addmarks;
    }finally{__CLR4_4_13g3gkakpy45i.R.flushNeeded();}}


    @FXML
    void addMark(ActionEvent actionEvent) throws IOException {try{__CLR4_4_13g3gkakpy45i.R.inc(133);
        __CLR4_4_13g3gkakpy45i.R.inc(134);if ((((mark.getText().isEmpty())&&(__CLR4_4_13g3gkakpy45i.R.iget(135)!=0|true))||(__CLR4_4_13g3gkakpy45i.R.iget(136)==0&false))) {{
            __CLR4_4_13g3gkakpy45i.R.inc(137);errormark.setText("Add meg a jegyet");
        }
        }else {{
            __CLR4_4_13g3gkakpy45i.R.inc(138);markDao.persist(addMarK());
            __CLR4_4_13g3gkakpy45i.R.inc(139);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Alap.fxml"));
            __CLR4_4_13g3gkakpy45i.R.inc(140);Parent root = fxmlLoader.load();
            __CLR4_4_13g3gkakpy45i.R.inc(141);fxmlLoader.<AlapC>getController().initdata(username,studentId);
            __CLR4_4_13g3gkakpy45i.R.inc(142);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_4_13g3gkakpy45i.R.inc(143);stage.setScene(new Scene(root));
            __CLR4_4_13g3gkakpy45i.R.inc(144);stage.show();
            __CLR4_4_13g3gkakpy45i.R.inc(145);log.info("Add mark and comment to Student");
        }
    }}finally{__CLR4_4_13g3gkakpy45i.R.flushNeeded();}}


    @FXML
    void initialize() {try{__CLR4_4_13g3gkakpy45i.R.inc(146);
        __CLR4_4_13g3gkakpy45i.R.inc(147);markDao=MarkDao.getInstance();
    }finally{__CLR4_4_13g3gkakpy45i.R.flushNeeded();}}
}