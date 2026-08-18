package exceptionex;

public class ExceptionEx07 {
    public static void main(String[] args) {
        
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(se); // 지정한 예외를 원인 예외로 등록 (예외 연결)
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) { // 프로그램을 설치하는데 공간이 부족하면
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) { // 메모리가 부족하면
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }
    
    static boolean enoughSpace() {
        return false; 
    }

    static boolean enoughMemory() {
        return true;
    }   
}

// 사용자 정의 예외 클래스 정의
class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}