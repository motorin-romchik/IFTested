public class main1 {
    public static void main (String args[]){
        Dynstack mystack1 = new Dynstack(5);
        Dynstack mystack2 = new Dynstack(8);

        for (int i=0;i<5;i++)
            mystack1.push(i);
        for (int i=0;i<8;i++)
            mystack2.push(i);

        System.out.println("Stack1!");
        for (int i=0;i<5;i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack2!");
        for (int i=0; i<8;i++)
            System.out.println(mystack2.pop());

    }
}
