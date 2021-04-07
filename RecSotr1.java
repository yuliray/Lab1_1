import java.util.Scanner;

class SotrudnikWR{
    String fam,im,otch,doljnost;
    int kolDet;
    Rebenok []reb = null;
}

class Rebenok{
    String imaR;
    int vozrastR;
}

public class RecSotr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите кол-во сотрудников:");
        int kol = sc.nextInt();
        sc.nextLine();
        SotrudnikWR []sotr = new SotrudnikWR[kol];
        System.out.println("Введите информацию о каждом сотруднике: ");
        for (int i = 0; i < sotr.length; i++){
            sotr[i] = new SotrudnikWR();
            System.out.println("Введите фамилию " + (i + 1) + " сотрудника");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите имя");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите отчество");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность");
            sotr[i].doljnost = sc.nextLine();
            System.out.println("Введите количество детей");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();

            if (sotr[i].kolDet!=0){
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Дети");
                for (int j = 0; j < sotr[i].reb.length; j++){
                    sotr[i].reb[j] = new Rebenok();
                    System.out.println("Введите имя "+(i+1)+" ребенка");
                    sotr[i].reb[j].imaR = sc.nextLine();
                    System.out.println("Введите его возраст");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        System.out.println( "\n Сотрудники фирмы: \n фам \t имя \t отч \t должность");
        for(SotrudnikWR s : sotr){
            System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch + "\t\t"+s.doljnost);
            System.out.println("\n      Дети: ");
            for (Rebenok r : s.reb)
                System.out.println("\t\t\t"+ r.imaR + "\t\t"+ r.vozrastR);
            System.out.println("");
        }
    }
}