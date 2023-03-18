package GooglePreparation;

import java.util.*;

public class ElectronicShop {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int n = in.nextInt();
            int m = in.nextInt();
            Integer[] keyboards = new Integer[n];
            for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
                keyboards[keyboards_i] = in.nextInt();
            }
            int[] pendrives = new int[m];
            for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
                pendrives[pendrives_i] = in.nextInt();
            }

            Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
            Arrays.sort(pendrives);//Ascending order

            int max = -1;
            for(int i = 0, j=0; i < n; i++){
                for(; j < m; j++){
                    System.out.println(keyboards[i] + " " + pendrives[j] );

                    if(keyboards[i]+pendrives[j] > s) break; //This prevents j from incrementing
                    if(keyboards[i]+pendrives[j] > max)
                        max = keyboards[i]+pendrives[j];
                }
            }
            System.out.println(max);
        }
    }
