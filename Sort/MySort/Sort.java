package Sort.MySort;

import java.util.Arrays;

public abstract class Sort {
	int[] orgData;
	int[] sortedData;
	
	public abstract void sort();
	
	
	public void setData(int[] numList) {
		this.orgData = numList;
		this.sortedData = numList.clone(); //deep copy 방식 
		                                    //this.sortedData = dataList; <- 이렇게 했을 경우 shallow copy: 얕은 복사(주소만 복사)                                     
	}
	
	public String getOrgData() {
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {
		return Arrays.toString(sortedData);
	}
	public void swap(int i, int j) {
		int temp = sortedData[i];
		sortedData[i] = sortedData[j];
		sortedData[j] = temp;
	}
	

}
