package training;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.lang.String;

public class Season {

    public String season (String month) {
        String season;
        month=month.toLowerCase();
        if (month=="january" || month.equals("february") || month.equals("march")) {
            season = "winter";

        } else if (month.equals("july") || month.equals("august")) {
            season = "august";

        } else {
            season = "unexpected season";

        }
        return season;
    }

    @Test
    public void main(){

        Assert.assertEquals(season("fEbruar"),"winter");
        Assert.assertEquals(season("July"),"august");
    }
}
