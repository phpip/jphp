package ru.regenix.jphp.compiler.jvm.zend;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import ru.regenix.jphp.compiler.jvm.JvmCompilerCase;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FuncTest extends JvmCompilerCase {

    @Test
    public void testStrLen(){
        check("zend/func/001_strlen.php");
    }

    @Test
    public void testStaticVariablesInFuncs(){
        check("zend/func/002_static_variables_in_funcs.php");
    }

    @Test
    public void testGeneral1(){
        check("zend/func/003_general.php");
    }

    @Test
    public void testGeneral2(){
        check("zend/func/004_general.php");
    }
}
