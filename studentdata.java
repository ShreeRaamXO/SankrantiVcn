public class studentdata {
    //10
    private int id;
    private String name;
    private int s1,s2,s3;
    
    void data(int id , String name , int s1 , int s2, int s3){
        this.id = id;
        this.name = name;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public int findTotal(){
        int sum = this.s1+this.s2+this.s3;
        return sum;
    }

    public double average(){
        double avg = (this.s1+this.s2+this.s3)/3;
        return avg;
    }
    public void display_st(){
        System.out.println("name "+name+" id "+id);
    }

    public static void main(String[] args) {
        studentdata peee = new studentdata();
        peee.data(24,"titan",98,98,98);
        studentdata pooo = new studentdata();
        pooo.data(56, "jilish", 99, 99, 99);
        studentdata PIPIPOPO = new studentdata();
        PIPIPOPO.data(69, "HornySaurus", 100, 90, 90);

        peee.display_st();
        System.out.println(peee.findTotal());
        System.out.println(peee.average()+"%");
        pooo.display_st();
        System.out.println(pooo.findTotal());
        System.out.println(pooo.average()+"%");
        PIPIPOPO.display_st();

    }
}
