fun main(args: Array<String>) {

// 01 - Mathematical Methods
    /* write a program to calc ellipse area:
        (algorithm)
        1- set: PI = 22/7 ||
        2- prompt x , y ||
        3- calculate: area=  PI * X* Y  then per = 2 * PI * SQRT (1/2*(pow(x,2)+pow(y,2)) ) ||
        4- Display area , Per
     */
    //Declaration
    var x: Double;
    var y: Double;
    var area: Double;
    var per: Double;

    //inputs
    print("Enter value of x")
    x = readln()!!.toDouble()
    print("Enter value of y")
    y = readln()!!.toDouble()

    //Operations / Equations
    area = Math.PI * x * y;
    per = 2 * Math.PI * Math.sqrt(0.5 * (Math.pow(x, 2.0)) + Math.pow(y, 2.0))

    //Outputs
    println("Area of Ellips $area")
    println("Per of Ellips $per")
----------------------------------------------------------------------------------------------------------------------
// 02 - Conditional Branching
    /* Design a program in which the user will use the motor capacity of car (CC), then the program prints the due tax ()
        According to several measures that do not need to be listed here.
     */
    //Declaration
    var mcc: Int;
    var tax: Int;

    //inputs
    print("Enter Motor CC: ")
    mcc = readln()!!.toInt()

    //operations

    tax = when (mcc) {
        in 0..1099 -> 30
        in 1100..1500 -> 50
        in 1501..1800 -> 80
        in 1801..2000 -> 120
        else -> 160

    }
    println("TAX = $tax")
//----------------------------------------------------------------------------------------------------------------------
//03  Looping
//      write a program to summation all Revenues of Branches

    var sum = 0.0f;
    var input: Float;

    do {
        print("Enter Value or -1 to Exit: ")
        input = readln()!!.toFloat();
        if (input == -1.0f)
            break;
        sum += input
    } while (true)
    println(
        "Summation = $sum"
    )
//----------------------------------------------------------------------------------------------------------------------

 Salary Task

    var baseSlary = 50000.0;
    var taxPercent = 0.2;

    if (baseSlary >= 30000) {
        taxPercent = 0.5
    }
    var hours = 20
    var incentive = 700.0;

    if (hours >= 15) {
        incentive += 500
    }
    println("Salary_Details\n----------------")

    print("Your Salary After incenives and Taxaion is Equal: ${baseSlary - (baseSlary * taxPercent) + incentive} \n \n Target_Details :- \n \n  ")

//02.02 Target task

    var RevenueOfMonths = 20000.0
    var targetPercent = 0.05
    var salesTargets = RevenueOfMonths

    for (months in 1..12) {
        println("Month " + months + ": " + salesTargets.toInt())
        salesTargets = RevenueOfMonths + (RevenueOfMonths * targetPercent)
        RevenueOfMonths = salesTargets
    }

}

