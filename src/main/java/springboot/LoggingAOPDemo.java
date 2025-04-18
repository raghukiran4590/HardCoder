package springboot;

//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;

import org.w3c.dom.ls.LSOutput;

//@Aspect
//@Component
public class LoggingAOPDemo {

    // Advice to be executed before the methods in the specified package
    // @Before: Indicates that this advice will be executed before the specified join points
    // "execution(* com.actuator.actuator.controllers.*.*(..))": Pointcut expression
    //  - execution: Specifies join points based on method execution
    //  - (* com.actuator.actuator.controllers.*.*(..)): Method signature pattern
    //      - *: Any return type
    //      - com.actuator.actuator.controllers: Package name
    //      - *.*: Any class and any method within the specified package
    //      - (..): Any number of arguments of any type
/*
    @Before("execution(* com.actuator.actuator.controllers.*.*(..))")
    public void logBeforeControllerMethods() {
        System.out.println("Before Advice");
    }

    // Advice to be executed after the methods in the specified package return successfully
    // @AfterReturning: Indicates that this advice will be executed after the method returns successfully
    // pointcut: Pointcut expression specifying the join points
    // returning: The name of the parameter in the advice method that will hold the returned value
    @AfterReturning(pointcut = "execution(* com.actuator.actuator.controllers.*.*(..))", returning = "result")
    public void logAfterControllerMethods(Object result) {
        System.out.println("AfterReturning Advice " + result);
    }

    // Advice to be executed if the methods in the specified package throw an exception
    // @AfterThrowing: Indicates that this advice will be executed if the method throws an exception
    // pointcut: Pointcut expression specifying the join points
    // throwing: The name of the parameter in the advice method that will hold the thrown exception
    @AfterThrowing(pointcut = "execution(* com.actuator.actuator.controllers.*.*(..))", throwing = "exception")
    public void logAfterThrowingControllerMethods(Exception exception) {
        System.out.println("Exception thrown from controller method: " + exception.getMessage());
    }

    // Advice to be executed around the methods in the specified package
    // @Around: Indicates that this advice will be executed around the specified join points
    // The advice method can control when and if the target method is called
    @Around("execution(* com.actuator.actuator.controllers.*.*(..))")
    public Object logAroundControllerMethods(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Method execution start time: " + start);

        // Proceed with the method execution
        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        return proceed;
    }
*/

    public static void main(String[] args) {
        System.out.println("Aspect Oriented Programming in Springboot");
    }
}

