package mentorJava;

public class thread {
    //스레드는 하나의 프로세스 안에서 두 가지 이상의 일을 하도록 도움
    //스레드를 만드는 방법 : Thread 클래스 상속 / Runnable 인터페이스 구현(다중 상속 가능)
    //void setPriority(int newPriority);
    //int getPriority();

    class t1 extends Thread{
        public void run(){
            for(int i=0; i<10; i++){
                System.out.println("running"+i);
            }
        }
    }
    class t2 implements Runnable{
        public void run(){
            for(int i=0; i<10; i++){
                System.out.println("still running"+i);
            }
        }
    }
}
