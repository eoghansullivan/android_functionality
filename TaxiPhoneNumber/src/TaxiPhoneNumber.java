import java.util.Random;

public class TaxiPhoneNumber {
    private String toSplit = "0851113333 " + "0852834891 " + "0834079293 " + "0858819000 " + "0861057796 " +
            "0899891537 " + "0906494400 " + "0860210567 " + "0831800544 " + "0830289543 " + "0871313647 " +
            "0833641620 " + "0871313647 " + "0858015555 " + "0906474400 " + "0906420902 " + "0906493335 " +
            "0906479777 " + "0906493366 " + "0906477200 " + "0871348090 " + "0449331010";

    public String getPhoneNum()
    {
        Random ran = new Random();
        String[] toReturn = toSplit.split(" ");
        return toReturn[ran.nextInt(toReturn.length)];
    }


}
