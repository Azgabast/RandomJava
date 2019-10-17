import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

		
	public static void main(String[] args){
		ArrayList<InsideObject> insideObjectList = new ArrayList<InsideObject>();
		ArrayList<OutsideObject> outsideObjectList = new ArrayList<OutsideObject>();
		
		
		InsideObject insideObject = new InsideObject("A");
		
		insideObjectList.add(insideObject);
		
		//so this uses the same object as above
		OutsideObject  outsideObject = new OutsideObject(insideObject);
		outsideObjectList.add(outsideObject);
		
		
		//main thread
		insideObject.setValue("B");
		
		System.out.println(insideObjectList.get(0).getValue());
		System.out.println(outsideObjectList.get(0).getObject().getValue());
		
		//another thread
		ExecutorService exec = 	Executors.newSingleThreadExecutor();
		exec.execute(new Runnable() {
		    @Override 
		    public void run() {
		    	insideObject.setValue("C");
		    }
		});
		
		exec.shutdown();
		try {
			exec.awaitTermination(1000, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(insideObjectList.get(0).getValue());
		System.out.println(outsideObjectList.get(0).getObject().getValue());
		
		
	}
}



class InsideObject{
	String value;
	
	
	public InsideObject(){
		this.value="default";
	}
	
	public InsideObject(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}


class OutsideObject{
	InsideObject object;
	
	public OutsideObject(){
		this.object = new InsideObject("default");
	}
	
	public OutsideObject(InsideObject object){
		this.object = object;
	}

	public InsideObject getObject() {
		return object;
	}

	public void setObject(InsideObject object) {
		this.object = object;
	}
	
	
}
