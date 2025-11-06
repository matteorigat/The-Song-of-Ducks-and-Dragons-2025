
// https://everybody.codes/event/2025/quests/3


// part 1
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        Set<Integer> set = new HashSet<>(Arrays.asList(61,87,61,73,73,29,42,49,58,19,69,17,63,20,77,61,22,88,52,81,18,29,17,86,16,15,36,86,12,81,80,74,81,28,58,59,40,58,6,13,22,50,12,41,64,21,6,3,76,87,87,38,24,9,19,15,64,7,23,33,16,63,54,3,14,6,15,69,52,60,32,68,14,35,46,13,75,77,76,47,19,80,31,83,61,47,65,53,19,54,85,75,78,11,9,85,76,26,46,27));
        int largest = 0;

        for(int i: set)
            largest += i;
        
        System.out.println(largest); // 2669

    }
}



// part 2
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; 

public class Main{

    public static void main(String[] args){

        Set<Integer> set = new HashSet<>(Arrays.asList(112,180,87,144,90,137,138,165,104,63,180,2,159,60,148,58,149,48,112,113,181,4,83,111,174,156,6,35,57,118,153,59,78,16,168,33,16,183,90,159,156,13,101,37,65,81,41,74,8,66,169,168,137,106,5,75,67,171,25,53,121,127,66,156,14,143,65,124,69,92,160,91,113,5,118,68,66,173,7,163,22,150,65,11,153,97,112,147,187,50,126,175,86,153,26,87,20,182,141,139,4,84,66,33,149,15,17,112,64,31,129,141,188,79,66,112,33,160,167,45,88,31,102,7,79,183,80,24,26,178,134,109,21,130,189,100,164,101,42,152,186,178,60,26,140,139,138,89,89,60,37,24,71,104,80,187,25,75,138,168,132,43,104,112,20,17,117,10,167,29,12,84,129,8,50,64,177,91,67,102,60,111,71,7,134,91,27,131,156,90,61,112,57,38,138,84,141,57,7,189,161,49,130,92,180,156,36,164,88,25,94,65,129,33,188,27,42,50,149,170,125,162,153,104,179,4,60,164,50,62,70,34,46,19,182,56,65,61,23,69,165,152,119,161,60,1,66,44,50,21,58,55,96,21,95,61,91,186,182,33,21,89,73,106,159,36,56,122,87,90,157,148,107,82,104,187,17,64,70,24,29,145,7,184,35,55,33,83,164,59,90,39,180,100,154,155,3,68,36,94));
        int largest = 0;

        List<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);

        for(int i=0; i<20; i++)
            largest += arr.get(i);
        
        System.out.println(largest); // 226

    }
}



//part 3
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("src/input.txt");
        List<Integer> nums = new ArrayList<>();

        try (Scanner sc = new Scanner(Files.newBufferedReader(path))) {
            sc.useDelimiter("[^\\-?\\d]+");
            while (sc.hasNextInt()) {
                nums.add(sc.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            if(map.containsKey(i))
                map.replace(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        int max = 0;
        for(int i: map.values())
            if(i > max) max = i;

        System.out.print(max); // 2932
    }
}
