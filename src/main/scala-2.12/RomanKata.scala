package RomanKata;
/**
  * Created by joanmi on 29/3/17.
  */
class RomanKata {

  private def simpleEval(valu:Char): String ={

    if(valu == '1') return "I"
    else if(valu =='2') return "II"
    else if(valu =='3') return "III"
    else if(valu =='5') return "V"
    //else if(valu =='10') return "V"
    else
      throw  new Exception("number not correctly")

  }

  def roman(number: String): String = {

    var res:String=""

    for(c <- number)
      {
        res = simpleEval(c);
      }
    return res;
  }


}
