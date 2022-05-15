import java.util.*;

public class Main {
    static public void main(String[] args){
        String cnt = "";
        Scanner scan = new Scanner(System.in);
        do
        {
            runningProgram.input();
            System.out.print("\nDo you want to retry [y/t] ?");
            cnt = scan.nextLine();
        }
        while(cnt.equalsIgnoreCase("Y"));
        System.out.println("Terima Kasih");
    }
    
    private static Scanner input = new Scanner(System.in);
    public static int min, max, temp_min, temp_max, i,j,k, numb []=new int [5];
    static boolean check = false;
    private String word;

    public static void swap(int[] numb, int numb1, int numb2)
    {
        int temp;
        temp=numb[numb1];
        numb[numb1]=numb[numb2];
        numb[numb2]=temp;
    }
    
    public static class runningProgram
    {
        static public void input()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("     Program Sorting       ");
            System.out.println("============================");
            System.out.println("Menu hari ini");
            System.out.println("1. Random Data ");
            System.out.println("2. Simulasi Bubble Sort - Ascending ");
            System.out.println("3. Simulasi Bubble Sort - Descending ");
            System.out.println("4. Simulasi Selection Sort - Ascending ");
            System.out.println("5. Simulasi Selection Sort - Descending ");
            System.out.println("6. Exit ");
            System.out.print("Masukkan Pilihan Anda :");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1: Generate();break;
                case 2: bubblesortAsc();break;
                case 3: bubblesortDesc();break;
                case 4: selectionsortAsc();break;
                case 5: selectionsortDesc();break;
                case 6: Exit();break;
                default:
                    System.out.println("Pilihan Anda tidak tersedia");
                    break;
            }
        }
        
        public static void Generate(){
            System.out.print("\nBatas Atas :");
            min = input.nextInt();
            System.out.print("Batas Bawah :");
            max = input.nextInt();
            while(min>max)
            {
                System.out.println("\nMasukkan inputan: ");
                System.out.print("\nBatas Bawah: "); min = input.nextInt();
                System.out.print("Batas Atas: "); max = input.nextInt();
            }
            for(int i = 0;i<=numb.length-1;i++)
            {
                if(max-min+1<5)
                {
                    numb[i]=(int)(min+Math.random()*(max-min+1));
                }
                else
                {
                    numb[i]=(int)(min+Math.random()*(max-min+1));
                    j=0;
                    do
                    {
                        if(numb[i]==numb[j] && i!=j)
                        {
                            numb[i]=(int)(min+Math.random()*(max-min+1));
                            j=0;
                        }
                        else
                        {
                            j=j+1;
                        }
                    }
                    while(j<i);
                }
            }
            System.out.print("Bilangan yang dihasilkan: "); displayNumber(numb);
            check = true;
        }
        public static void bubblesortAsc() {
            if(!check)
            {
                System.out.println("\nBilangan Belum Dimasukkan, Silahkan Pilih Menu Nomor 1");
                input();
            }
            for(int i=1; i <= numb.length-1; i++)
            {
                System.out.println("\nPass " +i);
                displayNumber(numb);
                for(int j=0; j <= numb.length-1-i; j++)
                {
                    if(numb[j]>=numb[j+1])
                    {
                        swap(numb,j,j+1);
                    }
                    displayNumber(numb);
                }
                System.out.println("\nResult of Pass " +i +": ");
                displayNumber(numb);
            }
        }
        public static void bubblesortDesc() {
            if(!check)
            {
                System.out.println("\nBilangan Belum Dimasukkan, Silahkan Pilih Menu Nomor 1");
                input();
            }
            for(int i=1; i <= numb.length-1; i++)
            {
                System.out.println("\nPass " +i);
                displayNumber(numb);
                for(int j=0; j<= numb.length-1-i; j++)
                {
                    if(numb[j]<=numb[j+1])
                    {
                        swap(numb,j,j+1);
                    }
                    displayNumber(numb);
                }
                System.out.println("\nResult of Pass " +i +": ");
                displayNumber(numb);
            }
        }
        public static void selectionsortAsc() {
            if(!check)
            {
                System.out.println("\nBilangan Belum Dimasukkan, Silahkan Pilih Menu Nomor 1");
                input();
            }
            String extreme = "Minimum";
            for(int i=0; i <= numb.length-2; i++)
            {
                temp_max = i;
                k = i+1;
                System.out.println("\nPass " +k);
                for(int j=1+i; j <= numb.length-1; j++)
                {
                    selectDisplay(numb,extreme,j,temp_max);
                    if(numb[j]>=numb[temp_max])
                    {
                        temp_min = j;
                    }
                }
                selectDisplay(numb,extreme,temp_min,temp_min);
                swap(numb,i,temp_min);
                System.out.println("\nResult of Pass " +k +": ");
                displayNumber(numb);
            }
        }
        public static void selectionsortDesc() {
            if(!check)
            {
                System.out.println("\nBilangan Belum Dimasukkan, Silahkan Pilih Menu Nomor 1");
                input();
            }
            String extreme = "Maximum";
            for(int i=0; i <= numb.length-2; i++)
            {
                temp_max = i;
                k = i+1;
                System.out.println("\nPass " +k);
                for(int j=1+i; j <= numb.length-1; j++)
                {
                    selectDisplay(numb,extreme,j,temp_max);
                    if(numb[j]>=numb[temp_max])
                    {
                        temp_max = j;
                    }
                }
                selectDisplay(numb,extreme,temp_max,temp_max);
                swap(numb,i,temp_max);
                System.out.println("\nResult of Pass " +k +": ");
                displayNumber(numb);
            }
        }
        public static void displayNumber(int[] numb)
        {
            for (int k=0; k <= numb.length-1; k++){
                System.out.print(numb[k]+" ");
            }
            System.out.println();
        }
        public static void Exit(){
            System.out.println("Terima kasih");
            System.exit(0);
        }
        public static void selectDisplay(int[] numb, String extreme, int b, int temp_min) //printing selection method
        {
            for(int k=0; k<=numb.length-1; k++)
            {
                if(k == temp_min)
                {
                    System.out.print("Current " +extreme +" (" +numb[k] +") ");
                }
                else if(k == j)
                {
                    System.out.print("(" +numb[k] +") ");
                }
                else
                {
                    System.out.print(numb[k] +" ");
                }
            }
            System.out.println();
        }

    }
}