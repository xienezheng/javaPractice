package ObjSocket;


	import java.io.Serializable;  
	import java.util.List;  
	  
	public class City implements Serializable {  
	  
	    //ʵ���࣬�ر�ע�⣬��Ϊ�������������䣬��Ҫ�̳�java.io.Serializable��ʹ�ö���������л�  
	      
	    private List cityList;  
	  
	    public List getCityList() {  
	        return cityList;  
	    }  
	  
	    public void setCityList(List cityList) {  
	        this.cityList = cityList;  
	    }  
	}  


