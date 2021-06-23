import com.sun.tools.attach.VirtualMachine.list
import java.sql.Array

fun main ()
{
    var i = numJewelsInStones("zZ","asdzzZS")
    println(i.toString());

    var k = judgeCircle("DDUULLRR")
    println(k.toString())

    var data = arrayListOf<String>("fdsfaaaa...dsfd@ukr.net","fdbbb+sfsd+f...sfd@ukr.net","fdbbb+sfsd+f...sfd@ukr.net","fdbbbsfd@ukr.net")
    var l = numUniqueEmails(data);
    println(l.toString())
}

fun numJewelsInStones(jewels: String, stones: String): Int {

    var im = 0;

   for (i in 1..jewels.length)
    {
       for (k in 1..stones.length)
       {
         if (stones[k-1] == jewels[i-1]) im++
       }
    }

  return im;
}

fun judgeCircle(moves: String): Boolean {
    var res2 = false;
    var l = 0
    var m = 0

    for (i in 1..moves.length)
    {
      when (moves[i-1])
      {
          'R' -> m++
          'L' -> m--
          'U' -> l++
          'D' -> l--
      }
    }

    if ( l + m == 0 )
        res2 = true
    else
        res2 = false

 return res2;
}

fun numUniqueEmails(emails: ArrayList<String>): Int {
    var  list: MutableList<String> = emails.toMutableList()
    var list1: MutableSet <String> = emails.toMutableSet()
    list1.clear()
    var res = 123
    var temp2 = "123"

          list.forEach{

              temp2 = it.substringBefore("+") + it.substringAfterLast("@")
              temp2 = temp2.replace(".","")
              temp2 = temp2.replace("@","")

              list1.add(temp2)
          }

       res = list1.size
    return res
}