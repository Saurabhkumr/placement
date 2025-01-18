package designPattern;


import java.util.ArrayList;

class BookShop implements Cloneable{
    private String shopName;
    private ArrayList<String> books = new ArrayList<>();

    public void setShopName(String str){
        this.shopName=str;
    }
    public String getShopName(){
        return this.shopName;
    }

    public void setBooks(String str){
        this.books.add(str);
    }
    public ArrayList<String> getBooks(){
        return  this.books;
    }

    public void loadBooks(){
        for (int i = 1 ; i<=5 ;i++){
            this.books.add("Books-"+i);
        }
    }

    @Override
    public String toString() {
        return this.shopName+"::"+this.books.toString();
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for(String b : books){
            shop.setBooks(b);
        }
        return shop;
    }
}



public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs1 = new BookShop();
        bs1.loadBooks();
        bs1.setShopName("Rahul book store");

        BookShop bs2 = bs1.clone();

        bs1.getBooks().remove("Books-2");
        bs2.setShopName("Mohit Book shop");



        System.out.println(bs1);
        System.out.println(bs2);
    }
}
