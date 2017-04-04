package RomanKata;
/**
  * Created by joanmi on 29/3/17.
  */
class RomanKata {

  private def simpleEval(value:Char): String = value match
  {
    case '1' => "I"
    case '2' => "II"
    case '3' => "III"
    case '5' => "V"
    case _ => throw new Exception("number not correctly")

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
