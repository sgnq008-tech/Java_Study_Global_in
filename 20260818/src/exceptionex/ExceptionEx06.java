package exceptionex;
import java.util.*;
import java.io.*;

public class ExceptionEx06 {
    public static void main(String[] args) {
        
        try {
            startInstall();
            copyFiles();
        } catch (MemoryException me) {
            System.out.println("에러 메시지: " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치하시기 바랍니다.");
        } catch (Exception se) {
            se.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } finally {
            deleteTempFiles();
        }
        
    }

	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {//프로그램을 설치하는데 충분한 공간이 없으면
			throw new SpaceException("설치할 공간이 부족");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	static void copyFiles() {
		
	}
	static void deleteTempFiles() {
	}
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지를 확인하는 코드
		return false;
	}
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리 공간이 있는지 확인하는 코드
		return true;
	}	
}
