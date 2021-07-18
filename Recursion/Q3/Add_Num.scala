object Add_Num{

    def main (args: Array[String])
    {
        print(addnum(10))
    }

    def addnum (a:Int): Int= 
        if (a==1) a
        else a + addnum(a-1)

}