package fristjava;

public class test {
	public static void main(String[] args) {
		String str = "hshASd";
		char[] charArray = str.toCharArray();//将字符串转换为字符数组
		for (int i = 0; i < charArray.length; i++) {
		  if(charArray[i]>='A'&&charArray[i]<='Z'){
		    charArray[i] = (char) (155 - charArray[i]);
		  }
		  else if(charArray[i]>='a'&&charArray[i]<='z'){
			  charArray[i] = (char) (219 - charArray[i]);  
		  }
		  else{
			 System.out.println("非纯字母字符，请重新核对字符！！");
			 return;
		  }
		}
		System.out.println(String.valueOf(charArray));//类型转换
		}

}
