package Glava_3.Task_3_1_5;

public class CallerClass {
    public static void main(String[]args){
        getCallerClassAndMethodName();
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();


    }
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Thread current = Thread.currentThread();
        StackTraceElement[] traceElements = current.getStackTrace();

        if (traceElements.length < 4) {
            return null;
        }

        final StackTraceElement trace = traceElements[3];

        return trace.getClassName() + "#" + trace.getMethodName();


    }
}
