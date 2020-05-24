/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Student;

import util.jpa.GenericJpaDao;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * DAO class for the {@link StudentDao} entity.
 */
public class StudentDao extends GenericJpaDao<Student> {public static class __CLR4_4_1hhkakpy41y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006b\u0069\u0073\u0073\u006d\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u004b\u004d\u0076\u0065\u0064\u0065\u0073\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590304010607L,8589935092L,34,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static StudentDao instance;

    private StudentDao() {
        super(Student.class);__CLR4_4_1hhkakpy41y.R.inc(18);try{__CLR4_4_1hhkakpy41y.R.inc(17);
    }finally{__CLR4_4_1hhkakpy41y.R.flushNeeded();}}

    public static StudentDao getInstance() {try{__CLR4_4_1hhkakpy41y.R.inc(19);
        __CLR4_4_1hhkakpy41y.R.inc(20);if ((((instance == null)&&(__CLR4_4_1hhkakpy41y.R.iget(21)!=0|true))||(__CLR4_4_1hhkakpy41y.R.iget(22)==0&false))) {{
            __CLR4_4_1hhkakpy41y.R.inc(23);instance = new StudentDao();
            __CLR4_4_1hhkakpy41y.R.inc(24);instance.setEntityManager(Persistence.createEntityManagerFactory("KM").createEntityManager());
        }
        }__CLR4_4_1hhkakpy41y.R.inc(25);return instance;
    }finally{__CLR4_4_1hhkakpy41y.R.flushNeeded();}}

    /**
     * Finds the studen by name in the adatbase
     * @param name the users name
     * @return The student or null if he is not in the adatbase
     */
    public Student searchID(String name){try{__CLR4_4_1hhkakpy41y.R.inc(26);
        __CLR4_4_1hhkakpy41y.R.inc(27);TypedQuery<Student> query=entityManager.createQuery("SELECT r FROM Student r WHERE r.name=:name",Student.class).setParameter("name",name);
        __CLR4_4_1hhkakpy41y.R.inc(28);List queryID=query.getResultList();

        __CLR4_4_1hhkakpy41y.R.inc(29);if((((queryID.isEmpty())&&(__CLR4_4_1hhkakpy41y.R.iget(30)!=0|true))||(__CLR4_4_1hhkakpy41y.R.iget(31)==0&false))){{
            __CLR4_4_1hhkakpy41y.R.inc(32);return null;
        }}else{{
            __CLR4_4_1hhkakpy41y.R.inc(33);return query.getSingleResult();
        }
    }}finally{__CLR4_4_1hhkakpy41y.R.flushNeeded();}}

}
