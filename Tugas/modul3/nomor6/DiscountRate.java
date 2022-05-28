package nomor6;

public class DiscountRate{
    static final double seviceDiscountPremium = 0.2;
    static final double seviceDiscountGold = 0.15;
    static final double seviceDiscountSilver = 0.1;
    static final double productDiscountPremium = 0.1;
    static final double productDiscountGold = 0.1;
    static final double productDiscountSilver = 0.1;

    static double getProductDiscountRate(String type){
        if(type.equals("Premium")){
            return productDiscountPremium;
        }
        else if(type.equals("Gold")){
            return productDiscountGold;
        }
        else if(type.equals("Silver")){
            return productDiscountSilver;
        }
        else{
            return 0.1;
        }
    }

    static double getServiceDiscountRate(String type){
        if(type.equals("Premium")){
            return seviceDiscountPremium;
        }
        else if(type.equals("Gold")){
            return seviceDiscountGold;
        }
        else if(type.equals("Silver")){
            return seviceDiscountSilver;
        }
        else{
            return 0.1;
        }
    }
}