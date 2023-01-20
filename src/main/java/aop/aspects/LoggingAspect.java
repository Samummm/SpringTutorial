package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
        @Before("execution(public void getBook())")
        public void beforeGetBookAdvice(){
                System.out.println("beforeGetBookAdvice: попытка получить книгу");
        }

        @Before("execution(public * returnBook())")
        public void beforeReturnBookAdvice(){
                System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
        }
}