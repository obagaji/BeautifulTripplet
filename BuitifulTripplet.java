
import java.util.*;
public    class BuitifulTripplet {

        /*
         * Complete the 'beautifulTriplets' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER d
         *  2. INTEGER_ARRAY arr
         */
        public static int beautifulTriplets(int d, List<Integer> arr) {
            // Write your code here

            HashMap<Integer, Integer> map = new HashMap<>();
            int count =0;

            for(int i = 0; i< arr.size(); i++)
            {
                int zy = arr.get(i) + d;
                if(zy <= arr.get(arr.size()-1)){
                    map.put(arr.get(i), zy);
                }
            }
            for(int i = 0; i< arr.size(); i++)
            {
                int l1 =0;
                int l2 =0;
                int y = arr.get(i);
                l1 = returnPath(map, y);
                l2 = returnPath(map, l1);
                if(l1 != -1 && l2 != -1 && y != -1 && arr.contains(l1)&&arr.contains(l2)&&arr.contains(y))
                {
                    count++;
                }
            }
            return count;

        }
        private static int returnPath(HashMap<Integer, Integer> map, int nextPosition)
        {
            int returnValue = -1;
            if(map.get(nextPosition)==null)
                return returnValue;

            else {
                returnValue =map.get(nextPosition);
            }

            return returnValue;
        }

    }



