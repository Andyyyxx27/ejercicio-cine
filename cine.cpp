#include <iostream>
using namespace std;
int main(){
    int formato, edad, cantidad, dia;
    string est;
    cout<<"Formato 1=2D 2=3D 3=IMAX: "; cin>>formato;
    if(formato<1||formato>3){ cout<<"Fuera de rango"; return 0; }
    cout<<"Edad: "; cin>>edad;
    if(edad<0||edad>120){ cout<<"Edad fuera de rango"; return 0; }
    cout<<"Cantidad: "; cin>>cantidad;
    cout<<"Estudiante S/N: "; cin>>est;
    cout<<"Dia 1-7: "; cin>>dia;
    double base = (formato==1?5:(formato==2?7.5:10));
    double desc=0;
    if(edad>=65) desc=base*0.30;
    else if(edad<=11) desc=base*0.20;
    else if((est=="S"||est=="s")&&dia<=5) desc=base*0.15;
    else if(dia==3) desc=base*0.10;
    double recargo=0;
    if((dia==6||dia==7)&&formato==3) recargo=(base-desc)*0.10;
    if(cantidad>=4&&(est=="S"||est=="s"||edad<=11)) cout<<"Combo cortesia\n";
    cout<<"TOTAL: $"<<(base-desc)+recargo;
}
