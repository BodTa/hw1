class ShoppingList {
    var itemList = mutableListOf<Item>();

    fun addItem(item:Item){
        itemList.add(item);
        println("${item.name} is successfully added to shopping list");
    }

    fun removeItem(index:Int){
        if(index<0 || index >= itemList.size){
            println("Please select a valid item");
            return;
        }
        var itemToDelete = itemList[index];
        itemList.remove(itemToDelete);
        println("${itemToDelete.name} is removed from the shopping list!");
    }

    fun displayItems(){
        if(itemList.isEmpty()){
            println("Shopping list is empty. To Display items you need to add something first.");
            return;
        }
        var counter:Int = 1;
        for(item in itemList){
            println("-----item ${counter}-----");
            println("item's name: ${item.name}");
            println("item's price: ${item.price}");
            if(item is Food){
                println("item's weight: ${item.kilo}");
            }
            if(item is Cloth){
                println("item's type: ${item.type}");
            }
            println();
            counter++;
        }
    }
}