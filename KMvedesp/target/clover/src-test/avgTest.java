/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sample.avg;

import static org.junit.jupiter.api.Assertions.*;

public class avgTest {static class __CLR4_4_14t4tkakpy48x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006b\u0069\u0073\u0073\u006d\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u004b\u004d\u0076\u0065\u0064\u0065\u0073\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590304011002L,8589935092L,177,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    avg underTest;

    @BeforeEach
    void setUp() {try{__CLR4_4_14t4tkakpy48x.R.inc(173);

        __CLR4_4_14t4tkakpy48x.R.inc(174);underTest = new avg();
    }finally{__CLR4_4_14t4tkakpy48x.R.flushNeeded();}}

    @Test
    void testavgMark(){__CLR4_4_14t4tkakpy48x.R.globalSliceStart(getClass().getName(),175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0dhuc4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14t4tkakpy48x.R.rethrow($CLV_t2$);}finally{__CLR4_4_14t4tkakpy48x.R.globalSliceEnd(getClass().getName(),"avgTest.testavgMark",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0dhuc4v(){try{__CLR4_4_14t4tkakpy48x.R.inc(175);
        __CLR4_4_14t4tkakpy48x.R.inc(176);assertEquals(5,avg.avgMark(1,5));
    }finally{__CLR4_4_14t4tkakpy48x.R.flushNeeded();}}
}
