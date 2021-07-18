object Even_Odd {

    def main (args: Array[String])
    {
       find_even_or_odd (10)
       find_even_or_odd (9)
    }

    def find_even_or_odd (n:Int): Unit = {
        if(n==0) println("even")
        else if(n==1) println("odd")
        else find_even_or_odd (n-2)
    }

}