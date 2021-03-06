import java.util.ArrayList;

public class GroceryList {

        private ArrayList<String> groceryList = new ArrayList<String>();

        public void addGroceryItem(String item) {

            //add items
            groceryList.add(item);
        }


        public ArrayList<String> getGroceryList() {
            return groceryList;
        }

        public void printGroceryList() {
            System.out.println("You have " + groceryList.size() + " items in your grocery list");
            for(int i=0; i< groceryList.size(); i++) {
                //getting each element of the array
                System.out.println((i+1) + ". " + groceryList.get(i));
            }
        }

        public void modifyGroceryItem(String currentItem, String newItem) {
            int position = findItem(currentItem);
            if(position >= 0) {
                modifyGroceryItem(position, newItem);
            }

        }
        private void modifyGroceryItem(int position, String newItem) {
            //.set is used to assign new value of the array
            groceryList.set(position, newItem);
            System.out.println("Grocery item " + (position+1) + " has been modified.");
        }

        public void removeGroceryItem(String item) {
            int position = findItem(item);
            if(position >= 0) {
                removeGroceryItem(position);
            }
        }
        private void removeGroceryItem(int position) {
            //deletes the array element
            groceryList.remove(position);
        }

        private int findItem(String searchItem) {
            //gives the position of the array element
            return groceryList.indexOf(searchItem);
        }

        public boolean onFile(String searchItem) {
            int position = findItem(searchItem);
            if(position >=0) {
                return true;
            }

            return false;
        }
    }

