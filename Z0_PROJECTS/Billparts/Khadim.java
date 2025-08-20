package Z0_PROJECTS.Billparts;
// import java.sql.SQLOutput;
// import java.util.Scanner;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class Khadim
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.print("\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCABＫＨＡＤＩＭ ＩＮＴＥＲ ＰＲＩＧＥＳ \uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB\uD83D\uDCAB  ");
        System.out.println("\uD835\uDC9C\uD835\uDC40\uD835\uDC38\uD835\uDC38\uD835\uDCA9 \uD835\uDC9C\uD835\uDC3B\uD835\uDCAE\uD835\uDC9C\uD835\uDCA9");
        System.out.println("TO RECIPENT:");
        Customer C=new Customer("AMERICA9162","TRUMP","WASHINGTAN CITY AMERICA","5708745");
        System.out.print("NAME:"+C.getName()+" ");
        System.out.println("ID:"+C.getCustId()+" ");
        System.out.print("phNum:"+C.getPhno()+" ");
        System.out.print("ADDRESS:"+C.getAddress()+" ");
        System.out.println();
        //ABOUT PRODUCT
       // Product k=new Product("12JA","Fev");
        Product ob=new Product("123A","Fevicol",4.5,(short) 100);
        System.out.println("ItemName:"+ob.getName());
        System.out.println("Item Number: >"+ob.getItemNo());
        System.out.println("Total Buy(qt):"+ob.getQuantity());
        System.out.println("PRICE: >      "+ob.getPrice()+"$");
        System.out.println("TOTAL PRICE:> "+ob.getQuantity()*ob.getPrice()+"$");
        System.out.print("SHOAP:");
        System.out.println("HAMAZAPUR,SHERGHATI,SIDE OF GT ROAD,(BIHAR),824211");
        System.out.print("✆:6203951082 , ✉:ammen@265  \uD83C\uDF31");
    }
}