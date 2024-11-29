import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class usa {
    public static void main(String[] args) {
        List<String> allStates = Arrays.asList("delaware", "pennsylvania", "new jersey", "georgia", "connecticut");
        List<String> usa = new ArrayList<>(allStates);

        System.out.println(usa);
        System.out.println("state join" + usa.get(1));

    }

}
