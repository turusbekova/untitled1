package practice1;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class Problem3 {
    static int appleCoin = 146;
    static int pearCoin = 5000;
    static int rubberCoin = 10000;
    /**
     * appleCoin is worth $1.78 and pearCoin is worth $0.3 while rubberCoin is worth $1
     * All of these coins are physical and can't be split into parts
     * Please create a variable for total amount of $ you can sell all your coins for and print it out to the console
     */
    public static void main(String[] args) {
        //TODO create variable for the total amount in $ that you have after selling all of your coins
        //TODO print this variable out to the console
     double appleCoin = (146 * 1.78);
     double pearCoin = (5000 * 0.3);
     int rubberCoin = (10000 * 1);

     System.out.println(appleCoin);
     System.out.println(pearCoin);
     System.out.println(rubberCoin);

     double totalAmount = 259 + 1500 + 10000;
     System.out.println(totalAmount);



    }}
