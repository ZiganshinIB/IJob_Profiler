package converter.base;

import converter.ConvertToTxt;

public class ConvertFactory {
    public Convert createConvert (ConvertType type) {
        Convert convert = null;

        switch (type) {
            case TXT:
                convert = new Convert();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
        }

        return coffee;
    }
}
