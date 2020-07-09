package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Food {
	private String name;
	private int price;
	private String locale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}
	
}
public class ListTest4 {

	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = {"한식","양식","중식","일식","분식","경양식"};
		Random r = new Random();
		int count[] = new int[locales.length];
		int maxPrice = 0;
		int minPrice = 0;
		int idx = 0;
		int idx1 = 0;
		
		for(int i=1;i<=30;i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10)+1)*1000);
			fList.add(f);
			
		}
		for(int i=0;i<fList.size();i++) {
			Food fp = fList.get(i);
			
			if(fp.getPrice()>maxPrice) {
				maxPrice = fp.getPrice();
				idx = i;
			}
			if(fp.getPrice()<minPrice || minPrice==0) {
				minPrice = fp.getPrice();
				idx1 = i;
			}
		}
			//System.out.println("제일비싼음식 : "+fList.get(idx));
			//System.out.println("제일싼음식 : "+fList.get(idx1));
			
			List<Food> maxList = new ArrayList<>();
			List<Food> minList = new ArrayList<>();
			
			for(int i=0;i<30;i++) {
				Food f = fList.get(i);
				if(maxPrice==f.getPrice()) {
					maxList.add(f);
				}
				if(minPrice==f.getPrice()) {
					minList.add(f);
				}
			}
			System.out.println(maxList);
			System.out.println(minList);
			
			for(int i=0;i<locales.length;i++) {
				for(int j=0;j<fList.size();j++) {
					if((locales[i].equals(fList.get(j).getLocale()))) {
						count[i] += 1;
					}
				}
			}
			for(int j=0;j<locales.length;j++) {
				System.out.println(locales[j] +"갯수 : "+count[j]);
			}	
	}

}//