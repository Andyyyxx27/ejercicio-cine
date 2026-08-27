import java.util.Scanner;
public class CineCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int formato, edad, cantidad, dia;
        System.out.print("Formato 1=2D 2=3D 3=IMAX: "); formato=sc.nextInt();
        if(formato<1||formato>3){ System.out.println("Formato fuera de rango"); return; }
        System.out.print("Edad: "); edad=sc.nextInt();
        if(edad<0||edad>120){ System.out.println("Edad fuera de rango"); return; }
        System.out.print("Cantidad entradas: "); cantidad=sc.nextInt();
        System.out.print("Es estudiante S/N: "); String est=sc.next();
        System.out.print("Dia 1=Lun 7=Dom: "); dia=sc.nextInt();
        double base = (formato==1?5:(formato==2?7.5:10));
        double desc=0;
        if(edad>=65) desc=base*0.30;
        else if(edad<=11) desc=base*0.20;
        else if(est.equalsIgnoreCase("S")&&dia<=5) desc=base*0.15;
        else if(dia==3) desc=base*0.10;
        double recargo=0;
        if((dia==6||dia==7)&&formato==3) recargo=(base-desc)*0.10;
        if(cantidad>=4&&(est.equalsIgnoreCase("S")||edad<=11)) System.out.println("Combo cortesía");
        System.out.println("TOTAL: $"+((base-desc)+recargo));
    }
}
