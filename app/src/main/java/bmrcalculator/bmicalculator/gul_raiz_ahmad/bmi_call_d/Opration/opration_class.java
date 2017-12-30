package bmrcalculator.bmicalculator.gul_raiz_ahmad.bmi_call_d.Opration;

import android.util.Log;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import bmrcalculator.bmicalculator.gul_raiz_ahmad.bmi_call_d.MainActivity;

/**
 * Created by rehan on 9/30/2017.
 */
public class opration_class {

/*
will use in future
public String man_AvarageIBM(double userinput,String age,int age_number){
    String resultQuery = "";
    Log.e("query", String.valueOf(userinput)+age);
//    switch (age){
      //  case "1month":
    if(age_number == 1 && age.equals("m")) {
        if (userinput >= 7.4 && userinput < 9.8) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 7.4) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 9.8) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 2 && age.equals("m")) {
        //   case "2month":
        if (userinput >= 9.8 && userinput < 12.3) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 9.8) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 12.3) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("m")) {
      ///  case "3month":
            if (userinput >= 12.3 && userinput < 14.1) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 12.3) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 14.1) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("m")) {
        //   case "4month":
        if (userinput >= 15.4 && userinput < 16.6) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 15.4) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 16.6) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 5 && age.equals("m")) {
        //   case "5month":
        if (userinput >= 16.6 && userinput < 17.5) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 16.6) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 17.5) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 6 && age.equals("m")) {
        ///   case "6month":
        if (userinput >= 17.5 && userinput < 18.3) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 17.5) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 18.3) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 7 && age.equals("m")) {
        //   case "7month":
        if (userinput >= 18.3 && userinput < 19) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 18.3) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 19) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 8 && age.equals("m")) {
        //  case "8month":
        if (userinput >= 19 && userinput < 19.6) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 19) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 19.6) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 9 && age.equals("m")) {
        // case "9month":
        if (userinput >= 19.6 && userinput < 20.1) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 19.6) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 20.1) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 10 && age.equals("m")) {
       // case "10month":
            if (userinput >= 20.1 && userinput < 20.8) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 20.1) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 20.8) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 11 && age.equals("m")) {
        // case "11month":
        if (userinput >= 20.8 && userinput < 21.3) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 20.8) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 21.3) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 1 && age.equals("y")) {
        //  case "1year":
        if (userinput >= 21.3 && userinput < 21.8) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 21.3) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 21.8) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 13 && age.equals("y")) {
        //   case "13month":
        if (userinput >= 21.8 && userinput < 22.3) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 21.8) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 22.3) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("y")) {
        //case "14month":
            if (userinput >= 22.3 && userinput < 22.7) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 22.3) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 22.7) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "15month":
            if (userinput >= 22.7 && userinput < 23.2) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 22.7) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 23.2) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
       // case "16month":
            if (userinput >= 23.2 && userinput < 27.7) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 23.2) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 23.7) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "17month":
            if (userinput >= 23.7 && userinput < 24.1) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 23.7) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 24.1) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "18month":
            if (userinput >= 24.1 && userinput < 25) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 24.1) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 25) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "19month":
            if (userinput >= 22.7 && userinput < 23.2) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 22.7) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 23.2) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "20month":
            if (userinput >= 25 && userinput < 25.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 25) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 25.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "21month":
            if (userinput >= 25.5 && userinput < 25.9) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 25.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 25.9) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //case "22month":
            if (userinput >= 25.9 && userinput < 26.3) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 25.9) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 26.3) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
     ///   case "23month":
            if (userinput >= 26.3 && userinput < 27.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 26.3) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 23.2) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 2 && age.equals("y")) {
       // case "2year":
            if (userinput >= 27.5 && userinput < 31) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 22.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 31) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
     //   case "3year":
            if (userinput >= 31 && userinput < 40.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 31) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 40.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 4 && age.equals("y")) {
    //    case "4year":
            if (userinput >= 40.5 && userinput < 40.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 40.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 40.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 5 && age.equals("y")) {
    //    case "5year":
            if (userinput >= 40.5 && userinput < 40.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 40.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 40.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 6 && age.equals("y")) {
       // case "6year":
            if (userinput >= 45.5 && userinput < 40.5  ){
                resultQuery = "your baby has perfect IBM ";
            }else if (userinput < 40.5){
                resultQuery = "Your baby is underwaight. ";
            }else if (userinput >= 40.5){
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 7 && age.equals("y")) {
       // case "7year":
            if (userinput >= 50.5 && userinput < 56.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 50.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 56.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 8 && age.equals("y")) {
     //   case "8year":
            if (userinput >= 56.5 && userinput < 63) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 56.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 63) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 9 && age.equals("y")) {
        //case "9year":
            if (userinput >= 63 && userinput < 70.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 63) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 70.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 10 && age.equals("y")) {
        //case "10year":
            if (userinput >= 70.5 && userinput < 78.5  ){
                resultQuery = "your baby has perfect IBM ";
            }else if (userinput < 70.5){
                resultQuery = "Your baby is underwaight. ";
            }else if (userinput >= 78.5){
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 11 && age.equals("y")) {
       /// case "11year":
            if (userinput >= 78.5 && userinput < 88) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 78.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 88) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number == 12 || age_number == 13) && age.equals("y")) {
       // case "12years-13years":
            if (userinput >= 88 && userinput <= 100  ){
                resultQuery = "your baby has perfect IBM ";
            }else if (userinput < 88){
                resultQuery = "Your baby is underwaight. ";
            }else if (userinput >= 100){
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number == 14 || age_number == 15) && age.equals("y")) {
        //case "14years-15years":
            if (userinput >= 112 && userinput <= 123  ){
                resultQuery = "your baby has perfect IBM ";
            }else if (userinput < 112){
                resultQuery = "Your baby is underwaight. ";
            }else if (userinput >= 123){
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number == 16 || age_number == 17) && age.equals("y")) {
       // case "16years-17years":
            if (userinput >= 134 && userinput <= 142) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 134) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 142) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number >= 18 && age_number <= 20) && age.equals("y")){
        //  case "18years-20years":
        if (userinput >= 147 && userinput <= 155) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 147) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 155) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if((age_number >= 20 && age_number <= 29) && age.equals("y")) {
        //case "20years-29years":
            if (userinput >= 168 && userinput < 155) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 168) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 155) {
                resultQuery = "Your baby is overwaight .";
            }

    }else if((age_number >= 30 && age_number <= 39) && age.equals("y")) {
        //case "30years-39years":
            if (userinput >= 179 && userinput < 182) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 179) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 182) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number >= 40 && age_number <= 49) && age.equals("y")) {
        //case "40years-49years":
            if (userinput >= 182 && userinput < 185) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 182) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 185) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number >= 50 && age_number <= 59) && age.equals("y")) {
        //case "50years-59years":
            if (userinput >= 185 && userinput < 184) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 185) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 184) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number >= 60 && age_number <= 69) && age.equals("y")) {
      //  case "60years-69years":
            if (userinput >= 184 && userinput < 189) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 184) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 189) {
                resultQuery = "Your baby is overwaight .";
            }
        }
    //}//switch end
    return resultQuery;
}//function end

////////////////////////woman fucntion
public String woman_AvarageIBM(double userinput,String age,int age_number) {
    String resultQuery = "";
    Log.e("query", String.valueOf(userinput) + age);
    //  switch (age){
    if (age_number == 1 && age.equals("m")) {
        // case "1month":
        if (userinput >= 7.3 && userinput < 9.6) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 7.3) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 9.6) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 2 && age.equals("m")) {
      //  case "2month":
            if (userinput >= 9.6 && userinput < 11.7) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 9.6) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 11.7) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("m")) {
       // case "3month":
            if (userinput >= 11.7 && userinput < 13.3) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 11.3) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 13.3) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("m")) {
     //   case "4month":
            if (userinput >= 14.6 && userinput < 15.8) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 14.6) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 15.8) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 5 && age.equals("m")) {
      //  case "5month":
            if (userinput >= 15.8 && userinput < 16.6) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 15.8) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 16.6) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 6 && age.equals("m")) {
        //case "6month":
        if (userinput >= 16.6 && userinput < 17.4) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 16.6) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 17.4) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 7 && age.equals("m")) {
        // case "7month":
        if (userinput >= 17.4 && userinput < 18.1) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 17.4) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 18.1) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 8 && age.equals("m")) {
   //     case "8month":
            if (userinput >= 18.1 && userinput < 18.8) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 18.1) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 18.8) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 9 && age.equals("m")) {
      //  case "9month":
            if (userinput >= 18.8 && userinput < 19.4) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 18.8) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 19.4) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 10 && age.equals("m")) {
    //case "10month":
        if (userinput >= 19.4 && userinput < 19.9) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 19.4) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 19.9) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 11 && age.equals("m")) {
        // case "11month":
        if (userinput >= 19.9 && userinput < 20.4) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 19.9) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 20.4) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 1 && age.equals("y")) {
      //  case "1year":
            if (userinput >= 19.9 && userinput < 20.4) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 19.9) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 20.4) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 13 && age.equals("y")) {
     //   case "13month":
            if (userinput >= 20.4 && userinput < 21) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 20.4) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 21) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
      //  case "14month":
            if (userinput >= 21 && userinput < 21.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 21) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 21.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
      //  case "15month":
            if (userinput >= 21.5 && userinput < 22) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 21.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 22) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
       // case "16month":
            if (userinput >= 22 && userinput < 22.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 22) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 22.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        // case "17month":
        if (userinput >= 22.5 && userinput < 23.4) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 22.5) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 23.4) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("y")) {
       // case "18month":
            if (userinput >= 23.4 && userinput < 23.9) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 23.4) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 23.9) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        //  case "19month":
        if (userinput >= 23.9 && userinput < 24.4) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 23.9) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 24.4) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("y")) {
      //  case "20month":
            if (userinput >= 24.4 && userinput < 24.9) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 24.4) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 24.9) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 3 && age.equals("y")) {
        // case "21month":
        if (userinput >= 24.9 && userinput < 25.4) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 24.9) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 25.4) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("y")) {
        // case "22month":
        if (userinput >= 25.4 && userinput < 25.9) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 25.4) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 25.9) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("y")) {
        // case "23month":
        if (userinput >= 25.9 && userinput < 26.5) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 25.9) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 26.5) {
            resultQuery = "Your baby is overwaight .";
        }
    }  else if(age_number == 2 && age.equals("y")) {
        //   case "2year":
        if (userinput >= 26.5 && userinput < 31.5) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 26.5) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 31.5) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 3 && age.equals("y")) {
        // case "3year":
        if (userinput >= 31.5 && userinput < 34) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 31.5) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 34) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 4 && age.equals("y")) {
       /// case "4year":
            if (userinput >= 34 && userinput < 39.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 34) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 39.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 5 && age.equals("y")) {
        //case "5year":
            if (userinput >= 39.5 && userinput < 44) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 39.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 44) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 6 && age.equals("y")) {
      //  case "6year":
            if (userinput >= 44 && userinput < 49.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 44) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 49.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 7 && age.equals("y")) {
       // case "7year":
            if (userinput >= 49.5 && userinput < 57) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 49.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 57) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 8 && age.equals("y")) {
        // case "8year":
        if (userinput >= 57 && userinput < 62) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 57) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 62) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 9 && age.equals("y")) {
        //  case "9year":
        if (userinput >= 62 && userinput < 70.5) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 62) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 70.5) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if(age_number == 10 && age.equals("y")) {
      //  case "10year":
            if (userinput >= 70.5 && userinput < 81.5) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 70.5) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 81.5) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if(age_number == 11 && age.equals("y")) {
        // case "11year":
        if (userinput >= 81.5 && userinput < 91) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 81.5) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 91) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if((age_number == 12 || age_number == 13) && age.equals("y")) {
        // case "12years-13years":
        if (userinput >= 91 && userinput <= 101) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 91) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 101) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if((age_number == 14 || age_number == 15) && age.equals("y")) {
       // case "14years-15years":
            if (userinput >= 105 && userinput <= 115) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 105) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 115) {
                resultQuery = "Your baby is overwaight .";
            }
    }else if((age_number == 16 || age_number == 17) && age.equals("y")) {
     //   case "16years-17years":
            if (userinput >= 118 && userinput <= 120) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 118) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 120) {
                resultQuery = "Your baby is overwaight .";
            }
    } else if((age_number >= 18 && age_number <= 20) && age.equals("y")) {
        // case "18years-20years":
        if (userinput >= 125 && userinput <= 128) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 125) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 128) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if((age_number >= 20 && age_number <= 29) && age.equals("y")) {
        //   case "20years-29years":
        if (userinput >= 128 && userinput < 132) {
            resultQuery = "your baby has perfect IBM ";
        } else if (userinput < 128) {
            resultQuery = "Your baby is underwaight. ";
        } else if (userinput >= 132) {
            resultQuery = "Your baby is overwaight .";
        }
    }else if ((age_number >= 30 && age_number <= 39) && age.equals("y")) {
            // case "30years-39years":
            if (userinput >= 132 && userinput < 144) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 132) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 144) {
                resultQuery = "Your baby is overwaight .";
            }
        } else if ((age_number >= 40 && age_number <= 49) && age.equals("y")) {
            // case "40years-49years":
            if (userinput >= 144 && userinput < 149) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 144) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 149) {
                resultQuery = "Your baby is overwaight .";
            }
        } else if ((age_number >= 50 && age_number <= 59) && age.equals("y")) {
            // case "50years-59years":
            if (userinput >= 149 && userinput < 158) {
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 149) {
                resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 158) {
                resultQuery = "Your baby is overwaight .";
            }
        } else if ((age_number >= 60 && age_number <= 69) && age.equals("y")) {
            // case "60years-69years":
            if (userinput >= 152 && userinput < 158){
                resultQuery = "your baby has perfect IBM ";
            } else if (userinput < 152) {
            resultQuery = "Your baby is underwaight. ";
            } else if (userinput >= 158) {
                 resultQuery = "Your baby is overwaight .";
            }
        }
    //}//switch end
    return resultQuery;
}//function end


    ////////////////end woman
    public String getWaistToHeightresults(double userinput,String userType){
        String resultQuery= "";
        switch (userType) {
            case "man":
                if (userinput <= 0.34) {
                        resultQuery = "extemlyslim ";
                } else if (userinput >= 0.43 && userinput < 0.52) {
                        resultQuery = "healthy ";
                } else if (userinput >= 0.53 && userinput < 0.57) {
                        resultQuery = "overweight";
                } else if (userinput >= 0.58 && userinput < 0.62) {
                        resultQuery = "veryoverweight";
                } else if (userinput >= 0.63) {
                        resultQuery = " morbidly Obese";
                }
            case "woman":
                if (userinput <= 0.34) {
                    resultQuery = "extemlyslim ";
                } else if (userinput >= 0.42  && userinput <  0.48) {
                    resultQuery = "healthy ";
                } else if (userinput >= 0.49 && userinput < 0.53) {
                    resultQuery = "overweight";
                } else if (userinput >= 0.54  && userinput <  0.57) {
                    resultQuery = "veryoverweight";
                } else if (userinput >= 0.58) {
                    resultQuery = " morbidlyobese";
                }
        }
        return resultQuery;

    }///function end
*/
    public String bmiStanders(double bmi){
        /*underweight (BMI less than 18.5)
        normal weight (B MI between 18.5 & 24.9)
        overweight (BMI between 25.0 & 29.9)
        obese (BMI 30.0 and above)*/
        String userSituation = null;
        if(bmi <18.5){
            userSituation = "under";
        }else if (bmi >= 18.5 && bmi <=24.9){
            userSituation = "normal";
        }else if (bmi >= 25.0 && bmi <= 29.0){
            userSituation = "over";
        }else if(bmi >= 30.0){
            userSituation = "obese";
        }
    return  userSituation;
    }
    public String getBMI(String weight_type, String height_type, double height_feet, double weight, int height_inch){
        int bmi = 0;
        double x = 0;
    //    height_inch = 1;
        String result = null;
        if(height_type.equals("ft")){
            if(weight_type.equals("kg")) {
                double meters = feetToMeters(height_feet,height_inch);
                x = ((weight / Math.pow(meters, 2)));
                int i = (int) x;
                //result = String.valueOf(i)+"Kg";
                result = String.valueOf(i);
            }else if (weight_type.equals("pd")){
                double inches = height_feet * 12 + height_inch;
                x = (weight * 703)/ Math.pow(inches, 2);
                int i = (int) x;
              //  result = String.valueOf(i)+"Pd";
                result = String.valueOf(i);
            }
        }else if(height_type.equals("cm")){
            if(weight_type.equals("kg")) {
                // double meters = height / 3.2808;
                double meters = height_feet/ 100;
                x = ((weight / Math.pow(meters, 2)));
                int i = (int) x;
                result = String.valueOf(i);
            }else if (weight_type.equals("pd")){
                double inches = height_feet / 2.54;
                x = (weight * 703)/ Math.pow(inches, 2);
                int i = (int) x;
                result = String.valueOf(i);
            }
        }
        String userSituation = bmiStanders(x);
       // bmi = (int)x;
        return userSituation +","+result;
       // return bmi = (int)x;
    }//function end
//////////////////////////waist to height
   /* waist divided by their height, both measured in the same units
    for example
    34in waist/ 73in (6.1 feet) height*/
    public String getWaistToHeight(String wiast_type, String height_type, double heightFeet, Double waistToheight_waist, int heightInch, String gender) {
        double waistToHeightCal ;
      //  heightInch = 1;
        double   heightFeetToInch = 0;
        String result;
        if (wiast_type.equals("cm")) {
           waistToheight_waist = cmToIncheConvert(waistToheight_waist);
        }
         //   if(heightInch != 0)
        if (height_type.equals("cm")) {
             heightFeetToInch = cmToIncheConvert(heightFeet);
        }
        else
            heightFeetToInch = (heightFeet * 12) + heightInch;
            /*else
                heightFeetToInch = (heightFeet * 12);*/
            waistToHeightCal = waistToheight_waist / heightFeetToInch;
       // DecimalFormat precision = new DecimalFormat("0.00");
      //  double ans = Double.parseDouble(new DecimalFormat("##.##").format(waistToHeightCal));
        double ans = setFormatOfDecimal(waistToHeightCal);
        String standerResults = "";
        Log.e("gender",gender);
    //    gender = "man";
       standerResults  = waistToheightStanders(ans, gender);
         result = standerResults +","+ ans;
        return result;
    }
    public String waistToheightStanders(double waistToHeightCal,String genderType){
        /*<=0.34  Extremely Slim
            0.43 to 0.52 Healthy
            0.53 to 0.57 Overweight
            0.58 to 0.62 Very Overweight
            0.63 +  Morbidly Obese*/
        String userSituation = null;
        if(waistToHeightCal <0.34 &&  genderType.equals("man")){
            userSituation = "extremelyslim";
        }else if ((waistToHeightCal >= 0.35 && waistToHeightCal <= 0.42) &&  genderType.equals("man")){
            userSituation = "healthyslim";
        }else if ((waistToHeightCal >= 0.43 && waistToHeightCal <= 0.52) &&  genderType.equals("man")){
            userSituation = "healthy";
        }else if ((waistToHeightCal >= 0.53 && waistToHeightCal <= 0.57) &&  genderType.equals("man")){
            userSituation = "overweight";
        }else if ((waistToHeightCal >= 0.58 && waistToHeightCal <= 0.62) &&  genderType.equals("man")){
            userSituation = "veryoverweight";
        }else if(waistToHeightCal >= 63.0 &&  genderType.equals("man")){
            userSituation = "morbidlyobese";
        }////for woman
        else if(waistToHeightCal <0.34 &&  genderType.equals("woman")){
            userSituation = "extremelyslim";
        }else if ((waistToHeightCal >= 0.35 && waistToHeightCal <= 0.41) &&  genderType.equals("woman")){
            userSituation = "healthy";
        }else if ((waistToHeightCal >= 0.42 && waistToHeightCal <= 0.48) &&  genderType.equals("woman")){
            userSituation = "healthy";
        }else if ((waistToHeightCal >= 0.49 && waistToHeightCal <= 0.53) &&  genderType.equals("woman")){
            userSituation = "overweight";
        }else if ((waistToHeightCal >= 0.54 && waistToHeightCal <= 0.57) &&  genderType.equals("woman")){
            userSituation = "veryoverweight";
        }else if(waistToHeightCal >= 0.58 &&  genderType.equals("woman")){
            userSituation = "morbidlyobese";
        }
       /* Range for woman
                <=0.34   Extremely Slim
        0.42 to 0.48  Healthy
        0.49 to 0.53  Overweight
        0.54 to 0.57  Very Overweight
        0.58 +   Morbidly Obese*/
        return  userSituation;
    }
////////////////waist to height


    ///////////////////////////////////////////////////// start fat of percentage \
/*
495 / (1.29579 - .35004 x log10(Waist in cm + Hip in cm - Neck in cm) + .22100 x log10(Height)) - 450
    for man
    495 / (1.0324 - .19077 x log10(waist in cm - Neck in cm) + .15456 x log10(Height in cm)) - 450
*/
    public String calculateBodyFatOfPercetage(String waistType , double waist, String heightType, double height, int inch, String neckType, double neck, String gender, String hipType, double hip){
       String result;
        double calFatOfPercentage ,heightFeetToInch = 0;

        if(waistType.equals("inch")) {
            waist = incheToCmConvert(waist);
        }
        if(neckType.equals("inch")){
            neck = incheToCmConvert(neck);
        }
        if(heightType.equals("ft")){
            heightFeetToInch = (height * 12) + inch;
            height = incheToCmConvert(heightFeetToInch);
        }
        if(hipType.equals("inch")){
           hip = incheToCmConvert(hip);
        }
        //for man495 / (1.0324 - .19077 x log10(waist in cm - Neck in cm) + .15456 x log10(Height in cm)) - 450
        if(gender.equals("man")) {
            calFatOfPercentage = 495 / (1.0324 - .19077 * Math.log10(waist - neck) + .15456 * Math.log10(height)) - 450;
        }  else
        //495 / (1.29579 - .35004 x log10(Waist in cm + Hip in cm - Neck in cm) + .22100 x log10(Height)) - 450
           calFatOfPercentage = 495 / (1.29579 - .35004 * Math.log10(waist + hip - neck) + .22100 * Math.log10(height)) - 450;
     /*   double  ans;
        try {
            ans = new Double(calFatOfPercentage);
        } catch (NumberFormatException e) {
            ans = 0; // your default value
        }*/
        double ans = setFormatOfDecimal(calFatOfPercentage);

       // int n = 25;
    /*    int v = 100;
        float percent = (float) (ans * 100f / v);*/
       String standerResult = standersFatOfPercetage(ans,gender);
        result = String.valueOf(ans)+"%"+","+standerResult;
        return result;
    //    i = (495 / (1.0324 - 0.19077 * (Math.log10(76.2 - 25.4)) + 0.15456 * (Math.log10(170.18))) - 450);
     //   495 / (1.29579 - .35004 * log10(Waist - Neck) + 0.22100 * log10(Height)) - 450
    }
    private double setFormatOfDecimal(double calculation){
        double ans = 0;
        try{
           ans = Double.parseDouble(new DecimalFormat("##.##").format(calculation));
        //    NumberFormat formatter = new DecimalFormat("#0.00");
        }catch (Exception c){
            ans = 0;
          //  Toast.makeText(MainActivity.class,"There are some eror in calculation",Toast.LENGTH_LONG).show();
        }
        return ans;
    }
    public String standersFatOfPercetage(double results,String genderType) {
        String userSituation = null;
       if ((results <= 8) && genderType.equals("man")) {
           userSituation = "low";
        } else if ((results >= 8 && results <= 20) && genderType.equals("man")) {
           userSituation = "normal";
        } else if ((results >= 20 && results <= 25) && genderType.equals("man")) {
           userSituation = "high";
        } else if ((results >= 25) && genderType.equals("man")) {
           userSituation = "veryhigh";
        } ////for woman
        else if ((results <= 21) && genderType.equals("woman")) {
            userSituation = "low";
        } else if ((results >= 21 && results <= 33) && genderType.equals("woman")) {
            userSituation = "normal";
        } else if ((results >= 33 && results <= 39) && genderType.equals("woman")) {
            userSituation = "high";
        } else if ((results >= 39) && genderType.equals("woman")) {
            userSituation = "veryhigh";
        }
        return userSituation;
    }
    ////////////////////// end fat of percentage

    //////////////////////////start BMW
    public String calculateBMR(String weightType ,double weight,String heightType,double height,int age,String gender,int inch){
       /* BMR for male = (height in centimeters x 6.25) + (weight in kilograms x 9.99) - (age x 4.92) + 5
        BMR for female= (height in centimeters x 6.25) + (weight in kilograms x 9.99) - (age x 4.92) - 161*/

        double calculateBMR ;
            if(heightType.equals("ft")){
               height = (height * 12) + inch;
            height = incheToCmConvert(height);
            }
            if(weightType.equals("pound")){
                weight = pondToKg(weight);
            }
                if(gender.equals("man"))
        //calculateBMRForMale
           calculateBMR = (height * 6.25) + (weight * 9.99) - (age * 4.92) + 5;
        else
            calculateBMR = (height * 6.25) + (weight * 9.99) - (age * 4.92) - 161;

        return String.valueOf(calculateBMR+" Calories/day");
    }
    ////////////////////////////////end BMW
    ////////////////////convertor start
    public  double cmToIncheConvert(double cm){
        double converted;
       /* double feet = cm / 30.48;
        converted = (cm / 2.54) - (feet * 12);*/
      converted =  cm * 0.39370;
        return converted;

    }
    public  double incheToCmConvert(double inch){
       /* double converted;
        double feet = cm / 30.48;
        converted = (cm / 2.54) - (feet * 12);*/
        double converted = (inch * 2.54);
        return converted;

    }
    public double pondToKg(double pounds){
        double kilograms = pounds * 0.454;
        return kilograms;
    }
    public double feetToMeters(double feet ,int inch ){
        double   meters;
        if (inch != 0)
            meters = (feet * .3048) + (inch * 0.0254);
        else
            meters = (feet * .3048);
        return meters;

    }
    public double feetToInches(double feet){
        double inches;
      inches = feet * 12;
        return inches;
    }
    ///////////////convertor end


}   //class end
