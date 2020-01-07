package GroceryShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryShopClient {


    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        User user = new User(1L, "Sangeeth");
        List<UserProduct> userProducts = new ArrayList<>();

        while (true) {
            String request = bf.readLine();
            if(request.equalsIgnoreCase("exit")){
                break;
            }

            String[] items = request.split(" ");

            UserProduct userProduct = UserProduct
                    .addUserProduct(user, Long.parseLong(items[0]), Float.parseFloat(items[1]));
            userProducts.add(userProduct);

        }

        Order order = new Order(userProducts);

        System.out.println("Item Code ");
        userProducts.stream().forEach(userProduct -> {

            System.out.println(userProduct);

        });

        System.out.println(order);

    }

}
