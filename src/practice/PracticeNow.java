package practice;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeNow {

	 

		
			private String depName;
			private int studentCount;
		//using getters and setters
			public String getDepName(){
			return depName;
			}
			public void setDepName(String depName){
			this.depName = depName;
			}
			public int getStudentCount(){
			return studentCount;
			}
			public void setStudentCount(int studentCount){
			this.studentCount = studentCount;
			}
			public void deptName(String string) {
				// TODO Auto-generated method stub
				
			}
		}

		 class Data extends PracticeNow{
			public static void main(String[] args){
				PracticeNow obj = new PracticeNow();
			obj.deptName("Mech");
			obj.setStudentCount(56);

			PracticeNow obj1 = new PracticeNow();
			obj1.deptName("Civil");
			obj1.setStudentCount(48);

		//userDefinedList
		      List<Data> l = new ArrayList<Data>();
		      l.add(obj);
		      l.add(obj1);
		      for(int i=0; i<l.size();i++) {
		    	  System.out.println(l.get(i).getDepName()+" "+l.get(i).getStudentCount());	  
		      }
			}}