package ch13_collection.b_set;

public class Phone {
    String number;
    Integer price;

    public Phone(String number, Integer price) {
        this.number = number;
        this.price = price;
    } //생성자
    
    // TODO: 가격과 번호가 같은 Phone은 set에서 하나만 관리되도록 처리하시오.
    
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Phone) {
    		Phone p = (Phone)obj;
    		if(this.number.equals(p.number) && this.price.equals(p.price)) {
    			return true;
    		}
    	}return false; //equals에서 같게 나오려고 만드는 식 
    }
    
    @Override //자동으로 생성
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return this.number.hashCode()
    			 + this.price.hashCode();
    }
    // END

    @Override
    public String toString() {
        return "SamePhone [number=" + number + ", price=" + price + "]";
    }
}
