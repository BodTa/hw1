fun main(){
    var shoppingList: ShoppingList = ShoppingList();
    do{
        println("1- Add Item");
        println("2- Display Items");
        println("3- Delete Item");
        println("4- Exit");
        val selection = readLine();
        when(selection){
            "1"->{
                AddItem(shoppingList);
            }
            "2"->{
                shoppingList.displayItems();
            }
            "3"->{
                if(shoppingList.itemList.isEmpty()){
                    println("Shopping list is empty, you cannot delete an item that does not exist!");
                    continue;
                }
                shoppingList.displayItems();
                println("Select the number of the item to delete");
                var itemToDeleteNumber = readln();
                shoppingList.removeItem(itemToDeleteNumber.toInt()-1);
            }
            "4"->{
                println("Exiting...");
            }
            else ->{
                println("Please select a valid option");
            }
        }

    }while(selection != "4");
}

fun AddItem(shoppingList:ShoppingList){
    do{
        println("Please select which type of item you want to add");
        println("1- Add Food");
        println("2- Add Cloth");
        println("3- Exit");
        var selection = readln();
        when(selection){
            "1"->{
                println("Enter the name of the food");
                var name = readln();
                println("Enter the price of the food");
                var price = readln();
                println("Enter the weight of the food");
                var weight = readln();
                shoppingList.addItem(Food(weight,name,price.toDouble()));
                break;
            }
            "2"->{
                println("Enter the name of the cloth");
                var name = readln();
                println("Enter the price of the cloth");
                var price = readln();
                println("Enter the type of the cloth");
                var type = readln();
                shoppingList.addItem(Cloth(type,name,price.toDouble()));
                break;
            }
            "3"->{
                println("Exiting...");
            }
            else ->{
                println("Please select a valid option");
            }
        }
    }while(selection != "3")
}