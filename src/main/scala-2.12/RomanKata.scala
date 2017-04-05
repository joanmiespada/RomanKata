package RomanKata;
/**
  * Created by joanmi on 29/3/17.
  */


class RomanKata {


  val table =  List ( Map('0'->"", '1'->"I",'2'->"II",'3'->"III",'4'->"IV", '5'->"V", '6'->"VI", '7'->"VII", '8'->"VIII", '9'->"IX"), //units
                  Map('0'->"", '1'->"X",'2'->"XX",'3'->"XXX",'4'->"IL", '5'->"L", '6'->"LX", '7'->"LXX", '8'->"LXXX", '9'->"XC"), //decens
                  Map('0'->"", '1'->"C",'2'->"CC",'3'->"CCC",'4'->"CD", '5'->"D", '6'->"DC", '7'->"DCC", '8'->"DCCC", '9'->"CM")  //centens
                  )


  def roman(number: String): String = {

    var res:String=""
    var pos:Int=0
    val numberArray = number.toArray.reverse
    numberArray.map( c => { res += table(pos)(c); pos+=1 })

    return res
  }


}
