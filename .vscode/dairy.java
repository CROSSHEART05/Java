public class dairy {
    String Q[];
    int size;
    int start;
    int end;
    void dairy(int max ){
     size =max;
     start=0;
     end=0;
    }
    void pushadd(String n){
        //new word
        if(end==size-1){
            System.out.println("NO SPACE");
        }
        else if(start==-1 && end==-1){
            start++;
            end++;
            Q[end]=n;
        }
        else{
            end++;
            Q[end]=n;
        }
    }
    /**
     * 
     */
    void popadd(){
        if(start==-1){
            System.out.println("......");
        }
        return;
        else{
            int n=Q[start];
            start=start-1;
        }return n;
    }
    

}
