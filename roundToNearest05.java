import java.math.BigDecimal;
import java.math.RoundingMode;

class roundToNearest05 {
  public Double result(Double tax) {
    BigDecimal taxToRound = new BigDecimal(tax);
    BigDecimal roundTo = new BigDecimal("0.05");
    BigDecimal rounded = taxToRound.divide(roundTo, 9, RoundingMode.HALF_EVEN);
    rounded = rounded.setScale(0, RoundingMode.HALF_UP).multiply(roundTo);
    return rounded.doubleValue();
  }
}