package BaseMent;

public class Convert {
    public double convert(String convertTo,double x,String unit1,String unit2){
        if(convertTo=="Length"){
            if(unit1=="Kilometre"){
            switch(unit2){
                case "Kilometre":
                    return x;
                case "Meter":
                    return x*1000.0;
                case "Centimeter":
                    return x*100000.0;
                case "Millimeter":
                    return x*1e+6;
                case "Micrometres":
                    return x*1e+9;
                case "Nanometre":
                    return x*1e+12;
                case "Mile":
                    return x*0.621371;
                case "Yard":
                    return x*1093.61;
                case "Foot":
                    return x*3280.84;
                case "Inch":
                    return x*39370.1;
                case "Nautical mile":
                    return x*0.539957;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Meter"){
            switch(unit2){
                case "Kilometre":
                    return x*0.001;
                case "Meter":
                    return x;
                case "Centimeter":
                    return x*100.0;
                case "Millimeter":
                    return x*1000.0;
                case "Micrometres":
                    return x*1e+6;
                case "Nanometre":
                    return x*1e+9;
                case "Mile":
                    return x*0.000621371;
                case "Yard":
                    return x*1.09361;
                case "Foot":
                    return x*3.28084;
                case "Inch":
                    return x*39.3701;
                case "Nautical mile":
                    return x*0.000539957;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Centimeter"){
            switch(unit2){
                case "Kilometre":
                    return x*1e-5;
                case "Meter":
                    return x*0.01;
                case "Centimeter":
                    return x;
                case "Millimeter":
                    return x*10.0;
                case "Micrometres":
                    return x*10000.0;
                case "Nanometre":
                    return x*1e+7;
                case "Mile":
                    return x*6.2137e-6;
                case "Yard":
                    return x*0.0109361;
                case "Foot":
                    return x*0.0328084;
                case "Inch":
                    return x*0.393701;
                case "Nautical mile":
                    return x*5.3996e-6;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Millimeter"){
            switch(unit2){
                case "Kilometre":
                    return x*1e-6;
                case "Meter":
                    return x*0.001;
                case "Centimeter":
                    return x*0.1;
                case "Millimeter":
                    return x;
                case "Micrometres":
                    return x*1000.0;
                case "Nanometre":
                    return x*1e+6;
                case "Mile":
                    return x*6.2137e-7;
                case "Yard":
                    return x*0.00109361;
                case "Foot":
                    return x*0.00328084;
                case "Inch":
                    return x*0.0393701;
                case "Nautical mile":
                    return x*5.3996e-7;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Micrometres"){
            switch(unit2){
                case "Kilometre":
                    return x*1e-9;
                case "Meter":
                    return x*1e-6;
                case "Centimeter":
                    return x*1e-4;
                case "Millimeter":
                    return x*0.001;
                case "Micrometres":
                    return x;
                case "Nanometre":
                    return x*1000.0;
                case "Mile":
                    return x*6.2137e-10;
                case "Yard":
                    return x*1.0936e-6;
                case "Foot":
                    return x*3.2808e-6;
                case "Inch":
                    return x*3.937e-5;
                case "Nautical mile":
                    return x*5.3996e-10;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Nanometre"){
            switch(unit2){
                case "Kilometre":
                    return x*1e-12;
                case "Meter":
                    return x*1e-9;
                case "Centimeter":
                    return x*1e-7;
                case "Millimeter":
                    return x*1e-6;
                case "Micrometres":
                    return x*0.001;
                case "Nanometre":
                    return x;
                case "Mile":
                    return x*6.2137e-13;
                case "Yard":
                    return x*1.0936e-9;
                case "Foot":
                    return x*3.2808e-9;
                case "Inch":
                    return x*3.937e-8;
                case "Nautical mile":
                    return x*5.3996e-13;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Mile"){
            switch(unit2){
                case "Kilometre":
                    return x*1.60934;
                case "Meter":
                    return x*1609.34;
                case "Centimeter":
                    return x*160934;
                case "Millimeter":
                    return x*1.609e+6;
                case "Micrometres":
                    return x*1.609e+9;
                case "Nanometre":
                    return x*1.609e+12;
                case "Mile":
                    return x;
                case "Yard":
                    return x*1760;
                case "Foot":
                    return x*5280;
                case "Inch":
                    return x*63360;
                case "Nautical mile":
                    return x*0.868976;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Yard"){
            switch(unit2){
                case "Kilometre":
                    return x*0.0009144;
                case "Meter":
                    return x*0.9144;
                case "Centimeter":
                    return x*91.44;
                case "Millimeter":
                    return x*914.4;
                case "Micrometres":
                    return x*914400;
                case "Nanometre":
                    return x*9.144e+8;
                case "Mile":
                    return x*0.000568182;
                case "Yard":
                    return x;
                case "Foot":
                    return x*3;
                case "Inch":
                    return x*36;
                case "Nautical mile":
                    return x*0.000493737;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Foot"){
            switch(unit2){
                case "Kilometre":
                    return x*0.0003048;
                case "Meter":
                    return x*0.3048;
                case "Centimeter":
                    return x*30.48;
                case "Millimeter":
                    return x*304.8;
                case "Micrometres":
                    return x*304800;
                case "Nanometre":
                    return x*3.048e+8;
                case "Mile":
                    return x*0.000189394;
                case "Yard":
                    return x*0.333333;
                case "Foot":
                    return x;
                case "Inch":
                    return x*12;
                case "Nautical mile":
                    return x*0.000164579;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Inch"){
            switch(unit2){
                case "Kilometre":
                    return x*2.54e-5;
                case "Meter":
                    return x*0.0254;
                case "Centimeter":
                    return x*2.54;
                case "Millimeter":
                    return x*25.4;
                case "Micrometres":
                    return x*25400;
                case "Nanometre":
                    return x*2.54e+7;
                case "Mile":
                    return x*1.5783e-5;
                case "Yard":
                    return x*0.0277778;
                case "Foot":
                    return x*0.0833333;
                case "Inch":
                    return x;
                case "Nautical mile":
                    return x*1.3715e-5;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Nautical mile"){
            switch(unit2){
                case "Kilometre":
                    return x*1.852;
                case "Meter":
                    return x*1852;
                case "Centimeter":
                    return x*185200;
                case "Millimeter":
                    return x*1.852e+6;
                case "Micrometres":
                    return x*1.852e+9;
                case "Nanometre":
                    return x*1.852e+12;
                case "Mile":
                    return x*1.15078;
                case "Yard":
                    return x*2025.37;
                case "Foot":
                    return x*6076.12;
                case "Inch":
                    return x*72913.4;
                case "Nautical mile":
                    return x;
                default:
                    return 0;      
            }
        }     
       
    }else if(convertTo=="Area"){
        
            if(unit1=="Square kilometre"){
            switch(unit2){
                case "Square Kilometre":
                    return x;
               case "Square meter":
                    return x* 1e+6;
                  case "Square mile":
                    return x*0.386102;   

                case "Square yard":
                    return x* 1.196e+6;
                case "Square foot":
                    return x*1.076e+7;

                case "Square inch":
                    return x* 1.55e+9;

                case "Hectare":
                    return x*100.00;
                     case "Acre":
                    return x*247.1052800007536;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Square meter"){
            switch(unit2){
                case "Square metre":
                    return x;
            
                case "Square Kilometre":
                    return x/1e+6;

                case " Square mile":
                    return x/2.59e+6;

                case "Square yard":
                    return x*1.196;
                case "Square foot":
                    return x*1.196;
                case "Square inch":
                    return x* 1550;
                case "Hectare":
                    return x/10000;

                case "Acre":
                    return x/4047;
                default:
                    return 0;
                    
                    
            }
        }
        if(unit1=="Square mile"){
            switch(unit2){
                case "Square mile":
                    return x;
            
                case "Square Kilometre":
                    return x*2.59;

                case "Square meter":
                    return x*2.59e+6;
                case "Square yard":
                    return x*3.098e+6;
                case "Square foot":
                    return x*2.788e+7;

                case "Square inch":
                    return x*4.014e+9;

                case "Hectare":
                    return x*259;
                case "Acre":
                    return x*640;
                default:
                    return 0;
                      
            }
        }
        if(unit1=="Square yard"){
            switch(unit2){
                case "Square Kilometre":
                    return x/1.196e+6;
                case "Square meter":
                    return x/ 1.196;
                case "Square mile":
                    return x/3.098e+6;
                case "Square yard":
                    return x;
                case "Square foot":
                    return x*9;
                case "Square inch":
                    return x* 1296;
                case "Hectare":
                    return x/11960;
                case "Acre":
                    return x/4840;
                default:
                    return 0;
            }
        }
     if(unit1=="Square foot"){
            switch(unit2){
                case "Square Kilometre":
                    return x/1.076e+7;
                case "Square meter":
                    return x/ 10.764;
                case "Square mile":
                    return x/2.788e+7;
                case "Square yard":
                    return x/9;
                case "Square foot":
                    return x;
                case "Square inch":
                    return x*144;
                case "Hectare":
                    return x/ 107639;
                case "Acre":
                    return x/43560;
                default:
                    return 0;
            }
     }
      if(unit1=="Square inch"){
            switch(unit2){
                case "Square Kilometre":
                    return x/1.55e+9;
                case "Square meter":
                    return x/1550;
                case "Square mile":
                    return x/4.014e+9;
                case "Square yard":
                    return x/1296;
                case "Square foot":
                    return x/144;
                case "Square inch":
                    return x;
                case "Hectare":
                    return x/ 1.55e+7;
                case "Acre":
                    return x/6.273e+6;
                default:
                    return 0;
            }
     }
      if(unit1=="Hectare"){
            switch(unit2){
                case "Square Kilometre":
                    return x/100;
                case "Square meter":
                    return x* 10000;
                case "Square mile":
                    return x/259;
                case "Square yard":
                    return x*11960;
                case "Square foot":
                    return x*107639;
                case "Square inch":
                    return x* 1.55e+7;
                case "Hectare":
                    return x;
                case "Acre":
                    return x* 2.471;
                default:
                    return 0;
            }
     }
     if(unit1=="Acre"){
            switch(unit2){
                case "Square Kilometre":
                    return x/257;
                case "Square meter":
                    return x*4047;
                case "Square mile":
                    return x/640;
                case "Square yard":
                    return x* 4840;
                case "Square foot":
                    return x*43560;
                case "Square inch":
                    return x*6.273e+6;
                case "Hectare":
                    return x/ 2.471;
                case "Acre":
                    return x;
                default:
                    return 0;
            }
     }  
    }else if(convertTo=="Weight"){
      if(unit1=="tonne"){
            switch(unit2){
                case "tonne":
                    return x;
                case "Kilogram":
                    return x*1000;
                case "Gram":
                    return x* 1e+6;
                case "Milligram":
                    return x*1e+9;
                case "Imperial ton":
                    return x/ 1.016;
                case "US ton":
                    return x* 1.102;
                case "Stone":
                    return x*157;
                case "Pound":
                    return x*2205;
                case "Ounce":
                    return x*35274;
                     default:
                    return 0;
                  
    }}
   if(unit1=="Kilogram"){
            switch(unit2){
                case "tonne":
                    return x/1000;
                case "Kilogram":
                    return x;
                case "Gram":
                    return x*1000;
                case "Milligram":
                    return x*1e+6;
                case "Imperial ton":
                    return x/1016;
                case "US ton":
                    return x/907;
                case "Stone":
                    return x/6.35;
                case "Pound":
                    return x*2.205;
                case "Ounce":
                    return x*35.274;
                     default:
                    return 0;
            }
   }
   
   if(unit1=="Gram"){
            switch(unit2){
                case "tonne":
                    return x*1.000003529996992029e-6;
                case "Kilogram":
                    return x/1000;
                case "Gram":
                    return x;
                case "Milligram":
                    return x*1000;
                case "Imperial ton":
                    return x*9.8421e-7;
                case "US ton":
                    return x*1.10231520208e-6;
                case "Stone":
                    return x*0.00015747360029714279283;
                case "Pound":
                    return x*0.0022046304041599992622;
                case "Ounce":
                    return x*0.035274086466559988196;
                     default:
                    return 0;
            }
   }
  if(unit1=="Milligram"){
            switch(unit2){
                case "tonne":
                    return x*1.000003529996992029e-9;
                case "Kilogram":
                    return x*1.000003529996992029e-6;
                case "Gram":
                    return x*0.0010000035299969919998;
                case "Milligram":
                    return x;
                case "Imperial ton":
                    return x*9.84210001857142749e-10;
                case "US ton":
                    return x*1.102315202079999722e-9;
                case "Stone":
                    return x*1.574736002971428134e-7;
                case "Pound":
                    return x*2.204630404159999228e-6;
                case "Ounce":
                    return x*3.527408646655998088e-5;
                     default:
                    return 0;
            }
   }      
  if(unit1=="Imperial ton"){
            switch(unit2){
                case "tonne":
                    return x*1.1016;
                case "Kilogram":
                    return x*1016;
                case "Gram":
                    return x* 1.016e+6;
                case "Milligram":
                    return x*1.016e+9;
                case "Imperial ton":
                    return x;
                case "US ton":
                    return x*1.12;
                case "Stone":
                    return x*160;
                case "Pound":
                    return x*2240;
                case "Ounce":
                    return x*35840;
                     default:
                    return 0;
            }
   }   
   if(unit1=="US ton"){
            switch(unit2){
                case "tonne":
                    return x*0.90718794235940325432;
                case "Kilogram":
                    return x*907;
                case "Gram":
                    return x*907185;
                case "Milligram":
                    return x*9.072e+8;
                case "Imperial ton":
                    return x*0.89286029464017124813;
                case "US ton":
                    return x;
                case "Stone":
                    return x*143;
                case "Pound":
                    return x*2000;
                case "Ounce":
                    return x*32000;
                     default:
                    return 0;
            }
   }   
   if(unit1=="Stone"){
            switch(unit2){
                case "tonne":
                    return x*0.0063503155965158224541;
                case "Kilogram":
                    return x*6.35;
                case "Gram":
                    return x*6350;
                case "Milligram":
                    return x*6.35e+6;
                case "Imperial ton":
                    return x*0.0062500220624811990769;
                case "US ton":
                    return x*0.0070000247099789424804;
                case "Stone":
                    return x;
                case "Pound":
                    return x*14;
                case "Ounce":
                    return x*224;
                     default:
                    return 0;
            }
   }   
   if(unit1=="Pound"){
            switch(unit2){
                case "tonne":
                    return x*0.00045359397117970161935;
                case "Kilogram":
                    return x*0.45359397117970162716;
                case "Gram":
                    return x*454;
                case "Milligram":
                    return x*453592;
                case "Imperial ton":
                    return x*0.00044643014732008564835;
                case "US ton":
                    return x*0.00050000176499849589146;
                case "Stone":
                    return x*0.071428823571213703736;
                case "Pound":
                    return x;
                case "Ounce":
                    return x*16;
                     default:
                    return 0;
                  
            }
   }   
  
   if(unit1=="Ounce"){
   }
            switch(unit2){
                case "tonne":
                    return x*2.834962319873135121e-5;
                case "Kilogram":
                    return x*0.028349623198731351698;
                case "Gram":
                    return x*28.349623198731350726;
                case "Milligram":
                    return x*2835;
                case "Imperial ton":
                    return x*2.7902e-5;
                case "US ton":
                    return x*3.125024e-5;
                case "Stone":
                    return x*0.00446432;
                case "Pound":
                    return x*0.06250048;
                case "Ounce":
                    return x;
                     default:
                    return 0;
            }         
    }
 else if(convertTo=="Volume"){

            if(unit1=="US liquid gallon"){
            switch(unit2){
                case "US liquid gallon":
                    return x;
               case "US liquid quart":
                    return x*4;
                  case "US liquid pint":
                    return x*8;
                case "US legal cup":
                    return x*15.7725;
                case "US tablespoon":
                    return x*256;
                case "US teaspoon":
                    return x* 768;
                     case "Cubic meter":
                    return x*0.0037854000000131;
                 case "Liter":
                    return x* 3.785;
                case "Milliliter":
                    return x*3785;

                case "imperial gallon":
                    return x*0.83267159251424849309;

                case "imperial quart":
                    return x*3.331;
                     case "imperial pint":
                    return x*6.661;
                case "imperial cup":
                    return x*13.323;
                 case "fluid ounce":
                    return x* 128;
                case "imperial tablespoon":
                    return x*213;
                case "imperial teaspoon":
                    return x* 639;
                     case "Cubic foot":
                    return x*0.13368013940798553763;
                    case "Cubic inch":
                    return x*231;
                  default:
                    return 0;
}
}
             if(unit1=="US liquid quart"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.25;
               case "US liquid quart":
                    return x;
                  case "US liquid pint":
                    return x*2;
                case "US legal cup":
                    return x* 3.943;
                case "US tablespoon":
                    return x*64;
                case "US teaspoon":
                    return x*192;
                     case "Cubic meter":
                    return x*0.000946353;
                 case "Liter":
                    return x*0.94635300000003475;
                case "Milliliter":
                    return x*946;
                case "imperial gallon":
                    return x*0.20816855803559425331;
                case "imperial quart":
                    return x*0.83267423214237701323;
                     case "imperial pint":
                    return x*1.665;
                case "imperial cup":
                    return x*3.331;
                 case "fluid ounce":
                    return x*33.307;
                case "imperial tablespoon":
                    return x*53.291;
                case "imperial teaspoon":
                    return x*160;
                     case "Cubic foot":
                    return x*0.033420140795882118112;
                    case "Cubic inch":
                    return x* 57.75;
                  default:
                      return 0;
            }
             }
              if(unit1=="US liquid pint"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.12500000713264999841;
               case "US liquid quart":
                    return x*0.50000002853059999364;
                  case "US liquid pint":
                    return x;
                case "US legal cup":
                    return x*1.972;
                case "US tablespoon":
                    return x*32;
                case "US teaspoon":
                    return x*96;
                     case "Cubic meter":
                    return x*0.0004731765000000173662;
                 case "Liter":
                    return x*0.47317650000001737487;
                case "Milliliter":
                    return x*473;
                case "imperial gallon":
                    return x*0.10408427901779712665;
                case "imperial quart":
                    return x*0.41633711607118850662;
                     case "imperial pint":
                    return x*0.83267423214237701323;
                case "imperial cup":
                    return x* 1.665;
                 case "fluid ounce":
                    return x* 16.653;
                case "imperial tablespoon":
                    return x*26.646;
                case "imperial teaspoon":
                    return x*79.937;
                     case "Cubic foot":
                    return x*0.016710070397941059056;
                    case "Cubic inch":
                    return x*28.875;
                  default:
                      return 0;
            }
             }
                if(unit1=="US legal cup"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.063401296183709446308;
               case "US liquid quart":
                    return x*0.25360518473483772972;
                  case "US liquid pint":
                    return x*0.50721036946967534842;
                case "US legal cup":
                    return x;
                case "US tablespoon":
                    return x*16.231;
                case "US teaspoon":
                    return x*48.692;
                     case "Cubic meter":
                    return x*0.00024000001369468783232;
                 case "Liter":
                    return x*0.24000001369468781931;
                case "Milliliter":
                    return x*240;
                case "imperial gallon":
                    return x*0.052792622604191256908;
                case "imperial quart":
                    return x*0.21117049041676502763;
                     case "imperial pint":
                    return x*0.42234098083353005526;
                case "imperial cup":
                    return x*0.8446820359886891838;
                 case "fluid ounce":
                    return x* 8.447;
                case "imperial tablespoon":
                    return x* 13.515;
                case "imperial teaspoon":
                    return x*40.545;
                     case "Cubic foot":
                    return x*0.0084755204967805978372;
                    case "Cubic inch":
                    return x*14.646;
                  default:
                      return 0;
            }
             }
                 if(unit1=="US tablespoon"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.0039062502228953098482;
               case "US liquid quart":
                    return x*0.015625000891581239393;
                  case "US liquid pint":
                    return x*0.031250001783162478786;
                case "US legal cup":
                    return x*0.061611523437502216383;
                case "US tablespoon":
                    return x*16.231;
                case "US teaspoon":
                    return x* 48.692;
                     case "Cubic meter":
                    return x*0.00024000001369468783232;
                 case "Liter":
                    return x*0.24000001369468781931;
                case "Milliliter":
                    return x*240;
                case "imperial gallon":
                    return x*0.052792622604191256908;
                case "imperial quart":
                    return x*0.21117049041676502763;
                     case "imperial pint":
                    return x*0.42234098083353005526;
                case "imperial cup":
                    return x*0.8446820359886891838;
                 case "fluid ounce":
                    return x* 8.115;
                case "imperial tablespoon":
                    return x* 13.515;
                case "imperial teaspoon":
                    return x*40.545;
                     case "Cubic foot":
                    return x*0.0084755204967805978372;
                    case "Cubic inch":
                    return x*14.646;
                  default:
                      return 0;
            }
             }
              if(unit1=="US teaspoon"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.001302082986607537617;
               case "US liquid quart":
                    return x*0.0052083319464301504678;
                  case "US liquid pint":
                    return x*0.010416663892860300936;
                case "US legal cup":
                    return x*0.020537167838542029485;
                case "US tablespoon":
                    return x*0.33333324457152962994;
                case "US teaspoon":
                    return x*3;
                     case "Cubic meter":
                    return x*1.478676562500053253e-5;
                 case "Liter":
                    return x*0.014786765625000532556;
                case "Milliliter":
                    return x*14.787;
                case "imperial gallon":
                    return x*0.0032526337193061580395;
                case "imperial quart":
                    return x*0.013010534877224632158;
                     case "imperial pint":
                    return x*0.026021069754449264316;
                case "imperial cup":
                    return x*0.052042144087967055766;
                 case "fluid ounce":
                    return x*0.50000002853059966057;
                case "imperial tablespoon":
                    return x*0.83267388808965614455;
                case "imperial teaspoon":
                    return x* 2.498;
                     case "Cubic foot":
                    return x*0.00052218969993565777024;
                    case "Cubic inch":
                    return x*0.90234380148881665473;
                  default:
                      return 0;
            }
             }
              if(unit1=="Cubic meter"){
            switch(unit2){
                case "US liquid gallon":
                    return x*264;
               case "US liquid quart":
                    return x*1057;
                  case "US liquid pint":
                    return x*2113;
                case "US legal cup":
                    return x*4167;
                case "US tablespoon":
                    return x*67628;
                case "US teaspoon":
                    return x*202884;
                     case "Cubic meter":
                    return x;
                 case "Liter":
                    return x*1000;
                case "Milliliter":
                    return x*1e+6;
                case "imperial gallon":
                    return x*220;
                case "imperial quart":
                    return x*880;
                     case "imperial pint":
                    return x*1760;
                case "imperial cup":
                    return x*3520;
                 case "fluid ounce":
                    return x*35195;
                case "imperial tablespoon":
                    return x*56312;
                case "imperial teaspoon":
                    return x* 168936;
                     case "Cubic foot":
                    return x*35.315;
                    case "Cubic inch":
                    return x*61024;
                  default:
                      return 0;
            }
             }
                 if(unit1=="Liter"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.26417206743212251485;
               case "US liquid quart":
                    return x*1.057;
                  case "US liquid pint":
                    return x*2.113;
                case "US legal cup":
                    return x*4.167;
                case "US tablespoon":
                    return x*67.628;
                case "US teaspoon":
                    return x*203;
                     case "Cubic meter":
                    return x*0.0010000000570611993194;
                 case "Liter":
                    return x;
                case "Milliliter":
                    return x*1000;
                case "imperial gallon":
                    return x*0.21996926085079690494;
                case "imperial quart":
                    return x*0.87987704340318761975;
                     case "imperial pint":
                    return x*1.76;
                case "imperial cup":
                    return x* 3.52;
                 case "fluid ounce":
                    return x* 35.195;
                case "imperial tablespoon":
                    return x*56.312;
                case "imperial teaspoon":
                    return x*169;
                     case "Cubic foot":
                    return x*0.035314668736585827502;
                    case "Cubic inch":
                    return x*61.024;
                  default:
                      return 0;
            }
             }
                  if(unit1=="Milliliter"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.00026417206743212251225;
               case "US liquid quart":
                    return x*0.001056688269728490049;
                  case "US liquid pint":
                    return x*0.002113376539456980098;
                case "US legal cup":
                    return x*0.0041666669044216637224;
                case "US tablespoon":
                    return x*0.067628049262623363136;
                case "US teaspoon":
                    return x*0.20288421338978909758;
                     case "Cubic meter":
                    return x*1.000000057061199245e-6;
                 case "Liter":
                    return x*0.0010000000570611993194;
                case "Milliliter":
                    return x;
                case "imperial gallon":
                    return x*0.00021996926085079688933;
                case "imperial quart":
                    return x*0.0008798770434031875573;
                     case "imperial pint":
                    return x*0.0017597540868063751146;
                case "imperial cup":
                    return x*0.0035195084832862046434;
                 case "fluid ounce":
                    return x* 0.033814024631311681568;
                case "imperial tablespoon":
                    return x*0.05631210751019101457;
                case "imperial teaspoon":
                    return x*0.16893632252105988956;
                     case "Cubic foot":
                    return x*3.531466873658582251e-5;
                    case "Cubic inch":
                    return x*0.061023747576820309979;
                  default:
                      return 0;
            }
             } 
              if(unit1=="imperial gallon"){
            switch(unit2){
                case "US liquid gallon":
                    return x* 1.201;
               case "US liquid quart":
                    return x*4.804;
                  case "US liquid pint":
                    return x*9.6075999522599850877;
                case "US legal cup":
                    return x*18.942;
                case "US tablespoon":
                    return x*307;
                case "US teaspoon":
                    return x*922;
                     case "Cubic meter":
                    return x*0.0045460902594053479234;
                 case "Liter":
                    return x* 4.546;
                case "Milliliter":
                    return x*4546;
                case "imperial gallon":
                    return x;
                case "imperial quart":
                    return x*4;
                     case "imperial pint":
                    return x*8;
                case "imperial cup":
                    return x*16;
                 case "fluid ounce":
                    return x*154;
                case "imperial tablespoon":
                    return x*256;
                case "imperial teaspoon":
                    return x*768;
                     case "Cubic foot":
                    return x*0.16054366239670547767;
                    case "Cubic inch":
                    return x*277;
                  default:
                      return 0;
            }
             } 
                if(unit1=="imperial quart"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.30023749850812453399;
               case "US liquid quart":
                    return x*1.201;
                  case "US liquid pint":
                    return x* 2.402;
                case "US legal cup":
                    return x*4.736;
                case "US tablespoon":
                    return x*76.861;
                case "US teaspoon":
                    return x*231;
                     case "Cubic meter":
                    return x*0.0011365225648513369808;
                 case "Liter":
                    return x*1.137;
                case "Milliliter":
                    return x*1137;
                case "imperial gallon":
                    return x*0.25000001426529983029;
                case "imperial quart":
                    return x;
                     case "imperial pint":
                    return x*2;
                case "imperial cup":
                    return x*4;
                 case "fluid ounce":
                    return x*40;
                case "imperial tablespoon":
                    return x*64;
                case "imperial teaspoon":
                    return x*192;
                     case "Cubic foot":
                    return x*0.040135915599176369417;
                    case "Cubic inch":
                    return x*69.355;
                  default:
                      return 0;
            }
             } 
              if(unit1=="imperial pint"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.150118749254062267;
               case "US liquid quart":
                    return x*0.60047499701624906798;
                  case "US liquid pint":
                    return x*1.201;
                case "US legal cup":
                    return x*2.368;
                case "US tablespoon":
                    return x*38.43;
                case "US teaspoon":
                    return x*115;
                     case "Cubic meter":
                    return x*0.00056826128242566849042;
                 case "Liter":
                    return x*0.56826128242566842363;
                case "Milliliter":
                    return x*568;
                case "imperial gallon":
                    return x*0.12500000713264988739;
                case "imperial quart":
                    return x*0.50000002853059954955;
                     case "imperial pint":
                    return x;
                case "imperial cup":
                    return x*2;
                 case "fluid ounce":
                    return x*20;
                case "imperial tablespoon":
                    return x*32;
                case "imperial teaspoon":
                    return x*96;
                     case "Cubic foot":
                    return x*0.020067957799588181239;
                    case "Cubic inch":
                    return x*34.677;
                  default:
                      return 0;
            }
             } 
               if(unit1=="imperial cup"){
            switch(unit2){
                case "US liquid gallon":
                    return x*0.075059368022729416881;
               case "US liquid quart":
                    return x*0.30023747209091766752;
                  case "US liquid pint":
                    return x*0.60047494418183533504;
                case "US legal cup":
                    return x*1.184;
                case "US tablespoon":
                    return x* 19.215;
                case "US teaspoon":
                    return x*57.646;
                     case "Cubic meter":
                    return x*0.0002841306162128327188;
                 case "Liter":
                    return x*0.0002841306162128327188;
                case "Milliliter":
                    return x*284;
                case "imperial gallon":
                    return x*6.249999806709340773e-5;
                case "imperial quart":
                    return x*0.00024999999226837363092;
                     case "imperial pint":
                    return x*0.00049999998453674726184;
                case "imperial cup":
                    return x;
                 case "fluid ounce":
                    return x*10;
                case "imperial tablespoon":
                    return x*16;
                case "imperial teaspoon":
                    return x*48;
                     case "Cubic foot":
                    return x*1.003397801692736795e-5;
                    case "Cubic inch":
                    return x*17.339;
                  default:
                      return 0;
            }
             } 
             if(unit1=="fluid ounce"){
            switch(unit2){
                case "US liquid gallon":
                    return x*7.812500445790614601e-6;
               case "US liquid quart":
                    return x*3.12500017831624584e-5;
                  case "US liquid pint":
                    return x*6.250000356632491681e-5;
                case "US legal cup":
                    return x*6.250000356632491681e-5;
                case "US tablespoon":
                    return x*2;
                case "US teaspoon":
                    return x*6;
                     case "Cubic meter":
                    return x*1.500000085591798073e-8;
                 case "Liter":
                    return x*1.500000085591798105e-5;
                case "Milliliter":
                    return x*29.574;
                case "imperial gallon":
                    return x*3.299538912761951493e-6;
                case "imperial quart":
                    return x*1.319815565104780597e-5;
                     case "imperial pint":
                    return x*2.639631130209561195e-5;
                case "imperial cup":
                    return x*5.279262724929303875e-5;
                 case "fluid ounce":
                    return x;
                case "imperial tablespoon":
                    return x*1.665;
                case "imperial teaspoon":
                    return x*5;
                     case "Cubic foot":
                    return x*5.297200310487871006e-7;
                    case "Cubic inch":
                    return x* 1.805;
                  default:
                      return 0;
            }
             }                 
           if(unit1=="imperial tablespoon"){
            switch(unit2){
                case "US liquid gallon":
                    return x*2.379431668430557575e-6;
               case "US liquid quart":
                    return x*9.517726673722230301e-6;
                  case "US liquid pint":
                    return x*1.90354533474444606e-5;
                case "US legal cup":
                    return x*3.752970282041589198e-5;
                case "US tablespoon":
                    return x* 1.201;
                case "US teaspoon":
                    return x*3.603;
                     case "Cubic meter":
                    return x*9.007128676899813929e-9;
                 case "Liter":
                    return x*9.007128676899814074e-6;
                case "Milliliter":
                    return x* 17.758;
                case "imperial gallon":
                    return x*1.981291324390809422e-6;
                case "imperial quart":
                    return x*7.925165297563237688e-6;
                     case "imperial pint":
                    return x*1.585033059512647538e-5;
                case "imperial cup":
                    return x*3.170066397952144141e-5;
                 case "fluid ounce":
                    return x*0.00031700661190252945329;
                case "imperial tablespoon":
                    return x;
                case "imperial teaspoon":
                    return x*3;
                     case "Cubic foot":
                    return x*1595;
                    case "Cubic inch":
                    return x*1.084;
                  default:
                      return 0;
            }
             }         
            if(unit1=="imperial teaspoon"){
            switch(unit2){
                case "US liquid gallon":
                    return x*7.931438895215161136e-7;
               case "US liquid quart":
                    return x*3.172575558086064454e-6;
                  case "US liquid pint":
                    return x*6.345151116172128909e-6;
                case "US legal cup":
                    return x*1.25099009408430882e-5;
                case "US tablespoon":
                    return x*0.00020304483571750812508;
                case "US teaspoon":
                    return x* 1.201;
                     case "Cubic meter":
                    return x*3.002376225802341374e-9;
                 case "Liter":
                    return x*3.002376225802340828e-6;
                case "Milliliter":
                    return x*5.919;
                case "imperial gallon":
                    return x*6.604304415007931457e-7;
                case "imperial quart":
                    return x*2.641721766003172159e-6;
                     case "imperial pint":
                    return x*5.283443532006344318e-6;
                case "imperial cup":
                    return x*1.056688799376885219e-5;
                 case "fluid ounce":
                    return x*0.00010566887064012687959;
                case "imperial tablespoon":
                    return x*0.00016907012316607893132;
                case "imperial teaspoon":
                    return x;
                     case "Cubic foot":
                    return x*1.060279157867304062e-7;
                    case "Cubic inch":
                    return x*0.00018321623847947015543;
                  default:
                      return 0;
            }
             }      
             if(unit1=="Cubic foot"){
            switch(unit2){
                case "US liquid gallon":
                    return x*7.481;
               case "US liquid quart":
                    return x*30;
                  case "US liquid pint":
                    return x*59.844;
                case "US legal cup":
                    return x*118;
                case "US tablespoon":
                    return x*1915;
                case "US teaspoon":
                    return x*5745;
                     case "Cubic meter":
                    return x*1.436259822214441916e-5;
                 case "Liter":
                    return x*28.317;
                case "Milliliter":
                    return x*28317;
                case "imperial gallon":
                    return x*6.229;
                case "imperial quart":
                    return x*25;
                     case "imperial pint":
                    return x*49.831;
                case "imperial cup":
                    return x*99.661;
                 case "fluid ounce":
                    return x*997;
                case "imperial tablespoon":
                    return x*1595;
                case "imperial teaspoon":
                    return x*4784;
                     case "Cubic foot":
                    return x;
                    case "Cubic inch":
                    return x*1728;
                  default:
                      return 0;
            }
             }    
              if(unit1=="Cubic inch"){
            switch(unit2){
                case "US liquid gallon":
                    return x*2.19571588515010644e-6;
               case "US liquid quart":
                    return x*8.782863540600425759e-6;
                  case "US liquid pint":
                    return x*1.756572708120085152e-5;
                case "US legal cup":
                    return x*3.463203660818001188e-5;
                case "US tablespoon":
                    return x*1.108;
                case "US teaspoon":
                    return x*3.325;
                     case "Cubic meter":
                    return x*8.311688785963203571e-9;
                 case "Liter":
                    return x*8.311688785963204206e-6;
                case "Milliliter":
                    return x*16.387;
                case "imperial gallon":
                    return x*1.828315934344283447e-6;
                case "imperial quart":
                    return x*7.313263737377133788e-6;
                     case "imperial pint":
                    return x*1.462652747475426758e-5;
                case "imperial cup":
                    return x*2.925305752341776395e-5;
                 case "fluid ounce":
                    return x*0.0002925305494950853312;
                case "imperial tablespoon":
                    return x*0.0004680486857989896339;
                case "imperial teaspoon":
                    return x* 2.768;
                     case "Cubic foot":
                    return x*2.935245193690246522e-7;
                    case "Cubic inch":
                    return x;
                  default:
                      return 0;
            }
             }           
  }else if(convertTo=="Time"){              
           
                if(unit1=="year"){
            switch(unit2){
                case "year":
                    return x;
               case "month":
                    return x*12;
                  case "week":
                    return x*52.1429;
                case "day":
                    return x*365.00030003;
                case "hour":
                    return x* 8760;
                case "minute":
                    return x*525600;
                     case "second":
                    return x*3.154e+7;
                  default:
                      return 0;
            }
                }
               if(unit1=="month"){
            switch(unit2){
                case "year":
                    return x*0.083333493157609;
               case "month":
                    return x;
                  case "week":
                    return x*4.3452464289324694846;
                case "day":
                    return x*30.417;
                case "hour":
                    return x*730;
                case "minute":
                    return x*43800;
                     case "second":
                    return x*2.628e+6;
                  default:
                      return 0;
            }
                }
                   if(unit1=="week"){
            switch(unit2){
                case "year":
                    return x*0.01917809795616431251;
               case "month":
                    return x*0.23013692326912432717;
                  case "week":
                    return x;
                case "day":
                    return x*7;
                case "hour":
                    return x*168;
                case "minute":
                    return x*10080;
                     case "second":
                    return x*604800;
                  default:
                      return 0;
            }
                }
              if(unit1=="day"){
            switch(unit2){
                case "year":
                    return x*0.0027397282794520442725;
               case "month":
                    return x*0.032876703324160615194;
                  case "week":
                    return x*0.14285726028571371637;
                case "day":
                    return x;
                case "hour":
                    return x*24;
                case "minute":
                    return x*1440.0011836799942557;
                     case "second":
                    return x*86400;
                  default:
                      return 0;
            }
                }
              if(unit1=="hour"){
            switch(unit2){
                case "year":
                    return x*0.00011415534497716850232;
               case "month":
                    return x*0.0013698626385066922997;
                  case "week":
                    return x*0.005952385845238072383;
                case "day":
                    return x*0.041666700916666507548;
                case "hour":
                    return x;
                case "minute":
                    return x*60;
                     case "second":
                    return x*3600;
                  default:
                      return 0;
            }
                }
              if(unit1=="minute"){
            switch(unit2){
                case "year":
                    return x*1.902589082952808725e-6;
               case "month":
                    return x*2.283104397511154194e-5;
                  case "week":
                    return x*9.920643075396785317e-5;
                case "day":
                    return x*0.00069444501527777505352;
                case "hour":
                    return x*0.01666668036666659955;
                case "minute":
                    return x;
                     case "second":
                    return x*60;
                  default:
                      return 0;
            }
                }
             if(unit1=="second"){
            switch(unit2){
                case "year":
                    return x*3.170981804921347345e-8;
               case "month":
                    return x*3.805173995851922034e-7;
                  case "week":
                    return x*1.653440512566130689e-6;
                case "day":
                    return x*1.15740835879629144e-5;
                case "hour":
                    return x*0.0002777780061111098913;
                case "minute":
                    return x*0.016666680366666592611;
                     case "second":
                    return x;
                  default:
                      return 0;
            }
                }
    }else if(convertTo=="Speed"){
        if(unit1=="miles per hour"){
            switch(unit2){
                case "miles per hour":
                    return x;
                case "foot per second":
                    return x* 1.467;
                case "meter per second":
                    return x*0.44704;
                case "kilometer per hour":
                    return x* 1.609;
                case "knot":
                    return x*0.868976;
               
                default:
                    return 0;
                    
                    
            }
        }
         if(unit1=="foot per second"){
            switch(unit2){
                case "miles per hour":
                    return x*0.6818179914272727;
                case "foot per second":
                    return x;
                case "meter per second":
                    return x* 0.30479991488764801577;
                case "kilometer per hour":
                    return x*1.097;
                case "knot":
                    return x*0.59248363636258460918;
               
                default:
                    return 0;      
            }
        }
          if(unit1=="meter per second"){
            switch(unit2){
                case "miles per hour":
                    return x*2.237;
                case "foot per second":
                    return x*3.281;
                case "meter per second":
                    return x;
                case "kilometer per hour":
                    return x*3.6;
                case "knot":
                    return x*1.944;
               
                default:
                    return 0;      
            }
        }
          if(unit1=="kilometer per hour"){
            switch(unit2){
                case "miles per hour":
                    return x*0.62137101872569200367;
                case "foot per second":
                    return x*0.91134416079768154617;
                case "meter per second":
                    return x*0.27777770021113334931;
                case "kilometer per hour":
                    return x;
                case "knot":
                    return x*0.53995665314471419372;
               
                default:
                    return 0;      
            }
        }
         if(unit1=="knot"){
            switch(unit2){
                case "miles per hour":
                    return x*1.151;
                case "foot per second":
                    return x* 1.688;
                case "meter per second":
                    return x*0.51444430034653354511;
                case "kilometer per hour":
                    return x*1.852;
                case "knot":
                    return x;
               
                default:
                    return 0;      
            }
         }
        
    }else if(convertTo=="Temperature"){
         if(unit1=="Celsius"){
            switch(unit2){
                case "Celsius":
                    return x;
                case "Fahrenheit":
                    return (9*x+32)/5;
                case "Kelvin":
                    return (x+273);
               
                default:
                    return 0;      
            }
         }
         if(unit1=="Fahrenheit"){
            switch(unit2){
                case "Celsius":
                    return 5*(x-32)/9;
                case "Fahrenheit":
                    return x;
                case "Kelvin":
                    return (5*(x-32)/9)+273;
                default:
                    return 0;      
            }
         }
         if(unit1=="kelvin"){
            switch(unit2){
                case "Celsius":
                    return (x-273);
                case "Fahrenheit":
                    return (9*(x-273)/5)+32;
                case "Kelvin":
                    return x;
                default:
                    return 0;      
            }
         }
        
    }else if(convertTo=="Currency"){
        
    }
    return 0;
}
}
