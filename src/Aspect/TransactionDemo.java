/*
package Aspect;

import com.sun.prism.j2d.print.J2DPrinterJob;

@Aspect
public class TransactionDemo {
    @Pointcut(value="execution(*com.citi.core.service.*)")
    public void point(){}


    @Before(value="point")
    public void before(){
        System.out.println("transaction start");
    }

    @Around("point()")
    public void around(ProceedingJointPoint  joinPonit){
        System.out.println("transaction begin");
        joinPonit.proceed();
        System.out.println("commit");
    }

    @AfterReturning(value="point()")
    public void after(){
        System.out.println("after");
    }
}
*/
