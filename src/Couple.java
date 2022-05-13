public class Couple
{

    private Person[] p1,p2;
    private int total;

    //--------------------------------------------------------------------------------------
    public Couple()
    {
        int MAX = 5;
        p1  = new Person[MAX];
        p2 = new Person[MAX];
        total = 0;
    }
//--------------------------------------------------------------------------------------
    public void addData(String name1, int age1, String name2, int age2)
    {
        p1[total] = new Person();
        p2[total] = new Person();
        setData1(p1[total],name1,age1);
        setData1(p2[total],name2,age2);
        total++;
    }
    private void setData1(Person p, String name, int age)
    {
            p.setName(name);
            p.setAge(age);
    }
//--------------------------------------------------------------------------------------    
    public String test(int current)
    {
       if (current!=-1)
       {
        if (p1[current].getAge() < p2[current].getAge()) return("GOOD FOR "+p2[current].getName()+"!");
        else                                              return("GOOD FOR "+p1[current].getName()+"!");
       }
       return "error";
   }
    public String display(int current)
    {
        return("p1: "+p1[current].getName()+","+p1[current].getAge()+"\np2:"+p2[current].getName()+","+p2[current].getAge());
    }


    public double maleAverage() {
        double maleAverage = 0; // initializes maleAverage
        for(int i=0;i<total;i++){ // loops for the number of couples created
            maleAverage += p2[i].getAge(); // adds each age to the maleAverage var
        }
        maleAverage /= total; // divides maleAverage by the number of couples to get the average age of males
        return maleAverage; // returns var
    }


    public double femaleAverage() { // the same as maleAverage
        double femaleAverage = 0;
        for(int i=0;i<total;i++){
            femaleAverage += p1[i].getAge();
        }
        femaleAverage /= total;
        return femaleAverage;
    }


    public double getMaxDifference(){
        double maxDifference = 0; // initializes maxDifference
        int temp; // temp stores the current age difference
        for(int i=0;i<total;i++){ // loops for the number of couples created
            if(p2[i].getAge() > p1[i].getAge()){ // compares the absolute value of p2 getAge to p1
                temp = p2[i].getAge()-p1[i].getAge(); // subtracts the smaller value from the larger
            }
            else{ // this will run if the female absolute value is greater than the male
                temp = p1[i].getAge()-p2[i].getAge(); // same as other temp but p values inverted
            }
            if(temp > maxDifference){ // if temp difference is higher than the current maxDifference
                maxDifference = temp; // maxDifference will become the temp value
            }
        }
        return maxDifference; // returns difference
    }


    public double getAverageDifference(){
        double averageDifference = 0; // initializes averageDifference
        for(int i=0;i<total;i++){ // loops for the number of couples created
            if(p2[i].getAge() > p1[i].getAge()){ // compares the absolute value of p2 getAge to p1
                averageDifference += p2[i].getAge()-p1[i].getAge();
                // adds the current couple difference into the averageDifference
            }
            else{ // this will run if the female absolute value is greater than the male
                averageDifference += p1[i].getAge()-p2[i].getAge();
                // as we aren't finding the maximum all values are added to the averageDifference
            }
        }
        averageDifference /=total; // divides averageDifference by the number of couples to find the average age difference
        return averageDifference; // returns difference
    }


    public int getTotal() {
        return total;
    }
}