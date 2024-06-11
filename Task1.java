
import java.util.Scanner;

class UnitGet{
    public String inputunit;
    public String outputunit;
}
class TempValue{
    public static double celcius=1;
    public static double kelvin=273.15;
    public static double Fahrenhite=32;
}

class TempConverter extends TempValue{

    public void TempConverterFun(String iu,String ou,Double val,TempValue tempValue){
        try{
    var result="";
    if(iu=="celcius" && ou=="kelvin"){
        result=val+kelvin+"K";
    }
    if(iu=="celcius" && ou=="Fahrenhite"){
        result=(val*9/5)+Fahrenhite +"F";
    }
    if(iu=="celcius" && ou=="celcius"){
        result=val +"C";
    }
    //step2
    if(iu=="kelvin" && ou=="celcius"){
        result=val - kelvin +"C";
    }
    if(iu=="kelvin" && ou=="Fahrenhite"){
        result=(val - kelvin)*9/5+Fahrenhite+"F" ;
    }
    if(iu=="kelvin" && ou=="kelvin"){
        result=val+"K";
    }
    //step3
    if(iu=="Fahrenhite" && ou=="kelvin"){
        result=(val - Fahrenhite)*5/9+kelvin+"K";
    }
    if(iu=="Fahrenhite" && ou=="Fahrenhite"){
        result=val+"F";
    }
    if(iu=="Fahrenhite" && ou=="celcius"){
        result=(val - Fahrenhite)*5/9 +"C";
    }
    int index=result.indexOf(".");
    if(result.substring(index,result.length()).length()>4){
        result=result.substring(0, index+3)+result.charAt(result.length()-1);
    }else{
        result=result;
    }
  System.out.println("convertion of "+val+" "+iu+" to "+ou+" is : "+result);
  System.out.println("\nThank you visit again...");
  StartProject start=new StartProject();
  start.startProject();
  
    }
        catch(Exception e){
            System.out.println(e);
    }

    }
   
}

class StartProject{
    public void startProject(){
        UnitGet unitget=new UnitGet();
        TempValue tempValue=new TempValue();
        TempConverter tempConverter=new TempConverter();

        Scanner sc =new Scanner(System.in);
        System.out.println("choose input unit");
        System.out.println("1: celcious \n2: kelvin\n3: Fahrenhite");
        int iu=sc.nextInt();
        System.out.println("Enter value :");
        double val=sc.nextDouble();
        System.out.println("choose output unit");
        System.out.println("1: celcious \n2: kelvin\n3: Fahrenhite");
        int ou=sc.nextInt();

 if(iu==1){unitget.inputunit="celcius";}
 if(iu==2){unitget.inputunit="kelvin";}
 if(iu==3){unitget.inputunit="Fahrenhite";}
 if(ou==1){unitget.outputunit="celcius";}
 if(ou==2){unitget.outputunit="kelvin";}
 if(ou==3){unitget.outputunit="Fahrenhite";}
//  celsius, Fahrenhite and Kelvin
tempConverter.TempConverterFun(unitget.inputunit,unitget.outputunit,val,tempValue);
       
        sc.close();
    }
}

public class Task1 {
    public static void main(String[] args) {
        StartProject start=new StartProject();
        start.startProject();
    }
}
