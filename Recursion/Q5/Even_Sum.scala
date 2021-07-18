object Even_Sum{

    def main (args: Array[String])
    {
        print(evensum(10))
    }

    def iseven(n:Int): Boolean = n%2 match {
        case 0 => true
        case 1 => false
    }

    def evensum(n:Int):Int =n match{
        case x if x<2 => 0
        case x if(iseven(n)==true)=> n+evensum(n-1)
        case _ => evensum(n-1)
    }

}