
package lab3.task7;
public class Convertor {
    public double oldValue;
    public double newValue;
    public String currencyTo;
    public String currencyFrom;
    Convertor(double oldValue, String currencyTo, String currencyFrom) {
        this.oldValue = oldValue;
        this.currencyTo = currencyTo;
        this.currencyFrom = currencyFrom;
    }
    public double convertCurrency() {
        if(this.currencyFrom.equals("RUB") && this.currencyTo.equals("USD")) {
            this.newValue = this.oldValue * 0.0102;
        } else if(this.currencyFrom.equals("RUB") && this.currencyTo.equals("EUR")) {
            this.newValue = this.oldValue * 0.0095;
        } else if(this.currencyFrom.equals("USD") && this.currencyTo.equals("RUB")) {
            this.newValue = this.oldValue * 97.9241;
        } else if(this.currencyFrom.equals("USD") && this.currencyTo.equals("EUR")) {
            this.newValue = this.oldValue *  0.9336;
        } else if(this.currencyFrom.equals("EUR") && this.currencyTo.equals("RUB")) {
            this.newValue = this.oldValue * 104.8872;
        } else if(this.currencyFrom.equals("EUR") && this.currencyTo.equals("USD")) {
            this.newValue = this.oldValue * 1.0711;
        }
        return this.newValue;
    }
}


