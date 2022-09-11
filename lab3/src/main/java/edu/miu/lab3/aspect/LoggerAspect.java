package edu.miu.lab3.aspect;

import edu.miu.lab3.exceptions.HeaderNotFoundException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LoggerAspect {
    @Autowired
    private HttpServletRequest request;

    @Pointcut("@annotation(edu.miu.lab3.aspect.MyLogger)")
    public void selectMethods(){

    }

    @Around("within(edu.miu.lab3.controller.* )")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        if(request.getMethod().equals("POST")){
            var header = request.getHeader("AOP-IS-AWESOME");
            if (header != null) {
                return pjp.proceed();
            } else {
                throw new HeaderNotFoundException();
            }
        } else {
            return pjp.proceed();
        }
    }
}
