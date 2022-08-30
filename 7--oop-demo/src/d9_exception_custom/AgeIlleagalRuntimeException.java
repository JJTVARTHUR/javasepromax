package d9_exception_custom;

/**
    自定义的运行时异常
      1、继承RuntimeException
      2、重写构造器
 */
public class AgeIlleagalRuntimeException extends RuntimeException{
    public AgeIlleagalRuntimeException() {
    }

    public AgeIlleagalRuntimeException(String message) {
        super(message);
    }
}
