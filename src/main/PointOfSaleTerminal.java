package main;

import java.math.BigDecimal;
import java.util.*;

public class PointOfSaleTerminal {

    private List<Product> products = new ArrayList<Product>();
    private Map<Code, Integer> quantityByCode=new HashMap<Code, Integer>();

    public BigDecimal calculateTotal(){
        BigDecimal totalPrice = new BigDecimal(0);

        for (Map.Entry quantity : quantityByCode.entrySet()) {
            BigDecimal temp = new BigDecimal(0);
            Code code = (Code)quantity.getKey();
            Integer volume =(Integer) quantity.getValue();

            if (code.volume<0) {
                  temp=temp.add(new BigDecimal(volume*code.price));
                } else {
                    if (volume>=code.volume) {
                        double temp1 = (volume/code.volume)*code.volumePrice;
                        double temp2 = (volume%code.volume)*code.price;
                        temp=temp.add(new BigDecimal(temp1+temp2));
                    } else {
                        temp=temp.add(new BigDecimal(volume*code.price));
                    }
                }
           totalPrice=totalPrice.add(temp);
        }
        return totalPrice;
    }

    public void setPrising(String order){
        String [] orderArray = order.split("");
        for (int i = 0; i < orderArray.length; i++) {
            try {
                Code code = Code.valueOf(orderArray[i]);
                products.add(new Product(code));
            } catch (IllegalArgumentException ie) {

            }
        }
    }

    public void scan (String codeProduct){
        try {
            Code code = Code.valueOf(codeProduct);
            quantityByCode.put(code, quantityProductsByCode(code));
        } catch (Exception e ) {
            System.out.println("You are input incorrect parameter to method, must be \"A\",\"B\",\"C\" or \"D\"");
        }
    }

   private int quantityProductsByCode (Code code) {
        int result = 0;
        for (Product product: products) {
            if (product.getCode().equals(code)) result++;
        }
        return result;
    }
}
